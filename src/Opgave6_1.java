public class Opgave6_1 {
    public static void main(String[] args) {

    /* (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
    n = 1,2,...,and so on.Therefore,the first few numbers are 1,5,12,22,....
    Write a method with the following header that returns a pentagonal number:
    public static int getPentagonalNumber(int n)
    Write a test program that uses this method to display the first 100 pentagonal
    numbers with 10 numbers on each line.
    */


        System.out.println("Opgave 6.1");
        System.out.print("\nThis program shows the first 100 pentagonal numbers:");

        System.out.println();
        System.out.println();


        final int totalNumberOfPentagonals = 100;   //How many numbers going to be listed
        final int numbersPerLine = 10;  //How many numbers per line


        for (int i = 1; i <= totalNumberOfPentagonals; i++){

            if (i % numbersPerLine == 0)
                System.out.printf("%10d\n", getPentagonalNumber(i));

            else System.out.printf("%10d", getPentagonalNumber(i));

    }}


    //The method that creates the pentagonal numbers
    public static int getPentagonalNumber(int n){
    return (n * (3 * n - 1)) / 2;

    }
}
