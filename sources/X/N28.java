package X;

/* loaded from: classes11.dex */
public enum N28 {
    NO_PRELOAD(0),
    HIGH(1),
    NORMAL(2),
    LOW(3);

    public final int LJLIL;

    public static N28 valueOf(String str) {
        return (N28) V0N.LJJJ(N28.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    N28(int i) {
        this.LJLIL = i;
    }
}
