package Monopoly;

public class show {

    private chance[] chance;
    private destiny[] destiny;

    public show() {
        load load = new load();  //new 一個名為load的類別，用於初始化物件
        this.chance = load.load_chance();  //宣告名為chance的物件陣列，並到load類別中執行load_chance()的方法，建立機會資料
        this.destiny = load.load_destiny();  //宣告名為destiny的物件陣列，並到load類別中執行load_destiny()的方法，建立命運資料
    }

    public void showMap(place[] place,String[] place_data){
        System.out.println("－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－");
        System.out.println("｜"+place[18].getPlace_name()+"｜"+place[17].getPlace_name()+"｜"+place[16].getPlace_name()+"｜"+place[15].getPlace_name()+"｜"+place[14].getPlace_name()+"｜"+place[13].getPlace_name()+"｜"+place[12].getPlace_name()+"｜");
        System.out.println("｜"+place[18].getShop_name() +"｜"+place[17].getShop_name() +"｜"+place[16].getShop_name() +"｜"+place[15].getShop_name() +"｜"+place[14].getShop_name() +"｜"+place[13].getShop_name() +"｜"+place[12].getShop_name() +"｜");
        System.out.println("｜　　　　　　　｜　＄２５００　｜　　　　　　　｜　＄３０００　｜　＄３５００　｜　＄４５００　｜　　　　　　　｜");
        System.out.println("｜"+place_data[18]+"｜"+place_data[17]+"｜"+place_data[16]+"｜"+place_data[15]+"｜"+place_data[14]+"｜"+place_data[13]+"｜"+place_data[12]+"｜");
        System.out.println("－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－");
        System.out.println("｜"+place[19].getPlace_name()+"｜　　　　　　　　～　　走　　到　　哪　　　喝　　到　　哪　　～　　　　　　　　｜"+place[11].getPlace_name()+"｜");
        System.out.println("｜"+place[19].getShop_name() +"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place[11].getShop_name() +"｜");
        System.out.println("｜　＄２２５０　｜　　　　　　　　　　　　　　　　目前遊玩人數－　　　　　　　　　　　　　　　　｜　＄５０００　｜");
        System.out.println("｜"+place_data[19]+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place_data[11]+"｜");
        System.out.println("－－－－－－－－－　　　　　　　　　　　　玩家－　擲出骰子　點數合計－－　　　　　　　　　　　　－－－－－－－－－");
        System.out.println("｜"+place[20].getPlace_name()+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place[10].getPlace_name()+"｜");
        System.out.println("｜"+place[20].getShop_name() +"｜　　　　　　　　玩家－　現在走到－－－－－　　該地區屬於玩家－　　　　　　　　｜"+place[10].getShop_name() +"｜");
        System.out.println("｜　　　　　　　｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜　＄５２５０　｜");
        System.out.println("｜"+place_data[20]+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place_data[10]+"｜");
        System.out.println("－－－－－－－－－　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　－－－－－－－－－");
        System.out.println("｜"+place[21].getPlace_name()+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place[9].getPlace_name()+"｜");
        System.out.println("｜"+place[21].getShop_name() +"｜　　　　　　　　　　命運："+chance[0].getContent()+"　　　　　　　　　　　｜"+place[9].getShop_name()+"｜");
        System.out.println("｜　＄２０００　｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜　＄５５００　｜");
        System.out.println("｜"+place_data[21]+"｜　　　　　　　　　　機會："+destiny[0].getContent()+"　　　　　　　　　　　｜"+place_data[9]+"｜");
        System.out.println("－－－－－－－－－　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　－－－－－－－－－");
        System.out.println("｜"+place[22].getPlace_name()+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place[8].getPlace_name()+"｜");
        System.out.println("｜"+place[22].getShop_name() +"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place[8].getShop_name() +"｜");
        System.out.println("｜　＄１２５０　｜　　　　　　玩家Ａ　　　　　玩家Ｂ　　　　　玩家Ｃ　　　　　玩家Ｄ　　　　　　｜　　　　　　　｜");
        System.out.println("｜"+place_data[22]+"｜　　　　＄９９９９９　　＄９９９９９　　＄９９９９９　　＄９９９９９　　　　　｜"+place_data[8]+"｜");
        System.out.println("－－－－－－－－－　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　－－－－－－－－－");
        System.out.println("｜"+place[23].getPlace_name()+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place[7].getPlace_name()+"｜");
        System.out.println("｜"+place[23].getShop_name() +"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+ place[7].getShop_name()+"｜");
        System.out.println("｜　＄１０００　｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜　＄５７５０　｜");
        System.out.println("｜"+place_data[23]+"｜　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　｜"+place_data[7]+"｜");
        System.out.println("－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－");
        System.out.println("｜"+place[0].getPlace_name()+"｜"+place[1].getPlace_name()+"｜"+place[2].getPlace_name()+"｜"+place[3].getPlace_name()+"｜"+place[4].getPlace_name()+"｜"+place[5].getPlace_name()+"｜"+place[6].getPlace_name()+"｜");
        System.out.println("｜"+place[0].getShop_name()+"｜"+place[1].getShop_name()+"｜"+place[2].getShop_name()+"｜"+place[3].getShop_name()+"∣"+place[4].getShop_name()+"｜"+place[5].getShop_name()+"｜"+place[6].getShop_name()+"｜");
        System.out.println("｜　　　　　　　｜　＄７０００　｜　＄６５００　｜　＄６２５０　｜　　　　　　　｜　＄６０００　｜　　　　　　　｜");
        System.out.println("｜"+place_data[0]+"｜"+place_data[1]+"｜"+place_data[2]+"｜"+place_data[3]+"｜"+place_data[4]+"｜"+place_data[5]+"｜"+place_data[6]+"｜");
        System.out.println("－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－");
    }
}
