package X;

import android.os.Trace;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ew2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38018Ew2 extends PThreadPoolExecutor {
    public int LJLIL;
    public volatile boolean LJLILLLLZI;
    public long LJLJI;

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new RunnableC35819E3z(runnable, this));
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        Trace.beginSection("beforeExecute");
        while (this.LJLILLLLZI) {
            if (this.LJLILLLLZI) {
                try {
                    if (this.LJLJI < 100) {
                        Thread.sleep(100L);
                    } else {
                        this.LJLILLLLZI = false;
                    }
                    this.LJLJI++;
                } catch (Throwable unused) {
                }
            } else {
                this.LJLJI = 0L;
            }
        }
        Trace.endSection();
        super.beforeExecute(thread, runnable);
    }

    public C38018Ew2(long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactoryC38022Ew6 threadFactoryC38022Ew6) {
        super(1, 1, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactoryC38022Ew6);
        this.LJLIL = -1;
    }
}
