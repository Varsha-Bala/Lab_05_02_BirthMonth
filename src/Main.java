public class Main
{
    public static void main(String[] args)
    {
        int bMonth = 13;

        if(bMonth < 1 || bMonth > 12)
        {
            System.out.println("You declared an invalid birth month value: "+bMonth);
        }
        else
        {
            System.out.println("Your birth month is : "+bMonth);
        }


    }
}