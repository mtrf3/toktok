package X;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes15.dex */
public final class WNF implements Interpolator {
    public final Interpolator LIZ;

    public WNF() {
        this(new LinearInterpolator());
    }

    public WNF(Interpolator interpolator) {
        this.LIZ = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.LIZ.getInterpolation(f);
    }
}
