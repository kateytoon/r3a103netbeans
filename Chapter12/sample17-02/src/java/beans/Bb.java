package beans;

import java.io.Serializable;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
// ここにコードを記述
public class Bb implements Serializable {

    private String product;	// 商品名 
    private Integer qty;	// 数量
    private String name;	// お名前
    private String address;	// ご住所
    @Inject
    Conversation conv;
    public String goto_1() {
        if(conv.isTransient()) {
            conv.begin();
            System.out.println("**第一画面　会話スコープ開始 **");
        } else {
            System.out.println("**第一画面**");
        }
        return "view_1.xhtml";
    }

    public String goto_2() {
        System.out.println("** 第２画面 **");
        return "view_2.xhtml";		// 画面２（氏名と住所の入力）を表示する
    }

    public String goto_3() {
        System.out.println("** 第３画面 **");
        return "view_3.xhtml";		// 画面３（確認表示）を表示する
    }

    public String goto_0() {
        conv.end();
          // 会話スコープを終了する
        System.out.println("** 開始画面　会話スコープ終了 **");
        return "index.xhtml";
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
