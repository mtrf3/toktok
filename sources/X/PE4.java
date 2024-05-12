package X;

import Y.ARunnableS30S0200000_11;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public final class PE4 implements ThreadFactory {
    public final String LJLIL;
    public PE8 LJLILLLLZI;

    public PE4(String str) {
        C16880lQ.LJLLJ(PE4.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("APM_");
        LIZ.append(str);
        this.LJLIL = X1D.LIZIZ(LIZ);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PthreadThread(new ARunnableS30S0200000_11(this, runnable, 56), this.LJLIL);
    }
}
