package com.p4f.kareem.rad_eye.humanMapListener;

import android.support.annotation.Nullable;

import com.p4f.kareem.rad_eye.human_map.properties.HumanNegativeEffect;

/**
 * Created by mohamednagy on 4/28/2017.
 */
public abstract class OnNegativeEffectClickListener implements HumanMapClickListener {
    @Override
    public abstract void onClick(@Nullable HumanNegativeEffect humanNegativeEffect);

}
