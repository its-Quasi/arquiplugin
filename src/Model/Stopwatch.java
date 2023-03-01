/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FELIPE
 */
public class Stopwatch {
    public int hours;
    public int minutes;
    public int seconds;
    
    public Stopwatch(){
        this.hours = this.minutes = this.seconds = 0;
    }
    
    public Stopwatch(int hours, int minutes, int seconds){    
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public String toString(){
        String crono = new String();
        if(this.hours < 10) crono += "0";
        crono += hours+":";
        if(this.minutes < 10) crono += "0";
        crono += minutes+":";
        if(seconds < 10) crono += "0";
        crono += seconds;
        return crono;
    }  
    
    public void decreaseSeconds(){
        this.seconds--;
        if(this.seconds < 0) {
            decreaseMinutes();
            this.seconds = 60;
        }
    }
    
    private void decreaseMinutes(){
        this.minutes--;
        if(this.minutes < 0) {
            decreaseHours();
            this.minutes = 60;
        }
    }
    
    private void decreaseHours(){
        this.hours--;
        if(this.hours < 0){ 
            hours = minutes = seconds = 0;
        }
    }
    public boolean finished(){
        return hours + seconds + minutes == 0;
    }
    public void toFinish(){
        this.hours = this.minutes = this.seconds = 0;
    }
}
