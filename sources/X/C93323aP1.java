package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.aP1, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93323aP1 implements InterfaceExecutorC93236aNc {
    public final ThreadFactoryC93233aNZ LJLIL;
    public final ExecutorService LJLILLLLZI;

    @Override // X.InterfaceExecutorC93236aNc
    public final int LIZLLL() {
        ExecutorService executorService = this.LJLILLLLZI;
        if (executorService != null) {
            return ((ThreadPoolExecutor) executorService).getQueue().size();
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.LJLILLLLZI.execute(runnable);
        }
    }

    public C93323aP1(int i, String str) {
        ThreadFactoryC93233aNZ threadFactoryC93233aNZ = new ThreadFactoryC93233aNZ(str);
        this.LJLIL = threadFactoryC93233aNZ;
        this.LJLILLLLZI = C16880lQ.LLLLZI(i, threadFactoryC93233aNZ);
    }

    @Override // X.InterfaceExecutorC93236aNc
    public final PthreadThread LJIJJ(Runnable runnable, String str) {
        this.LJLIL.getClass();
        PthreadThread pthreadThread = new PthreadThread(null, runnable, str, 0L);
        pthreadThread.setDaemon(false);
        pthreadThread.setPriority(5);
        return pthreadThread;
    }
}
