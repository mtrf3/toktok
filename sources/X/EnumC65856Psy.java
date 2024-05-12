package X;

/* renamed from: X.Psy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC65856Psy {
    PATTERN("PATTERN_PROTECT_THROWABLE"),
    JSON("JSON_PROTECT_THROWABLE"),
    CAST_NUMBER("CAST_NUMBER_PROTECT_THROWABLE"),
    CAST_COLOR("CAST_COLOR_PROTECT_THROWABLE"),
    EQUALS("EQUALS_PROTECT_THROWABLE"),
    ENUM("ENUM_PROTECT_THROWABLE"),
    URI("URI_PROTECT_THROWABLE"),
    COLLECTIONS("COLLECTION_PROTECT_THROWABLE");

    public final String LJLIL;

    public String getName() {
        return this.LJLIL;
    }

    public static EnumC65856Psy valueOf(String str) {
        return (EnumC65856Psy) V0N.LJJJ(EnumC65856Psy.class, str);
    }

    EnumC65856Psy(String str) {
        this.LJLIL = str;
    }
}
