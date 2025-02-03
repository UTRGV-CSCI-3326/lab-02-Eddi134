public class MixMatch {
    public static void main (String[] args) {
        String vString = "My name is Edgar.";
        System.out.println(vString + " <- String stores sequences of characters.");

        char vChar = "A";
        System.out.println(vChar + " <- Char stores single characters.");
    
        short vShort = 6907;
        System.out.println(vShort + " <- Short stores whole numbers from -32,768 to 32,767.");

        int vInt = 100000;
        System.out.println(vInt + " <- Int stores whole numbers from -2,174,483,648 to 2,174,483,647.");

        long vLong = 12345678901L;
        System.out.println(vLong + " <- Long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");

        float vFloat = 12345678901L;
        System.out.println(vFloat + " <- Float stores single-precision floating-point numbers.");

        double vDouble = 12345678901L;
        System.out.println(vDouble + " <- Double stores double-precision floating-point numbers.");

        boolean vBoolean = 12345678901L;
        System.out.println(vBoolean + " <- Boolean stores true or false values.");

        System.out.println("Multiple variables: " + vLong + ", " + vString + ", " + vBoolean + ", " + vInt);
    }
}