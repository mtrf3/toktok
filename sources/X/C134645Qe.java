package X;

import android.graphics.Color;

/* renamed from: X.5Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134645Qe {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new OJD("^#[0-9A-Fa-f]{6}$");
        new OJD("^#[0-9A-Fa-f]{8}$");
    }

    public static int LIZ(float f, int i) {
        return Color.argb((int) (Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
