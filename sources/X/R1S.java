package X;

/* loaded from: classes12.dex */
public enum R1S {
    COLUMN_SEC_UID("SEC_UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_RELATION_TYPE("RELATION_TYPE", "INTEGER NOT NULL"),
    COLUMN_CREATED_TIME("CREATED_TIME", "INTEGER NOT NULL");

    public final String key;
    public final String type;

    public static R1S valueOf(String str) {
        return (R1S) V0N.LJJJ(R1S.class, str);
    }

    R1S(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
