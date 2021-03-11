public class OperasiSederhana {
    public static void main(String[] args) 
    {
        System.out.println("Hasil dari -5 + 8 * 6 adalah " + operasi1(-5, 8, 6));
        System.out.println("Hasil dari (55+9) % 9 adalah " + operasi2(55, 9, 9));
        System.out.println("Hasil dari 20 + -3*5 / 8 adalah " + operasi3(20, -3, 5, 8));
        System.out.println("Hasil dari 5 + 15 / 3 * 2 - 8 % 3 adalah " + operasi4(5, 15, 3, 2, 8, 3));
    }
    
    static int operasi1(int a, int b, int c)
    {
        int hasil = a + b * c;
        return hasil;
    }
    
    static int operasi2(int a, int b, int c)
    {
        int hasil = (a + b) % c;
        return hasil;
    }
    
    static int operasi3(int a, int b, int c, int d)
    {
        int hasil = a + b * c / d;
        return hasil;
    }
    
    static int operasi4(int a, int b, int c, int d, int e, int f)
    {
        int hasil = a + b /c * d - e % f;
        return hasil;
    }
}