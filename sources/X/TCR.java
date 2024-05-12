package X;

import android.view.animation.Interpolator;

/* loaded from: classes13.dex */
public final class TCR implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d = 4.0f;
        return (float) ((Math.sin(((f - (d / 4.0d)) * 6.283185307179586d) / d) * Math.pow(2.0d, (-10) * f)) + 1);
    }
}
