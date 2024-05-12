package com.bytedance.android.alog;

import X.C0IG;
import X.C0II;
import X.C0IJ;
import X.C0IK;
import X.C0IL;
import X.C0IM;
import X.C15290ir;
import X.C16880lQ;
import X.C78605Ut7;
import X.InterfaceC15270ip;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Alog {
    public static final int LJIIIIZZ = C0IJ.SAFE.value;
    public static final int LJIIIZ = C0IM.RAW.value;
    public static final int LJIIJ = C0IK.DEFAULT.value;
    public static final int LJIIJJI = C0II.ZSTD.value;
    public static final int LJIIL = C0IL.TEA_16.value;
    public static final int LJIILIIL = C0IG.EC_SECP256K1.value;
    public static volatile List<InterfaceC15270ip> LJIILJJIL = null;
    public static final ArrayList<String> LJIILL = new ArrayList<>();
    public static boolean LJIILLIIL = false;
    public int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public String LJFF;
    public final String LJI;
    public long LJII;

    public static native void nativeAsyncFlush(long j);

    public static native long nativeCreate(int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5, boolean z2);

    public static native void nativeDestroy(long j);

    public static native long nativeGetLegacyFlushFuncAddr();

    public static native long nativeGetLegacyGetLogFileDirFuncAddr();

    public static native long nativeGetLegacyWriteFuncAddr();

    public static native long nativeGetNativeWriteFuncAddr();

    public static native void nativeSetDefaultInstance(long j);

    public static native void nativeSetLevel(long j, int i);

    public static native void nativeSetSyslog(long j, boolean z);

    public static native void nativeSyncFlush(long j);

    public static native void nativeTimedSyncFlush(long j, int i);

    public static native void nativeWrite(long j, int i, String str, String str2);

    public static native void nativeWriteAsyncMsg(long j, int i, String str, String str2, long j2, long j3);

    public final void LIZIZ() {
        synchronized (this) {
            long j = this.LJII;
            if (j != 0) {
                this.LIZ = 6;
                nativeDestroy(j);
                this.LJII = 0L;
            }
        }
    }

    public final void LIZ() {
        long j = this.LJII;
        if (j != 0) {
            nativeAsyncFlush(j);
        }
    }

    public final long LIZJ() {
        if (this.LJII == 0) {
            return 0L;
        }
        return nativeGetLegacyFlushFuncAddr();
    }

    public final long LIZLLL() {
        if (this.LJII == 0) {
            return 0L;
        }
        return nativeGetLegacyGetLogFileDirFuncAddr();
    }

    public final long LJ() {
        if (this.LJII == 0) {
            return 0L;
        }
        return nativeGetLegacyWriteFuncAddr();
    }

    public final long LJFF() {
        if (this.LJII == 0) {
            return 0L;
        }
        return nativeGetNativeWriteFuncAddr();
    }

    public final void LJIIIZ() {
        long j = this.LJII;
        if (j != 0) {
            nativeSyncFlush(j);
        }
    }

    public final void finalize() {
        try {
            super.finalize();
        } finally {
            LIZIZ();
        }
    }

    public static synchronized void LJI(C78605Ut7 c78605Ut7) {
        synchronized (Alog.class) {
            if (LJIILLIIL) {
                return;
            }
            try {
                Librarian.LJFF(ALog.sConfig.LIZ, "alog");
            } catch (Throwable unused) {
                C16880lQ.LLJJJIL("alog");
            }
            LJIILLIIL = true;
        }
    }

    public final void LJII(int i) {
        this.LIZ = i;
        long j = this.LJII;
        if (j != 0) {
            nativeSetLevel(j, i);
        }
    }

    public final void LJIIIIZZ(boolean z) {
        long j = this.LJII;
        if (j != 0) {
            nativeSetSyslog(j, z);
        }
    }

    public final void LJIIJ(int i) {
        long j = this.LJII;
        if (j != 0) {
            nativeTimedSyncFlush(j, i);
        }
    }

    public final void LJIIJJI(int i, String str, String str2) {
        if (this.LJII != 0 && i >= this.LIZ && str != null && str2 != null) {
            if (LJIILJJIL != null) {
                C15290ir c15290ir = new C15290ir(i, str, str2);
                Iterator it = ((CopyOnWriteArrayList) LJIILJJIL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC15270ip) it.next()).LIZ(c15290ir);
                }
                nativeWrite(this.LJII, c15290ir.LIZ, c15290ir.LIZIZ, c15290ir.LIZJ);
                return;
            }
            nativeWrite(this.LJII, i, str, str2);
        }
    }

    public final void LJIIL(int i, long j, long j2, String str, String str2) {
        if (this.LJII != 0 && i >= this.LIZ && str != null && str2 != null) {
            if (LJIILJJIL != null) {
                C15290ir c15290ir = new C15290ir(i, str, str2);
                Iterator it = ((CopyOnWriteArrayList) LJIILJJIL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC15270ip) it.next()).LIZ(c15290ir);
                }
                nativeWriteAsyncMsg(this.LJII, c15290ir.LIZ, c15290ir.LIZIZ, c15290ir.LIZJ, j, j2);
                return;
            }
            nativeWriteAsyncMsg(this.LJII, i, str, str2, j, j2);
        }
    }

    public Alog(Context context, int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i5;
        this.LJ = i6 / i5;
        this.LJI = str;
        this.LJII = nativeCreate(i, z, str, str2, i2, i3, i4, str3, i5, i6, str4, i7, i8, i9, i10, i11, i12, str5, z2);
    }
}
