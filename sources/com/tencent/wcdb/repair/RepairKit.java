package com.tencent.wcdb.repair;

import X.AbstractC84318X7i;
import X.C63322OtC;
import X.C84325X7p;
import X.V0N;
import X.X7W;
import X.X7Y;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;

/* loaded from: classes16.dex */
public class RepairKit {
    public long LIZ;
    public X7Y LIZIZ;
    public V0N LIZJ;
    public RepairCursor LIZLLL;

    /* loaded from: classes16.dex */
    public static class RepairCursor extends AbstractC84318X7i {
        public long LJLLILLLL;

        public static native byte[] nativeGetBlob(long j, int i);

        public static native int nativeGetColumnCount(long j);

        public static native double nativeGetDouble(long j, int i);

        public static native long nativeGetLong(long j, int i);

        public static native String nativeGetString(long j, int i);

        public static native int nativeGetType(long j, int i);

        @Override // X.AbstractC84318X7i, android.database.Cursor
        public final int getColumnCount() {
            return nativeGetColumnCount(this.LJLLILLLL);
        }

        @Override // X.AbstractC84318X7i, android.database.Cursor
        public final String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
        public final int getCount() {
            throw new UnsupportedOperationException();
        }

        @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
        public final byte[] getBlob(int i) {
            return nativeGetBlob(this.LJLLILLLL, i);
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            return nativeGetDouble(this.LJLLILLLL, i);
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            return (float) getDouble(i);
        }

        @Override // X.InterfaceC79378VDi, android.database.Cursor
        public final int getInt(int i) {
            return (int) getLong(i);
        }

        @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
        public final long getLong(int i) {
            return nativeGetLong(this.LJLLILLLL, i);
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            return (short) getLong(i);
        }

        @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
        public final String getString(int i) {
            return nativeGetString(this.LJLLILLLL, i);
        }

        @Override // X.AbstractC84318X7i, android.database.Cursor
        public final int getType(int i) {
            return nativeGetType(this.LJLLILLLL, i);
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            if (getType(i) == 0) {
                return true;
            }
            return false;
        }
    }

    public static native void nativeCancel(long j);

    public static native void nativeFini(long j);

    public static native void nativeFreeMaster(long j);

    public static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    public static native int nativeIntegrityFlags(long j);

    public static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j, long j2, long j3, int i);

    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    public final void LIZIZ() {
        X7Y x7y = this.LIZIZ;
        if (x7y != null) {
            long j = x7y.LIZ;
            if (j != 0) {
                nativeFreeMaster(j);
                x7y.LIZ = 0L;
            }
            this.LIZIZ = null;
        }
        long j2 = this.LIZ;
        if (j2 != 0) {
            nativeFini(j2);
            this.LIZ = 0L;
        }
    }

    public final void finalize() {
        LIZIZ();
        super.finalize();
    }

    public final int LIZ(SQLiteDatabase sQLiteDatabase) {
        long j;
        if (this.LIZ != 0) {
            X7Y x7y = this.LIZIZ;
            if (x7y == null) {
                j = 0;
            } else {
                j = x7y.LIZ;
            }
            int nativeOutput = nativeOutput(this.LIZ, sQLiteDatabase.LJ("repair", false), j, 0);
            C84325X7p LJJ = sQLiteDatabase.LJJ();
            SQLiteConnection sQLiteConnection = LJJ.LIZIZ;
            if (sQLiteConnection != null) {
                sQLiteConnection.LIZLLL();
            }
            LJJ.LJIIIZ();
            this.LIZLLL = null;
            nativeIntegrityFlags(this.LIZ);
            return nativeOutput;
        }
        throw new IllegalArgumentException();
    }

    public RepairKit(String str, X7Y x7y) {
        byte[] bArr;
        if (str != null) {
            if (x7y == null) {
                bArr = null;
            } else {
                bArr = x7y.LIZIZ;
            }
            long nativeInit = nativeInit(str, null, null, bArr);
            this.LIZ = nativeInit;
            if (nativeInit != 0) {
                nativeIntegrityFlags(nativeInit);
                this.LIZIZ = x7y;
                return;
            }
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        throw new IllegalArgumentException();
    }

    private int onProgress(String str, int i, long j) {
        if (this.LIZJ == null) {
            return 0;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new RepairCursor();
        }
        this.LIZLLL.LJLLILLLL = j;
        this.LIZJ.getClass();
        X7W.LJLLL++;
        C63322OtC.LJFF("LocalWcdbOpenHelper RepairKit.Callback onProgress, table:" + str + ", root:" + i + ", repairCount:" + X7W.LJLLL);
        return 0;
    }
}
