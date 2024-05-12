package X;

import com.bytedance.keva.Keva;

/* renamed from: X.JEn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48833JEn {
    public static ChoreographerFrameCallbackC48830JEk LIZ;
    public static C48832JEm LIZIZ;
    public static int LIZJ;
    public static final boolean LIZLLL;

    static {
        boolean z = false;
        int i = Keva.getRepo("vsync_probe_repo").getInt("key", 0);
        LIZJ = i;
        if ((i & 4) > 0) {
            z = true;
        }
        LIZLLL = z;
    }

    public static void LIZ(boolean z, boolean z2) {
        int i;
        int i2 = LIZJ;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = i | i2;
        LIZJ = i3;
        if (z2) {
            LIZJ = i3 | 4;
        }
        Keva.getRepo("vsync_probe_repo").storeInt("key", LIZJ);
    }
}
