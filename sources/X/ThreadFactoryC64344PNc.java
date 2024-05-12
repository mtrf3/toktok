package X;

import Y.ARunnableS30S0200000_11;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.PNc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ThreadFactoryC64344PNc implements ThreadFactory {
    public final String LJLILLLLZI;
    public final AtomicInteger LJLJJI = new AtomicInteger(1);
    public final int LJLIL = 10;
    public final boolean LJLJI = true;

    public ThreadFactoryC64344PNc(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        ARunnableS30S0200000_11 aRunnableS30S0200000_11 = new ARunnableS30S0200000_11(this, runnable, 63);
        if (this.LJLJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI);
            LIZ.append("-");
            str = C47135Ieh.LIZJ(this.LJLJJI, LIZ, LIZ);
        } else {
            str = this.LJLILLLLZI;
        }
        return new PthreadThread(aRunnableS30S0200000_11, str);
    }
}
