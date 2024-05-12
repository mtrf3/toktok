package X;

/* renamed from: X.9RI, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9RI {
    DEFAULT(0),
    LOADING(1),
    FAILED(2);

    public final int LJLIL;

    public static C9RI valueOf(String str) {
        return (C9RI) V0N.LJJJ(C9RI.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C9RI(int i) {
        this.LJLIL = i;
    }
}
