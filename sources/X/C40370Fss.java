package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.Fss, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40370Fss extends SQLiteOpenHelper {
    public static C40370Fss LJLJI;
    public final SQLiteDatabase LJLIL;
    public final SQLiteDatabase LJLILLLLZI;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C40370Fss() {
        super(EF7.LIZIZ(), "TIKTOK.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.LJLIL = getWritableDatabase();
        this.LJLILLLLZI = getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `like_dialog_open` (\n\t`open_time`\tINTEGER,\n\t`version`\tINTEGER\n);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            System.exit(0);
        }
    }
}
