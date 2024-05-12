package X;

import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes7.dex */
public final class FSA extends PThreadPoolExecutor {
    public static final int LJLJI = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    public static final int LJLJJI = (FSU.LIZIZ * 2) + 1;
    public final PThreadPoolExecutor LJLIL;
    public final ThreadPoolExecutor LJLILLLLZI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FSA(java.util.concurrent.ThreadPoolExecutor r20) {
        /*
            r19 = this;
            r12 = 1
            r14 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ArrayBlockingQueue r2 = new java.util.concurrent.ArrayBlockingQueue
            r2.<init>(r12)
            com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory r1 = new com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory
            java.lang.String r0 = "KevaPriorityExecutorWrapper"
            r1.<init>(r0)
            r11 = r19
            r13 = r12
            r16 = r7
            r17 = r2
            r18 = r1
            r11.<init>(r12, r13, r14, r16, r17, r18)
            r1 = r20
            r11.LJLILLLLZI = r1
            com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor r2 = new com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor
            int r3 = X.FSA.LJLJI
            int r4 = X.FSA.LJLJJI
            r5 = 30
            java.util.concurrent.PriorityBlockingQueue r8 = new java.util.concurrent.PriorityBlockingQueue
            r0 = 128(0x80, float:1.8E-43)
            r8.<init>(r0)
            java.util.concurrent.ThreadFactory r9 = r1.getThreadFactory()
            java.util.concurrent.RejectedExecutionHandler r10 = r1.getRejectedExecutionHandler()
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            r11.LJLIL = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSA.<init>(java.util.concurrent.ThreadPoolExecutor):void");
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        FSB fsb;
        if (runnable instanceof FutureTask) {
            FutureTask futureTask = (FutureTask) runnable;
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                fsb = new FSB(futureTask, 1);
            } else {
                fsb = new FSB(futureTask, 0);
            }
            this.LJLIL.execute(fsb);
            return;
        }
        this.LJLILLLLZI.execute(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.LJLILLLLZI.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.LJLILLLLZI.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.LJLILLLLZI.submit(runnable, t);
    }
}
