package X;

/* renamed from: X.OqX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63157OqX {
    COLUMN_MSG_UUID("msg_uuid", "TEXT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_KEY("key", "TEXT"),
    COLUMN_IDEMPOTENT_ID("idempotent_id", "TEXT"),
    COLUMN_SENDER("sender", "INTEGER"),
    COLUMN_SENDER_SEC("sender_sec", "TEXT"),
    COLUMN_CREATE_TIME("create_time", "INTEGER"),
    COLUMN_VALUE("value", "TEXT"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_VERSION("version", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_CREATE_TIME_V2("create_time_v2", "INTEGER");

    public String key;
    public String type;

    public static EnumC63157OqX valueOf(String str) {
        return (EnumC63157OqX) V0N.LJJJ(EnumC63157OqX.class, str);
    }

    EnumC63157OqX(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
