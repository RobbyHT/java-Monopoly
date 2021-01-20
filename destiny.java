package Monopoly;

public class destiny {
    /**
     * 建立命運物件
     * content=>內容
     * money=>金額
     */
    private String content;
    private int money;

    public destiny(String content, int money) {
        this.content = content;
        this.money = money;
    }

    public String getContent() {
        return this.content;
    }  //取得命運內容
    public int getMoney() {
        return this.money;
    }  //取得命運金額
}
