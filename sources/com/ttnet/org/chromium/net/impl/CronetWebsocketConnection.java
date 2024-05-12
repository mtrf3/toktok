package com.ttnet.org.chromium.net.impl;

import J.N;
import X.C16880lQ;
import X.C1JX;
import X.C78939UyV;
import X.QFK;
import X.QFL;
import X.QFM;
import X.X1D;
import Y.ARunnableS12S1100000_11;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS1S2101000_11;
import Y.ARunnableS3S1101000_11;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class CronetWebsocketConnection extends QFK {
    public static final /* synthetic */ int LJIJI = 0;
    public long LIZ;
    public final QFM LIZIZ;
    public final Executor LIZJ;
    public final List<String> LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final long LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final Map<String, String> LJIIL;
    public final Map<String, String> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final CronetUrlRequestContext LJIILLIIL;
    public final Object LJIIZILJ;
    public final AtomicInteger LJIJ;

    static {
        C16880lQ.LJLLJ(CronetWebsocketConnection.class);
    }

    @Override // X.QFK
    public final void LIZIZ() {
        synchronized (this.LJIIZILJ) {
            if (this.LIZ == 0) {
                return;
            }
            N.MCzpxGQD(this.LIZ, this);
            this.LIZ = 0L;
        }
    }

    @Override // X.QFK
    public final void LIZJ() {
        synchronized (this.LJIIZILJ) {
            try {
                try {
                    if (this.LIZ == 0) {
                        this.LIZ = N.MRAGjNeT(this, this.LJIILLIIL.LJJJJZ());
                    }
                    Iterator<String> it = this.LIZLLL.iterator();
                    while (it.hasNext()) {
                        N.MgN9hn8A(this.LIZ, this, it.next());
                    }
                    Map<String, String> map = this.LJIIL;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            N.Mzisx1kZ(this.LIZ, this, entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, String> map2 = this.LJIILIIL;
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                            N.MKmGe$35(this.LIZ, this, entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (!this.LJIILL) {
                        N.MVrBbeuj(this.LIZ, this, this.LJIILJJIL);
                    } else {
                        N.MWq0tMul(this.LIZ, this, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIILJJIL);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // X.QFK
    public final void LIZLLL() {
        synchronized (this.LJIIZILJ) {
            if (this.LIZ == 0) {
                return;
            }
            N.M14GZgiH(this.LIZ, this);
        }
    }

    private void onFeedbackLog(String str) {
        LJ(new ARunnableS12S1100000_11(this, str, 4));
    }

    @Override // X.QFK
    public final void LIZ(ByteBuffer byteBuffer) {
        synchronized (this.LJIIZILJ) {
            if (this.LIZ == 0) {
                return;
            }
            N.MRfZ_7V_(this.LIZ, this, byteBuffer);
        }
    }

    public final void LJ(Runnable runnable) {
        try {
            this.LIZJ.execute(runnable);
        } catch (RejectedExecutionException e) {
            C78939UyV.LJII("Exception posting task to executor", e);
        }
    }

    private void onConnectionStateChanged(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnectionStateChanged: state = ");
        LIZ.append(i);
        LIZ.append(", url = ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.LJIJ.set(i);
        LJ(new ARunnableS3S1101000_11(i, this, str, 0));
    }

    private void onMessageReceived(ByteBuffer byteBuffer, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        allocate.flip();
        LJ(new ARunnableS14S0201000_11(i, allocate, this, 6));
    }

    private void onConnectionError(int i, String str, String str2) {
        C1JX.LJIIIIZZ("onConnectionError: ", str2);
        this.LJIJ.set(i);
        LJ(new ARunnableS1S2101000_11(i, str, str2, this, 1));
    }

    private void onTrafficChanged(String str, long j, long j2, boolean z) {
        LJ(new QFL(this, str, j, j2, z));
    }

    public CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, QFM qfm, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.LJIILL = true;
        this.LJIIZILJ = new Object();
        this.LJIJ = new AtomicInteger(-1);
        this.LJIILLIIL = cronetUrlRequestContext;
        this.LIZIZ = qfm;
        this.LIZJ = executor;
        this.LIZLLL = list;
        this.LJIIL = map;
        this.LJIILIIL = map2;
        this.LJIILJJIL = z;
        this.LJIILL = false;
    }

    public CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, QFM qfm, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z) {
        this.LJIILL = true;
        this.LJIIZILJ = new Object();
        this.LJIJ = new AtomicInteger(-1);
        this.LJIILLIIL = cronetUrlRequestContext;
        this.LIZIZ = qfm;
        this.LIZJ = executor;
        this.LIZLLL = list;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = j;
        this.LJII = i2;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = str2;
        this.LJIIJ = i3;
        this.LJIIJJI = null;
        this.LJIIL = map;
        this.LJIILIIL = map2;
        this.LJIILJJIL = z;
    }
}
