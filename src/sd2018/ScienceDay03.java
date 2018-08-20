package sd2018;

public class ScienceDay03 {
    public static void main(String[] args) {
        // 3-1 変数に数値を入れて取り出してみよう
        // ここに書く
        int number; // numberという名前の整数用の変数（箱）を用意する
        number = 7; // 変数numberへ7を入れる

        System.out.println(number); // 変数numberに入った値を表示させる



        // 3-2 変数に文字列を入れて取り出してみよう
        // ここに書く
        String name; // // まずnameという名前の文字列用の変数（箱）を用意する
        name = "山田太郎"; // 変数nameへあなたの名前を入れる

        System.out.println(name); // 変数nameに入った値を表示させる



        // チャレンジ問題
        // 自己紹介を表示させよう
        // ここに書く
        int age;
        age = 18;
        System.out.println("私の名前は" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");



        // ====================
        // ヒント
        // ====================
        // * 整数用の変数は int
        // * 文字列用の変数は String
        // * 変数は " " で囲まない
        // * 最後の ; を忘れずに
        // * 文字列どうしは「+」で繋げられる
        // * 文字列と数値は「+」で繋げられ、文字列になる
    }
}
