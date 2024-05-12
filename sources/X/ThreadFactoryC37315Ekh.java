package X;

import Y.ARunnableS25S0200000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.Ekh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC37315Ekh implements ThreadFactory {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread LIZ;
        int incrementAndGet = FSU.LIZ.incrementAndGet();
        if (FSU.LJIIIZ != null && (LIZ = FSU.LJIIIZ.LIZ(this.LJLIL, incrementAndGet, this.LJLILLLLZI, this.LJLJI, runnable)) != null) {
            return LIZ;
        }
        PthreadThread pthreadThread = new PthreadThread(new ARunnableS25S0200000_6(this, runnable, 58), "NewInstanceFactory$3");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLIL);
        LIZ2.append("-");
        LIZ2.append(incrementAndGet);
        pthreadThread.setName(X1D.LIZIZ(LIZ2));
        pthreadThread.setDaemon(this.LJLILLLLZI);
        return pthreadThread;
    }

    public ThreadFactoryC37315Ekh(String str, boolean z, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }
}
