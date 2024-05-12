package X;

import android.view.animation.Interpolator;

/* renamed from: X.LOc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class InterpolatorC54178LOc implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.sin(((f - (4.0f / 4)) * 6.283185307179586d) / 4.0f) * Math.pow(2.0d, (-10) * f)) + 1);
    }
}
