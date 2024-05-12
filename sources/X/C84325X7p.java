package X;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteConnection;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.X7p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84325X7p {
    public final C84326X7q LIZ;
    public SQLiteConnection LIZIZ;
    public int LIZJ;
    public C84334X7y LIZLLL;
    public C84334X7y LJ;

    public final void LIZJ() {
        boolean z;
        C84334X7y c84334X7y = this.LJ;
        if (c84334X7y != null) {
            boolean z2 = false;
            if (!c84334X7y.LIZJ || c84334X7y.LIZLLL) {
                z = false;
            } else {
                z = true;
            }
            SQLiteTransactionListener sQLiteTransactionListener = c84334X7y.LIZIZ;
            if (sQLiteTransactionListener != null) {
                try {
                    if (z) {
                        sQLiteTransactionListener.onCommit();
                    } else {
                        sQLiteTransactionListener.onRollback();
                    }
                } catch (RuntimeException e) {
                    e = e;
                }
            }
            z2 = z;
            e = null;
            C84334X7y c84334X7y2 = c84334X7y.LIZ;
            this.LJ = c84334X7y2;
            c84334X7y.LIZ = this.LIZLLL;
            c84334X7y.LIZIZ = null;
            this.LIZLLL = c84334X7y;
            if (c84334X7y2 != null) {
                if (!z2) {
                    c84334X7y2.LIZLLL = true;
                }
            } else {
                try {
                    if (z2) {
                        this.LIZIZ.LJ("COMMIT;", null);
                    } else {
                        this.LIZIZ.LJ("ROLLBACK;", null);
                    }
                } finally {
                    LJIIIZ();
                }
            }
            if (e == null) {
                return;
            } else {
                throw e;
            }
        }
        throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
    }

    public final void LJIIIZ() {
        int i = this.LIZJ - 1;
        this.LIZJ = i;
        if (i == 0) {
            try {
                SQLiteConnection sQLiteConnection = this.LIZIZ;
                sQLiteConnection.LJIIIIZZ = 0;
                this.LIZ.LJIJ(sQLiteConnection);
            } finally {
                this.LIZIZ = null;
            }
        }
    }

    public C84325X7p(C84326X7q c84326X7q) {
        if (c84326X7q != null) {
            this.LIZ = c84326X7q;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    public final void LIZ(String str, int i) {
        boolean z;
        SQLiteConnection LJJIII;
        int i2;
        RuntimeException runtimeException;
        if (this.LIZIZ == null) {
            C84326X7q c84326X7q = this.LIZ;
            c84326X7q.getClass();
            SystemClock.uptimeMillis();
            if ((i & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            synchronized (c84326X7q.LJLJJI) {
                c84326X7q.LJIJJ();
                if ((z || (LJJIII = c84326X7q.LJJ(i, str)) == null) && (LJJIII = c84326X7q.LJJIII(i)) == null) {
                    if ((i & 4) != 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                    C84330X7u c84330X7u = c84326X7q.LJLL;
                    if (c84330X7u != null) {
                        c84326X7q.LJLL = c84330X7u.LIZ;
                        c84330X7u.LIZ = null;
                    } else {
                        c84330X7u = new C84330X7u();
                    }
                    c84330X7u.LIZIZ = LLLLIIIILLL;
                    c84330X7u.LIZJ = uptimeMillis;
                    c84330X7u.LIZLLL = i2;
                    c84330X7u.LJ = z;
                    c84330X7u.LJFF = str;
                    c84330X7u.LJI = i;
                    C84330X7u c84330X7u2 = c84326X7q.LJLLI;
                    C84330X7u c84330X7u3 = null;
                    while (true) {
                        if (c84330X7u2 == null) {
                            break;
                        }
                        if (i2 > c84330X7u2.LIZLLL) {
                            c84330X7u.LIZ = c84330X7u2;
                            break;
                        } else {
                            c84330X7u3 = c84330X7u2;
                            c84330X7u2 = c84330X7u2.LIZ;
                        }
                    }
                    if (c84330X7u3 == null) {
                        c84326X7q.LJLLI = c84330X7u;
                    } else {
                        c84330X7u3.LIZ = c84330X7u;
                    }
                    long j = c84330X7u.LIZJ + 3000;
                    long j2 = 3000;
                    while (true) {
                        if (c84326X7q.LJLJJL.compareAndSet(true, false)) {
                            synchronized (c84326X7q.LJLJJI) {
                                c84326X7q.LJJIIJ();
                            }
                        }
                        LockSupport.parkNanos(j2 * 1000000);
                        Thread.interrupted();
                        synchronized (c84326X7q.LJLJJI) {
                            c84326X7q.LJIJJ();
                            LJJIII = c84330X7u.LJII;
                            runtimeException = c84330X7u.LJIIIIZZ;
                            if (LJJIII != null || runtimeException != null) {
                                break;
                            }
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (uptimeMillis2 < j) {
                                j2 = uptimeMillis2 - j;
                            } else {
                                c84326X7q.LJFF(i, uptimeMillis2 - c84330X7u.LIZJ);
                                j = uptimeMillis2 + 3000;
                                j2 = 3000;
                            }
                        }
                    }
                    c84330X7u.LIZ = c84326X7q.LJLL;
                    c84330X7u.LIZIZ = null;
                    c84330X7u.LJFF = null;
                    c84330X7u.LJII = null;
                    c84330X7u.LJIIIIZZ = null;
                    c84326X7q.LJLL = c84330X7u;
                    if (LJJIII == null) {
                        throw runtimeException;
                    }
                }
            }
            this.LIZIZ = LJJIII;
            C16880lQ.LLLLIIIILLL();
            LJJIII.LJIIIIZZ = Process.myTid();
        }
        this.LIZJ++;
    }

    public final void LIZIZ(int i, int i2) {
        C84334X7y c84334X7y = this.LJ;
        if (c84334X7y == null || !c84334X7y.LIZJ) {
            if (c84334X7y == null) {
                LIZ(null, i2);
            }
            try {
                if (this.LJ == null) {
                    if (i != 1) {
                        if (i == 2) {
                            this.LIZIZ.LJ("BEGIN EXCLUSIVE;", null);
                        } else {
                            this.LIZIZ.LJ("BEGIN;", null);
                        }
                    } else {
                        this.LIZIZ.LJ("BEGIN IMMEDIATE;", null);
                    }
                }
                C84334X7y c84334X7y2 = this.LIZLLL;
                if (c84334X7y2 != null) {
                    this.LIZLLL = c84334X7y2.LIZ;
                    c84334X7y2.LIZ = null;
                    c84334X7y2.LIZJ = false;
                    c84334X7y2.LIZLLL = false;
                } else {
                    c84334X7y2 = new C84334X7y();
                }
                c84334X7y2.LIZIZ = null;
                c84334X7y2.LIZ = this.LJ;
                this.LJ = c84334X7y2;
                return;
            } catch (Throwable th) {
                if (this.LJ == null) {
                    LJIIIZ();
                }
                throw th;
            }
        }
        throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
    }

    public final boolean LJIIIIZZ(String str, int i) {
        int LIZ = C84310X7a.LIZ(str);
        if (LIZ != 4) {
            if (LIZ != 5) {
                if (LIZ != 6) {
                    return false;
                }
                LIZJ();
                return true;
            }
            C84334X7y c84334X7y = this.LJ;
            if (c84334X7y != null) {
                if (!c84334X7y.LIZJ) {
                    c84334X7y.LIZJ = true;
                    LIZJ();
                    return true;
                }
                throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
            }
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        LIZIZ(2, i);
        return true;
    }

    public final int LIZLLL(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJIIIIZZ(str, i)) {
                return 0;
            }
            LIZ(str, i);
            try {
                return this.LIZIZ.LJFF(str, objArr);
            } finally {
                LJIIIZ();
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJFF(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJIIIIZZ(str, i)) {
                return 0L;
            }
            LIZ(str, i);
            try {
                return this.LIZIZ.LJII(str, objArr);
            } finally {
                LJIIIZ();
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJI(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJIIIIZZ(str, i)) {
                return 0L;
            }
            LIZ(str, i);
            try {
                return this.LIZIZ.LJIIIIZZ(str, objArr);
            } finally {
                LJIIIZ();
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final String LJII(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJIIIIZZ(str, i)) {
                return null;
            }
            LIZ(str, i);
            try {
                return this.LIZIZ.LJIIIZ(str, objArr);
            } finally {
                LJIIIZ();
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final int LJ(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3) {
        if (str != null) {
            if (cursorWindow != null) {
                if (LJIIIIZZ(str, i3)) {
                    cursorWindow.LJ();
                    return 0;
                }
                LIZ(str, i3);
                try {
                    return this.LIZIZ.LJI(str, objArr, cursorWindow, i, i2, z);
                } finally {
                    LJIIIZ();
                }
            }
            throw new IllegalArgumentException("window must not be null.");
        }
        throw new IllegalArgumentException("sql must not be null.");
    }
}
