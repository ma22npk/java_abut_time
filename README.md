# java_abut_time
JavaのTimeについて学んだことのアウトプットです
<!-- ここから キャプチャー -+-+-+-+-+-+-+ -->
<!-- キャプチャータイトル -->
## Timeクラス


<!-- 説明 「〜〜とはなど」-->
### 【説明】

[Date]クラスと[Calendar]クラスの問題を解決するために新しく出来たクラスです。
*Time*は [Date]クラスと[Calendar]クラスの両方の特徴があり、

- 日付データ保持
- 日付操作

これら両方とも Timeクラス1つで賄うことが出来てしまいます。

Timeクラスには、

- LocalDate
- Localtimeのインスタンスを持つLocalDateTime
- LocalDateTimeに加え
- オフセット（標準時との時差）を含むOffsetDateTime
- OffsetDateTimeに加え
- タイムゾーンを含むZonedDateTimeがあります。

| クラス名       | 機能と役割                                                                                                                   | 例                                        | 
| -------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------- | 
| Instant        | 世界における、ある「瞬間」の時刻を、ナノ秒単位で厳密に指し示し、保持する                                                     |                                           | 
| ZoneDateTime   | 世界における、ある「瞬間」の時刻を、ナノ秒単位で厳密に指し示し、保持する                                                     | 2020-11-30T23:30:59.999+09:00[Asia/Tokyo] | 
| LocalDateTime  | 内部にLocalDateとLocalTimeのインスタンスを持っている。<br>日常的に使われる「曖昧な日時」を保持する<br>タイムゾーンのない日時 | 2020-11-30T23:30:59.999                   | 
| Duration       | ２つの異なる時刻や日付の期間を保持する                                                                                       |                                           | 
| Period         | ２つの異なる時刻や日付の期間を保持する                                                                                       |                                           | 
| OffsetDateTime | オフセット付きの日時。                                                                                                       | 2020-11-30T23:30:59.999+09:00     

また、月の値の対応もCalendarクラスと異なっており、**月の値が1場合 1月 として出力されます。**


### 【使用場面】

「 *時間* 」を扱う場面全般で使用できます。

※ 現場の中には、「伝統的な[Date]と[Calendar]を使用するので、Time Apiは積極活用しない」という場所もあるので、実務では現場のルールに従うこと。


<!-- ここから サンプルコード ★☆★☆★☆★☆★ -->
<!-- サンプルコードタイトル -->
### 【サンプルコード】 

<!-- サンプルコード概要 -->

<!-- サンプルコード -->
```java

// LocalDateTime のインポート
import java.time.LocalDateTime;
// OffsetDateTime のインポート
import java.time.OffsetDateTime;
// ZonedDateTime のインポート
import java.time.ZonedDateTime;

public class AboutTimeMain {

    public static void main(String[] args) {
        // LocalDateTime で現在時刻を取得
        LocalDateTime ldtNow = LocalDateTime.now();
        // OffsetDateTime で現在時刻を取得
        OffsetDateTime odtNow = OffsetDateTime.now();
        // ZonedDateTime で現在時刻を取得
        ZonedDateTime zdtNow = ZonedDateTime.now();
        
        // それぞれのTimeクラスを出力する。
        System.out.println("LocalDateTime は" + ldtNow.toString());
        System.out.println("OffsetDateTime は" + odtNow.toString());
        System.out.println("ZonedDateTime は" + zdtNow.toString());
    }
}
```
<!-- 実行結果 -->
#### 【実行結果】

```
LocalDateTime は2020-11-29T16:48:21.834565
OffsetDateTime は2020-11-29T16:48:21.835357+09:00
ZonedDateTime は2020-11-29T16:48:21.836312+09:00[Asia/Tokyo]
```
<!-- サンプルコード説明 -->

<!-- ここまで サンプルコード ★☆★☆★☆★☆★ -->

<!-- ここから サンプルコード ★☆★☆★☆★☆★ -->
<!-- サンプルコードタイトル -->
### 【サンプルコード】 
Timeクラスは[Date]クラスや[Calendar]クラスと異なり、「**直接値を変更することができない**」ため、「 **日時などの値を変更する場合はインスタンスを生成しなおす**」 必要があります。


<!-- サンプルコード概要 -->


<!-- サンプルコード -->
```java
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
```
<!-- 実行結果 -->
#### 【実行結果】

```
11月です。
5月に変更しました。
```
<!-- サンプルコード説明 -->

<!-- ここまで サンプルコード ★☆★☆★☆★☆★ -->

<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->


[Progate]:https://prog-8.com/
[ドットインストール]:https://dotinstall.com/
[インスタンス]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[インスタンス化]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[アクセス修飾子]:https://qiita.com/takahirocook/items/e51b0b9d37d95ad587fe
[フィールド]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[フィールド変数]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[new演算子]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[new]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[カプセル化]:https://qiita.com/takahirocook/items/e469a7c0539a0012868e
[クラス]:https://qiita.com/takahirocook/items/50cbbdca8e21539170e9
[メソッド]:https://qiita.com/takahirocook/items/5bfe43576d87a2a4006c
[mainメソッド]:https://qiita.com/takahirocook/items/f4635915337303de338c
[メソッドの呼び出し]:https://qiita.com/takahirocook/items/f4635915337303de338c
[コンストラクタ]:https://qiita.com/takahirocook/items/fa1822f2f22c3786593e
[引数]:https://qiita.com/takahirocook/items/5e5b0ba79e869f4a592e
[戻り値]:https://qiita.com/takahirocook/items/3b6fa670a1d6dd4a9386
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[getter・setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[getter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[オブジェクト指向]:https://qiita.com/takahirocook/items/041ba7a096b71ab8ffd4
[継承]:https://qiita.com/takahirocook/items/6c84ea66a6e2ad536a37
[オーバーライド]:https://qiita.com/takahirocook/items/09dd8e5f56d6617ce45a
[オーバーロード]:https://qiita.com/takahirocook/items/b937c3c07126fe7e02a4
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[super]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[スーパークラス]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[final]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[final修飾子]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[定数]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[static修飾子]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[static]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[動的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスメソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インターフェイス]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[インターフェース]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[パッケージ]:https://qiita.com/takahirocook/items/39b58d17abcb159ef5c1
[インポート]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[import]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[配列]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[配列操作]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[List]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[list]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[Map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Date]:https://qiita.com/takahirocook/items/a760e20ef2d9aa5c08fc
[拡張for文]:https://qiita.com/takahirocook/items/470b2858de1a4f99b334
[Calendar]:https://qiita.com/takahirocook/items/204dd7331db777eb6f3b
