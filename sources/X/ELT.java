package X;

/* loaded from: classes7.dex */
public enum ELT {
    EMAIL("email"),
    PHONE("phone");

    public final String LJLIL;

    public static ELT valueOf(String str) {
        return (ELT) V0N.LJJJ(ELT.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    ELT(String str) {
        this.LJLIL = str;
    }
}
