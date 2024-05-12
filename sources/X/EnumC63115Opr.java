package X;

/* renamed from: X.Opr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63115Opr {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_STICK_TOP("stick_top", "INTEGER"),
    COLUMN_MUTE("mute", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_FAVORITE("favor", "INTEGER"),
    COLUMN_SET_TOP_TIME("set_top_time", "BIGINT"),
    COLUMN_SET_FAVORITE_TIME("set_favorite_time", "BIGINT"),
    COLUMN_CATEGORY("user_set_category", "INTEGER DEFAULT 0");

    public String key;
    public String type;

    public static EnumC63115Opr valueOf(String str) {
        return (EnumC63115Opr) V0N.LJJJ(EnumC63115Opr.class, str);
    }

    EnumC63115Opr(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
