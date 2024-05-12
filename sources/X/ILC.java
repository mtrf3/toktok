package X;

/* loaded from: classes9.dex */
public enum ILC {
    PLAY_IN_ORDER,
    REPEAT;

    public static ILC valueOf(String str) {
        return (ILC) V0N.LJJJ(ILC.class, str);
    }

    public final String toMobString() {
        int i = C46417IJp.LIZ[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "repeat";
            }
            throw new C162476Zf();
        }
        return "order";
    }
}
