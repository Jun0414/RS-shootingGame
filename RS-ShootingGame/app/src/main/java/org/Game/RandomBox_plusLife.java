package org.Game;

import android.graphics.Bitmap;

import com.example.gameframework.AppManager;
import com.example.gameframework.R;

import org.Game.RandomBox;

public class RandomBox_plusLife extends RandomBox {
    public RandomBox_plusLife() {
        super(AppManager.getInstance().getBitmap(R.drawable.randombox));
        this.initSpriteData(120,120,1,1);
        speed = 10;
        boxtype = 3;
    }

    @Override
    public void Update(long gameTime) {
        super.Update(gameTime);
        m_BoundBox.set(m_x,m_y,m_x+120,m_y+120);
    }
}
