package Wasserman.Zachary.InitializationLab2;

/**
 * Created by zacharywasserman on 9/11/16.
 */
public class InitializationLab2 {
    public static void main(String[] args) {

        ColorfulThing enum1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing enum2 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing enum3 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        ColorfulThing enum4 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        ThingContainer thing1 = new ThingContainer(2);
        thing1.add(enum1);
        thing1.add(enum2);
        thing1.add(enum3);
        // print colorArr
        thing1.printArr();
        // removes last element in array and returns removed value
        System.out.println(thing1.pop());
        thing1 = new ThingContainer(2);
        enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        System.out.println("");
        // remove element using color value and returns it
        System.out.println(thing1.remove(enum1.color));
        System.out.println("");
        //prints out sorted method
        thing1.printArr();
        thing1 = new ThingContainer(2);
        enum3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        enum2 = new ColorfulThing(ColorfulThing.Color.BLURPLE);
        thing1.add(enum2);
        thing1.add(enum3);
        System.out.println("");
        // remove element using colorfulThing object and returns it
        System.out.println(thing1.remove(enum3));
        System.out.println("");
        //print out sorted array
        thing1.printArr();

        ThingContainer container = new ThingContainer(ColorfulThing[enum4]);

    }
}
