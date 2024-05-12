package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class FST {
    public final FSV LIZ = new FSV();
    public final FSU LIZIZ = new FSU();

    public final ExecutorService LIZ(C38028EwC c38028EwC, boolean z) {
        ThreadPoolExecutor LIZ;
        this.LIZIZ.getClass();
        switch (FSZ.LIZ[c38028EwC.LIZ.ordinal()]) {
            case 1:
                LIZ = FSU.LIZ();
                break;
            case 2:
                FSY fsy = FSY.DEFAULT;
                int i = FSU.LIZIZ;
                LIZ = new FSW(fsy, i, (i * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactoryC37315Ekh("tp-default", false, 0), FSU.LJIIIIZZ);
                LIZ.allowCoreThreadTimeOut(true);
                break;
            case 3:
                LIZ = new FSW(FSY.BACKGROUND, 0, 3, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactoryC37315Ekh("tp-background", true, 10), FSU.LJIIIIZZ);
                break;
            case 4:
                int i2 = c38028EwC.LIZJ;
                ThreadFactory threadFactory = c38028EwC.LJI;
                if (threadFactory == null) {
                    String str = c38028EwC.LIZIZ;
                    if (str == null) {
                        str = "tp-scheduled";
                    }
                    threadFactory = new ThreadFactoryC37315Ekh(str, false, 0);
                }
                LIZ = new PThreadScheduledThreadPoolExecutor(i2, threadFactory);
                long j = c38028EwC.LJFF;
                if (j < 0) {
                    j = 15;
                }
                LIZ.setKeepAliveTime(j, TimeUnit.SECONDS);
                LIZ.allowCoreThreadTimeOut(true);
                break;
            case 5:
                FSY fsy2 = FSY.SERIAL;
                long j2 = c38028EwC.LJFF;
                if (j2 < 0) {
                    j2 = 30;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                BlockingQueue blockingQueue = c38028EwC.LIZLLL;
                if (blockingQueue == null) {
                    blockingQueue = new LinkedBlockingQueue();
                }
                ThreadFactory threadFactory2 = c38028EwC.LJI;
                if (threadFactory2 == null) {
                    String str2 = c38028EwC.LIZIZ;
                    if (str2 == null) {
                        str2 = "tp-serial";
                    }
                    threadFactory2 = new ThreadFactoryC37315Ekh(str2, false, 0);
                }
                RejectedExecutionHandler rejectedExecutionHandler = c38028EwC.LJ;
                if (rejectedExecutionHandler == null) {
                    rejectedExecutionHandler = new ThreadPoolExecutor.AbortPolicy();
                }
                LIZ = new FSW(fsy2, 1, 1, j2, timeUnit, blockingQueue, threadFactory2, rejectedExecutionHandler);
                LIZ.allowCoreThreadTimeOut(true);
                break;
            case 6:
                FSY fsy3 = FSY.FIXED;
                int i3 = c38028EwC.LIZJ;
                long j3 = c38028EwC.LJFF;
                if (j3 < 0) {
                    j3 = 30;
                }
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                BlockingQueue blockingQueue2 = c38028EwC.LIZLLL;
                if (blockingQueue2 == null) {
                    blockingQueue2 = new LinkedBlockingQueue();
                }
                ThreadFactory threadFactory3 = c38028EwC.LJI;
                if (threadFactory3 == null) {
                    String str3 = c38028EwC.LIZIZ;
                    if (str3 == null) {
                        str3 = "tp-fixed";
                    }
                    threadFactory3 = new ThreadFactoryC37315Ekh(str3, false, 0);
                }
                RejectedExecutionHandler rejectedExecutionHandler2 = c38028EwC.LJ;
                if (rejectedExecutionHandler2 == null) {
                    rejectedExecutionHandler2 = new ThreadPoolExecutor.AbortPolicy();
                }
                LIZ = new FSW(fsy3, i3, i3, j3, timeUnit2, blockingQueue2, threadFactory3, rejectedExecutionHandler2);
                LIZ.allowCoreThreadTimeOut(true);
                break;
            default:
                LIZ = FSU.LIZ();
                break;
        }
        if (C38995FSd.LIZ.LIZ) {
            FSV fsv = this.LIZ;
            FSY fsy4 = c38028EwC.LIZ;
            if (z) {
                ((HashMap) fsv.LIZ).put(fsy4.name(), new WeakReference(LIZ));
            } else {
                if (((HashMap) fsv.LIZIZ).get(fsy4) == null) {
                    ((HashMap) fsv.LIZIZ).put(fsy4, new AtomicInteger(0));
                }
                java.util.Map<String, WeakReference<ExecutorService>> map = fsv.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(fsy4.name());
                LIZ2.append("_");
                LIZ2.append(((AtomicInteger) ((HashMap) fsv.LIZIZ).get(fsy4)).incrementAndGet());
                ((HashMap) map).put(X1D.LIZIZ(LIZ2), new WeakReference(LIZ));
            }
        }
        return LIZ;
    }
}
