package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.PNa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class ThreadFactoryC64342PNa implements ThreadFactory {
    public final AtomicInteger LJLIL = new AtomicInteger(1);
    public final PNZ LJLILLLLZI = new Thread.UncaughtExceptionHandler() { // from class: X.PNZ
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            C36922EeM.LJFF(th);
        }
    };

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Facebook-SDK #");
        PthreadThread pthreadThread = new PthreadThread(runnable, C47135Ieh.LIZJ(this.LJLIL, LIZ, LIZ));
        pthreadThread.setUncaughtExceptionHandler(this.LJLILLLLZI);
        return pthreadThread;
    }
}
