package X;

/* loaded from: classes10.dex */
public final class LAE {
    public static final LAE LIZ = new LAE();
    public static final int LIZIZ = 1;
    public static boolean LIZJ;

    public static boolean LIZ() {
        if (!LIZJ) {
            if (!C2WG.LIZ().getBoolean("creator_hack_flag", false)) {
                boolean LIZIZ2 = LIZIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CreatorInboxExperiment manual = ");
                LIZ2.append(LIZIZ2);
                C56204M4a.LIZLLL(X1D.LIZIZ(LIZ2));
                C2WG.LIZ().storeBoolean("creator_user_setting", LIZIZ2);
            } else {
                C10K.LJII(10000L).LIZLLL(LAF.LIZ);
            }
            FH5.LIZIZ().LJFF(LAE.class, LAD.LJLIL);
            LIZJ = true;
        }
        return C2WG.LIZ().getBoolean("creator_user_setting", true);
    }

    public static boolean LIZIZ() {
        if (Q7K.LIZIZ("enable_creator_inbox", 1) == LIZIZ) {
            return true;
        }
        return false;
    }
}
