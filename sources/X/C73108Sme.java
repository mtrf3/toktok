package X;

import android.animation.TimeInterpolator;

/* renamed from: X.Sme, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73108Sme implements TimeInterpolator {
    public final float LIZ = C17N.LJIILL(8.0d);

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        if (f < 0.4f) {
            f2 = this.LIZ * f;
        } else {
            float f3 = 1;
            if (f > f3 - 0.4f) {
                f2 = (f3 - f) * this.LIZ;
            } else {
                return this.LIZ;
            }
        }
        return f2 / 0.4f;
    }
}
