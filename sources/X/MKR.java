package X;

import android.view.animation.Interpolator;

/* loaded from: classes10.dex */
public final class MKR implements Interpolator {
    public static final MKR LIZ = new MKR();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}
