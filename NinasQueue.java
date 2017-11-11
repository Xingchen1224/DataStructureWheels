
import java.util.LinkedList;

public class NinasQueue{
    
    private LinkedList<String> mData;
    
    NinasQueue(){
        mData = new LinkedList<String>();
    }

    public void InQueue(String item){
        mData.push(item);
    }

    public String OutQueue(){
        String element = mData.pop();
        return element;
    }
    
} 