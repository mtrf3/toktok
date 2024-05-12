package X;

import defpackage.q;

/* loaded from: classes16.dex */
public final class YTS {
    public static final /* synthetic */ YTS LIZ = new YTS();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("create table if not exists RECENT_SHARE (");
        YTT ytt = YTT.COLUMN_ID;
        LIZ2.append(ytt.key);
        LIZ2.append(' ');
        LIZ2.append(ytt.type);
        LIZ2.append(',');
        YTT ytt2 = YTT.COLUMN_SHARE_TIME;
        LIZ2.append(ytt2.key);
        LIZ2.append(' ');
        LIZIZ = JBR.LJFF(LIZ2, ytt2.type, ");", LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("create table if not exists RECENT_SHARE (");
        LIZ3.append(ytt.key);
        LIZ3.append(' ');
        LIZ3.append(ytt.type);
        LIZ3.append(',');
        LIZ3.append(ytt2.key);
        LIZ3.append(' ');
        LIZ3.append(ytt2.type);
        LIZ3.append(',');
        YTT ytt3 = YTT.COLUMN_SEND_TIME;
        LIZ3.append(ytt3.key);
        LIZ3.append(' ');
        LIZ3.append(ytt3.type);
        LIZ3.append(',');
        YTT ytt4 = YTT.COLUMN_CURR_UID;
        LIZ3.append(ytt4.key);
        LIZ3.append(' ');
        LIZ3.append(ytt4.type);
        LIZ3.append(",PRIMARY KEY(");
        LIZ3.append(ytt.key);
        LIZ3.append(", ");
        LIZJ = JBR.LJFF(LIZ3, ytt4.key, "));", LIZ3);
        LIZLLL = "DROP TABLE IF EXISTS RECENT_SHARE";
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("ALTER table RECENT_SHARE ADD column ");
        YTT ytt5 = YTT.COLUMN_SHARE_TYPE;
        LIZ4.append(ytt5.key);
        LIZ4.append(' ');
        LJ = q.LIZIZ(LIZ4, ytt5.type, ';', LIZ4);
    }
}
