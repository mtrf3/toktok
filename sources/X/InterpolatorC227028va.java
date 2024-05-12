package X;

import android.view.animation.Interpolator;

/* renamed from: X.8va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class InterpolatorC227028va implements Interpolator {
    public final float LIZ = 1.71f;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        double pow = Math.pow(2.0d, (-10) * f);
        float f2 = this.LIZ;
        return (float) ((Math.sin(((f - (f2 / 4.0d)) * 6.283185307179586d) / f2) * pow) + 1);
    }
}
