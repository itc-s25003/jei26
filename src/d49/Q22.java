package src.d49;

public class Q22
{
    public static void main()
    {
        int length = 1600;
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
