package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38481fA implements InterfaceC262811k {
    public final SQLiteProgram LJLIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public C38481fA(SQLiteProgram sQLiteProgram) {
        this.LJLIL = sQLiteProgram;
    }

    @Override // X.InterfaceC262811k
    public final void LLLLLLJ(int i) {
        this.LJLIL.bindNull(i);
    }

    @Override // X.InterfaceC262811k
    public final void LJIIIZ(int i, long j) {
        this.LJLIL.bindLong(i, j);
    }

    @Override // X.InterfaceC262811k
    public final void LJJII(int i, String str) {
        this.LJLIL.bindString(i, str);
    }

    @Override // X.InterfaceC262811k
    public final void LJJIIZ(int i, byte[] bArr) {
        this.LJLIL.bindBlob(i, bArr);
    }

    @Override // X.InterfaceC262811k
    public final void LLJJIJI(double d, int i) {
        this.LJLIL.bindDouble(i, d);
    }
}
