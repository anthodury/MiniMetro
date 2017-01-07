package model;

public class Inventory {
    private int lineNb ;
    private int tunnelNb ;
    private int wagonNb ;
    private int trainNb ;
    private int interchangeNb;

    public Inventory () {

    }

    public Inventory (int line,int tunnel, int wagon, int train,int inter) {
        lineNb = line;
        tunnelNb = tunnel;
        wagonNb = wagon;
        trainNb = train;
        interchangeNb = inter;
    }

    public int getTunnelNb()
    {
        return tunnelNb;
    }

    public void subTunnelNb(int t)
    {
        tunnelNb=tunnelNb-t;
    }

    public void addTunnelNb(int t)
    {
        tunnelNb=tunnelNb+t;
    }



    public int getLine()
    {
        return lineNb;
    }

    public void subLine()
    {
        --lineNb;
    }

    public void addLine()
    {
        ++lineNb;
    }


    public int getWagon()
    {
        return wagonNb;
    }

    public void subWagon(int t)
    {
        --wagonNb;
    }

    public void addWagon()
    {
        ++wagonNb;
    }



    public int getTrain()
    {
        return trainNb;
    }

    public void subTrain()
    {
        --trainNb;
    }

    public void addTrain()
    {
        ++trainNb;
    }

}
