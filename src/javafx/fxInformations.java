package javafx;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Created by romainhry on 07/01/2017.
 */
public class fxInformations extends Group {

    private Text nbTunnel;
    private Text nbTrain;
    private Text nbWagon;
    private Text nbLine;

    private ImageView imageTunnel;
    private ImageView imageTrain;
    private ImageView imageWagon;
    private ImageView imageLine;



    public fxInformations(double posX, double posY){
        super();

        imageTunnel = new ImageView(new Image(this.getClass().getResource("/img/tunnel.png").toString(),40,40,false,false));
        imageTrain = new ImageView(new Image(this.getClass().getResource("/img/train.png").toString(),40,40,false,false));
        imageWagon = new ImageView(new Image(this.getClass().getResource("/img/wagon.png").toString(),40,40,false,false));
        imageLine = new ImageView(new Image(this.getClass().getResource("/img/rails.png").toString(),40,40,false,false));

        imageTrain.setX(posX);
        imageTrain.setY(posY);
        nbTrain = new Text(posX+40, posY+5,"3");
        nbTrain.setFill(Color.CHOCOLATE);
        nbTrain.setFont(Font.font(null, FontWeight.BOLD,15));

        imageWagon.setX(posX+65);
        imageWagon.setY(posY+4);
        nbWagon = new Text(posX+105, posY+5,"0");
        nbWagon.setFill(Color.CHOCOLATE);
        nbWagon.setFont(Font.font(null, FontWeight.BOLD,15));

        imageLine.setX(posX+130);
        imageLine.setY(posY+6);
        nbLine = new Text(posX+170, posY+5,"3");
        nbLine.setFill(Color.CHOCOLATE);
        nbLine.setFont(Font.font(null, FontWeight.BOLD,15));

        imageTunnel.setX(posX+195);
        imageTunnel.setY(posY);
        nbTunnel = new Text(posX+235, posY+5,"3");
        nbTunnel.setFill(Color.CHOCOLATE);
        nbTunnel.setFont(Font.font(null, FontWeight.BOLD,15));

        getChildren().add(nbLine);
        getChildren().add(nbTrain);
        getChildren().add(nbTunnel);
        getChildren().add(nbWagon);

        getChildren().add(imageLine);
        getChildren().add(imageTrain);
        getChildren().add(imageTunnel);
        getChildren().add(imageWagon);

    }

    public void setNbTunnel(int i)
    {
        nbTunnel.setText(Integer.toString(i));
    }

    public void setNbTrain(int i)
    {
        nbTrain.setText(Integer.toString(i));
    }

    public void setNbWagon(int i)
    {
        nbWagon.setText(Integer.toString(i));
    }

    public void setNbLine(int i)
    {
        nbLine.setText(Integer.toString(i));
    }

    public ImageView getImageTrain()
    {
        return imageTrain;
    }

    public ImageView getImageWagon()
    {
        return imageWagon;
    }





}
