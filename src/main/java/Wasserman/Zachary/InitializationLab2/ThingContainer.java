package Wasserman.Zachary.InitializationLab2;

/**
 * Created by zacharywasserman on 9/10/16.
 */
public class ThingContainer {

    private int arraySize;
    private ColorfulThing[] colorfulArr;

    public ThingContainer(int arraySize){

        this.arraySize = arraySize;
        this.colorfulArr = new ColorfulThing[arraySize];
    }
    public ThingContainer(ColorfulThing[] color){

        this.colorfulArr = color;
    }



    public void add(ColorfulThing colorfulThing) {
        for (int i = 0; i <= arraySize; i++) {
            if (i > arraySize-1) {
                System.out.println("ThingContainer is full.");
            }
            else if(colorfulArr[i] == null ){
                colorfulArr[i] = colorfulThing;
                break;

            }

        }

    }
    public ColorfulThing pop(){
            ColorfulThing returned = null;
        for(int i = 0; i < colorfulArr.length; i++){
            if (colorfulArr[i] == null){
                returned = colorfulArr[i - 1];
                colorfulArr[i - 1] = null;

            }
            else if(i == colorfulArr.length-1){
                returned = colorfulArr[i];
                colorfulArr[i] = null;
           }

        }
        return returned;
    }
    public ColorfulThing.Color remove(ColorfulThing.Color color){
        ColorfulThing.Color returned = null;
        for(int i = 0; i < colorfulArr.length; i++){
            if (colorfulArr[i].color == color){
                returned = colorfulArr[i].color;
                colorfulArr[i] = null;


            }
            if(colorfulArr[i] != null && i != 0){
                colorfulArr[i -1] = colorfulArr[i];
                colorfulArr[i] = null;
            }

    }
        return returned;
    }
    public ColorfulThing remove(ColorfulThing color){
        ColorfulThing returned = null;
        for(int i = 0; i < colorfulArr.length; i++){
            if (colorfulArr[i] == color){
                returned = colorfulArr[1];
                colorfulArr[i] = null;

            }
            if(colorfulArr[i] != null && i != 0){
                colorfulArr[i -1] = colorfulArr[i];
                colorfulArr[i] = null;
            }

        }
        return returned;
    }
    public void printArr(){
        for (ColorfulThing x : colorfulArr) {
            System.out.println(x);
        }{
    }


    }
    public int getArraySize() {
        return arraySize;
    }

    public ColorfulThing[] getColorfulArr() {
        return colorfulArr;
    }
}
