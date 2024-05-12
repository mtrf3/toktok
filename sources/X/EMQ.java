package X;

/* loaded from: classes7.dex */
public enum EMQ {
    AUTHORIZATION(1),
    THIRD_PART_NAME(2),
    OPT_AUTHORIZATION(3);

    public final int LJLIL;

    public static EMQ valueOf(String str) {
        return (EMQ) V0N.LJJJ(EMQ.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EMQ(int i) {
        this.LJLIL = i;
    }
}
