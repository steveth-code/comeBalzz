
/**
 * Write a description of class queen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class queen
{
    int queenCakes;
    int flour;
    int butter;
    int jam;
    int flourBuy;
    int butterBuy;
    int jamBuy;
    public queen()
    {
        for(var i=0;i<=150;i++){
            queenCakes += 13*i;
        }
        flour = queenCakes * 7;
        butter = queenCakes * 3;
        jam = queenCakes * 11;
        System.out.println(queenCakes + " Tarts");
        System.out.println("She will need " + flour + "g's of flour, " + butter + "g's of butter, " + jam + " g's of jam.");
        flourBuy = (int) Math.ceil(flour/5000.0);
        butterBuy = (int) Math.ceil(butter/500.0);
        jamBuy = (int) Math.ceil(jam/425.0);
        System.out.println(flourBuy + " bags of flour, " + butterBuy + " butter, " + jamBuy + " jars of jam.");
    }
}
