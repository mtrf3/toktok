package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.ZyB, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91659ZyB {
    public final C91658ZyA LIZ;
    public SQLiteDatabase LIZIZ;

    @JavascriptInterface
    public final void clear() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8561264403894700009");
        if (c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "clear", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "clear", null, objArr, this, c65300Pk0, false);
            return;
        }
        SQLiteDatabase writableDatabase = this.LIZ.getWritableDatabase();
        o.LJIIIIZZ(writableDatabase, "localStorageDBHelper.writableDatabase");
        this.LIZIZ = writableDatabase;
        writableDatabase.delete("local_storage_table", null, null);
        SQLiteDatabase sQLiteDatabase = this.LIZIZ;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "clear", null, objArr, this, c65300Pk0, true);
        } else {
            o.LJIJI("database");
            throw null;
        }
    }

    public C91659ZyB(Context c) {
        o.LJIIIZ(c, "c");
        if (C91658ZyA.LJLIL == null) {
            C91658ZyA.LJLIL = new C91658ZyA(C16880lQ.LLLLL(c));
        }
        C91658ZyA c91658ZyA = C91658ZyA.LJLIL;
        o.LJIIIIZZ(c91658ZyA, "getInstance(context)");
        this.LIZ = c91658ZyA;
    }

    @JavascriptInterface
    public final String getItem(String str) {
        String str2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "8561264403894700009");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "getItem", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "getItem", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        if (str != null) {
            SQLiteDatabase readableDatabase = this.LIZ.getReadableDatabase();
            o.LJIIIIZZ(readableDatabase, "localStorageDBHelper.readableDatabase");
            this.LIZIZ = readableDatabase;
            Cursor query = readableDatabase.query("local_storage_table", null, "_id = ?", new String[]{str}, null, null, null);
            o.LJIIIIZZ(query, "database.query(\n        … null, null\n            )");
            if (query.moveToFirst()) {
                str2 = query.getString(1);
            } else {
                str2 = null;
            }
            query.close();
            SQLiteDatabase sQLiteDatabase = this.LIZIZ;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            } else {
                o.LJIJI("database");
                throw null;
            }
        } else {
            str2 = null;
        }
        c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "getItem", str2, objArr, this, c65300Pk0, true);
        return str2;
    }

    @JavascriptInterface
    public final void removeItem(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "8561264403894700009");
        if (c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "removeItem", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "removeItem", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (str != null) {
            SQLiteDatabase writableDatabase = this.LIZ.getWritableDatabase();
            o.LJIIIIZZ(writableDatabase, "localStorageDBHelper.writableDatabase");
            this.LIZIZ = writableDatabase;
            writableDatabase.delete("local_storage_table", "_id='" + str + '\'', null);
            SQLiteDatabase sQLiteDatabase = this.LIZIZ;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            } else {
                o.LJIJI("database");
                throw null;
            }
        }
        c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "removeItem", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public final void setItem(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)V", "8561264403894700009");
        if (c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "setItem", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "setItem", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (str != null && str2 != null) {
            String item = getItem(str);
            SQLiteDatabase writableDatabase = this.LIZ.getWritableDatabase();
            o.LJIIIIZZ(writableDatabase, "localStorageDBHelper.writableDatabase");
            this.LIZIZ = writableDatabase;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", str);
            contentValues.put("value", str2);
            if (item != null) {
                SQLiteDatabase sQLiteDatabase = this.LIZIZ;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.update("local_storage_table", contentValues, "_id='" + str + '\'', null);
                } else {
                    o.LJIJI("database");
                    throw null;
                }
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.LIZIZ;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.insert("local_storage_table", null, contentValues);
                } else {
                    o.LJIJI("database");
                    throw null;
                }
            }
            SQLiteDatabase sQLiteDatabase3 = this.LIZIZ;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.close();
            } else {
                o.LJIJI("database");
                throw null;
            }
        }
        c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/LocalStorageJavaScriptInterface", "setItem", null, objArr, this, c65300Pk0, true);
    }
}
