package src.d48;

public class Q23
{
    public static void main()
    {
        int i = 1;
        for (;;) {
            i = i + 3;
            System.out.println(i);
            if (i < 10) {
                continue;
            } else {
                break;
            }
            // System.out.println(i); // 到達不能なのでエラー
        }
    }
}
