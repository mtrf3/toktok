package com.byted.cast.sdk.monitor;

import X.C16880lQ;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.log.Logger;
import com.byted.cast.sdk.log.LoggerManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/* loaded from: classes29.dex */
public class PerformanceMonitor {
    public static Context mAppContext;
    public ContextManager.CastContext mCastContext;
    public Handler mHandler;
    public CastLogger mLogger;
    public OnPerformanceUpdateListener mPerformanceUpdateListener;
    public volatile boolean mStarted;
    public int mThreadId = -1;
    public Runnable mNormalMonitorRunnable = new Runnable() { // from class: com.byted.cast.sdk.monitor.PerformanceMonitor.1
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_monitor_PerformanceMonitor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_monitor_PerformanceMonitor$1__run$___twin___() {
            PerformanceMonitor performanceMonitor = PerformanceMonitor.this;
            if (performanceMonitor.mThreadId == -1) {
                performanceMonitor.mThreadId = Process.myTid();
            }
            Performance performance = new Performance();
            performance.cpuCoreNum = PerformanceMonitor.getCpuCore(PerformanceMonitor.this.mCastContext);
            performance.memTotalSize = PerformanceMonitor.getTotalMemSizeKB(PerformanceMonitor.mAppContext);
            performance.memAppUsedSize = PerformanceMonitor.getAppMemUsedSizeKB(Process.myPid(), PerformanceMonitor.mAppContext);
            performance.memUsedSize = performance.memTotalSize - PerformanceMonitor.getFreeMemSizeKB(PerformanceMonitor.mAppContext);
            OnPerformanceUpdateListener onPerformanceUpdateListener = PerformanceMonitor.this.mPerformanceUpdateListener;
            if (onPerformanceUpdateListener != null) {
                onPerformanceUpdateListener.onPerformanceUpdated(performance);
            }
            PerformanceMonitor performanceMonitor2 = PerformanceMonitor.this;
            Handler handler = performanceMonitor2.mHandler;
            if (handler != null) {
                handler.postDelayed(performanceMonitor2.mNormalMonitorRunnable, 3000L);
            }
            CastLogger castLogger = PerformanceMonitor.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Performance: ");
            LIZ.append(performance.toString());
            castLogger.v("PerformanceMonitor", X1D.LIZIZ(LIZ));
        }

        public static void com_byted_cast_sdk_monitor_PerformanceMonitor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_byted_cast_sdk_monitor_PerformanceMonitor$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };

    /* loaded from: classes29.dex */
    public interface OnPerformanceUpdateListener {
        void onPerformanceUpdated(Performance performance);
    }

    /* loaded from: classes29.dex */
    public static class Performance {
        public int cpuAppPercent;
        public int cpuCoreNum;
        public int cpuSysPercent;
        public int cpuTotalPercent;
        public int memAppUsedSize;
        public int memTotalSize;
        public int memUsedSize;

        public String toString() {
            return GsonProtectorUtils.toJson(new Gson(), this);
        }
    }

    public void stop() {
        if (!this.mStarted) {
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mNormalMonitorRunnable);
        }
        this.mStarted = false;
        this.mLogger.i("PerformanceMonitor", "stopped");
    }

    public PerformanceMonitor(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public static int getCpuCore(ContextManager.CastContext castContext) {
        CastLogger logger = ContextManager.getLogger(castContext);
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.byted.cast.sdk.monitor.PerformanceMonitor.2
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]{1,2}", file.getName());
                }
            }).length;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCpuCore failed: ");
            LIZ.append(e.getMessage());
            logger.e("PerformanceMonitor", X1D.LIZIZ(LIZ));
            return 0;
        }
    }

    public static int getFreeMemSizeKB(Context context) {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return (int) (memoryInfo.availMem / 1024);
        }
        return 0;
    }

    public static long getTotalCpuPercent(String str) {
        Logger logger = LoggerManager.getLogger(str);
        long j = 0;
        try {
            Scanner scanner = new Scanner(new File("/proc/stat"));
            try {
                scanner.next();
                long nextLong = scanner.nextLong();
                long nextLong2 = scanner.nextLong();
                long nextLong3 = scanner.nextLong();
                long nextLong4 = scanner.nextLong();
                long nextLong5 = scanner.nextLong();
                j = scanner.nextLong() + nextLong + nextLong2 + nextLong3 + nextLong4 + nextLong5 + scanner.nextLong();
                scanner.close();
            } finally {
            }
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getTotalCpuPercent failed: ");
            LIZ.append(e.getMessage());
            logger.e("PerformanceMonitor", X1D.LIZIZ(LIZ));
        }
        return j;
    }

    public static int getTotalMemSizeKB(Context context) {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return (int) (memoryInfo.totalMem / 1024);
        }
        return 0;
    }

    public void setOnPerformanceUpdateListener(OnPerformanceUpdateListener onPerformanceUpdateListener) {
        this.mPerformanceUpdateListener = onPerformanceUpdateListener;
    }

    public void start(Context context) {
        if (this.mStarted) {
            return;
        }
        if (this.mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("MonitorThread");
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
        }
        stop();
        mAppContext = context;
        this.mHandler.postDelayed(this.mNormalMonitorRunnable, 0L);
        this.mStarted = true;
        this.mLogger.i("PerformanceMonitor", "started");
    }

    public static long getAppCpuPercent(int i, String str) {
        Logger logger = LoggerManager.getLogger(str);
        long j = 0;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(i);
            LIZ.append("/stat");
            Scanner scanner = new Scanner(new File(X1D.LIZIZ(LIZ)));
            for (int i2 = 0; scanner.hasNext() && i2 < 13; i2++) {
                try {
                    scanner.next();
                } finally {
                }
            }
            j = scanner.nextLong() + scanner.nextLong() + scanner.nextLong() + scanner.nextLong();
            scanner.close();
        } catch (IOException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getAppCpuPercent failed: ");
            LIZ2.append(e.getMessage());
            logger.e("PerformanceMonitor", X1D.LIZIZ(LIZ2));
        }
        return j;
    }

    public static int getAppMemUsedSizeKB(int i, Context context) {
        Debug.MemoryInfo memoryInfo;
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager == null || (memoryInfo = C16880lQ.LLJJL(activityManager, new int[]{i})[0]) == null) {
            return 0;
        }
        return memoryInfo.getTotalPss();
    }
}
