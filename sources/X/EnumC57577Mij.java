package X;

/* renamed from: X.Mij, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC57577Mij {
    UNKNOWN(4),
    EXP_UNSTABLE(-3),
    NO_GRANT(-1),
    NOT_FOUND(0),
    ON_PROCESSING(1),
    PHONE_FILTER(2),
    EMAIL(3);

    public final int LJLIL;

    public static EnumC57577Mij valueOf(String str) {
        return (EnumC57577Mij) V0N.LJJJ(EnumC57577Mij.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC57577Mij(int i) {
        this.LJLIL = i;
    }
}
