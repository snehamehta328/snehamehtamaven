package sneha;

class chocolates implements sweets {
    private final int w=200;
    private String n;
    private int p;
    void add(String n1,int p1)
    {
        n=n1;
        p=p1;
    }
    int add(int tw)
    {
        tw=tw*1000;
        return(tw-w);
    }
    public void print()
    {
        System.out.println("1 chocolate added");
    }
}
