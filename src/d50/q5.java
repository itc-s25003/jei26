package src.d50;

public class q5
{
    public static void main(String[] args)
    {
        // 引数の個数分、引数の値を保管する配列を作る。
        int num[] = new int[args.length];

        // int型に変換しつつ、配列に代入
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        // 基本挿入法
        // 値を入れ替えるときに使う変数
        int tmp;
        // 外側ループは、値の個数-1回のループをする用
        for (int i = 1; i < num.length; i++) {
            // 外側ループのiをにもとに比較などを行う。
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                // 値同士を入れ替える処理
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
        }

        // numの中身を出力
        for (int val : num) {
            System.out.print(val + " ");
        }
    }
}