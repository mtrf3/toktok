package X;

/* loaded from: classes6.dex */
public enum CWD {
    RIGHT_BOTTOM(1),
    RIGHT_TOP(2),
    LEFT_BOTTOM(3),
    LEFT_TOP(4);

    public final int LJLIL;

    public static CWD valueOf(String str) {
        return (CWD) V0N.LJJJ(CWD.class, str);
    }

    public final boolean isLeft() {
        if (this == LEFT_TOP || this == LEFT_BOTTOM) {
            return true;
        }
        return false;
    }

    public final boolean isTop() {
        if (this == LEFT_TOP || this == RIGHT_TOP) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    CWD(int i) {
        this.LJLIL = i;
    }
}
