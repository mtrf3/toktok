package X;

import android.animation.TimeInterpolator;

/* renamed from: X.ZpN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91113ZpN implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin(((f - (1.2f / 4)) * 6.283185307179586d) / 1.2f)) + 1);
    }
}
