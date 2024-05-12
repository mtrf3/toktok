package X;

/* renamed from: X.6SS, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C6SS {
    AUTO("auto"),
    MANUAL("manual");

    public final String LJLIL;

    public static C6SS valueOf(String str) {
        return (C6SS) V0N.LJJJ(C6SS.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    C6SS(String str) {
        this.LJLIL = str;
    }
}
