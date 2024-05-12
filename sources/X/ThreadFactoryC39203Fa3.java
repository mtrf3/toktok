package X;

import Y.ARunnableS10S0101000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.Fa3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC39203Fa3 implements ThreadFactory {
    public final /* synthetic */ int LJLIL;

    public ThreadFactoryC39203Fa3(int i) {
        this.LJLIL = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String LJ = KMP.LJ("Common_Thread_Pool-", C39202Fa2.LIZIZ.incrementAndGet());
        PthreadThread pthreadThread = new PthreadThread(new ARunnableS10S0101000_6(this.LJLIL, runnable, 1), "CommonThreadUtil$threadFactory$1");
        pthreadThread.setName(LJ);
        pthreadThread.setDaemon(false);
        return pthreadThread;
    }
}
