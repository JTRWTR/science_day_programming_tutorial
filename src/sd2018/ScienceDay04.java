package sd2018;

public class ScienceDay04 {
    public static void main(String[] args) {
        // 「もし〜なら」のような条件分岐をさせてみよう。

        // 4-1 条件（数値の大小）によって処理を制御しよう
        // ここに書く
        int num;
        num = 7;

        if (num > 3) { // 「numが3より大きいなら」
            System.out.println(num + "は、3より大きい数値です");
        }



        // 4-2 条件に満たさない場合の処理も書いてみよう
        // ここに書く
        if (num < 3) { // 「numが3より小さいなら」
            System.out.println(num + "は、3より小さい数値です");
        }else{ // 「それ以外なら」
            System.out.println(num + "は、3より小さい数値ではありません");
        }



        // チャレンジ問題
        // 今日の天気によって、表示させるメッセージを変えてみよう。
        // ここに書く
        String weather;
        weather = "Rainy"; // ["Sunny", "Cloudy", "Rainy", その他適当な文字列]　に変更して実行してみよう
        if (weather.equals("Sunny")) {
            System.out.println("今日の天気は、晴れです");
        }else if (weather.equals("Cloudy")){
            System.out.println("今日の天気は、曇りです");
        }else if (weather.equals("Rainy")){
            System.out.println("今日の天気は、雨です");
        }else{
            System.out.println("今日の天気は、わかりません");
        }



        // ====================
        // ヒント
        // ====================
        // 数値の大小を比較するには、「<」「>」を使用する
        // 始めの条件は「if」
        // それ以外は「else」
        // 複数の条件を追加する場合は「else if」を使う
        // 「.equals()」を使うことで、変数と()の中の文字列が等しいかどうかを判定してくれる
    }
}
