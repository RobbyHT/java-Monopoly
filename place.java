package Monopoly;

public class place {
    /**
     * 建立商店類別並固定物件
     * place_name=>地點名稱
     * shop_name=>店家名稱
     * pay_money=>過路費
     * house=>幾間房子
     * own=>擁有者，999為無人擁有
     */
    private String place_name;
    private String shop_name;
    private int pay_money;
    private int house;
    private int own;

    public place(String place_name, String shop_name, int pay_money, int house, int own) {
        this.place_name = place_name;
        this.shop_name = shop_name;
        this.pay_money = pay_money;
        this.house = house;
        this.own = own;
    }

    public String getPlace_name() {
        return this.place_name;
    }
    public String getShop_name() {
        return this.shop_name;
    }
    public int getPay_money() {
        return this.pay_money;
    }
    public int getHouse() {
        return this.house;
    }
    public int getOwn() {
        return this.own;
    }

    public void setHouse(int house) {
        this.house = house;
    }
    public void setOwn(int own) { this.own = own; }
    public void setPay_money(int pay_money) {
        this.pay_money = pay_money;
    }
}
