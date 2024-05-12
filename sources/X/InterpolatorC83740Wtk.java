package X;

import android.view.animation.Interpolator;

/* renamed from: X.Wtk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class InterpolatorC83740Wtk implements Interpolator {
    public C38501fC LIZ;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        C38501fC c38501fC = this.LIZ;
        if (c38501fC == null) {
            return f;
        }
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f = 1.0f;
        }
        float[] fArr = (float[]) c38501fC.LJLILLLLZI;
        int length = fArr.length - 1;
        float f3 = length;
        float f4 = 1.0f / f3;
        int i = (int) (f3 * f);
        int min = Math.min(i + 1, length);
        if (i == min) {
            return fArr[length];
        }
        float f5 = i * f4;
        float f6 = fArr[i];
        return C06420Na.LIZIZ(fArr[min], f6, (f - f5) / ((f4 + f5) - f5), f6);
    }
}
