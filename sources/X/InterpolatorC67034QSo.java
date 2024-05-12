package X;

import android.view.animation.Interpolator;

/* renamed from: X.QSo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class InterpolatorC67034QSo implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float exp;
        float f2 = 2;
        float sqrt = 42.0f / (((float) Math.sqrt(640.0f)) * f2);
        float sqrt2 = (float) Math.sqrt(640.0f);
        float f3 = 1;
        float sqrt3 = ((float) Math.sqrt(Math.abs(f3 - ((float) Math.pow(sqrt, 2))))) * sqrt2;
        float f4 = sqrt2 * sqrt;
        if (sqrt < f3) {
            double d = f * sqrt3;
            exp = C1I1.LIZ(((f4 * f3) + (-0.0f)) / sqrt3, (float) Math.sin(d), ((float) Math.cos(d)) * f3, (float) Math.exp((-f4) * f));
        } else if (sqrt > f3) {
            float f5 = (((f4 + sqrt3) * f3) / (f2 * sqrt3)) + (-0.0f);
            exp = C1I1.LIZ(f3 - f5, (float) Math.exp((-sqrt3) * f), ((float) Math.exp(sqrt3 * f)) * f5, (float) Math.exp((-f4) * f));
        } else {
            exp = (((f4 * f3) + (-0.0f)) * f) + f3 + ((float) Math.exp((-f4) * f));
        }
        return f3 - exp;
    }
}
