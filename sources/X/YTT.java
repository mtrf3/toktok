package X;

/* loaded from: classes16.dex */
public enum YTT {
    COLUMN_ID("ID", "TEXT NOT NULL"),
    COLUMN_SHARE_TIME("SHARE_TIME", "INTEGER NOT NULL"),
    COLUMN_SEND_TIME("SEND_TIME", "INTEGER NOT NULL DEFAULT -1"),
    COLUMN_CURR_UID("CURR_UID", "TEXT NOT NULL"),
    COLUMN_SHARE_TYPE("SHARE_TYPE", "TEXT NOT NULL DEFAULT ''");

    public final String key;
    public final String type;

    public static YTT valueOf(String str) {
        return (YTT) V0N.LJJJ(YTT.class, str);
    }

    YTT(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
