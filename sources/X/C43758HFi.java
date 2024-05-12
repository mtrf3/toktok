package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HFi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43758HFi extends SQLiteOpenHelper {
    public static C43758HFi LJLIL;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r18 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.HGA> LIZJ() {
        /*
            r23 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r18 = 0
            android.database.sqlite.SQLiteDatabase r15 = r23.getReadableDatabase()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L76
            java.lang.String r16 = "frames_table"
            java.lang.String r1 = "aweme_id"
            java.lang.String r2 = "video_id"
            java.lang.String r3 = "zip_uri"
            java.lang.String r4 = "zip_path"
            java.lang.String r5 = "extract_model"
            java.lang.String r6 = "union_id"
            java.lang.String r7 = "update_time"
            java.lang.String r8 = "match_factors"
            java.lang.String r9 = "is_draft"
            java.lang.String r10 = "origin"
            java.lang.String r11 = "vframe_type"
            java.lang.String r12 = "is_backup"
            java.lang.String r13 = "query_times"
            java.lang.String r14 = "aweme_type_2"
            java.lang.String[] r17 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L76
            java.lang.String r22 = "update_time desc"
            r19 = r18
            r20 = r18
            r21 = r18
            android.database.Cursor r18 = r15.query(r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L76
            java.util.List r1 = LJ(r18)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L76
            r0.addAll(r1)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L76
            goto L72
        L41:
            r1 = move-exception
            boolean r1 = r1 instanceof android.database.sqlite.SQLiteBlobTooBigException     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L70
            java.lang.String r1 = "VideoFramesSQLiteHelper > Row too big to fit into CursorWindow"
            X.H78.LIZJ(r1)     // Catch: java.lang.Throwable -> L76
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L76
            r1 = 28
            if (r2 < r1) goto L70
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "enlarge_cursor_window_db_frame"
            r1.getClass()     // Catch: java.lang.Throwable -> L76
            r1 = 0
            boolean r1 = com.bytedance.ies.abmock.SettingsManager.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L70
            java.lang.String r0 = "VideoFramesSQLiteHelper > enlarge cursor window, and query again"
            X.H78.LIZJ(r0)     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = r23.LIZLLL()     // Catch: java.lang.Throwable -> L76
            if (r18 == 0) goto L6f
            r18.close()
        L6f:
            return r0
        L70:
            if (r18 == 0) goto L75
        L72:
            r18.close()
        L75:
            return r0
        L76:
            r0 = move-exception
            if (r18 == 0) goto L7c
            r18.close()
        L7c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43758HFi.LIZJ():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        if (r17 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.HGA> LIZLLL() {
        /*
            r22 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r17 = 0
            android.database.sqlite.SQLiteDatabase r14 = r22.getReadableDatabase()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            java.lang.String r15 = "frames_table"
            java.lang.String r1 = "aweme_id"
            java.lang.String r2 = "video_id"
            java.lang.String r3 = "zip_uri"
            java.lang.String r4 = "zip_path"
            java.lang.String r5 = "extract_model"
            java.lang.String r6 = "union_id"
            java.lang.String r7 = "update_time"
            java.lang.String r8 = "match_factors"
            java.lang.String r9 = "is_draft"
            java.lang.String r10 = "origin"
            java.lang.String r11 = "is_backup"
            java.lang.String r12 = "query_times"
            java.lang.String r13 = "aweme_type_2"
            java.lang.String[] r16 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r17
            android.database.Cursor r17 = r14.query(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            android.database.CursorWindow r4 = new android.database.CursorWindow     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            java.lang.String r3 = "frame_cursor_window"
            r1 = 3170304(0x306000, double:1.5663383E-317)
            r4.<init>(r3, r1)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            r1 = r17
            android.database.AbstractWindowedCursor r1 = (android.database.AbstractWindowedCursor) r1     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            r1.setWindow(r4)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            java.util.List r1 = LJ(r17)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            r0.addAll(r1)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L5b
            goto L57
        L50:
            java.lang.String r1 = "VideoFramesSQLiteHelper > enlarge cursor window, query failed"
            X.H78.LIZJ(r1)     // Catch: java.lang.Throwable -> L5b
            if (r17 == 0) goto L5a
        L57:
            r17.close()
        L5a:
            return r0
        L5b:
            r0 = move-exception
            if (r17 == 0) goto L61
            r17.close()
        L61:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43758HFi.LIZLLL():java.util.List");
    }

    public C43758HFi(Context context) {
        super(context, "frames_table", (SQLiteDatabase.CursorFactory) null, 5);
    }

    public static C43758HFi LIZIZ(Context context) {
        if (LJLIL == null) {
            synchronized (C43758HFi.class) {
                if (LJLIL == null) {
                    LJLIL = new C43758HFi(C16880lQ.LLLLL(context));
                }
            }
        }
        return LJLIL;
    }

    public static List LJ(Cursor cursor) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            HG8 hg8 = new HG8();
            hg8.LIZ = cursor.getString(cursor.getColumnIndex("aweme_id"));
            hg8.LIZJ = cursor.getString(cursor.getColumnIndex("video_id"));
            hg8.LIZLLL = cursor.getString(cursor.getColumnIndex("zip_uri"));
            hg8.LJ = cursor.getString(cursor.getColumnIndex("zip_path"));
            hg8.LJFF = ExtractFramesModelExtKt.string2Model(cursor.getString(cursor.getColumnIndex("extract_model")));
            hg8.LJII = cursor.getString(cursor.getColumnIndex("union_id"));
            hg8.LJI = cursor.getLong(cursor.getColumnIndex("update_time"));
            hg8.LJIIIIZZ = cursor.getInt(cursor.getColumnIndex("match_factors"));
            boolean z2 = false;
            if (cursor.getInt(cursor.getColumnIndex("is_draft")) == 1) {
                z = true;
            } else {
                z = false;
            }
            hg8.LJIIIZ = z;
            hg8.LJIIJ = cursor.getInt(cursor.getColumnIndex("origin"));
            if (cursor.getInt(cursor.getColumnIndex("is_backup")) == 1) {
                z2 = true;
            }
            hg8.LJIIJJI = z2;
            hg8.LJIIL = cursor.getInt(cursor.getColumnIndex("query_times"));
            hg8.LIZIZ = cursor.getInt(cursor.getColumnIndex("aweme_type_2"));
            hg8.LJIILIIL = cursor.getInt(cursor.getColumnIndex("vframe_type"));
            arrayList.add(hg8.LIZ());
        }
        return arrayList;
    }

    public final void LIZ(HGN hgn) {
        Iterator it = ((ArrayList) hgn.LIZ).iterator();
        while (it.hasNext()) {
            HGA hga = (HGA) it.next();
            if (hga.LJI == null) {
                String str = hga.LIZ;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("aweme_id", hga.LIZ);
            String str2 = hga.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("video_id", str2);
            contentValues.put("zip_uri", hga.LJ);
            contentValues.put("zip_path", hga.LJFF);
            contentValues.put("extract_model", hga.LJI.toString());
            contentValues.put("union_id", hga.LJIIIIZZ);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("match_factors", Integer.valueOf(hga.LJIIIZ));
            if (hga.LJIIJ) {
                contentValues.put("is_draft", (Integer) 1);
            } else {
                contentValues.put("is_draft", (Integer) 0);
            }
            contentValues.put("origin", Integer.valueOf(hga.LJIIJJI));
            if (hga.LJIIL) {
                contentValues.put("is_backup", (Integer) 1);
            } else {
                contentValues.put("is_backup", (Integer) 0);
            }
            contentValues.put("query_times", Integer.valueOf(hga.LJIILIIL));
            contentValues.put("aweme_type_2", Integer.valueOf(hga.LIZIZ));
            contentValues.put("vframe_type", Integer.valueOf(hga.LIZJ));
            getWritableDatabase().replace("frames_table", null, contentValues);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\taweme_type_2\tINTEGER,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`vframe_type`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r5 < 5) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 2
            if (r5 >= r0) goto L45
            if (r5 == r6) goto La
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN union_id TEXT"
            r4.execSQL(r0)
        La:
            if (r5 == r6) goto L25
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN match_factors INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN is_draft INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN origin INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN is_backup INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN query_times INTEGER"
            r4.execSQL(r0)
        L25:
            if (r5 == r6) goto L2c
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN aweme_type_2 INTEGER DEFAULT -1"
            r4.execSQL(r0)
        L2c:
            if (r5 == r6) goto L33
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN vframe_type INTEGER DEFAULT 1"
            r4.execSQL(r0)
        L33:
            X.Gbn r2 = X.C1I0.LIZIZ()
            java.lang.String r1 = "upgrade from "
            java.lang.String r0 = " to "
            java.lang.String r1 = X.C48263Iwt.LIZLLL(r1, r5, r0, r6)
            java.lang.String r0 = "extract_frame_db"
            r2.LIZJ(r0, r1)
            return
        L45:
            r0 = 3
            if (r5 >= r0) goto L49
            goto La
        L49:
            r0 = 4
            if (r5 >= r0) goto L4d
            goto L25
        L4d:
            r0 = 5
            if (r5 >= r0) goto L33
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43758HFi.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
