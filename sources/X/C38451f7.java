package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;

/* renamed from: X.1f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38451f7 implements InterfaceC262211e {
    public static final String[] LJLILLLLZI = new String[0];
    public final SQLiteDatabase LJLIL;

    @Override // X.InterfaceC262211e
    public final boolean D() {
        return this.LJLIL.isWriteAheadLoggingEnabled();
    }

    public final List<Pair<String, String>> LIZIZ() {
        return this.LJLIL.getAttachedDbs();
    }

    public final String LIZJ() {
        return this.LJLIL.getPath();
    }

    @Override // X.InterfaceC262211e
    public final void LJII() {
        this.LJLIL.beginTransaction();
    }

    @Override // X.InterfaceC262211e
    public final void LJIL() {
        this.LJLIL.beginTransactionNonExclusive();
    }

    @Override // X.InterfaceC262211e
    public final void LJJIJL() {
        this.LJLIL.setTransactionSuccessful();
    }

    @Override // X.InterfaceC262211e
    public final void LJJIJLIJ() {
        this.LJLIL.endTransaction();
    }

    @Override // X.InterfaceC262211e
    public final boolean LJJJ() {
        return this.LJLIL.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // X.InterfaceC262211e
    public final boolean isOpen() {
        return this.LJLIL.isOpen();
    }

    public C38451f7(SQLiteDatabase sQLiteDatabase) {
        this.LJLIL = sQLiteDatabase;
    }

    @Override // X.InterfaceC262211e
    public final InterfaceC37591dj LJIILLIIL(String str) {
        return new C44431ol(this.LJLIL.compileStatement(str));
    }

    @Override // X.InterfaceC262211e
    public final void LJJIJIIJI(String str) {
        this.LJLIL.execSQL(str);
    }

    @Override // X.InterfaceC262211e
    public final Cursor LLLLZLLIL(final InterfaceC262911l interfaceC262911l) {
        return this.LJLIL.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.13k
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                InterfaceC262911l.this.LIZ(new C38481fA(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC262911l.LIZIZ(), LJLILLLLZI, null);
    }

    @Override // X.InterfaceC262211e
    public final Cursor query(String str) {
        return LLLLZLLIL(new C37581di(str));
    }

    public final void LIZ(String str, Object[] objArr) {
        this.LJLIL.execSQL(str, objArr);
    }
}
