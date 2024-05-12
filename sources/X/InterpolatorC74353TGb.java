package X;

import android.view.animation.Interpolator;

/* renamed from: X.TGb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class InterpolatorC74353TGb implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((Math.sin(((f - (2.3f / 4)) * 6.283185307179586d) / 2.3f) * Math.pow(2.0d, (-10) * f)) + 1);
    }
}
