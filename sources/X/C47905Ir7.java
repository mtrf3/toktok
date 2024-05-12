package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.Ir7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47905Ir7 extends SQLiteOpenHelper {
    public static C47905Ir7 LJLIL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C47905Ir7(Context context) {
        super(context, "fangqing.db", (SQLiteDatabase.CursorFactory) null, 1);
    }
}
