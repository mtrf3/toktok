package X;

/* loaded from: classes7.dex */
public enum FJ6 {
    STRING("string"),
    BOOL("bool"),
    NUMBER("number"),
    OBJECT("object"),
    ARRAY("array"),
    INT32("int32"),
    LONG("long"),
    FLOAT("float"),
    DOUBLE("double"),
    UNSUPPORTED(null);

    public static final FJ7 Companion = new FJ7();
    public final String LJLIL;

    public static final FJ6 getValueByType(String str) {
        Companion.getClass();
        return FJ7.LIZ(str);
    }

    public static FJ6 valueOf(String str) {
        return (FJ6) V0N.LJJJ(FJ6.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    FJ6(String str) {
        this.LJLIL = str;
    }
}
