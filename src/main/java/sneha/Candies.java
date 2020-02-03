package sneha;

class candies implements sweets
{
    private final int w=200;
    private String n;
    private int p;
    private int c;
    void add(String n1,int p1)
    {
        n=n1;
        p=p1;
    }
    void add(int rw)
    {
        c=rw/w;
    }
    public void print()
    {
        System.out.println(c+" candies added");
    }
}
