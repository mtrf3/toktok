package X;

/* renamed from: X.Pzk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66276Pzk {
    SOURCE("source"),
    API_ID("api_id"),
    IS_REFLECTION("is_reflection"),
    CLASS_NAME("class_name"),
    MEMBER_NAME("member_name"),
    RETURN_TYPE("return_type");

    public final String LJLIL;

    public static EnumC66276Pzk valueOf(String str) {
        return (EnumC66276Pzk) V0N.LJJJ(EnumC66276Pzk.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC66276Pzk(String str) {
        this.LJLIL = str;
    }
}
