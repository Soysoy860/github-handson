import java.util.*;
public class Hero {
    private String name;
    public  Hero(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){//戻り値がないからvoid
        this.name =name;
    }
    Map <String,String> characters = new HashMap<String,String>();

}
