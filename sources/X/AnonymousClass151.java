package X;

/* renamed from: X.151, reason: invalid class name */
/* loaded from: classes.dex */
public enum AnonymousClass151 {
    Simultaneously,
    Individually;

    public static AnonymousClass151 forId(int i) {
        if (i != 1) {
            if (i == 2) {
                return Individually;
            }
            throw new IllegalArgumentException(KMP.LJ("Unknown trim path type ", i));
        }
        return Simultaneously;
    }

    public static AnonymousClass151 valueOf(String str) {
        return (AnonymousClass151) V0N.LJJJ(AnonymousClass151.class, str);
    }
}
