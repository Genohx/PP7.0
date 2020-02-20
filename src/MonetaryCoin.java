public class MonetaryCoin extends Coin
{
    private int value;

    public MonetaryCoin(int value)
    {
        super();
        this.value = value;
    }

    public String toString()
    {
        String output = super.toString() + "\nThe coin's value is: " + value;
        return output;
    }
}
