package X;

import android.view.animation.Interpolator;

/* loaded from: classes11.dex */
public final class O84 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}
