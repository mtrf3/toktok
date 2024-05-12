package X;

import android.view.animation.Interpolator;

/* renamed from: X.0B2, reason: invalid class name */
/* loaded from: classes.dex */
public class C0B2 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}
