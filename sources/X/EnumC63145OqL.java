package X;

/* renamed from: X.OqL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63145OqL {
    COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_MIN_INDEX("min_index", "INTEGER"),
    COLUMN_READ_INDEX("read_index", "INTEGER"),
    COLUMN_READ_ORDER("read_order", "INTEGER");

    public String key;
    public String type;

    public static EnumC63145OqL valueOf(String str) {
        return (EnumC63145OqL) V0N.LJJJ(EnumC63145OqL.class, str);
    }

    EnumC63145OqL(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
