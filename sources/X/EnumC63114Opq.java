package X;

/* renamed from: X.Opq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63114Opq {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_NAME("name", "TEXT"),
    COLUMN_DESC("desc", "TEXT"),
    COLUMN_ICON("icon", "TEXT"),
    COLUMN_NOTICE("notice", "TEXT"),
    COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
    COLUMN_SEC_OWNER("sec_owner", "TEXT"),
    COLUMN_SILENT("silent", "INTEGER DEFAULT 0"),
    COLUMN_SILENT_NORMAL_ONLY("silent_normal_only", "INTEGER DEFAULT 0"),
    COLUMN_MODE("mode", "INTEGER DEFAULT -1"),
    COLUMN_EXT("ext", "TEXT");

    public String key;
    public String type;

    public static EnumC63114Opq valueOf(String str) {
        return (EnumC63114Opq) V0N.LJJJ(EnumC63114Opq.class, str);
    }

    EnumC63114Opq(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
