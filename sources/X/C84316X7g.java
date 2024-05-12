package X;

import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: X.X7g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84316X7g implements InterfaceC84324X7o {
    public static final C84323X7n LIZLLL = C84315X7f.LJZI;
    public final SQLiteDatabase LIZ;
    public final String LIZIZ;
    public C84312X7c LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SQLiteDirectCursorDriver: ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C84316X7g(SQLiteDatabase sQLiteDatabase, String str) {
        this.LIZ = sQLiteDatabase;
        this.LIZIZ = str;
    }
}
