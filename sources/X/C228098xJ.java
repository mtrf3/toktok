package X;

/* renamed from: X.8xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228098xJ {
    public static final int LIZ;

    public static int LIZ() {
        if (C228088xI.LIZ) {
            return LIZ;
        }
        return C00F.LIZ(31744, 0, "playlist_auto_play_and_add_sequence", true);
    }

    static {
        FFL.LJIIIZ().getClass();
        LIZ = FFL.LJIIJ(31744, 0, "playlist_auto_play_and_add_sequence", true);
    }

    public static boolean LIZIZ() {
        int LIZ2 = LIZ();
        if (LIZ2 == 1 || LIZ2 == 3 || LIZ2 == 4) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        int LIZ2 = LIZ();
        if (LIZ2 == 2 || LIZ2 == 3 || LIZ2 == 4) {
            return true;
        }
        return false;
    }
}
