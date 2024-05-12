package X;

/* renamed from: X.3PB, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3PB {
    SINGLE("private"),
    GROUP("group");

    public final String LJLIL;

    public static C3PB valueOf(String str) {
        return (C3PB) V0N.LJJJ(C3PB.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    C3PB(String str) {
        this.LJLIL = str;
    }
}
