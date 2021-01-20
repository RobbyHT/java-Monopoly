package Monopoly;

public class player {
    /**
     * 建立玩家物件
     * name=>玩家名稱
     * money=>玩家金額
     * location=>玩家位置
     * state=>玩家狀態 預設0
     * rest=>玩家休息 預設0
     * multiply=>玩家過路費支付倍率 預設1
     */
    private String name;
    private int money;
    private int location;
    private int state;
    private int rest;
    private int multiply;

    //Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    //Money
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return this.money;
    }
    //Location
    public void setLocation(int location) {
        this.location = location;
    }
    public int getLocation() {
        return this.location;
    }
    //State
    public void setState(int state) {
        this.state = state;
    }
    public int getState() {
        return this.state;
    }
    //rest
    public void setRest(int rest) {
        this.rest = rest;
    }
    public int getRest() {
        return this.rest;
    }
    //multiply
    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }
    public int getMultiply() {
        return this.multiply;
    }
}
