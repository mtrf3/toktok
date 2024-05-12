package com.tencent.wcdb.database;

import X.AbstractC84314X7e;
import X.C16880lQ;
import X.C84310X7a;
import X.C84312X7c;
import X.C84313X7d;
import X.C84315X7f;
import X.C84316X7g;
import X.C84320X7k;
import X.C84323X7n;
import X.C84325X7p;
import X.C84326X7q;
import X.C84329X7t;
import X.C84334X7y;
import X.JBR;
import X.X1D;
import X.X7D;
import X.X7E;
import X.X7U;
import android.content.ContentValues;
import android.os.Looper;
import android.util.Pair;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes16.dex */
public final class SQLiteDatabase extends AbstractC84314X7e {
    public static final WeakHashMap<SQLiteDatabase, Object> LJLJLJ;
    public static final String[] LJLJLLL;
    public final X7D LJLILLLLZI;
    public final X7E LJLJI;
    public final C84329X7t LJLJJL;
    public C84326X7q LJLJJLL;
    public boolean LJLJL;
    public final C84320X7k LJLIL = new C84320X7k(this);
    public final Object LJLJJI = new Object();

    /* loaded from: classes16.dex */
    public interface CustomFunction {
        void LIZ();
    }

    @Override // X.AbstractC84314X7e
    public final void LIZIZ() {
        LJIIL(false);
    }

    public final void finalize() {
        try {
            LJIIL(true);
        } finally {
            super.finalize();
        }
    }

    public final void LJIIJJI() {
        synchronized (this.LJLJJI) {
            LJJJJ();
            C84329X7t c84329X7t = this.LJLJJL;
            int i = c84329X7t.LIZLLL;
            if ((i & 536870912) == 0) {
                return;
            }
            c84329X7t.LIZLLL = i & (-536870913);
            try {
                this.LJLJJLL.LJIIL(c84329X7t);
            } catch (RuntimeException e) {
                C84329X7t c84329X7t2 = this.LJLJJL;
                c84329X7t2.LIZLLL = 536870912 | c84329X7t2.LIZLLL;
                throw e;
            }
        }
    }

    public final void LJIILIIL() {
        synchronized (this.LJLJJI) {
            LJJJJ();
            C84329X7t c84329X7t = this.LJLJJL;
            int i = c84329X7t.LIZLLL;
            if ((i & 536870912) != 0) {
                return;
            }
            if ((i & 1) == 1) {
                return;
            }
            if (c84329X7t.LIZ.equalsIgnoreCase(":memory:")) {
                Log.LIZJ("WCDB.SQLiteDatabase", "can't enable WAL for memory databases.");
                return;
            }
            if (this.LJLJL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("this database: ");
                LIZ.append(this.LJLJJL.LIZIZ);
                LIZ.append(" has attached databases. can't  enable WAL.");
                Log.LIZJ("WCDB.SQLiteDatabase", X1D.LIZIZ(LIZ));
                return;
            }
            C84329X7t c84329X7t2 = this.LJLJJL;
            c84329X7t2.LIZLLL |= 536870912;
            try {
                this.LJLJJLL.LJIIL(c84329X7t2);
            } catch (RuntimeException e) {
                this.LJLJJL.LIZLLL &= -536870913;
                throw e;
            }
        }
    }

    public final List<Pair<String, String>> LJIJ() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LJLJJI) {
            C84315X7f c84315X7f = null;
            if (this.LJLJJLL == null) {
                return null;
            }
            if (!this.LJLJL) {
                arrayList.add(new Pair("main", this.LJLJJL.LIZ));
                return arrayList;
            }
            LIZ();
            try {
                try {
                    c84315X7f = LJJJI("pragma database_list;", null);
                    while (c84315X7f.moveToNext()) {
                        arrayList.add(new Pair(c84315X7f.getString(1), c84315X7f.getString(2)));
                    }
                    c84315X7f.close();
                    return arrayList;
                } catch (Throwable th) {
                    if (c84315X7f != null) {
                        c84315X7f.close();
                    }
                    throw th;
                }
            } finally {
                LIZLLL();
            }
        }
    }

    public final String LJIJI() {
        String str;
        synchronized (this.LJLJJI) {
            str = this.LJLJJL.LIZ;
        }
        return str;
    }

    public final C84325X7p LJJ() {
        return this.LJLIL.get();
    }

    public final void LJJIIJ() {
        synchronized (this.LJLJJI) {
            LJJJJ();
            this.LJLJJLL.getClass();
        }
    }

    public final boolean LJJIJIIJIL() {
        boolean z;
        synchronized (this.LJLJJI) {
            z = true;
            if ((this.LJLJJL.LIZLLL & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    public final void LJJIJIL() {
        this.LJLJI.LIZ(this);
    }

    public final void LJJJIL() {
        synchronized (this.LJLJJI) {
            LJJJJ();
            C84329X7t c84329X7t = this.LJLJJL;
            int i = c84329X7t.LIZLLL;
            if ((i & 1) == 1) {
                c84329X7t.LIZLLL = i & (-2);
                try {
                    this.LJLJJLL.LJIIL(c84329X7t);
                } catch (RuntimeException e) {
                    this.LJLJJL.LIZLLL = i;
                    throw e;
                }
            }
        }
    }

    public final void LJJJJ() {
        if (this.LJLJJLL != null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("The database '");
        throw new IllegalStateException(JBR.LJFF(LIZ, this.LJLJJL.LIZIZ, "' is not open.", LIZ));
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.LJLJJI) {
            if (this.LJLJJLL != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    static {
        SQLiteGlobal.loadLib();
        LJLJLJ = new WeakHashMap<>();
        LJLJLLL = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    public final void LJJIJL() {
        LIZ();
        try {
            C84334X7y c84334X7y = LJJ().LJ;
            if (c84334X7y != null) {
                if (!c84334X7y.LIZJ) {
                    c84334X7y.LIZJ = true;
                    return;
                }
                throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
            }
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        } finally {
            LIZLLL();
        }
    }

    public final void LJJIJLIJ() {
        LIZ();
        try {
            LJJ().LIZJ();
        } finally {
            LIZLLL();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SQLiteDatabase: ");
        LIZ.append(LJIJI());
        return X1D.LIZIZ(LIZ);
    }

    public static int LJIJJ(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && myLooper == C16880lQ.LLJJJJ()) {
            return i | 4;
        }
        return i;
    }

    public final void LJI(boolean z) {
        int i;
        LIZ();
        try {
            C84325X7p LJJ = LJJ();
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            LJJ.LIZIZ(i, LJIJJ(false));
        } finally {
            LIZLLL();
        }
    }

    public final C84313X7d LJIIJ(String str) {
        LIZ();
        try {
            return new C84313X7d(this, str, null);
        } finally {
            LIZLLL();
        }
    }

    public final void LJIIL(boolean z) {
        C84326X7q c84326X7q;
        synchronized (this.LJLJJI) {
            c84326X7q = this.LJLJJLL;
            this.LJLJJLL = null;
        }
        if (!z) {
            WeakHashMap<SQLiteDatabase, Object> weakHashMap = LJLJLJ;
            synchronized (weakHashMap) {
                weakHashMap.remove(this);
            }
            if (c84326X7q != null) {
                c84326X7q.LIZJ();
            }
        }
    }

    public final void LJIILL(String str) {
        boolean z;
        LIZ();
        try {
            if (C84310X7a.LIZ(str) == 3) {
                synchronized (this.LJLJJI) {
                    if (!this.LJLJL) {
                        z = true;
                        this.LJLJL = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    LJIIJJI();
                }
            }
            C84313X7d c84313X7d = new C84313X7d(this, str, null);
            try {
                c84313X7d.LJIIJ();
            } finally {
                c84313X7d.LIZLLL();
            }
        } finally {
            LIZLLL();
        }
    }

    public final long LJ(String str, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C84325X7p LJJ = LJJ();
        LJJ.LIZ(null, i);
        long LJIIJJI = LJJ.LIZIZ.LJIIJJI(str);
        if (LJIIJJI != 0) {
            return LJIIJJI;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    public final void LJJIZ(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        synchronized (this.LJLJJI) {
            this.LJLJJLL = C84326X7q.LJIIJ(this, this.LJLJJL, bArr, sQLiteCipherSpec);
        }
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = LJLJLJ;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    public final C84315X7f LJJJI(String str, Object[] objArr) {
        LIZ();
        try {
            C84316X7g c84316X7g = new C84316X7g(this, str);
            Object obj = this.LJLILLLLZI;
            if (obj == null) {
                obj = C84316X7g.LIZLLL;
            }
            try {
                ((C84323X7n) obj).getClass();
                C84312X7c c84312X7c = new C84312X7c(this, str, objArr);
                try {
                    C84315X7f c84315X7f = new C84315X7f(c84316X7g, c84312X7c);
                    c84316X7g.LIZJ = c84312X7c;
                    return c84315X7f;
                } catch (RuntimeException e) {
                    c84312X7c.LIZLLL();
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } finally {
            LIZLLL();
        }
    }

    public final long LJJIIJZLJL(String str, ContentValues contentValues, int i) {
        int i2;
        Object[] objArr;
        String str2;
        LIZ();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(LJLJLLL[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            int i3 = 0;
            if (contentValues.size() > 0) {
                i2 = contentValues.size();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                objArr = new Object[i2];
                int i4 = 0;
                for (String str3 : contentValues.keySet()) {
                    if (i4 > 0) {
                        str2 = ",";
                    } else {
                        str2 = "";
                    }
                    sb.append(str2);
                    sb.append(str3);
                    objArr[i4] = contentValues.get(str3);
                    i4++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                loop1: while (true) {
                    String str4 = "?";
                    while (true) {
                        sb.append(str4);
                        i3++;
                        if (i3 >= i2) {
                            break loop1;
                        }
                        if (i3 > 0) {
                            str4 = ",?";
                        }
                    }
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                objArr = null;
                LIZ.append((String) null);
                LIZ.append(") VALUES (NULL");
                sb.append(X1D.LIZIZ(LIZ));
            }
            sb.append(')');
            C84313X7d c84313X7d = new C84313X7d(this, sb.toString(), objArr);
            try {
                return c84313X7d.LJIILJJIL();
            } finally {
                c84313X7d.LIZLLL();
            }
        } finally {
            LIZLLL();
        }
    }

    public SQLiteDatabase(int i, X7E x7e, X7D x7d, String str) {
        this.LJLILLLLZI = x7d;
        this.LJLJI = x7e == null ? new X7U() : x7e;
        this.LJLJJL = new C84329X7t(str, i);
    }

    public static SQLiteDatabase LJJIL(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, X7D x7d, int i, X7E x7e) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(i, x7e, x7d, str);
        try {
            try {
                sQLiteDatabase.LJJIZ(bArr, sQLiteCipherSpec);
            } catch (SQLiteDatabaseCorruptException unused) {
                sQLiteDatabase.LJJIJIL();
                sQLiteDatabase.LJJIZ(bArr, sQLiteCipherSpec);
            }
            return sQLiteDatabase;
        } catch (SQLiteException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to open database '");
            synchronized (sQLiteDatabase.LJLJJI) {
                Log.LIZIZ("WCDB.SQLiteDatabase", JBR.LJFF(LIZ, sQLiteDatabase.LJLJJL.LIZIZ, "'.", LIZ), e);
                sQLiteDatabase.LIZLLL();
                throw e;
            }
        }
    }
}
