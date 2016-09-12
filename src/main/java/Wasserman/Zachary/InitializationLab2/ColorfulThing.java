package Wasserman.Zachary.InitializationLab2;

/**
 * Created by zacharywasserman on 9/10/16.
 */
public class ColorfulThing {

    public enum Color{
        RED, BLURPLE, BLUE
    }
    public Color color;
    public ColorfulThing(Color color ){
        this.color = color;
    }
    public Color getColor(){
        //this.colors = colors;
        return color;
        //return colorName;
    }
}
