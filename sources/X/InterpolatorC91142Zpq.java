package X;

import android.view.animation.Interpolator;

/* renamed from: X.Zpq, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class InterpolatorC91142Zpq implements Interpolator {
    public static final InterpolatorC91142Zpq LIZ = new InterpolatorC91142Zpq();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
