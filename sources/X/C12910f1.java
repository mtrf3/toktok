package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0f1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12910f1 extends SQLiteOpenHelper {
    public C12910f1(Context context) {
        super(context, "live_composer.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT,path TEXT,update_time INTEGER,use INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,node_id INTEGER,resource_id TEXT)");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:7|(2:8|9)|10|11|12|(1:14)(1:41)|15|(7:18|(1:20)(1:37)|21|22|23|24|16)|38|39|40|32|5) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc A[Catch: all -> 0x00fc, TryCatch #5 {all -> 0x00fc, blocks: (B:12:0x0076, B:15:0x00a2, B:16:0x00b6, B:18:0x00bc, B:20:0x00ca, B:21:0x00cc, B:24:0x00ee, B:37:0x00f2, B:39:0x00f8), top: B:11:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r18, java.util.List<X.C12930f3> r19) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12910f1.LIZIZ(java.lang.String, java.util.List):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_node");
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
            } else {
                return;
            }
        } else if (i >= 3 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE live_composer_tag_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
    }

    public static void LIZ(SQLiteDatabase sQLiteDatabase, String str, C12930f3 c12930f3, ArrayList arrayList) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("live_composer_tag_node", null, "node_id=?", new String[]{str}, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    String tag = cursor.getString(cursor.getColumnIndex("tag"));
                    float f = cursor.getFloat(cursor.getColumnIndex("value"));
                    String resourceId = cursor.getString(cursor.getColumnIndex("resource_id"));
                    Iterator it = ((ArrayList) c12930f3.LJI).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((C12940f4) next).LIZ, tag)) {
                            if (next == null) {
                            }
                        }
                    }
                    List<C12940f4> list = c12930f3.LJI;
                    o.LJIIIIZZ(tag, "tag");
                    C12940f4 c12940f4 = new C12940f4(tag);
                    c12940f4.LIZIZ = Float.valueOf(f);
                    o.LJIIIIZZ(resourceId, "resourceId");
                    c12940f4.LIZJ = resourceId;
                    ((ArrayList) list).add(c12940f4);
                } catch (Throwable th) {
                    th = th;
                    try {
                        C0NB.LJI("LiveComposerSQLiteHelper", th);
                        if (cursor != null) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            arrayList.add(c12930f3);
            cursor.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
