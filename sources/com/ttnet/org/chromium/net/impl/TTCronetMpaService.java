package com.ttnet.org.chromium.net.impl;

import X.C16880lQ;
import X.QFS;
import X.QFY;
import Y.ARunnableS47S0100000_11;
import java.util.List;

/* loaded from: classes12.dex */
public final class TTCronetMpaService extends QFS {
    public static final /* synthetic */ int LJFF = 0;
    public final CronetUrlRequestContext LIZ;
    public long LIZIZ;
    public final Object LIZJ = new Object();
    public QFY LIZLLL;
    public QFY LJ;

    private native void nativeCommand(long j, String str, String str2);

    private native long nativeCreateMpaServiceAdapter(long j);

    private native void nativeInit(long j);

    private native void nativeSetAccAddress(long j, String[] strArr);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    static {
        C16880lQ.LJLLJ(TTCronetMpaService.class);
    }

    @Override // X.QFS
    public final void LIZLLL() {
        synchronized (this.LIZJ) {
            long j = this.LIZIZ;
            if (j == 0) {
                return;
            }
            nativeStart(j);
        }
    }

    @Override // X.QFS
    public final void LJ() {
        synchronized (this.LIZJ) {
            long j = this.LIZIZ;
            if (j == 0) {
                return;
            }
            nativeStop(j);
        }
    }

    public TTCronetMpaService(CronetUrlRequestContext cronetUrlRequestContext) {
        this.LIZ = cronetUrlRequestContext;
    }

    @Override // X.QFS
    public final void LIZIZ(QFY qfy) {
        synchronized (this.LIZJ) {
            if (this.LIZIZ == 0) {
                this.LIZIZ = nativeCreateMpaServiceAdapter(this.LIZ.LJJJJZ());
            }
            this.LIZLLL = qfy;
            nativeInit(this.LIZIZ);
        }
    }

    private void onInitFinish(boolean z, String str) {
        Thread thread = new Thread(new ARunnableS47S0100000_11(this, z, str, 73));
        thread.setName("TTCronetMpaService_Thread");
        thread.start();
    }

    private void onSetAccAddressFinish(boolean z, String str) {
        Thread thread = new Thread(new ARunnableS47S0100000_11(this, z, str, 74));
        thread.setName("TTCronetMpaService_Thread");
        thread.start();
    }

    @Override // X.QFS
    public final void LIZ(String str, String str2) {
        synchronized (this.LIZJ) {
            long j = this.LIZIZ;
            if (j == 0) {
                return;
            }
            nativeCommand(j, str, str2);
        }
    }

    @Override // X.QFS
    public final void LIZJ(List<String> list, QFY qfy) {
        synchronized (this.LIZJ) {
            long j = this.LIZIZ;
            if (j == 0) {
                return;
            }
            this.LJ = qfy;
            nativeSetAccAddress(j, (String[]) list.toArray(new String[list.size()]));
        }
    }
}
