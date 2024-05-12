package X;

import android.animation.TimeInterpolator;

/* renamed from: X.MCq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56428MCq implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (0.5f >= f && f > 0.2f) {
            return 1 - ((f - 0.2f) / 0.3f);
        }
        if (f <= 0.5f || f >= 0.8f) {
            return 1.0f;
        }
        return 1 - ((0.8f - f) / 0.3f);
    }
}
