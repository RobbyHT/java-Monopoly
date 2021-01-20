package Monopoly;
public class load {
    //初始定義玩家
    public player[] load_player(int num){
        player[] player = new player[num];
        for(int i=0;i<num;i++){
            player[i] = new player();
            player[i].setName(String.valueOf((char) ((int)(i+65))));
            player[i].setMoney(20000);
            player[i].setLocation(0);
            player[i].setState(0);
            player[i].setRest(0);
            player[i].setMultiply(1);
        }
        return player;
    }

    //初始定義地圖
    public place[] load_place(){
        place[] place = {
                new place("　　　　　　　","　　起　點　　",0,0,999),
                new place("　　大　安　　","　　三千子　　",7000,0,999),
                new place("　　南　港　　","　　武侍酒　　",6500,0,999),
                new place("　　台　北　　","ＡＢＶ　ＢＡＲ",6250,0,999),
                new place("　　　　　　　","　　命　運　　",0,0,999),
                new place("　　市政府　　","激安の食事酒場",6000,0,999),
                new place("　　　　　　　","　　警　局　　",0,0,999),
                new place("　　松　山　　","　　酌　九　　",5750,0,999),
                new place("　　　　　　　","　　機　會　　",0,0,999),
                new place("　台北　車站　","　　獨　樂　　",5500,0,999),
                new place("　　江子翠　　","　　老串角　　",5250,0,999),
                new place("　　公　館　　","　私處　大口　",5000,0,999),
                new place("　　　　　　　","　　續　攤　　",0,0,999),
                new place("　　西　門　　","　　西門靖　　",4500,0,999),
                new place("　　後山埤　　","　　鳥　厝　　",3500,0,999),
                new place("　　士　林　　","　　澠井川　　",3000,0,999),
                new place("　　　　　　　","　　命　運　　",0,0,999),
                new place("　　三　重　　","　　川中屋　　",2500,0,999),
                new place("　　　　　　　","　　醫　院　　",0,0,999),
                new place("　　台北橋　　","　一號　倉庫　",2250,0,999),
                new place("　　　　　　　","　　機　會　　",0,0,999),
                new place("　國父紀念館　","　　拾　玖　　",2000,0,999),
                new place("　　善導寺　　","　　　柒　　　",1250,0,999),
                new place("　忠孝　新生　","　　豚　知　　",1000,0,999),
        };
        return place;
    }

    //初始定義機會
    public chance[] load_chance(){
        chance[] chance = {
                new chance("商店街幸運得獎得獎金５０００元",5000),
                new chance("獲得大樂透小獎項獎金４０００元",4000),
                new chance("酒駕遭到臨檢支付政府３０００元",-3000),
                new chance("遇到久未見朋友續攤付５０００元",-5000),
                new chance("跟朋友酒精路跑冠軍得７５００元",7500),
        };
        return chance;
    }

    //初始定義命運
    public destiny[] load_destiny(){
        destiny[] destiny = {
                new destiny("經發現玩家逃漏稅損失２０００元",-2000),
                new destiny("酒醉鬧事遭到逮捕支付３５００元",-3500),
                new destiny("買太多樂透支付金額共２５００元",-2500),
                new destiny("失戀吃過多肉串支付共４０００元",-4000),
                new destiny("酒精中毒送醫院支付１００００元",-10000),
        };
        return destiny;
    }
}
