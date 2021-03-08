import com.telran.RgbColor;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void testRGB(){
        RgbColor color= new RgbColor();
        System.out.println(color);
        RgbColor color1=  new RgbColor(12,30,500);
        System.out.println(color1);
        RgbColor color2= new RgbColor(color1);
        System.out.println(color2);
    }

}
