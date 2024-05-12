package com.bytedance.common.graphics;

import X.C16880lQ;
import X.C64125PEr;
import X.C78248UnM;
import X.PG9;
import X.PGH;
import X.PMP;
import X.PMQ;
import Y.ARunnableS18S0000000_11;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class GraphicsMonitor {
    public static ScheduledFuture<?> gpuFuture;
    public static ScheduledExecutorService gpuScheduleService;
    public static PG9 lifecycleService;
    public static long sCollectInterval;
    public static long sCollectWindow;
    public static CopyOnWriteArrayList<PMQ> graphicsUpdateListeners = new CopyOnWriteArrayList<>();
    public static int startTime = 0;
    public static boolean isInit = false;
    public static volatile boolean isPause = false;
    public static boolean isInitGraphicsLoad = false;
    public static double gpuLoadDataOnce = -1.0d;

    public static native void closeStatistical();

    public static native double getStatisticOnceData();

    public static void initGraphicsLoad() {
        isInitGraphicsLoad = true;
        try {
            C64125PEr.LJFF(C78248UnM.LJLJJI);
            startHook();
            gpuScheduleService = C16880lQ.LLLLZIL(0);
        } catch (Throwable unused) {
            isInitGraphicsLoad = false;
        }
    }

    public static native void openStatistical();

    public static native boolean startHook();

    public static synchronized double getByteGpu() {
        double d;
        synchronized (GraphicsMonitor.class) {
            d = gpuLoadDataOnce;
        }
        return d;
    }

    public static synchronized void init() {
        synchronized (GraphicsMonitor.class) {
            if (isInit) {
                return;
            }
            sCollectInterval = LivePlayEnforceIntervalSetting.DEFAULT;
            sCollectWindow = 100L;
            PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
            lifecycleService = pg9;
            if (pg9 == null) {
                return;
            }
            pg9.LIZ(new PMP());
            if (lifecycleService.isForeground()) {
                isPause = false;
            }
            isInit = true;
        }
    }

    public static synchronized boolean isStart() {
        boolean z;
        synchronized (GraphicsMonitor.class) {
            if (startTime <= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public static synchronized void start() {
        synchronized (GraphicsMonitor.class) {
            if (!isInit) {
                return;
            }
            if (!isInitGraphicsLoad) {
                initGraphicsLoad();
            }
            ScheduledExecutorService scheduledExecutorService = gpuScheduleService;
            if (scheduledExecutorService == null) {
                return;
            }
            int i = startTime + 1;
            startTime = i;
            if (i > 1) {
                return;
            }
            ARunnableS18S0000000_11 aRunnableS18S0000000_11 = new ARunnableS18S0000000_11(4);
            long j = sCollectInterval;
            gpuFuture = scheduledExecutorService.scheduleWithFixedDelay(aRunnableS18S0000000_11, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public static synchronized void stop() {
        synchronized (GraphicsMonitor.class) {
            if (isInit && isStart()) {
                int i = startTime - 1;
                startTime = i;
                if (i > 0) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = gpuFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                gpuLoadDataOnce = -1.0d;
            }
        }
    }

    public static void registerGraphicsUpdateListener(PMQ pmq) {
        if (pmq == null || graphicsUpdateListeners.contains(pmq)) {
            return;
        }
        graphicsUpdateListeners.add(pmq);
    }

    public static void unRegisterGraphicsUpdateListener(PMQ pmq) {
        graphicsUpdateListeners.remove(pmq);
    }
}
