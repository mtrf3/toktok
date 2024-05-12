package X;

import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;

/* renamed from: X.X7c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84312X7c extends AbstractC84311X7b {
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SQLiteQuery: ");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public C84312X7c(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr);
    }

    public final int LJIIJ(CursorWindow cursorWindow, int i, int i2, boolean z) {
        LIZ();
        try {
            cursorWindow.LIZ();
            try {
                try {
                    C84325X7p LJJ = this.LJLIL.LJJ();
                    String str = this.LJLILLLLZI;
                    Object[] objArr = this.LJLJJLL;
                    SQLiteDatabase sQLiteDatabase = this.LJLIL;
                    boolean z2 = this.LJLJI;
                    sQLiteDatabase.getClass();
                    return LJJ.LJ(str, objArr, cursorWindow, i, i2, z, SQLiteDatabase.LJIJJ(z2));
                } finally {
                    cursorWindow.LIZLLL();
                }
            } catch (SQLiteException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exception: ");
                LIZ.append(e.getMessage());
                LIZ.append("; query: ");
                LIZ.append(this.LJLILLLLZI);
                com.tencent.wcdb.support.Log.LIZ("WCDB.SQLiteQuery", X1D.LIZIZ(LIZ));
                LJI(e);
                throw e;
            }
        } finally {
            LIZLLL();
        }
    }
}
