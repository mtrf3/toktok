package X;

import android.animation.TimeInterpolator;

/* renamed from: X.ZqF, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91167ZqF implements TimeInterpolator {
    public static final C91167ZqF LIZ = new C91167ZqF();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
    }
}
