package X;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteFullException;
import java.util.Arrays;

/* renamed from: X.X7b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84311X7b extends AbstractC84314X7e {
    public static final String[] LJLJL = new String[0];
    public final SQLiteDatabase LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final String[] LJLJJI;
    public final int LJLJJL;
    public final Object[] LJLJJLL;

    @Override // X.AbstractC84314X7e
    public void LIZIZ() {
        synchronized (this) {
        }
        Object[] objArr = this.LJLJJLL;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final void finalize() {
        synchronized (this) {
        }
        super.finalize();
    }

    public final void LJI(SQLiteException sQLiteException) {
        if ((sQLiteException instanceof SQLiteDatabaseCorruptException) || ((sQLiteException instanceof SQLiteFullException) && this.LJLJI)) {
            SQLiteDebug.LIZIZ(this.LJLIL);
            this.LJLIL.LJJIJIL();
        }
    }

    public final void LJ(int i, Object obj) {
        if (i >= 1 && i <= this.LJLJJL) {
            this.LJLJJLL[i - 1] = obj;
        } else {
            StringBuilder LJ = C7MY.LJ("Cannot bind argument at index ", i, " because the index is out of range.  The statement has ");
            throw new IllegalArgumentException(C08380Uo.LIZ(LJ, this.LJLJJL, " parameters.", LJ));
        }
    }

    public final void LJJII(int i, String str) {
        if (str != null) {
            LJ(i, str);
            return;
        }
        throw new IllegalArgumentException(C0NY.LIZIZ("the bind value at index ", i, " is null"));
    }

    public AbstractC84311X7b(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        this.LJLIL = sQLiteDatabase;
        String trim = str.trim();
        this.LJLILLLLZI = trim;
        int LIZ = C84310X7a.LIZ(trim);
        if (LIZ != 4 && LIZ != 5 && LIZ != 6) {
            boolean z = LIZ == 1;
            C84321X7l c84321X7l = new C84321X7l();
            C84325X7p LJJ = sQLiteDatabase.LJJ();
            LJJ.LIZ(trim, SQLiteDatabase.LJIJJ(z));
            try {
                LJJ.LIZIZ.LJIILIIL(trim, c84321X7l);
                LJJ.LJIIIZ();
                this.LJLJI = c84321X7l.LIZJ;
                this.LJLJJI = c84321X7l.LIZIZ;
                this.LJLJJL = c84321X7l.LIZ;
            } catch (Throwable th) {
                LJJ.LJIIIZ();
                throw th;
            }
        } else {
            this.LJLJI = false;
            this.LJLJJI = LJLJL;
            this.LJLJJL = 0;
        }
        if (objArr == null || objArr.length <= this.LJLJJL) {
            int i = this.LJLJJL;
            if (i != 0) {
                Object[] objArr2 = new Object[i];
                this.LJLJJLL = objArr2;
                if (objArr != null) {
                    System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                    return;
                }
                return;
            }
            this.LJLJJLL = null;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Too many bind arguments.  ");
        LIZ2.append(objArr.length);
        LIZ2.append(" arguments were provided but the statement needs ");
        throw new IllegalArgumentException(C08380Uo.LIZ(LIZ2, this.LJLJJL, " arguments.", LIZ2));
    }
}
