package X;

/* renamed from: X.4jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC117884jw {
    COLUMN_UUID("uuid", "TEXT NOT NULL"),
    COLUMN_LOCAL_URI("local_uri", "TEXT"),
    COLUMN_REMOTE_URI("remote_uri", "TEXT"),
    COLUMN_SIZE("size", "BIGINT"),
    COLUMN_TYPE("type", "TEXT"),
    COLUMN_HASH("hash", "TEXT"),
    COLUMN_INDEX("position", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
    COLUMN_MIME_TYPE("mime_type", "TEXT"),
    COLUMN_UPLOAD_URI("upload_uri", "TEXT");

    public String key;
    public String type;

    public static EnumC117884jw valueOf(String str) {
        return (EnumC117884jw) V0N.LJJJ(EnumC117884jw.class, str);
    }

    EnumC117884jw(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
