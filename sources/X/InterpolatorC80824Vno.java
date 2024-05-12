package X;

import android.view.animation.Interpolator;

/* renamed from: X.Vno, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class InterpolatorC80824Vno implements Interpolator {
    public static final InterpolatorC80824Vno LIZ = new InterpolatorC80824Vno();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}
