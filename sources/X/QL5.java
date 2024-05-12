package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes12.dex */
public class QL5 extends SQLiteOpenHelper {
    public QL5(Context context) {
        super(context, "ss_app_log.db", (SQLiteDatabase.CursorFactory) null, 13);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value VARCHAR NOT NULL, timestamp INTEGER, duration INTEGER, non_page INTEGER, app_version VARCHAR, version_code INTEGER, pausetime INTEGER,launch_sent INTEGER NOT NULL DEFAULT 0, event_index INTEGER NOT NULL DEFAULT 0  )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT, user_id INTEGER, timestamp INTEGER, session_id INTEGER, event_index INTEGER NOT NULL DEFAULT 0, user_type INTEGER NOT NULL DEFAULT 0, user_is_login INTEGER NOT NULL DEFAULT 0, user_is_auth INTEGER NOT NULL DEFAULT 0, uid INTEGER NOT NULL DEFAULT 0, disable_personalization VARCHAR )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS page ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, duration INTEGER, session_id INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT, is_crash INTEGER NOT NULL DEFAULT 0, log_type INTEGER NOT NULL DEFAULT 0, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS succ_rate ( _id INTEGER PRIMARY KEY AUTOINCREMENT, event_name VARCHAR, event_fail_reason INTEGER, event_fail_cnt INTEGER NOT NULL DEFAULT 0, event_date INTEGER )");
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (String str : QL6.LJ) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DROP TABLE IF EXISTS ");
                LIZ.append(str);
                sQLiteDatabase.execSQL(X1D.LIZIZ(LIZ));
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("drop table failed, ");
                LIZ2.append(str);
                QHL.LIZIZ(X1D.LIZIZ(LIZ2), th);
            }
        }
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0057, code lost:
    
        if (r4 < 10) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 2
            if (r4 >= r0) goto L37
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN user_id INTEGER"
            r3.execSQL(r0)
        L8:
            java.lang.String r0 = "ALTER TABLE session ADD COLUMN launch_sent INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        Ld:
            java.lang.String r0 = "ALTER TABLE queue ADD COLUMN is_crash INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L12:
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN ext_json TEXT"
            r3.execSQL(r0)
        L17:
            java.lang.String r0 = "ALTER TABLE queue ADD COLUMN log_type INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L1c:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )"
            r3.execSQL(r0)
        L21:
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L26:
            java.lang.String r0 = "ALTER TABLE session ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L2b:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS succ_rate ( _id INTEGER PRIMARY KEY AUTOINCREMENT, event_name VARCHAR, event_fail_reason INTEGER, event_fail_cnt INTEGER NOT NULL DEFAULT 0, event_date INTEGER )"
            r3.execSQL(r0)
        L30:
            r0 = 12
            java.lang.String r1 = "alter table add column failed"
            if (r4 >= r0) goto L79
            goto L5a
        L37:
            r0 = 3
            if (r4 >= r0) goto L3b
            goto L8
        L3b:
            r0 = 4
            if (r4 >= r0) goto L3f
            goto Ld
        L3f:
            r0 = 5
            if (r4 >= r0) goto L43
            goto L12
        L43:
            r0 = 6
            if (r4 >= r0) goto L47
            goto L17
        L47:
            r0 = 7
            if (r4 >= r0) goto L4b
            goto L1c
        L4b:
            r0 = 8
            if (r4 >= r0) goto L50
            goto L21
        L50:
            r0 = 9
            if (r4 >= r0) goto L55
            goto L26
        L55:
            r0 = 10
            if (r4 >= r0) goto L30
            goto L2b
        L5a:
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN user_type INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN user_is_login INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN user_is_auth INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            X.QHL.LIZIZ(r1, r0)
        L6e:
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN uid INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L74
            goto L7d
        L74:
            r0 = move-exception
            X.QHL.LIZIZ(r1, r0)
            goto L7d
        L79:
            r0 = 13
            if (r4 >= r0) goto L87
        L7d:
            java.lang.String r0 = "ALTER TABLE event ADD COLUMN disable_personalization VARCHAR"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L83
            goto L87
        L83:
            r0 = move-exception
            X.QHL.LIZIZ(r1, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL5.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
