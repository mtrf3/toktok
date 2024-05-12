package X;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;

/* renamed from: X.X7d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84313X7d extends AbstractC84311X7b {
    public final int LJIIJ() {
        LIZ();
        try {
            try {
                C84325X7p LJJ = this.LJLIL.LJJ();
                String str = this.LJLILLLLZI;
                Object[] objArr = this.LJLJJLL;
                SQLiteDatabase sQLiteDatabase = this.LJLIL;
                boolean z = this.LJLJI;
                sQLiteDatabase.getClass();
                return LJJ.LIZLLL(str, objArr, SQLiteDatabase.LJIJJ(z));
            } catch (SQLiteDatabaseCorruptException e) {
                LJI(e);
                throw e;
            }
        } finally {
            LIZLLL();
        }
    }

    public final long LJIILJJIL() {
        LIZ();
        try {
            try {
                C84325X7p LJJ = this.LJLIL.LJJ();
                String str = this.LJLILLLLZI;
                Object[] objArr = this.LJLJJLL;
                SQLiteDatabase sQLiteDatabase = this.LJLIL;
                boolean z = this.LJLJI;
                sQLiteDatabase.getClass();
                return LJJ.LJFF(str, objArr, SQLiteDatabase.LJIJJ(z));
            } catch (SQLiteDatabaseCorruptException e) {
                LJI(e);
                throw e;
            }
        } finally {
            LIZLLL();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SQLiteProgram: ");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public C84313X7d(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr);
    }
}
