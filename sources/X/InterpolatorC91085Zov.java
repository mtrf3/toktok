package X;

import android.view.animation.Interpolator;

/* renamed from: X.Zov, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class InterpolatorC91085Zov implements Interpolator {
    public final float LIZ;

    public InterpolatorC91085Zov(float f) {
        this.LIZ = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin(((f - (r6 / 4)) * 6.283185307179586d) / this.LIZ)) + 1);
    }
}
