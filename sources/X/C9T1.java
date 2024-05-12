package X;

/* renamed from: X.9T1, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9T1 {
    PROFILE("101"),
    OTHER_PROFILE("201");

    public final String LJLIL;

    public static C9T1 valueOf(String str) {
        return (C9T1) V0N.LJJJ(C9T1.class, str);
    }

    public final String getId() {
        return this.LJLIL;
    }

    C9T1(String str) {
        this.LJLIL = str;
    }
}
