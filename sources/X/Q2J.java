package X;

/* loaded from: classes12.dex */
public enum Q2J {
    NULL(0),
    BOOL(1),
    INT(2),
    LONG(3),
    FLOAT(4),
    DOUBLE(5),
    CHAR(6),
    STRING(7),
    COLLECTION(8),
    UNSUPPORTED(Integer.MAX_VALUE);

    public final int LJLIL;

    public static Q2J valueOf(String str) {
        return (Q2J) V0N.LJJJ(Q2J.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    Q2J(int i) {
        this.LJLIL = i;
    }
}
