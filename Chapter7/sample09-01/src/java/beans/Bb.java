package beans;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb {

//            ここにコードを記述
    private List <Meibo> meibo;
    {
        meibo = new ArrayList<>();
        meibo.add(new Meibo(100, "田中宏", "tanaka@mail.jp"));
        meibo.add(new Meibo(200, "佐藤修", "satoh@mail.jp"));
        meibo.add(new Meibo(300, "鈴木太郎", "suzuki@mail.jp"));
        meibo.add(new Meibo(400, "山田弘子", "yamada@mail.jp"));
        meibo.add(new Meibo(500, "藤本花子", "fujimoto@mail.jp"));
    }
    
    public String next() {
        return null;
    }

    public List<Meibo> getMeibo() {
        return meibo;
    }

    public void setMeibo(List<Meibo> meibo) {
        this.meibo = meibo;
    }
    
    
}