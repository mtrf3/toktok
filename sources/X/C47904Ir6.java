package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.Ir6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47904Ir6 extends SQLiteOpenHelper {
    public static final Integer LJLIL = 1;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C47904Ir6(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, LJLIL.intValue());
    }
}
