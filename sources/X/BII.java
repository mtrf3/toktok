package X;

/* loaded from: classes6.dex */
public enum BII {
    UNKNOWN(0),
    NOT_START(1),
    ONGOING(2),
    FINISHED(3),
    DELETED(4);

    public final int LJLIL;

    public static BII valueOf(String str) {
        return (BII) V0N.LJJJ(BII.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    BII(int i) {
        this.LJLIL = i;
    }
}
