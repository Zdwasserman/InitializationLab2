package Wasserman.Zachary.InitializationLab2Test;

import Wasserman.Zachary.InitializationLab2.ColorfulThing;
import Wasserman.Zachary.InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

/**
 * Created by zacharywasserman on 9/11/16.
 */
public class ThingContainerTest {
  /*  @Test
    public void holdArrayOfobjects(){
        Class<Array> expected = Array.class;
    }
*/
    @Test
    public void thingContainerSizeTest(){
        ThingContainer thing1 = new ThingContainer(5);
        int expected = 5;
        int actual = thing1.getArraySize();
        Assert.assertEquals("The expected value is 5", expected, actual);
    }
    @Test
    public void thingContainerAddTest(){
        ThingContainer thing1 = new ThingContainer(2);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        int expected = 2;
        thing1.add(enum2);
        thing1.add(enum3);
        int actual = thing1.getColorfulArr().length;
        Assert.assertEquals("The expected value is 2", expected, actual);
    }
   /* @Test
    public void printArrTest(){

    }
*/
   @Test
    public void popTest(){
       ThingContainer thing1 = new ThingContainer(2);
       ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
       ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
       thing1.add(enum2);
       ColorfulThing expected = enum2;
       ColorfulThing actual = thing1.pop();
       Assert.assertEquals("The expected value is enum3", expected, actual);
   }
    @Test
    public void pop2Test(){
        ThingContainer thing1 = new ThingContainer(2);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        ColorfulThing expected = enum3;
        ColorfulThing actual = thing1.pop();
        Assert.assertEquals("The expected value is enum3", expected, actual);
    }
    @Test
    public void removeTest(){
        ThingContainer thing1 = new ThingContainer(2);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        ColorfulThing.Color expected = enum3.color;
        ColorfulThing.Color actual = thing1.remove(enum3.color);
        Assert.assertEquals("The expected value is enum3", expected, actual);
    }
    @Test
    public void removeTest1_2(){
        ThingContainer thing1 = new ThingContainer(2);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        thing1.remove(enum2.color);
        ColorfulThing.Color expected = enum3.color;
        ColorfulThing.Color actual = thing1.getColorfulArr()[0].getColor();
        Assert.assertEquals("The expected value is enum3", expected, actual);
    }
    @Test
    public void remove2Test(){
        ThingContainer thing1 = new ThingContainer(2);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        ColorfulThing expected = enum3;
        ColorfulThing actual = thing1.remove(enum3);
        Assert.assertEquals("The expected value is enum3", expected, actual);
    }
    @Test
    public void removeTest2_2(){
        ThingContainer thing1 = new ThingContainer(2);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        thing1.remove(enum2);
        ColorfulThing expected = enum3;
        ColorfulThing actual = thing1.getColorfulArr()[0];
        Assert.assertEquals("The expected value is enum3", expected, actual);
    }
}
