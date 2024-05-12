package X;

import android.view.animation.Interpolator;

/* renamed from: X.0B3, reason: invalid class name */
/* loaded from: classes.dex */
public class C0B3 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}
