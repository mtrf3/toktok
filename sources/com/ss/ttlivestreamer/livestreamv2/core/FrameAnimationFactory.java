package com.ss.ttlivestreamer.livestreamv2.core;

import android.graphics.RectF;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;

/* loaded from: classes12.dex */
public class FrameAnimationFactory {
    public static FrameAnimationBase create(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new FrameAnimationBase(i, layer, j, rectF, i2);
                    }
                    return new FrameAnimationMove(3, layer, j, rectF, i2);
                }
                return new FrameAnimationGradualRect(2, layer, j, rectF, i2);
            }
            return new FrameAnimationRotation(1, layer, j, rectF, i2);
        }
        return null;
    }
}
