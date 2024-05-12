package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteException;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.X7q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84326X7q implements Closeable {
    public final WeakReference<SQLiteDatabase> LJLIL;
    public byte[] LJLILLLLZI;
    public SQLiteCipherSpec LJLJI;
    public final C84329X7t LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public C84330X7u LJLL;
    public C84330X7u LJLLI;
    public SQLiteConnection LJLLJ;
    public final Object LJLJJI = new Object();
    public final AtomicBoolean LJLJJL = new AtomicBoolean();
    public final ArrayList<SQLiteConnection> LJLLILLLL = new ArrayList<>();
    public final WeakHashMap<SQLiteConnection, EnumC84331X7v> LJLLL = new WeakHashMap<>();

    public final void LIZ() {
        int size = this.LJLLILLLL.size();
        for (int i = 0; i < size; i++) {
            LIZIZ((SQLiteConnection) ListProtector.get(this.LJLLILLLL, i));
        }
        this.LJLLILLLL.clear();
    }

    public final void LIZJ() {
        synchronized (this.LJLJJI) {
            LJIJJ();
            this.LJLJLJ = false;
            LIZ();
            SQLiteConnection sQLiteConnection = this.LJLLJ;
            if (sQLiteConnection != null) {
                LIZIZ(sQLiteConnection);
                this.LJLLJ = null;
            }
            int size = this.LJLLL.size();
            if (size != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("The connection pool for ");
                LIZ.append(this.LJLJJLL.LIZIZ);
                LIZ.append(" has been closed but there are still ");
                LIZ.append(size);
                LIZ.append(" connections in use.  They will be closed as they are released back to the pool.");
                com.tencent.wcdb.support.Log.LIZJ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ));
            }
            LJJIIJ();
        }
    }

    public final void LJ() {
        synchronized (this.LJLJJI) {
            LJFF(0, 0L);
        }
    }

    public final void LJIILIIL() {
        SQLiteConnection sQLiteConnection = this.LJLLJ;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.LJIILJJIL(this.LJLJJLL);
            } catch (RuntimeException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to reconfigure available primary connection, closing it: ");
                LIZ.append(this.LJLLJ);
                com.tencent.wcdb.support.Log.LIZIZ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ), e);
                LIZIZ(this.LJLLJ);
                this.LJLLJ = null;
            }
        }
        int size = this.LJLLILLLL.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) ListProtector.get(this.LJLLILLLL, i);
            try {
                sQLiteConnection2.LJIILJJIL(this.LJLJJLL);
            } catch (RuntimeException e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Failed to reconfigure available non-primary connection, closing it: ");
                LIZ2.append(sQLiteConnection2);
                com.tencent.wcdb.support.Log.LIZIZ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ2), e2);
                LIZIZ(sQLiteConnection2);
                ListProtector.remove(this.LJLLILLLL, i);
                size--;
                i--;
            }
            i++;
        }
        LJI(EnumC84331X7v.RECONFIGURE);
    }

    public final void LJIJI() {
        int i;
        if ((this.LJLJJLL.LIZLLL & 536870912) != 0) {
            i = 4;
        } else {
            i = 1;
        }
        this.LJLJL = i;
        com.tencent.wcdb.support.Log.LIZLLL(Integer.valueOf(i));
    }

    public final void LJIJJ() {
        if (this.LJLJLJ) {
        } else {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    public final void LJJIIJ() {
        SQLiteConnection LJJIII;
        C84330X7u c84330X7u = this.LJLLI;
        C84330X7u c84330X7u2 = null;
        boolean z = false;
        boolean z2 = false;
        while (c84330X7u != null) {
            boolean z3 = true;
            if (this.LJLJLJ) {
                try {
                    if (!c84330X7u.LJ && !z) {
                        LJJIII = LJJ(c84330X7u.LJI, c84330X7u.LJFF);
                        if (LJJIII == null) {
                            z = true;
                        }
                        c84330X7u.LJII = LJJIII;
                    }
                    if (!z2) {
                        LJJIII = LJJIII(c84330X7u.LJI);
                        if (LJJIII == null) {
                            z2 = true;
                        }
                        c84330X7u.LJII = LJJIII;
                    }
                    if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (RuntimeException e) {
                    c84330X7u.LJIIIIZZ = e;
                }
            }
            C84330X7u c84330X7u3 = c84330X7u.LIZ;
            if (z3) {
                if (c84330X7u2 != null) {
                    c84330X7u2.LIZ = c84330X7u3;
                } else {
                    this.LJLLI = c84330X7u3;
                }
                c84330X7u.LIZ = null;
                LockSupport.unpark(c84330X7u.LIZIZ);
            } else {
                c84330X7u2 = c84330X7u;
            }
            c84330X7u = c84330X7u3;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SQLiteConnectionPool: ");
        LIZ.append(this.LJLJJLL.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZJ();
    }

    public final void finalize() {
        super.finalize();
    }

    public static void LIZIZ(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.LIZJ();
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to close connection, its fate is now in the hands of the merciful GC: ");
            LIZ.append(sQLiteConnection);
            LIZ.append(e.getMessage());
            com.tencent.wcdb.support.Log.LIZ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(EnumC84331X7v enumC84331X7v) {
        if (!this.LJLLL.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.LJLLL.size());
            for (Map.Entry<SQLiteConnection, EnumC84331X7v> entry : this.LJLLL.entrySet()) {
                EnumC84331X7v value = entry.getValue();
                if (enumC84331X7v != value && value != EnumC84331X7v.DISCARD) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.LJLLL.put(ListProtector.get(arrayList, i), enumC84331X7v);
            }
        }
    }

    public final void LJIIL(C84329X7t c84329X7t) {
        boolean z;
        String str;
        String str2;
        if (c84329X7t != null) {
            synchronized (this.LJLJJI) {
                LJIJJ();
                if (((c84329X7t.LIZLLL ^ this.LJLJJLL.LIZLLL) & 536870912) != 0) {
                    z = true;
                    if (this.LJLLL.isEmpty()) {
                        LIZ();
                    } else {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                } else {
                    z = false;
                }
                if (c84329X7t.LJI == this.LJLJJLL.LJI || this.LJLLL.isEmpty()) {
                    C84329X7t c84329X7t2 = this.LJLJJLL;
                    if (((c84329X7t2.LIZLLL ^ c84329X7t.LIZLLL) & 268435473) == 0 && ((str = c84329X7t2.LIZJ) == (str2 = c84329X7t.LIZJ) || (str != null && str.equals(str2)))) {
                        this.LJLJJLL.LIZ(c84329X7t);
                        LJIJI();
                        int size = this.LJLLILLLL.size();
                        while (true) {
                            int i = size - 1;
                            if (size <= this.LJLJL - 1) {
                                break;
                            }
                            LIZIZ((SQLiteConnection) ListProtector.remove(this.LJLLILLLL, i));
                            size = i;
                        }
                        LJIILIIL();
                    } else {
                        if (z) {
                            LIZ();
                            SQLiteConnection sQLiteConnection = this.LJLLJ;
                            if (sQLiteConnection != null) {
                                LIZIZ(sQLiteConnection);
                                this.LJLLJ = null;
                            }
                        }
                        SQLiteConnection LJIIJJI = LJIIJJI(c84329X7t, true);
                        LIZ();
                        SQLiteConnection sQLiteConnection2 = this.LJLLJ;
                        if (sQLiteConnection2 != null) {
                            LIZIZ(sQLiteConnection2);
                            this.LJLLJ = null;
                        }
                        LJI(EnumC84331X7v.DISCARD);
                        this.LJLLJ = LJIIJJI;
                        this.LJLJJLL.LIZ(c84329X7t);
                        LJIJI();
                    }
                    LJJIIJ();
                } else {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    public final void LJIJ(SQLiteConnection sQLiteConnection) {
        synchronized (this.LJLJJI) {
            EnumC84331X7v remove = this.LJLLL.remove(sQLiteConnection);
            if (remove != null) {
                if (!this.LJLJLJ) {
                    LIZIZ(sQLiteConnection);
                } else if (sQLiteConnection.LIZLLL) {
                    if (LJIILL(sQLiteConnection, remove)) {
                        this.LJLLJ = sQLiteConnection;
                    }
                    LJJIIJ();
                } else if (this.LJLLILLLL.size() >= this.LJLJL - 1) {
                    LIZIZ(sQLiteConnection);
                } else {
                    if (LJIILL(sQLiteConnection, remove)) {
                        this.LJLLILLLL.add(sQLiteConnection);
                    }
                    LJJIIJ();
                }
            } else {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
        }
    }

    public final SQLiteConnection LJJIII(int i) {
        SQLiteConnection sQLiteConnection = this.LJLLJ;
        if (sQLiteConnection != null) {
            this.LJLLJ = null;
            LIZLLL(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.LJLLL.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().LIZLLL) {
                return null;
            }
        }
        SQLiteConnection LJIIJJI = LJIIJJI(this.LJLJJLL, true);
        LIZLLL(LJIIJJI, i);
        return LJIIJJI;
    }

    public C84326X7q(SQLiteDatabase sQLiteDatabase, C84329X7t c84329X7t) {
        this.LJLIL = new WeakReference<>(sQLiteDatabase);
        this.LJLJJLL = new C84329X7t(c84329X7t);
        LJIJI();
    }

    public final void LIZLLL(SQLiteConnection sQLiteConnection, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.LJIIJ = z;
            this.LJLLL.put(sQLiteConnection, EnumC84331X7v.NORMAL);
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to prepare acquired connection for session, closing it: ");
            LIZ.append(sQLiteConnection);
            LIZ.append(", connectionFlags=");
            LIZ.append(i);
            com.tencent.wcdb.support.Log.LIZ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ));
            LIZIZ(sQLiteConnection);
            throw e;
        }
    }

    public final void LJFF(int i, long j) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            sb.append("The connection pool for database '");
            sb.append(this.LJLJJLL.LIZIZ);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(LLLLIIIILLL.getId());
            sb.append(" (");
            sb.append(LLLLIIIILLL.getName());
            sb.append(") with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(((float) j) * 0.001f);
            sb.append(" seconds.\n");
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (!this.LJLLL.isEmpty()) {
            Iterator<SQLiteConnection> it = this.LJLLL.keySet().iterator();
            i2 = 0;
            while (it.hasNext()) {
                C84327X7r c84327X7r = it.next().LJII;
                synchronized (c84327X7r.LIZ) {
                    C84328X7s c84328X7s = c84327X7r.LIZ[c84327X7r.LIZIZ];
                    if (c84328X7s != null && !c84328X7s.LJFF) {
                        StringBuilder sb2 = new StringBuilder();
                        c84328X7s.LIZ(sb2);
                        String sb3 = sb2.toString();
                        if (sb3 != null) {
                            arrayList.add(sb3);
                            i3++;
                        }
                    }
                }
                i2++;
            }
        } else {
            i2 = 0;
        }
        int size = this.LJLLILLLL.size();
        if (this.LJLLJ != null) {
            size++;
        }
        C1EU.LIZJ(sb, "Connections: ", i3, " active, ", i2);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1DI.LIZIZ(sb, "  ", (String) it2.next(), "\n");
            }
        }
        com.tencent.wcdb.support.Log.LJ("WCDB.SQLiteConnectionPool", sb.toString());
        this.LJLIL.get();
    }

    public final SQLiteConnection LJIIJJI(C84329X7t c84329X7t, boolean z) {
        int i = this.LJLJLLL;
        this.LJLJLLL = i + 1;
        SQLiteConnection sQLiteConnection = new SQLiteConnection(this, c84329X7t, i, z, this.LJLILLLLZI, this.LJLJI);
        try {
            sQLiteConnection.LJIIL();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            SQLiteDebug.LIZ(sQLiteConnection);
            sQLiteConnection.LIZJ();
            throw e;
        }
    }

    public final boolean LJIILL(SQLiteConnection sQLiteConnection, EnumC84331X7v enumC84331X7v) {
        if (enumC84331X7v == EnumC84331X7v.RECONFIGURE) {
            try {
                sQLiteConnection.LJIILJJIL(this.LJLJJLL);
            } catch (RuntimeException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to reconfigure released connection, closing it: ");
                LIZ.append(sQLiteConnection);
                com.tencent.wcdb.support.Log.LIZIZ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ), e);
                enumC84331X7v = EnumC84331X7v.DISCARD;
            }
        }
        if (enumC84331X7v != EnumC84331X7v.DISCARD) {
            return true;
        }
        LIZIZ(sQLiteConnection);
        return false;
    }

    public final SQLiteConnection LJJ(int i, String str) {
        int size = this.LJLLILLLL.size();
        if (size > 1) {
            if (str != null) {
                int i2 = 0;
                do {
                    SQLiteConnection sQLiteConnection = (SQLiteConnection) ListProtector.get(this.LJLLILLLL, i2);
                    if (sQLiteConnection.LJFF.LIZIZ(str) != null) {
                        ListProtector.remove(this.LJLLILLLL, i2);
                        LIZLLL(sQLiteConnection, i);
                        return sQLiteConnection;
                    }
                    i2++;
                } while (i2 < size);
            }
        } else if (size <= 0) {
            int size2 = this.LJLLL.size();
            if (this.LJLLJ != null) {
                size2++;
            }
            if (size2 >= this.LJLJL) {
                return null;
            }
            SQLiteConnection LJIIJJI = LJIIJJI(this.LJLJJLL, false);
            LIZLLL(LJIIJJI, i);
            return LJIIJJI;
        }
        SQLiteConnection sQLiteConnection2 = (SQLiteConnection) ListProtector.remove(this.LJLLILLLL, size - 1);
        LIZLLL(sQLiteConnection2, i);
        return sQLiteConnection2;
    }

    public static C84326X7q LJIIJ(SQLiteDatabase sQLiteDatabase, C84329X7t c84329X7t, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (c84329X7t != null) {
            C84326X7q c84326X7q = new C84326X7q(sQLiteDatabase, c84329X7t);
            c84326X7q.LJLILLLLZI = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            c84326X7q.LJLJI = sQLiteCipherSpec2;
            c84326X7q.LJLLJ = c84326X7q.LJIIJJI(c84326X7q.LJLJJLL, true);
            c84326X7q.LJLJLJ = true;
            return c84326X7q;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }
}
