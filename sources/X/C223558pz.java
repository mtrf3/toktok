package X;

import android.animation.TimeInterpolator;

/* renamed from: X.8pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223558pz implements TimeInterpolator {
    public static final C223558pz LIZ = new C223558pz();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float pow;
        double d = f;
        if (d < 0.7d) {
            pow = f * ((float) Math.pow(0.7d, 3));
        } else {
            pow = (float) Math.pow(d, 4);
        }
        return pow * 90;
    }
}
