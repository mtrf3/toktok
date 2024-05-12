package X;

/* renamed from: X.Kfx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52309Kfx {
    public static int LIZ = -1;

    public static boolean LIZ() {
        if (LIZ < 0) {
            int LIZ2 = C00F.LIZ(31744, 0, "multi_tab_enable", true);
            LIZ = LIZ2;
            if (LIZ2 < 0) {
                LIZ = 0;
            }
        }
        if (LIZ != 1 && !C52308Kfw.LIZ()) {
            return false;
        }
        return true;
    }
}
