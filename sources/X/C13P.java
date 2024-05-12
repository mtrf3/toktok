package X;

import android.content.Context;

/* renamed from: X.13P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13P {
    public static String LIZ(int i, Context context) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return KMP.LJ("?", i);
            }
        }
        return "UNKNOWN";
    }

    public static String LIZIZ(C45601qe c45601qe, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return c45601qe.getContext().getResources().getResourceEntryName(i);
    }
}
