package com.tencent.wcdb.database;

import X.C08380Uo;
import X.C15890jp;
import X.C84310X7a;
import X.C84321X7l;
import X.C84326X7q;
import X.C84327X7r;
import X.C84328X7s;
import X.C84329X7t;
import X.C84332X7w;
import X.C84333X7x;
import X.X1D;
import X.YE1;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.Log;
import java.util.regex.Pattern;

/* loaded from: classes16.dex */
public final class SQLiteConnection {
    public static final String[] LJIILL = new String[0];
    public static final byte[] LJIILLIIL = new byte[0];
    public static final Pattern LJIIZILJ = PatternProtector.compile("[\\s]*\\n+[\\s]*");
    public final C84326X7q LIZ;
    public final C84329X7t LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C84333X7x LJFF;
    public C84332X7w LJI;
    public final C84327X7r LJII = new C84327X7r(this);
    public int LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public byte[] LJIIJJI;
    public final SQLiteCipherSpec LJIIL;
    public C84328X7s LJIILIIL;
    public int LJIILJJIL;

    public static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    public static native void nativeBindDouble(long j, long j2, int i, double d);

    public static native void nativeBindLong(long j, long j2, int i, long j3);

    public static native void nativeBindNull(long j, long j2, int i);

    public static native void nativeBindString(long j, long j2, int i, String str);

    public static native void nativeCancel(long j);

    public static native void nativeClose(long j);

    public static native void nativeExecute(long j, long j2);

    public static native int nativeExecuteForChangedRowCount(long j, long j2);

    public static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    public static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    public static native long nativeExecuteForLong(long j, long j2);

    public static native String nativeExecuteForString(long j, long j2);

    public static native void nativeFinalizeStatement(long j, long j2);

    public static native int nativeGetColumnCount(long j, long j2);

    public static native String nativeGetColumnName(long j, long j2, int i);

    public static native int nativeGetDbLookaside(long j);

    public static native int nativeGetParameterCount(long j, long j2);

    public static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    public static native long nativePrepareStatement(long j, String str);

    public static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    public static native void nativeRegisterLocalizedCollators(long j, String str);

    public static native void nativeResetCancel(long j, boolean z);

    public static native void nativeResetStatement(long j, long j2, boolean z);

    public static native long nativeSQLiteHandle(long j, boolean z);

    public static native void nativeSetKey(long j, byte[] bArr);

    public static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    public static native void nativeSetWalHook(long j);

    public static native long nativeWalCheckpoint(long j, String str);

    public final void LIZJ() {
        if (this.LJIIIZ != 0) {
            int i = this.LJII.LIZ("close", null, null).LJII;
            try {
                this.LJFF.LIZLLL(-1);
                nativeClose(this.LJIIIZ);
                this.LJIIIZ = 0L;
            } finally {
                this.LJII.LIZIZ(i);
            }
        }
    }

    public final void LIZLLL() {
        int i = this.LJIILJJIL - 1;
        this.LJIILJJIL = i;
        if (i == 0 && this.LJIILIIL != null) {
            nativeSQLiteHandle(this.LJIIIZ, false);
            this.LJII.LIZJ(this.LJIILIIL.LJII);
            this.LJIILIIL = null;
        }
    }

    public final void LJIIL() {
        long j;
        String str;
        int i;
        C84329X7t c84329X7t = this.LIZIZ;
        long nativeOpen = nativeOpen(c84329X7t.LIZ, c84329X7t.LIZLLL, c84329X7t.LIZJ);
        this.LJIIIZ = nativeOpen;
        byte[] bArr = this.LJIIJJI;
        if (bArr != null && bArr.length == 0) {
            this.LJIIJJI = null;
        }
        byte[] bArr2 = this.LJIIJJI;
        if (bArr2 != null) {
            nativeSetKey(nativeOpen, bArr2);
            SQLiteCipherSpec sQLiteCipherSpec = this.LJIIL;
            if (sQLiteCipherSpec != null) {
                if (sQLiteCipherSpec.cipher != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PRAGMA cipher=");
                    LIZ.append(C84310X7a.LIZLLL(this.LJIIL.cipher));
                    LJ(X1D.LIZIZ(LIZ), null);
                }
                if (this.LJIIL.kdfIteration != 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("PRAGMA kdf_iter=");
                    LIZ2.append(this.LJIIL.kdfIteration);
                    LJ(X1D.LIZIZ(LIZ2), null);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PRAGMA cipher_use_hmac=");
                LIZ3.append(this.LJIIL.hmacEnabled);
                LJ(X1D.LIZIZ(LIZ3), null);
            }
        }
        if (!this.LIZIZ.LIZ.equalsIgnoreCase(":memory:")) {
            if (this.LJIIJJI != null) {
                SQLiteCipherSpec sQLiteCipherSpec2 = this.LJIIL;
                if (sQLiteCipherSpec2 == null || (i = sQLiteCipherSpec2.pageSize) <= 0) {
                    i = SQLiteGlobal.LIZ;
                }
                j = i;
                str = "PRAGMA cipher_page_size";
            } else {
                j = SQLiteGlobal.LIZ;
                str = "PRAGMA page_size";
            }
            if (LJIIIIZZ(str, null) != j) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str);
                LIZ4.append("=");
                LIZ4.append(j);
                LJ(X1D.LIZIZ(LIZ4), null);
            }
        }
        if (this.LJ) {
            LJ("PRAGMA query_only = 1", null);
        }
        LJIIZILJ();
        LJIJI();
        int i2 = this.LIZIZ.LJIIIIZZ;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("PRAGMA synchronous=");
        LIZ5.append(i2);
        LJ(X1D.LIZIZ(LIZ5), null);
        if (!this.LIZIZ.LIZ.equalsIgnoreCase(":memory:") && !this.LJ && LJIIIIZZ("PRAGMA journal_size_limit", null) != PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            LJIIIIZZ("PRAGMA journal_size_limit=524288", null);
        }
        LJIILLIIL();
        LJIJ();
        long j2 = this.LJIIIZ;
        C84329X7t c84329X7t2 = this.LIZIZ;
        nativeSetUpdateNotification(j2, c84329X7t2.LJIIIZ, c84329X7t2.LJIIJ);
        int size = this.LIZIZ.LJIIJJI.size();
        for (int i3 = 0; i3 < size; i3++) {
            nativeRegisterCustomFunction(this.LJIIIZ, (SQLiteCustomFunction) ListProtector.get(this.LIZIZ.LJIIJJI, i3));
        }
    }

    public final void LJIILLIIL() {
        if (!this.LIZIZ.LIZ.equalsIgnoreCase(":memory:") && !this.LJ) {
            if (this.LIZIZ.LJII) {
                nativeSetWalHook(this.LJIIIZ);
            } else {
                if (LJIIIIZZ("PRAGMA wal_autocheckpoint", null) == 100) {
                    return;
                }
                LJIIIIZZ("PRAGMA wal_autocheckpoint=100", null);
            }
        }
    }

    public final void LJIIZILJ() {
        long j;
        if (!this.LJ) {
            if (this.LIZIZ.LJI) {
                j = 1;
            } else {
                j = 0;
            }
            if (LJIIIIZZ("PRAGMA foreign_keys", null) != j) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PRAGMA foreign_keys=");
                LIZ.append(j);
                LJ(X1D.LIZIZ(LIZ), null);
            }
        }
    }

    public final void LJIJ() {
        C84329X7t c84329X7t = this.LIZIZ;
        int i = c84329X7t.LIZLLL | 16;
        c84329X7t.LIZLLL = i;
        if ((i & 16) != 0) {
            return;
        }
        String locale = c84329X7t.LJFF.toString();
        nativeRegisterLocalizedCollators(this.LJIIIZ, locale);
        if (this.LJ) {
            return;
        }
        try {
            LJ("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null);
            String LJIIIZ = LJIIIZ("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null);
            if (LJIIIZ != null && LJIIIZ.equals(locale)) {
                return;
            }
            LJ("BEGIN", null);
            try {
                LJ("DELETE FROM android_metadata", null);
                LJ("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale});
                LJ("REINDEX LOCALIZED", null);
                LJ("COMMIT", null);
            } catch (Throwable th) {
                LJ("ROLLBACK", null);
                throw th;
            }
        } catch (RuntimeException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to change locale for db '");
            YE1.LIZLLL(LIZ, this.LIZIZ.LIZIZ, "' to '", locale, "'.");
            throw new SQLiteException(X1D.LIZIZ(LIZ), e);
        }
    }

    public final void LJIJI() {
        String str;
        if (!this.LIZIZ.LIZ.equalsIgnoreCase(":memory:") && !this.LJ) {
            if ((this.LIZIZ.LIZLLL & 536870912) != 0) {
                str = "WAL";
            } else {
                str = "PERSIST";
            }
            String LJIIIZ = LJIIIZ("PRAGMA journal_mode", null);
            if (!LJIIIZ.equalsIgnoreCase(str)) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PRAGMA journal_mode=");
                    LIZ.append(str);
                    if (LJIIIZ(X1D.LIZIZ(LIZ), null).equalsIgnoreCase(str)) {
                        return;
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Could not change the database journal mode of '");
                YE1.LIZLLL(LIZ2, this.LIZIZ.LIZIZ, "' from '", LJIIIZ, "' to '");
                LIZ2.append(str);
                LIZ2.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
                Log.LJ("WCDB.SQLiteConnection", X1D.LIZIZ(LIZ2));
            }
        }
    }

    public final void finalize() {
        try {
            C84326X7q c84326X7q = this.LIZ;
            if (c84326X7q != null && this.LJIIIZ != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("A SQLiteConnection object for database '");
                LIZ.append(c84326X7q.LJLJJLL.LIZIZ);
                LIZ.append("' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                Log.LJ("WCDB.SQLiteConnectionPool", X1D.LIZIZ(LIZ));
                c84326X7q.LJLJJL.set(true);
            }
            LIZJ();
        } finally {
            super.finalize();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SQLiteConnection: ");
        LIZ.append(this.LIZIZ.LIZ);
        LIZ.append(" (");
        return C08380Uo.LIZ(LIZ, this.LIZJ, ")", LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r5 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C84332X7w LIZ(java.lang.String r12) {
        /*
            r11 = this;
            X.X7x r0 = r11.LJFF
            java.lang.Object r5 = r0.LIZIZ(r12)
            X.X7w r5 = (X.C84332X7w) r5
            r4 = 1
            r6 = 0
            if (r5 == 0) goto L15
            boolean r0 = r5.LJII
            if (r0 != 0) goto L13
            r5.LJII = r4
            return r5
        L13:
            r10 = 1
            goto L16
        L15:
            r10 = 0
        L16:
            long r0 = r11.LJIIIZ
            long r2 = nativePrepareStatement(r0, r12)
            long r0 = r11.LJIIIZ     // Catch: java.lang.RuntimeException -> L5f
            int r9 = nativeGetParameterCount(r0, r2)     // Catch: java.lang.RuntimeException -> L5f
            int r8 = X.C84310X7a.LIZ(r12)     // Catch: java.lang.RuntimeException -> L5f
            long r0 = r11.LJIIIZ     // Catch: java.lang.RuntimeException -> L5f
            boolean r7 = nativeIsReadOnly(r0, r2)     // Catch: java.lang.RuntimeException -> L5f
            X.X7w r1 = r11.LJI     // Catch: java.lang.RuntimeException -> L5f
            if (r1 == 0) goto L44
            X.X7w r0 = r1.LIZ     // Catch: java.lang.RuntimeException -> L5f
            r11.LJI = r0     // Catch: java.lang.RuntimeException -> L5f
            r0 = 0
            r1.LIZ = r0     // Catch: java.lang.RuntimeException -> L5f
            r1.LJI = r6     // Catch: java.lang.RuntimeException -> L5f
        L39:
            r1.LIZIZ = r12     // Catch: java.lang.RuntimeException -> L5f
            r1.LIZJ = r2     // Catch: java.lang.RuntimeException -> L5f
            r1.LIZLLL = r9     // Catch: java.lang.RuntimeException -> L5f
            r1.LJ = r8     // Catch: java.lang.RuntimeException -> L5f
            r1.LJFF = r7     // Catch: java.lang.RuntimeException -> L5f
            goto L4a
        L44:
            X.X7w r1 = new X.X7w     // Catch: java.lang.RuntimeException -> L5f
            r1.<init>(r11)     // Catch: java.lang.RuntimeException -> L5f
            goto L39
        L4a:
            if (r10 != 0) goto L5c
            r0 = 2
            if (r8 == r0) goto L51
            if (r8 != r4) goto L5c
        L51:
            X.X7x r0 = r11.LJFF     // Catch: java.lang.RuntimeException -> L59
            r0.LIZJ(r12, r1)     // Catch: java.lang.RuntimeException -> L59
            r1.LJI = r4     // Catch: java.lang.RuntimeException -> L59
            goto L5c
        L59:
            r4 = move-exception
            r5 = r1
            goto L62
        L5c:
            r1.LJII = r4
            return r1
        L5f:
            r4 = move-exception
            if (r5 == 0) goto L66
        L62:
            boolean r0 = r5.LJI
            if (r0 != 0) goto L6b
        L66:
            long r0 = r11.LJIIIZ
            nativeFinalizeStatement(r0, r2)
        L6b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.LIZ(java.lang.String):X.X7w");
    }

    public final void LJIIJ(C84332X7w c84332X7w) {
        nativeFinalizeStatement(this.LJIIIZ, c84332X7w.LIZJ);
        c84332X7w.LIZIZ = null;
        c84332X7w.LIZ = this.LJI;
        this.LJI = c84332X7w;
    }

    public final long LJIIJJI(String str) {
        if (this.LJIIIZ == 0) {
            return 0L;
        }
        if (str != null && this.LJIILIIL == null) {
            C84328X7s LIZ = this.LJII.LIZ(str, null, null);
            this.LJIILIIL = LIZ;
            LIZ.getClass();
        }
        this.LJIILJJIL++;
        return nativeSQLiteHandle(this.LJIIIZ, true);
    }

    public final void LJIILJJIL(C84329X7t c84329X7t) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        this.LJIIJ = false;
        int size = c84329X7t.LJIIJJI.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) ListProtector.get(c84329X7t.LJIIJJI, i);
            if (!this.LIZIZ.LJIIJJI.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.LJIIIZ, sQLiteCustomFunction);
            }
        }
        int i2 = c84329X7t.LIZLLL;
        C84329X7t c84329X7t2 = this.LIZIZ;
        if (((i2 ^ c84329X7t2.LIZLLL) & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (c84329X7t.LJI != c84329X7t2.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !c84329X7t.LJFF.equals(c84329X7t2.LJFF);
        boolean z7 = c84329X7t.LJII;
        C84329X7t c84329X7t3 = this.LIZIZ;
        if (z7 != c84329X7t3.LJII) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c84329X7t.LJIIIIZZ != c84329X7t3.LJIIIIZZ) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c84329X7t.LJIIIZ != c84329X7t3.LJIIIZ || c84329X7t.LJIIJ != c84329X7t3.LJIIJ) {
            z5 = true;
        }
        c84329X7t3.LIZ(c84329X7t);
        C84333X7x c84333X7x = this.LJFF;
        int i3 = c84329X7t.LJ;
        if (i3 > 0) {
            synchronized (c84333X7x) {
                c84333X7x.LIZJ = i3;
            }
            c84333X7x.LIZLLL(i3);
            if (z2) {
                LJIIZILJ();
            }
            if (z) {
                LJIJI();
            }
            if (z4) {
                int i4 = this.LIZIZ.LJIIIIZZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PRAGMA synchronous=");
                LIZ.append(i4);
                LJ(X1D.LIZIZ(LIZ), null);
            }
            if (z3) {
                LJIILLIIL();
            }
            if (z6) {
                LJIJ();
            }
            if (z5) {
                long j = this.LJIIIZ;
                C84329X7t c84329X7t4 = this.LIZIZ;
                nativeSetUpdateNotification(j, c84329X7t4.LJIIIZ, c84329X7t4.LJIIJ);
                return;
            }
            return;
        }
        c84333X7x.getClass();
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void LJIILL(C84332X7w c84332X7w) {
        c84332X7w.LJII = false;
        if (c84332X7w.LJI) {
            try {
                nativeResetStatement(this.LJIIIZ, c84332X7w.LIZJ, true);
                return;
            } catch (SQLiteException unused) {
                C84333X7x c84333X7x = this.LJFF;
                Object obj = c84332X7w.LIZIZ;
                if (obj != null) {
                    synchronized (c84333X7x) {
                        Object remove = c84333X7x.LIZ.remove(obj);
                        if (remove != null) {
                            c84333X7x.LIZIZ--;
                        }
                        if (remove != null) {
                            c84333X7x.LIZ(obj, remove, null);
                            return;
                        }
                        return;
                    }
                }
                c84333X7x.getClass();
                throw new NullPointerException("key == null");
            }
        }
        LJIIJ(c84332X7w);
    }

    public final void LJIJJ(C84332X7w c84332X7w) {
        if (!this.LJIIJ || c84332X7w.LJFF) {
        } else {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    private void notifyCheckpoint(String str, int i) {
        this.LIZ.LJLIL.get();
    }

    public final void LIZIZ(C84332X7w c84332X7w, Object[] objArr) {
        int i;
        long j;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == c84332X7w.LIZLLL) {
            if (i == 0) {
                return;
            }
            long j2 = c84332X7w.LIZJ;
            int i2 = 0;
            do {
                Object obj = objArr[i2];
                if (obj == null) {
                    nativeBindNull(this.LJIIIZ, j2, i2 + 1);
                } else if (obj instanceof byte[]) {
                    nativeBindBlob(this.LJIIIZ, j2, i2 + 1, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeBindDouble(this.LJIIIZ, j2, i2 + 1, ((Number) obj).doubleValue());
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    nativeBindLong(this.LJIIIZ, j2, i2 + 1, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    long j3 = this.LJIIIZ;
                    int i3 = i2 + 1;
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    nativeBindLong(j3, j2, i3, j);
                } else {
                    nativeBindString(this.LJIIIZ, j2, i2 + 1, obj.toString());
                }
                i2++;
            } while (i2 < i);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ");
        C15890jp.LIZIZ(LIZ, c84332X7w.LIZLLL, " bind arguments but ", i, " were provided.");
        throw new SQLiteBindOrColumnIndexOutOfRangeException(X1D.LIZIZ(LIZ));
    }

    public final void LJ(String str, Object[] objArr) {
        C84326X7q c84326X7q;
        if (str != null) {
            C84328X7s LIZ = this.LJII.LIZ("execute", str, objArr);
            int i = LIZ.LJII;
            try {
                try {
                    C84332X7w LIZ2 = LIZ(str);
                    LIZ.getClass();
                    try {
                        LJIJJ(LIZ2);
                        LIZIZ(LIZ2, objArr);
                        nativeExecute(this.LJIIIZ, LIZ2.LIZJ);
                        return;
                    } finally {
                        LJIILL(LIZ2);
                    }
                } catch (RuntimeException e) {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                        c84326X7q.LJ();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } finally {
                this.LJII.LIZIZ(i);
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final int LJFF(String str, Object[] objArr) {
        C84326X7q c84326X7q;
        if (str != null) {
            C84328X7s LIZ = this.LJII.LIZ("executeForChangedRowCount", str, objArr);
            int i = LIZ.LJII;
            try {
                try {
                    C84332X7w LIZ2 = LIZ(str);
                    LIZ.getClass();
                    try {
                        LJIJJ(LIZ2);
                        LIZIZ(LIZ2, objArr);
                        int nativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.LJIIIZ, LIZ2.LIZJ);
                        if (this.LJII.LIZJ(i)) {
                            C84327X7r c84327X7r = this.LJII;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("changedRows=");
                            LIZ3.append(nativeExecuteForChangedRowCount);
                            c84327X7r.LJI(i, X1D.LIZIZ(LIZ3));
                        }
                        return nativeExecuteForChangedRowCount;
                    } finally {
                        LJIILL(LIZ2);
                    }
                } catch (Throwable th) {
                    if (this.LJII.LIZJ(i)) {
                        C84327X7r c84327X7r2 = this.LJII;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("changedRows=");
                        LIZ4.append(0);
                        c84327X7r2.LJI(i, X1D.LIZIZ(LIZ4));
                    }
                    throw th;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                    c84326X7q.LJ();
                }
                this.LJII.LJ(i, e);
                throw e;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJII(String str, Object[] objArr) {
        C84326X7q c84326X7q;
        if (str != null) {
            C84328X7s LIZ = this.LJII.LIZ("executeForLastInsertedRowId", str, objArr);
            int i = LIZ.LJII;
            try {
                try {
                    C84332X7w LIZ2 = LIZ(str);
                    LIZ.getClass();
                    try {
                        LJIJJ(LIZ2);
                        LIZIZ(LIZ2, objArr);
                        return nativeExecuteForLastInsertedRowId(this.LJIIIZ, LIZ2.LIZJ);
                    } finally {
                        LJIILL(LIZ2);
                    }
                } catch (RuntimeException e) {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                        c84326X7q.LJ();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } finally {
                this.LJII.LIZIZ(i);
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJIIIIZZ(String str, Object[] objArr) {
        C84326X7q c84326X7q;
        if (str != null) {
            C84328X7s LIZ = this.LJII.LIZ("executeForLong", str, objArr);
            int i = LIZ.LJII;
            try {
                try {
                    C84332X7w LIZ2 = LIZ(str);
                    LIZ.getClass();
                    try {
                        LJIJJ(LIZ2);
                        LIZIZ(LIZ2, objArr);
                        return nativeExecuteForLong(this.LJIIIZ, LIZ2.LIZJ);
                    } finally {
                        LJIILL(LIZ2);
                    }
                } catch (RuntimeException e) {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                        c84326X7q.LJ();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } finally {
                this.LJII.LIZIZ(i);
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final String LJIIIZ(String str, Object[] objArr) {
        C84326X7q c84326X7q;
        if (str != null) {
            C84328X7s LIZ = this.LJII.LIZ("executeForString", str, objArr);
            int i = LIZ.LJII;
            try {
                try {
                    C84332X7w LIZ2 = LIZ(str);
                    LIZ.getClass();
                    try {
                        LJIJJ(LIZ2);
                        LIZIZ(LIZ2, objArr);
                        return nativeExecuteForString(this.LJIIIZ, LIZ2.LIZJ);
                    } finally {
                        LJIILL(LIZ2);
                    }
                } catch (RuntimeException e) {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                        c84326X7q.LJ();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } finally {
                this.LJII.LIZIZ(i);
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final void LJIILIIL(String str, C84321X7l c84321X7l) {
        C84326X7q c84326X7q;
        C84328X7s LIZ = this.LJII.LIZ("prepare", str, null);
        int i = LIZ.LJII;
        try {
            try {
                C84332X7w LIZ2 = LIZ(str);
                LIZ.getClass();
                try {
                    c84321X7l.LIZ = LIZ2.LIZLLL;
                    c84321X7l.LIZJ = LIZ2.LJFF;
                    int nativeGetColumnCount = nativeGetColumnCount(this.LJIIIZ, LIZ2.LIZJ);
                    if (nativeGetColumnCount == 0) {
                        c84321X7l.LIZIZ = LJIILL;
                    } else {
                        c84321X7l.LIZIZ = new String[nativeGetColumnCount];
                        for (int i2 = 0; i2 < nativeGetColumnCount; i2++) {
                            c84321X7l.LIZIZ[i2] = nativeGetColumnName(this.LJIIIZ, LIZ2.LIZJ, i2);
                        }
                    }
                } finally {
                    LJIILL(LIZ2);
                }
            } finally {
                this.LJII.LIZIZ(i);
            }
        } catch (RuntimeException e) {
            if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                c84326X7q.LJ();
            }
            this.LJII.LJ(i, e);
            throw e;
        }
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.LIZ.LJLIL.get();
    }

    public SQLiteConnection(C84326X7q c84326X7q, C84329X7t c84329X7t, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        this.LJIIJJI = bArr;
        if (sQLiteCipherSpec == null) {
            sQLiteCipherSpec2 = null;
        } else {
            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
        }
        this.LJIIL = sQLiteCipherSpec2;
        this.LIZ = c84326X7q;
        C84329X7t c84329X7t2 = new C84329X7t(c84329X7t);
        this.LIZIZ = c84329X7t2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = (c84329X7t.LIZLLL & 1) != 0;
        this.LJFF = new C84333X7x(this, c84329X7t2.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final int LJI(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        C84326X7q c84326X7q;
        C84332X7w LIZ;
        int i6 = str;
        if (i6 != 0) {
            if (cursorWindow != null) {
                cursorWindow.LIZ();
                try {
                    try {
                        C84328X7s LIZ2 = this.LJII.LIZ("executeForCursorWindow", i6, objArr);
                        i5 = LIZ2.LJII;
                        try {
                            LIZ = LIZ(i6);
                            LIZ2.getClass();
                            try {
                                LJIJJ(LIZ);
                                LIZIZ(LIZ, objArr);
                                try {
                                    try {
                                        try {
                                            long nativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.LJIIIZ, LIZ.LIZJ, cursorWindow.mWindowPtr, i, i2, z);
                                            i4 = (int) (nativeExecuteForCursorWindow >> 32);
                                            i3 = (int) nativeExecuteForCursorWindow;
                                            try {
                                                i6 = cursorWindow.LJIILIIL();
                                                try {
                                                    cursorWindow.mStartPos = i4;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        try {
                                                            LJIILL(LIZ);
                                                            throw th;
                                                        } catch (RuntimeException e) {
                                                            e = e;
                                                            if ((!(e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c84326X7q = this.LIZ) != null) {
                                                                c84326X7q.LJ();
                                                            }
                                                            this.LJII.LJ(i5, e);
                                                            throw e;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                        } catch (Throwable th8) {
                            th = th8;
                            i6 = -1;
                            i3 = -1;
                            i4 = -1;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                    try {
                        LJIILL(LIZ);
                        if (this.LJII.LIZJ(i5)) {
                            C84327X7r c84327X7r = this.LJII;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("window='");
                            LIZ3.append(cursorWindow);
                            LIZ3.append("', startPos=");
                            LIZ3.append(i);
                            LIZ3.append(", actualPos=");
                            LIZ3.append(i4);
                            LIZ3.append(", filledRows=");
                            LIZ3.append((int) i6);
                            LIZ3.append(", countedRows=");
                            LIZ3.append(i3);
                            c84327X7r.LJI(i5, X1D.LIZIZ(LIZ3));
                        }
                        return i3;
                    } catch (RuntimeException e3) {
                        e = e3;
                        if (!(e instanceof SQLiteDatabaseLockedException)) {
                        }
                        c84326X7q.LJ();
                        this.LJII.LJ(i5, e);
                        throw e;
                    } catch (Throwable th10) {
                        th = th10;
                        if (this.LJII.LIZJ(i5)) {
                            C84327X7r c84327X7r2 = this.LJII;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("window='");
                            LIZ4.append(cursorWindow);
                            LIZ4.append("', startPos=");
                            LIZ4.append(i);
                            LIZ4.append(", actualPos=");
                            LIZ4.append(i4);
                            LIZ4.append(", filledRows=");
                            LIZ4.append(i6);
                            LIZ4.append(", countedRows=");
                            LIZ4.append(i3);
                            c84327X7r2.LJI(i5, X1D.LIZIZ(LIZ4));
                        }
                        throw th;
                    }
                } finally {
                    cursorWindow.LIZLLL();
                }
            }
            throw new IllegalArgumentException("window must not be null.");
        }
        throw new IllegalArgumentException("sql must not be null.");
    }
}
