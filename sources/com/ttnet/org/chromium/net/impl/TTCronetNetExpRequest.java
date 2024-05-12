package com.ttnet.org.chromium.net.impl;

import X.C16880lQ;
import X.C78939UyV;
import X.QF2;
import X.QFU;
import Y.ARunnableS3S1110000_11;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes12.dex */
public final class TTCronetNetExpRequest extends QFU {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final CronetUrlRequestContext LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final QF2 LJI;
    public final Executor LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public final Object LJIIJ = new Object();

    static {
        C16880lQ.LJLLJ(TTCronetNetExpRequest.class);
    }

    private void onNetExpRequestComplete(String str, boolean z) {
        ARunnableS3S1110000_11 aRunnableS3S1110000_11 = new ARunnableS3S1110000_11(this, z, str, 0);
        try {
            Executor executor = this.LJII;
            if (executor != null) {
                executor.execute(aRunnableS3S1110000_11);
            } else {
                new Thread(aRunnableS3S1110000_11, "NetExpCallback").start();
            }
        } catch (RejectedExecutionException e) {
            C78939UyV.LJII("Exception posting task to executor", e);
        }
    }

    public TTCronetNetExpRequest(CronetUrlRequestContext cronetUrlRequestContext, QF2 qf2, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        this.LIZ = cronetUrlRequestContext;
        this.LJI = qf2;
        this.LJII = executor;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }
}
