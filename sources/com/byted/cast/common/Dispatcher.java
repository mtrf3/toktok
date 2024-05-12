package com.byted.cast.common;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.threadpool.CastScheduledThreadPoolExecutor;
import com.byted.cast.common.threadpool.CastThreadFactory;
import com.byted.cast.common.threadpool.CastThreadPoolExecutor;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes29.dex */
public class Dispatcher {
    public static int CORE_POOL_SIZE = 16;
    public static int MAX_POOL_SIZE = 64;
    public static volatile Dispatcher sInstance;
    public final Handler byteCastHandler;
    public final HandlerThread byteCastHandlerThread;
    public CastThreadPoolExecutor executorService;
    public final MainThreadExecutor mainThreadExecutor;
    public CastScheduledThreadPoolExecutor scheduledExecutorService;
    public Map<String, ScheduledFuture> scheduledExecutorServiceMap;

    public Dispatcher() {
        this(CORE_POOL_SIZE, MAX_POOL_SIZE);
    }

    public static Dispatcher getInstance() {
        if (sInstance == null) {
            synchronized (Dispatcher.class) {
                if (sInstance == null) {
                    sInstance = new Dispatcher();
                }
            }
        }
        return sInstance;
    }

    public Looper getByteCastThreadLooper() {
        return this.byteCastHandlerThread.getLooper();
    }

    private boolean isMainThread() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            return true;
        }
        return false;
    }

    public Handler getByteCastHandler() {
        return this.byteCastHandler;
    }

    public Executor getExecutor() {
        return this.executorService;
    }

    public static void enableCompatibleConfig(String str) {
        if (TextUtils.equals(str, "sink")) {
            CORE_POOL_SIZE = 8;
            MAX_POOL_SIZE = 32;
        } else {
            CORE_POOL_SIZE = 16;
            MAX_POOL_SIZE = 64;
        }
    }

    public void enqueue(Runnable runnable) {
        this.executorService.execute(runnable);
    }

    public void remove(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.executorService.remove(runnable);
    }

    public void runOnByteCastThread(Runnable runnable) {
        this.byteCastHandler.post(runnable);
    }

    public void runOnMainThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            this.mainThreadExecutor.execute(runnable);
        }
    }

    public void shutdownScheduleService(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shutdownScheduleService, key:");
        LIZ.append(str);
        Logger.i("Dispatcher", X1D.LIZIZ(LIZ));
        ScheduledFuture scheduledFuture = this.scheduledExecutorServiceMap.get(str);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.scheduledExecutorServiceMap.remove(str);
        }
    }

    public boolean taskIsAlive(String str) {
        return this.scheduledExecutorServiceMap.containsKey(str);
    }

    public Dispatcher(int i, int i2) {
        this.mainThreadExecutor = new MainThreadExecutor();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Dispatcher, corePoolSize:");
        LIZ.append(i);
        LIZ.append(", maxPoolSize:");
        LIZ.append(i2);
        Logger.d("Dispatcher", X1D.LIZIZ(LIZ));
        this.executorService = new CastThreadPoolExecutor(i, i2, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(128), new CastThreadFactory("Dispatcher"), new ThreadPoolExecutor.DiscardOldestPolicy());
        this.scheduledExecutorService = new CastScheduledThreadPoolExecutor(8, new CastThreadFactory("Dispatcher"));
        this.scheduledExecutorServiceMap = new ConcurrentHashMap();
        HandlerThread handlerThread = new HandlerThread("ByteCast");
        this.byteCastHandlerThread = handlerThread;
        handlerThread.start();
        this.byteCastHandler = new Handler(handlerThread.getLooper());
    }

    public void delaySchedule(Runnable runnable, int i) {
        this.scheduledExecutorService.schedule(runnable, i, TimeUnit.SECONDS);
    }

    public void printThreadPool(ContextManager.CastContext castContext, String str, String str2) {
        int size = this.executorService.getQueue().size();
        int activeCount = this.executorService.getActiveCount();
        int largestPoolSize = this.executorService.getLargestPoolSize();
        long taskCount = this.executorService.getTaskCount();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        LIZ.append(", dispatcher info: queueSize: ");
        LIZ.append(size);
        LIZ.append(", activeCount: ");
        LIZ.append(activeCount);
        LIZ.append(", largestSize: ");
        LIZ.append(largestPoolSize);
        LIZ.append(", taskCount: ");
        LIZ.append(taskCount);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ContextManager.getLogger(castContext).d("Dispatcher", LIZIZ);
        ContextManager.getMonitor(castContext).sendCustomEvent(str, "Dispatcher_Count", LIZIZ);
    }

    public void schedule(String str, Runnable runnable, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("schedule, taskName:");
        LIZ.append(str);
        Logger.i("Dispatcher", X1D.LIZIZ(LIZ));
        if (this.scheduledExecutorServiceMap.containsKey(str)) {
            return;
        }
        this.scheduledExecutorServiceMap.put(str, this.scheduledExecutorService.scheduleAtFixedRate(runnable, 3L, i, TimeUnit.SECONDS));
    }

    public void schedule(String str, Runnable runnable, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("schedule, taskName:");
        LIZ.append(str);
        LIZ.append(", initDelayTime:");
        LIZ.append(i2);
        Logger.i("Dispatcher", X1D.LIZIZ(LIZ));
        if (this.scheduledExecutorServiceMap.containsKey(str)) {
            return;
        }
        this.scheduledExecutorServiceMap.put(str, this.scheduledExecutorService.scheduleAtFixedRate(runnable, i2, i, TimeUnit.SECONDS));
    }
}
