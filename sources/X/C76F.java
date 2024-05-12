package X;

/* renamed from: X.76F, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C76F {
    DEFAULT(-1),
    NO_RELATION(0),
    FOLLOW(1),
    MUTUAL_FOLLOW(2),
    MATCHED_FRIEND(3);

    public final int LJLIL;

    public static C76F valueOf(String str) {
        return (C76F) V0N.LJJJ(C76F.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C76F(int i) {
        this.LJLIL = i;
    }
}
