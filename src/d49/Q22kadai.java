package src.d49;

public class Q22kadai
{
    public static void main()
    {
        int length = 2001;
        String type;
        if (length < 1000) {
            type = "Short";
        } else if (length > 2000) {
            type = "Long";
        } else {
            type = "Standard";
        }
        System.out.println(type);
    }
}
