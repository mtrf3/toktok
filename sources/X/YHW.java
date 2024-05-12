package X;

/* loaded from: classes16.dex */
public enum YHW {
    SHOWN(1),
    UNSHOWN_NONADJUSTABLE(2),
    UNSHOWN_ADJUSTABLE(3);

    public final int LJLIL;

    public static YHW valueOf(String str) {
        return (YHW) V0N.LJJJ(YHW.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    YHW(int i) {
        this.LJLIL = i;
    }
}
