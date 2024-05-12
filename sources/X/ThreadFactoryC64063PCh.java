package X;

import Y.ARunnableS30S0200000_11;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import defpackage.i0;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.PCh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ThreadFactoryC64063PCh implements ThreadFactory {
    public final String LJLIL;

    public ThreadFactoryC64063PCh(String str) {
        this.LJLIL = i0.LJFF("APM6-", str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("creating newThread ");
            LIZ.append(this.LJLIL);
            C64028PAy.LIZ("APM-AsyncTask", X1D.LIZIZ(LIZ));
        }
        return new PthreadThread(new ARunnableS30S0200000_11(this, runnable, 31), this.LJLIL);
    }
}
