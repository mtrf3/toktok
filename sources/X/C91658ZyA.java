package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.ZyA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91658ZyA extends SQLiteOpenHelper {
    public static C91658ZyA LJLIL;

    public C91658ZyA(Context context) {
        super(context, "local_storage.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE local_storage_table (_id TEXT PRIMARY KEY, value TEXT NOT NULL);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_storage_table");
        sQLiteDatabase.execSQL("CREATE TABLE local_storage_table (_id TEXT PRIMARY KEY, value TEXT NOT NULL);");
    }
}
