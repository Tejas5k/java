class forl2
{
    public static void main(String args[])
    {

    System.out.println("Following are the no of working Days & their hours");
     for(int i=1;i<=5;i++)
     {
        System.out.println("Day : " + i);
        int a = 1;
        for(int j=1;j<=9;j++)
        {
            System.out.println("    "+ (j+8) + " - " + (j+9) );
            
        }
     }
    }
}