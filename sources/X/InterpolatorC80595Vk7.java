package X;

import android.view.animation.Interpolator;

/* renamed from: X.Vk7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class InterpolatorC80595Vk7 implements Interpolator {
    public static final InterpolatorC80595Vk7 LIZ = new InterpolatorC80595Vk7();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}