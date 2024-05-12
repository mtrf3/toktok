package X;

/* loaded from: classes7.dex */
public enum EBZ {
    SCHEMA("schema"),
    REQUEST("request");

    public final String LJLIL;

    public static EBZ valueOf(String str) {
        return (EBZ) V0N.LJJJ(EBZ.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EBZ(String str) {
        this.LJLIL = str;
    }
}
