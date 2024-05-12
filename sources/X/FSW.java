package X;

import android.os.Build;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FSW extends PThreadPoolExecutor {
    public static volatile Field LJLILLLLZI;
    public final FSY LJLIL;

    public static void LIZ() {
        try {
            if (LJLILLLLZI == null) {
                synchronized (FSW.class) {
                    if (LJLILLLLZI == null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            LJLILLLLZI = Thread.class.getDeclaredField("threadLocals");
                        } else {
                            LJLILLLLZI = Thread.class.getDeclaredField("localValues");
                        }
                        LJLILLLLZI.setAccessible(true);
                    }
                }
            }
            LJLILLLLZI.set(C16880lQ.LLLLIIIILLL(), null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        if (C38995FSd.LJII(this)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        if (C38995FSd.LJII(this)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    public final void LIZIZ(Runnable runnable) {
        if (C38995FSd.LIZ.LIZIZ.contains(this.LJLIL)) {
            super.execute(new RunnableC39002FSk(this, runnable));
        } else {
            super.execute(runnable);
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            LIZJ(this, runnable);
        } catch (OutOfMemoryError e) {
            throw e;
        }
    }

    public static void LIZJ(FSW fsw, Runnable command) {
        o.LJIIIZ(command, "command");
        if (C38993FSb.LIZ && FKM.LIZ().getBaseContext() != null && FKN.LIZ(FKM.LIZ()) != -1) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                fsw.LIZIZ(command);
                return;
            }
            FSY fsy = fsw.LJLIL;
            o.LJII(fsy, "null cannot be cast to non-null type com.ss.android.ugc.aweme.thread.ThreadPoolType");
            switch (FSX.LIZ[fsy.ordinal()]) {
                case 1:
                    fsw.LIZIZ(command);
                    FAJ.LJI();
                    return;
                case 2:
                    command.run();
                    FAJ.LJI();
                    return;
                case 3:
                    command.run();
                    FAJ.LJI();
                    return;
                case 4:
                    fsw.LIZIZ(command);
                    FAJ.LJI();
                    return;
                case 5:
                    command.run();
                    FAJ.LJI();
                    return;
                case 6:
                    command.run();
                    FAJ.LJI();
                    return;
                default:
                    fsw.LIZIZ(command);
                    return;
            }
        }
        fsw.LIZIZ(command);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                LIZ();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public FSW(FSY fsy, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactoryC37315Ekh threadFactoryC37315Ekh) {
        super(i, i2, 30L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactoryC37315Ekh);
        this.LJLIL = fsy;
    }

    public FSW(FSY fsy, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.LJLIL = fsy;
    }
}
