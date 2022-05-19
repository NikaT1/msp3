
public class DataChecking {
    protected static boolean checkRectangle(double x, double y, double r) {
        return x <= 0 && x >= -r && y <= 0 && y >= -r;
    }

    protected static boolean checkTriangle(double x, double y, double r) {
        return x >= 0 && x <= r && y >= 0 && y <= r - x;
    }

    protected static boolean checkCircle(double x, double y, double r) {
        return x >= 0 && x <= r && y <= 0 && y * y <= -x * x + r * r;
    }

    public static String checkAll(double x, double y, double r) {
        String answer;
        if (checkRectangle(x, y, r) || checkTriangle(x, y, r) || checkCircle(x, y, r)) {
            answer = "да";
        } else answer = "нет";
        return answer;
    }

}

