package io.reactivex.internal.schedulers;

import X.C16880lQ;
import X.C39017FSz;
import X.FNG;
import X.P3I;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;
    public static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();
    public static final Map<ScheduledThreadPoolExecutor, Object> POOLS = new ConcurrentHashMap();

    static {
        Properties properties = System.getProperties();
        C39017FSz c39017FSz = new C39017FSz();
        if (properties.containsKey("rx2.purge-enabled")) {
            c39017FSz.LIZ = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            c39017FSz.LIZ = true;
        }
        if (c39017FSz.LIZ && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                c39017FSz.LIZIZ = CastIntegerProtector.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                c39017FSz.LIZIZ = 1;
            }
        } else {
            c39017FSz.LIZIZ = 1;
        }
        PURGE_ENABLED = c39017FSz.LIZ;
        PURGE_PERIOD_SECONDS = c39017FSz.LIZIZ;
        start();
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    public SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService LLLLZLL = C16880lQ.LLLLZLL(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, LLLLZLL);
        return LLLLZLL;
    }

    public static void tryStart(boolean z) {
        ScheduledExecutorService LLLLZLL;
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE_THREAD;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            LLLLZLL = C16880lQ.LLLLZLL(1, new P3I("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, LLLLZLL)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            FNG fng = new FNG();
            int i = PURGE_PERIOD_SECONDS;
            LLLLZLL.scheduleAtFixedRate(fng, i, i, TimeUnit.SECONDS);
            return;
            LLLLZLL.shutdownNow();
        }
    }

    public static void tryPutIntoPool(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            POOLS.put(scheduledExecutorService, scheduledExecutorService);
        }
    }
}
