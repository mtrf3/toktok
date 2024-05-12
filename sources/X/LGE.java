package X;

/* loaded from: classes10.dex */
public enum LGE {
    FOLLOW(0),
    FOR_YOU(1),
    SHOP(101),
    FRIENDS(102),
    STEM(103);

    public static final LGF Companion = new LGF();
    public final int LJLIL;

    public static final LGE from(int i) {
        Companion.getClass();
        return LGF.LIZ(i);
    }

    public static LGE valueOf(String str) {
        return (LGE) V0N.LJJJ(LGE.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    LGE(int i) {
        this.LJLIL = i;
    }
}
