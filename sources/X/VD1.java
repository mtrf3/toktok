package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes15.dex */
public final class VD1 extends SQLiteOpenHelper {
    public static volatile VD1 LJLIL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public VD1(Context context) {
        super(context, "StrategyData.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C79361VCr.LJLLI);
        sQLiteDatabase.execSQL(C79353VCj.LJLLI);
        sQLiteDatabase.execSQL(C79354VCk.LJLLI);
        sQLiteDatabase.execSQL(C79354VCk.LJLLILLLL);
    }
}
