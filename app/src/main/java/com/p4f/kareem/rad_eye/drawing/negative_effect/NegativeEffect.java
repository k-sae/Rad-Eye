package com.p4f.kareem.rad_eye.drawing.negative_effect;

import android.graphics.Paint;

import com.p4f.kareem.rad_eye.humanMapListener.OnNegativeEffectClickListener;
import com.p4f.kareem.rad_eye.human_map.properties.HumanNegativeEffect;

/**
 * Created by mohamednagy on 4/28/2017.
 */
public abstract class NegativeEffect {

    protected String m_id;
    protected Paint m_paint;
    protected boolean m_effect;

    public abstract void setEffectOn();
    public abstract void setEffectOff();
    public abstract HumanNegativeEffect checkClickedPosition(int x, int y);
    public abstract void setOnNegativeEffectListener(
            OnNegativeEffectClickListener onNegativeEffectClickListener);
    public abstract boolean getM_effect();
    public abstract boolean setM_effect();

}
