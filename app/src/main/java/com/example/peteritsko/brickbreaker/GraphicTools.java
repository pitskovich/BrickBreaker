package com.example.peteritsko.brickbreaker;

import android.widget.ImageView;

/**
 * Created by PeterItsko on 11/23/17.
 */

public class GraphicTools {
    public static boolean graphicSelected (ImageView inGraphic, float x, float y){
        if (x > inGraphic.getX()
                && x < (inGraphic.getX() + inGraphic.getWidth())
                && y > inGraphic.getY()
                && y < (inGraphic.getY() + inGraphic.getHeight()))
        {
            return true;
        }
        return false;
    }
}
