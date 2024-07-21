public class  ReturnKeyword {
    String getname()
    {
        return "Arun";
    }
    public static void main (String[] args)
    {
    ReturnKeyword  obj = new ReturnKeyword ();
    String getname = obj.getname();
    System.out.println(getname);
    }
}