
// LocalDateTime のインポート
import java.time.LocalDateTime;

public class AboutTimeMain {

    public static void main(String[] args) {
        // LocalDateTime で現在時刻を取得
        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow.getMonthValue() + "月です。");

        // インスタンス の再生成
        ldtNow = ldtNow.withMonth(5);
        System.out.println(ldtNow.getMonthValue() + "月に変更しました。");
    }
}