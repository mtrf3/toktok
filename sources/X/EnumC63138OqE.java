package X;

/* renamed from: X.OqE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63138OqE {
    COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_IDS_STR("ids_str", "TEXT"),
    COLUMN_SENDER_ID("sender_id", "BIGINT"),
    COLUMN_CREATED_TIME("created_time", "INTEGER");

    public String key;
    public String type;

    public static EnumC63138OqE valueOf(String str) {
        return (EnumC63138OqE) V0N.LJJJ(EnumC63138OqE.class, str);
    }

    EnumC63138OqE(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
