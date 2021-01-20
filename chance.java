package Monopoly;

public class chance {
    /**
     * 建立機會物件
     * content=>內容
     * money=>金額
     */
    private String content;
    private int money;

    public chance(String content, int money) {
        this.content = content;
        this.money = money;
    }

    public String getContent() {
        return this.content;
    }  //取得機會內容
    public int getMoney() {
        return this.money;
    }  //取得機會金額
}
