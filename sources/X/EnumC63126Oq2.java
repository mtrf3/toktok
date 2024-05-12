package X;

/* renamed from: X.Oq2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63126Oq2 {
    COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
    COLUMN_SORT_ORDER("sort_order", "INTEGER"),
    COLUMN_ROLE("role", "INTEGER"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_ALIAS("alias", "TEXT"),
    COLUMN_SEC_UID("sec_uid", "TEXT"),
    COLUMN_SILENT("silent", "INTEGER"),
    COLUMN_SILENT_TIME("silent_time", "INTEGER");

    public String key;
    public String type;

    public static EnumC63126Oq2 valueOf(String str) {
        return (EnumC63126Oq2) V0N.LJJJ(EnumC63126Oq2.class, str);
    }

    EnumC63126Oq2(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
