import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Spritesheet {
    
    public static BufferedImage spritesheet;
    public static BufferedImage spritesheetInimigo;
    public static BufferedImage[] player_front;
    public static BufferedImage tileWall;
    public static BufferedImage tileFloor;
    public static BufferedImage[] inimigo_front;

    public Spritesheet(){
        try {
            spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
            spritesheetInimigo = ImageIO.read(getClass().getResource("/Enemy.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        player_front = new BufferedImage[4];
        inimigo_front = new BufferedImage[3];

        player_front[0] = Spritesheet.getSprite(40, 0, 20, 20);
        player_front[1] = Spritesheet.getSprite(60, 0, 20, 20);
        player_front[2] = Spritesheet.getSprite(80, 0, 20, 20);
        player_front[3] = Spritesheet.getSprite(100, 0, 20, 20);

        inimigo_front[0] = Spritesheet.getSprite(0, 0, 20, 20);
        inimigo_front[1] = Spritesheet.getSprite(20, 0, 20, 20);
        inimigo_front[2] = Spritesheet.getSprite(40, 0, 20, 20);

        tileWall = Spritesheet.getSprite(20, 0, 20, 20);
    }

    public static BufferedImage getSprite(int x, int y, int width, int height){
        return spritesheet.getSubimage(x, y, width, height);
    }

}
