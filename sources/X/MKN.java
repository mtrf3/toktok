package X;

import android.view.animation.Interpolator;

/* loaded from: classes10.dex */
public final class MKN implements Interpolator {
    public static final MKN LIZ = new MKN();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}
