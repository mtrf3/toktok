package X;

import android.view.animation.Interpolator;

/* renamed from: X.0Qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC07420Qw implements Interpolator {
    public final float[] LIZ;
    public final float LIZIZ;

    public AbstractInterpolatorC07420Qw(float[] fArr) {
        this.LIZ = fArr;
        this.LIZIZ = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.LIZ;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.LIZIZ;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.LIZ;
        float f4 = fArr2[min];
        return C06420Na.LIZIZ(fArr2[min + 1], f4, f3, f4);
    }
}
