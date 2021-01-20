package Monopoly;
import java.util.Scanner;
public class Monopoly {
    public static void main(String[] args){
        // 將玩家物件化
        // 將機會、命運物件化
        // 將地點物件化
        Scanner sin = new Scanner(System.in);
        System.out.print("請輸入玩家人數：");
        int n=sin.nextInt();  //輸入玩家人數
        //-----------------------
        load load = new load();  //new 一個名為load的類別，用於初始化物件
        player[] player = load.load_player(n);  //宣告名為player的物件陣列，並到load類別中執行load_player()的方法，建立玩家資料
        place[] place = load.load_place();  //宣告名為place的物件陣列，並到load類別中執行load_place()的方法，建立地點資料
        chance[] chance = load.load_chance();  //宣告名為chance的物件陣列，並到load類別中執行load_chance()的方法，建立機會資料
        destiny[] destiny = load.load_destiny();  //宣告名為destiny的物件陣列，並到load類別中執行load_destiny()的方法，建立命運資料
        String[] place_data = new String[24];
        //-----------------------
        String stay="",own="",house="";
        String houseOf="０１２３４５６７８９";
        int s=0,p=0;
        int destiny_ran=0,chance_ran=0;
        sin.nextLine();
        while(true){
            if(s==n) s=0;
            if(player[s].getState() != 1){
                if(player[s].getRest() == 0){
                    System.out.print("玩家"+player[s].getName()+"請按Enter擲骰子：");
                    sin.nextLine();
                    System.out.print("目前位置："+player[s].getLocation()+" -> ");
                //亂數產生1~12的數字，並顯示點數為多少
                    int dice=(int)(Math.random()*11)+2;
                    System.out.print("點數："+dice+" -> ");
                    player[s].setLocation(player[s].getLocation()+dice);
                //依骰子點數設定玩家位置，若玩家位置超出地圖範圍，則從0開始
                    if(player[s].getLocation()>23){
                        player[s].setLocation(player[s].getLocation()-24);
                        player[s].setMoney(player[s].getMoney()+5000);
                    }
                //顯示玩家移動到的地點名稱
                    System.out.println("移動到："+player[s].getLocation());
                //紀錄地點上的玩家
                    System.out.println(place[player[s].getLocation()].getPlace_name());
                    System.out.println(place[player[s].getLocation()].getShop_name());
                    System.out.println("玩家金額："+player[s].getMoney());
                //分類特殊地標，分別做不同的事
                    switch (player[s].getLocation()) {
                    //如果玩家走到起點
                        case 0:
                            break;
                    //如果玩家走到命運
                        case 4:
                        case 16:
                            destiny_ran = (int) (Math.random() * 5);
                            System.out.println("命運：" + destiny[destiny_ran].getContent());
                            player[s].setMoney(player[s].getMoney() + destiny[destiny_ran].getMoney());
                            break;
                    //如果玩家走到機會
                        case 8:
                        case 20:
                            chance_ran = (int) (Math.random() * 5);
                            System.out.println("機會：" + chance[chance_ran].getContent());
                            player[s].setMoney(player[s].getMoney() + chance[chance_ran].getMoney());
                            break;
                    //如果玩家走到警局
                        case 6:
                        //休息兩回合，之後經過所有玩家房地產支付兩倍金額
                            player[s].setRest(2);
                            player[s].setMultiply(2);
                            System.out.println("警局：休息兩回合，下一回合若採到其他玩家的地，則需支付兩倍的過路費");
                            break;
                    //如果玩家走到續攤
                        case 12:
                            //TODO 意即環遊世界（交換位置但不執行動作）
                            break;
                    //如果玩家走到醫院
                        case 18:
                        //休息一回合，支付給醫院５０００元
                            player[s].setRest(1);
                            player[s].setMoney(player[s].getMoney()-5000);
                            System.out.println("醫院：支付醫院５０００元並休息一回合");
                            break;
                    //否則代表玩家其他地標
                        default:
                         //判斷該地點是否有人購買，如果是則詢問是否要購買，輸入y/n
                            if(place[player[s].getLocation()].getOwn()==999){
                                System.out.print("此地點目前尚未有人擁有，請問是否要購買？ y/n： ");
                            //判斷玩家鍵入y/n，是否要購入
                                if(sin.next().equals("y")){
                                //購入的玩家需支付費用
                                    player[s].setMoney(player[s].getMoney()-place[player[s].getLocation()].getPay_money());
                                //該地點設定為該玩家所有
                                    place[player[s].getLocation()].setOwn(s);
                                    System.out.println("已購入");
                                }else{
                                    System.out.println("取消購入");
                                }
                                sin.nextLine();
                            }
                        //否則代表有人購買，需支付過路費
                            else {
                            //如果該地已被購買，且不為自己所有，則代表需支付過路費給擁有該地的玩家
                                if (place[player[s].getLocation()].getOwn() != s) {
                                    System.out.println("需支付過路費：" + (place[player[s].getLocation()].getPay_money()*player[s].getMultiply()));
                                    player[s].setMoney(player[s].getMoney() - (place[player[s].getLocation()].getPay_money()*player[s].getMultiply()));
                                    player[place[player[s].getLocation()].getOwn()].setMoney(player[place[player[s].getLocation()].getOwn()].getMoney() + (place[player[s].getLocation()].getPay_money()*player[s].getMultiply()));
                                //如果該玩家的支付倍率不為1，代表他剛從警局出來，且支付了兩倍過路費，並將其倍率狀態恢復為1
                                    if(player[s].getMultiply()!=1){
                                        player[s].setMultiply(1);
                                    }
                            //否則代表為自己的地，加蓋房子數量，過路費增加1.5倍
                                }else{
                                    System.out.print("這是您自己的地喔～房子從"+place[player[s].getLocation()].getHouse()+"棟 升為 ");
                                    place[player[s].getLocation()].setHouse(place[player[s].getLocation()].getHouse()+1);
                                    System.out.println(place[player[s].getLocation()].getHouse()+"棟，過路費增加1.5倍");
                                    System.out.print("原過路費："+place[player[s].getLocation()].getPay_money()+" 變為 ");
                                    place[player[s].getLocation()].setPay_money((int)(place[player[s].getLocation()].getPay_money()*1.5));
                                    System.out.println(place[player[s].getLocation()].getPay_money());
                                }
                            }
                    }
                //顯示玩家結餘金額
                    System.out.println("結餘金額："+player[s].getMoney());
                    System.out.println("---------------------------------------");
                //如果該玩家的金額低於0，則代表破產，將其狀態更新為1，並提示玩家破產
                    if(player[s].getMoney()<0){
                        p++;
                        player[s].setState(1);
                        System.out.println("玩家"+player[s].getName()+"破產");
                    }
            //否則代表該玩家有休息回合，顯示該玩家狀態及尚餘休息回合數，並將回合數減一
                }else{
                    player[s].setRest(player[s].getRest()-1);
                    System.out.println("玩家"+player[s].getName()+"休息!! 尚餘："+player[s].getRest());
                }
            }
        //設定地圖顯示資訊
            for(int i=0;i<24;i++){
                stay="";
                own="";
                house="";
                char ownOf,stayOf;
                for(int j=0;j<n;j++){
                //判斷該地點是否有玩家停留，如果有則以字串串接的方式紀錄(將半形轉為全形)，否則以全形空格替代，以防跑版
                    if(player[j].getLocation()==i){
                        stayOf = (char) ((int) (player[j].getName().charAt(0))+65248); //將玩家ABCD半形轉全形
                        stay += String.valueOf(stayOf);
                    }else{
                        stay += "　";
                    }
                //判斷該地點是否有玩家擁有，如果有則紀錄
                    if(place[i].getOwn()==j){
                        ownOf = (char) ((int) (player[j].getName().charAt(0))+65248); //將玩家ABCD半形轉全形
                        own = String.valueOf(ownOf);
                        house = houseOf.substring(place[i].getHouse()+1,place[i].getHouse()+2);
                    }
                }
            //如果玩家低於4個，會造成跑版，所以跑迴圈以補空格的方式取代之
                for(int j=0;j<4-n;j++){
                    stay += "　";
                }
            //如果該地未有玩家擁有，則用全形空格取代(擁有者)
                if(own==""){
                    own = "　";
                }
            //如果該地未有玩家擁有，則用全形空格取代(擁有房子數)
                if(house==""){
                    house = "　";
                }
            //將該地資訊以字串串接方式紀錄
                place_data[i]=own+house+"　"+stay;
            }

            show show = new show();  //new 一個名為load的類別，用於初始化物件
            show.showMap(place,place_data);  //呼叫showMap()，顯示地圖

        //如果破產計數為玩家人數減一，代表只剩一位玩家沒有破產，即遊戲結束，由最後一位存活玩家獲勝
            if(p==n-1){
                break;  //跳出迴圈
            }
            s++;
        }
        System.out.println("遊戲結束！！");
    //最後判斷哪位玩家的狀態不是1，代表該玩家沒破產，為贏家
        for(int i=0;i<n;i++){
            if(player[i].getState()!=1){
                System.out.println("遊戲結束！！贏家為：玩家"+player[i].getName());
            }
        }
    }
}
