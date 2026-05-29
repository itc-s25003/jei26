package src.d49;

public class Q25
{
    public static void main(String[] args)
    {
        double a = 12.3;
        double b = 4.5;
        // numberメソッドを使うためにインスタンスを作る
        Q25 o = new Q25();
        // インスタンスからnumberメソッドを使って、結果をcに代入
        int c = o.number(a, b);
        System.out.println(c);
    }

    int number(double v1, double v2)
    {
        // 計算結果を、doubleからintに変換して返す。
        // 小数点以下が切り捨てられる。
        return (int)(v1 / v2);
    }
}
