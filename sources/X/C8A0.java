package X;

/* renamed from: X.8A0, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8A0 {
    NONE(0),
    TITLE(1),
    DESC(2),
    TITLE_AND_DESC(3);

    public final int LJLIL;

    public static C8A0 valueOf(String str) {
        return (C8A0) V0N.LJJJ(C8A0.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C8A0(int i) {
        this.LJLIL = i;
    }
}
