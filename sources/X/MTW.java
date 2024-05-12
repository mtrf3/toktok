package X;

/* loaded from: classes10.dex */
public enum MTW {
    UN_SUPPORT(0),
    LATEST(1),
    DEFAULT(2);

    public final int LJLIL;

    public static MTW valueOf(String str) {
        return (MTW) V0N.LJJJ(MTW.class, str);
    }

    public final int getId() {
        return this.LJLIL;
    }

    MTW(int i) {
        this.LJLIL = i;
    }
}
