package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1ol, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44431ol extends C38481fA implements InterfaceC37591dj {
    public final SQLiteStatement LJLILLLLZI;

    @Override // X.InterfaceC37591dj
    public final long LJIILJJIL() {
        return this.LJLILLLLZI.executeInsert();
    }

    @Override // X.InterfaceC37591dj
    public final int LJIJJLI() {
        return this.LJLILLLLZI.executeUpdateDelete();
    }

    public C44431ol(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.LJLILLLLZI = sQLiteStatement;
    }
}
