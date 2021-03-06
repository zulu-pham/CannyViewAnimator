package com.livetyping.library.animators.property;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;

import com.livetyping.library.interfaces.OutAnimator;

public class PropertyOut extends PropertyCanny implements OutAnimator {

    public PropertyOut(PropertyValuesHolder... holders) {
        super(holders);
    }

    public PropertyOut(Property<?, Float> property, float start, float end) {
        super(property, start, end);
    }

    public PropertyOut(String propertyName, float start, float end) {
        super(propertyName, start, end);
    }

    public PropertyOut setDuration(long millis) {
        propertyAnimator.setDuration(millis);
        return this;
    }

    @Override
    public Animator getOutAnimator(View inChild, View outChild) {
        return getPropertyAnimator(outChild);
    }

}