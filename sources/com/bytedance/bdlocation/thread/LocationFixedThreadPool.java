package com.bytedance.bdlocation.thread;

import X.X1D;
import android.os.Build;
import com.bytedance.bdlocation.log.Logger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class LocationFixedThreadPool extends PThreadPoolExecutor {
    public static final RejectedExecutionHandler defaultHandler = new ThreadPoolExecutor.AbortPolicy();

    /* loaded from: classes7.dex */
    public class LocationFixedThreadPoolRunnable implements Runnable {
        public Runnable mRunnable;

        @Override // java.lang.Runnable
        public void run() {
            com_bytedance_bdlocation_thread_LocationFixedThreadPool$LocationFixedThreadPoolRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_bdlocation_thread_LocationFixedThreadPool$LocationFixedThreadPoolRunnable__run$___twin___() {
            boolean doInterceptThrowable;
            try {
                this.mRunnable.run();
            } finally {
                if (doInterceptThrowable) {
                }
            }
        }

        public static void com_bytedance_bdlocation_thread_LocationFixedThreadPool$LocationFixedThreadPoolRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(LocationFixedThreadPoolRunnable locationFixedThreadPoolRunnable) {
            boolean LIZ;
            try {
                locationFixedThreadPoolRunnable.com_bytedance_bdlocation_thread_LocationFixedThreadPool$LocationFixedThreadPoolRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        private boolean doInterceptThrowable(Throwable th) {
            int length;
            if (th == null) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i != 29) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("LocationFixedThreadPool versioncode:");
                LIZ.append(i);
                Logger.i(X1D.LIZIZ(LIZ));
                return false;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LocationFixedThreadPool throwable instanceof NullPointerException:");
            boolean z = th instanceof NullPointerException;
            LIZ2.append(z);
            Logger.i(X1D.LIZIZ(LIZ2));
            if (z) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("LocationFixedThreadPool elements:");
                if (stackTrace == null) {
                    length = 0;
                } else {
                    length = stackTrace.length;
                }
                LIZ3.append(length);
                Logger.i(X1D.LIZIZ(LIZ3));
                if (stackTrace != null && stackTrace.length > 0) {
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (stackTraceElement != null) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("LocationFixedThreadPool element ClassName:");
                            LIZ4.append(stackTraceElement.getClassName());
                            LIZ4.append("--MethodName:");
                            LIZ4.append(stackTraceElement.getMethodName());
                            Logger.i(X1D.LIZIZ(LIZ4));
                            if ("android.telephony.TelephonyManager$1".equals(stackTraceElement.getClassName()) && "lambda$onError$2".equals(stackTraceElement.getMethodName())) {
                                Logger.i("LocationFixedThreadPool doInterceptThrowable return true");
                                return true;
                            }
                        }
                    }
                }
            }
            Logger.i("LocationFixedThreadPool doInterceptThrowable return false");
            return false;
        }

        public LocationFixedThreadPoolRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    public static ExecutorService newFixedThreadPool(int i) {
        return new LocationFixedThreadPool(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new LocationFixedThreadPoolRunnable(runnable));
    }

    public LocationFixedThreadPool(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, timeUnit, blockingQueue, Executors.defaultThreadFactory(), defaultHandler);
    }
}
