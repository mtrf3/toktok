package X;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.WEy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class InterpolatorC81968WEy implements Interpolator {
    public Interpolator LIZ = new DecelerateInterpolator();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        Interpolator interpolator = this.LIZ;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }
}
