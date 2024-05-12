package X;

import android.view.animation.Interpolator;

/* loaded from: classes15.dex */
public class VRA implements Interpolator {
    public final int LIZ;
    public final int LIZIZ;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i;
        int i2;
        float f2;
        int i3 = this.LIZIZ;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return 0.0f;
                    }
                    int i4 = this.LIZ;
                    int i5 = ((int) (f * i4)) + 1;
                    if (i5 > i4) {
                        i5 = i4;
                    }
                    f2 = i5;
                    i = i4 + 1;
                } else {
                    int i6 = this.LIZ;
                    int i7 = (int) (f * i6);
                    if (i7 == i6) {
                        i7--;
                    }
                    f2 = i7;
                    i = i6 - 1;
                }
                return f2 / i;
            }
            i = this.LIZ;
            i2 = (int) (f * i);
            if (i2 == i) {
                i2--;
            }
        } else {
            i = this.LIZ;
            i2 = ((int) (f * i)) + 1;
            if (i2 > i) {
                i2 = i;
            }
        }
        f2 = i2;
        return f2 / i;
    }

    public VRA(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
