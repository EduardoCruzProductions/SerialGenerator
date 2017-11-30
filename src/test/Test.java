package test;

import java.util.ArrayList;
import java.util.List;



public class Test {
    

    public static void main(String[] args) {

        List<String> codes = new ArrayList<>();
        
        codes.add("6s");
        codes.add("d5");
        codes.add("s5");
        
        
        
        FindObject fo = new FindObject();
        fo.setGroup("62");
        fo.setPid(1);
        
        FindObject fo1 = new FindObject();
        fo1.setGroup("61");
        fo1.setPid(2);
        
        FindObject fo2 = new FindObject();
        fo2.setGroup("63");
        fo2.setPid(3);
        
        Thread p1 = new Thread(fo);
        p1.start();
       
        Thread p2 = new Thread(fo1);
        p2.start();
        
        Thread p3 = new Thread(fo2);
        p3.start();
        
    
    }
    
}
