package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.Ux4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78850Ux4 extends SQLiteOpenHelper implements InterfaceC63149OqP {
    public final C68466Qty LJLIL;

    @Override // X.InterfaceC63149OqP
    public final InterfaceC78848Ux2 LIZ() {
        C68466Qty c68466Qty = this.LJLIL;
        c68466Qty.LIZ = getWritableDatabase();
        return c68466Qty;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable, X.InterfaceC63149OqP
    public final void close() {
        C63322OtC.LJFF("LocalSQLiteOpenHelper close");
        super.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C63322OtC.LJFF("LocalSQLiteOpenHelper onConfigure");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C63322OtC.LJFF("LocalSQLiteOpenHelper onCreate");
        C63143OqJ LJII = C63143OqJ.LJII();
        C68466Qty c68466Qty = this.LJLIL;
        c68466Qty.LIZ = sQLiteDatabase;
        LJII.getClass();
        C63143OqJ.LJIIIIZZ(c68466Qty);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C63322OtC.LJFF("LocalSQLiteOpenHelper onOpen");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    public C78850Ux4(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 48);
        this.LJLIL = new C68466Qty();
        C63322OtC.LJFF("LocalSQLiteOpenHelper constructor");
        if (C63308Osy.LJI().LIZLLL().LJJIJLIJ) {
            super.setWriteAheadLoggingEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C63322OtC.LJFF("LocalSQLiteOpenHelper onDowngrade");
        C63143OqJ LJII = C63143OqJ.LJII();
        this.LJLIL.LIZ = sQLiteDatabase;
        LJII.LJIIIZ(i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C63322OtC.LJFF("LocalSQLiteOpenHelper onUpgrade");
        C63143OqJ LJII = C63143OqJ.LJII();
        C68466Qty c68466Qty = this.LJLIL;
        c68466Qty.LIZ = sQLiteDatabase;
        LJII.getClass();
        C63143OqJ.LJIIJ(c68466Qty, i, i2);
    }
}
