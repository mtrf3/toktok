package X;

import android.animation.TimeInterpolator;

/* renamed from: X.LOf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54181LOf implements TimeInterpolator {
    public static final C54181LOf LIZ = new C54181LOf();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
    }
}
