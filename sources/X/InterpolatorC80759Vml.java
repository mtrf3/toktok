package X;

import android.view.animation.Interpolator;

/* renamed from: X.Vml, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class InterpolatorC80759Vml implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}