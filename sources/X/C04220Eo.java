package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04220Eo extends Drawable {
    public static final double LIZ = Math.cos(Math.toRadians(45.0d));
    public static final /* synthetic */ int LIZIZ = 0;

    public static float LIZ(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - LIZ) * f2) + (f * 1.5f));
        }
        return f * 1.5f;
    }
}
