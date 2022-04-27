package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode 
{
    private String name;
    private int length;
    private boolean limbs;
    private String gender;
    private boolean eyes;


    @Override
    public String toString()
    {
        return "Nematode" + name + ", length" + length + ", limbs: " + limbs + ", gender: " + gender + ", eyes: " + eyes;
    }    


    public Nematode(TableRow tr)
    {
        this
        (
            tr.getString("Name"),
            tr.getInt("Length"),
            tr.getInt("Limbs?") == 1,
            tr.getString("Gender"),
            tr.getInt("Eyes?") ==1
        );
    }

    public Nematode(String name, int length, boolean limbs, String gender, boolean eyes) 
    {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }

    public boolean isLimbs()
    {
        return limbs;
    }
    public void setLimbs(boolean limbs)
    {
        this.limbs = limbs;
    }

    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public boolean isEyes()
    {
        return eyes;
    }
    public void setEyes(boolean eyes)
    {
        this.eyes = eyes;
    }

}
