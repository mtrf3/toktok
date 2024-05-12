package X;

import android.view.animation.Interpolator;

/* renamed from: X.58T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58T implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.sin(((f - (4.0f / 4)) * 6.283185307179586d) / 4.0f) * Math.pow(2.0d, (-10) * f)) + 1);
    }
}
