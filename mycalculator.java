class mycalculator implements  Calculator
{
    @Override
    public void mul()
    {
        int a=10;
        int b=20;
        int c=a*b;
        System.out.println(c);
    }
    public void div()
    {
        int a=10;
        int b=20;
        int c=a/b;
        System.out.println(c);
    }
}