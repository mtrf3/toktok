package X;

/* renamed from: X.0U1, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0U1 {
    NONE(0),
    FULL_SCREEN(1),
    HORIZONTAL(2),
    VERTICAL(3);

    public final int LJLIL;

    public static C0U1 valueOf(String str) {
        return (C0U1) V0N.LJJJ(C0U1.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C0U1(int i) {
        this.LJLIL = i;
    }
}
