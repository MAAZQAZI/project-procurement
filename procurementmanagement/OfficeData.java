/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementmanagement;

/**
 *
 * @author qaziz
 */
public class OfficeData extends Employee{
       private int chairs;
    private int Fdrives;
    private int files;
    private int projector;
    private int leptop;

    

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getFdrives() {
        return Fdrives;
    }

    public void setFdrives(int Fdrives) {
        this.Fdrives = Fdrives;
    }

    public int getFiles() {
        return files;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public int getProjector() {
        return projector;
    }

    public void setProjector(int projector) {
        this.projector = projector;
    }

    public int getLeptop() {
        return leptop;
    }

    public void setLeptop(int leptop) {
        this.leptop = leptop;
    }
    
    public String toString()
    {
        String line="";
        line=chairs+" "+Fdrives+" "+files+" "+projector+" "+leptop;
        return line;
    }
}
