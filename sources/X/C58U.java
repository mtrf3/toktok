package X;

import android.view.animation.Interpolator;

/* renamed from: X.58U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58U implements Interpolator {
    public final float LIZ;

    public C58U(float f) {
        this.LIZ = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.sin(((f - (r4 / 4)) * 6.283185307179586d) / this.LIZ) * Math.pow(2.0d, (-10) * f)) + 1);
    }
}
