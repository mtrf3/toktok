package X;

/* renamed from: X.Oq6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63130Oq6 {
    COLUMN_ID("combined_key", "TEXT NOT NULL"),
    COLUMN_TYPE("type", "INTEGER"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_MESSAGE_UUID("message_uuid", "TEXT"),
    COLUMN_USER_ID("user_id", "TEXT"),
    COLUMN_ENTITY_ID("entity_id", "TEXT"),
    COLUMN_SEARCH_CONTENT("search_content", "TEXT"),
    COLUMN_EXTRA("extra", "TEXT");

    public String key;
    public String type;

    public static EnumC63130Oq6 valueOf(String str) {
        return (EnumC63130Oq6) V0N.LJJJ(EnumC63130Oq6.class, str);
    }

    EnumC63130Oq6(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
