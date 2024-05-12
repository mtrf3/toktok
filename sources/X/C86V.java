package X;

import android.content.res.Resources;

/* renamed from: X.86V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86V {
    public static Resources LJ() {
        return EF7.LIZIZ().getResources();
    }

    public static int LIZIZ(int i) {
        return LJ().getColor(i);
    }

    public static String LJFF(int i) {
        return LJ().getString(i);
    }

    public static String LIZJ(int i, int i2) {
        return LJ().getQuantityString(i, i2);
    }

    public static String LIZLLL(int i, int i2, Object... objArr) {
        return LJ().getQuantityString(i, i2, objArr);
    }
}
