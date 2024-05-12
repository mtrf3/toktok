package X;

/* loaded from: classes7.dex */
public enum EBW {
    UNKNOWN(0),
    INIT(1),
    CHECK(2),
    CHECK_OBJECT(3),
    CHECK_PATTERN(4),
    API(5);

    public final int LJLIL;

    public static EBW valueOf(String str) {
        return (EBW) V0N.LJJJ(EBW.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EBW(int i) {
        this.LJLIL = i;
    }
}
