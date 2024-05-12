package X;

/* loaded from: classes10.dex */
public final class LAB {
    public static final LAB LIZ = new LAB();
    public static final int LIZIZ = 1;
    public static boolean LIZJ;

    public static boolean LIZ() {
        if (!LIZJ) {
            boolean LIZIZ2 = LIZIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CreatorInboxExperiment manual = ");
            LIZ2.append(LIZIZ2);
            C56204M4a.LIZLLL(X1D.LIZIZ(LIZ2));
            C2WG.LIZ().storeBoolean("creator_user_exp", LIZIZ2);
            FH5.LIZIZ().LJFF(LAB.class, LAC.LJLIL);
            LIZJ = true;
        }
        if (C2WG.LIZ().getBoolean("creator_user_exp", false) && C53364Kwy.LIZ() && !C53357Kwr.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (C00F.LIZ(31744, 0, "creator_inbox_experiment", false) < LIZIZ) {
            return false;
        }
        return true;
    }
}
