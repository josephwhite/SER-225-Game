package Engine;

import java.awt.Color;
import Utils.Colors;

<<<<<<< HEAD
=======
import java.awt.*;

/*
 * This class holds some constants like window width/height and resource folder locations
 * Tweak these as needed, they shouldn't break anything (keyword shouldn't).
 */
>>>>>>> f67e21e79443c4bbffa7c61fd2d39ad1b0823f04
public class Config {
    public static final int FPS = 100;
    public static final String RESOURCES_PATH = "Resources/";
    public static final String MAP_FILES_PATH = "MapFiles/";
    public static final int GAME_WINDOW_WIDTH = 800;
    public static final int GAME_WINDOW_HEIGHT = 605;
    public static final Color TRANSPARENT_COLOR = Colors.MAGENTA;

    // prevents Config from being instantiated -- it's my way of making a "static" class like C# has
    private Config() { }
}
