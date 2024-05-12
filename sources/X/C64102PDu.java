package X;

import android.content.SharedPreferences;

/* renamed from: X.PDu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64102PDu {
    public static volatile boolean LIZ = false;
    public static SharedPreferences LIZIZ = null;
    public static int LIZJ = 0;
    public static int LIZLLL = 0;
    public static long LJ = 16408;

    public static boolean LIZ(int i) {
        if ((i & LIZJ) != 0) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, boolean z) {
        if (z) {
            LIZLLL = i | LIZLLL;
        } else {
            LIZLLL = (~i) & LIZLLL;
        }
    }
}
