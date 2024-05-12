package X;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.Qty, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68466Qty implements InterfaceC78848Ux2 {
    public SQLiteDatabase LIZ = null;

    @Override // X.InterfaceC78848Ux2
    public final void LJII() {
        this.LIZ.beginTransaction();
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJIL() {
        this.LIZ.beginTransactionNonExclusive();
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJJIJL() {
        this.LIZ.setTransactionSuccessful();
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJJIJLIJ() {
        this.LIZ.endTransaction();
    }

    @Override // X.InterfaceC78848Ux2
    public final boolean LJJJ() {
        return this.LIZ.inTransaction();
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJI() {
        return DatabaseUtils.queryNumEntries(this.LIZ, "conversation_list");
    }

    @Override // X.InterfaceC78848Ux2
    public final InterfaceC63146OqM LJIILLIIL(String str) {
        return new C36411bp(this.LIZ.compileStatement(str));
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJJIJIIJI(String str) {
        this.LIZ.execSQL(str);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJIZL(String str) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        if (sQLiteDatabase == null) {
            return -1L;
        }
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "msg", str);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJJL(ContentValues contentValues) {
        return this.LIZ.insertWithOnConflict("conversation_list", null, contentValues, 5);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJI(String str, ContentValues contentValues) {
        return this.LIZ.insertOrThrow(str, null, contentValues);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJ(String str, ContentValues contentValues) {
        return this.LIZ.replaceOrThrow(str, null, contentValues);
    }

    @Override // X.InterfaceC78848Ux2
    public final InterfaceC63132Oq8 LJJJJJ(String str, String[] strArr) {
        return new G0J(this.LIZ.rawQuery(str, strArr));
    }

    @Override // X.InterfaceC78848Ux2
    public final int LJJJJL(String str, String str2, String[] strArr) {
        return this.LIZ.delete(str, str2, strArr);
    }

    @Override // X.InterfaceC78848Ux2
    public final int LJJJIL(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.LIZ.update(str, contentValues, str2, strArr);
    }
}
