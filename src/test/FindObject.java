
package test;

import gerador.SerialGenerator;

public class FindObject implements Runnable{

    private String group;
    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    @Override
    public void run() {
    
        String result = "";
        
        while(!result.equals(group)){
            
            SerialGenerator sg = new SerialGenerator();
            
            result = sg.generateAlphaNumericSerial(1, group.length(), true);
            System.out.println("Resultado Thread "+pid+" "+result);
            
        }
    
    }
    
}
