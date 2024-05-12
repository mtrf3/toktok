package X;

/* renamed from: X.Kfw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52308Kfw {
    public static int LIZ = -1;

    public static boolean LIZ() {
        if (LIZ < 0) {
            int LIZ2 = C00F.LIZ(31744, 0, "multi_tab_opt", true);
            LIZ = LIZ2;
            if (LIZ2 < 0) {
                LIZ = 0;
            }
            if (!C52307Kfv.LIZ()) {
                LIZ = 0;
            }
        }
        if (LIZ != 1) {
            return false;
        }
        return true;
    }
}
