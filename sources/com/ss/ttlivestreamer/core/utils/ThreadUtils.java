package com.ss.ttlivestreamer.core.utils;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class ThreadUtils {

    /* renamed from: com.ss.ttlivestreamer.core.utils.ThreadUtils$1CaughtException, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class C1CaughtException {
        public Exception e;
    }

    /* renamed from: com.ss.ttlivestreamer.core.utils.ThreadUtils$1Result, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class C1Result {
        public V value;
    }

    /* renamed from: com.ss.ttlivestreamer.core.utils.ThreadUtils$2CaughtException, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class C2CaughtException {
        public Exception e;
    }

    /* renamed from: com.ss.ttlivestreamer.core.utils.ThreadUtils$2Result, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class C2Result {
        public V value;
    }

    /* loaded from: classes12.dex */
    public interface BlockingOperation {
        void run();
    }

    /* loaded from: classes12.dex */
    public static class ThreadChecker {
        public Thread thread = C16880lQ.LLLLIIIILLL();

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = C16880lQ.LLLLIIIILLL();
            }
            if (C16880lQ.LLLLIIIILLL() == this.thread) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Wrong thread ");
            LIZ.append(this.thread.getName());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public static void checkIsOnMainThread() {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
        } else {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: com.ss.ttlivestreamer.core.utils.ThreadUtils.2
            @Override // com.ss.ttlivestreamer.core.utils.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: com.ss.ttlivestreamer.core.utils.ThreadUtils.1
            @Override // com.ss.ttlivestreamer.core.utils.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z2 = true;
                if (j2 <= 0) {
                    break;
                }
            }
        }
        C16880lQ.LLLLIIIILLL().interrupt();
        return z;
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.ThreadUtils.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_ThreadUtils$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [V, java.lang.Object] */
            public void com_ss_ttlivestreamer_core_utils_ThreadUtils$3__run$___twin___() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e2) {
                    c1CaughtException.e = e2;
                }
                countDownLatch.countDown();
            }

            public static void com_ss_ttlivestreamer_core_utils_ThreadUtils$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_utils_ThreadUtils$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            Exception exc = new Exception("Handler is invalid");
            C16880lQ.LLLLIIL(exc);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(exc.getCause());
            LIZ.append(" ");
            LIZ.append(Log.getStackTraceString(exc));
            AVLog.ioe("ThreadUtils", X1D.LIZIZ(LIZ));
            countDownLatch.countDown();
        }
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
        return !thread.isAlive();
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: com.ss.ttlivestreamer.core.utils.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable, long j) {
        if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        final C2Result c2Result = new C2Result();
        final C2CaughtException c2CaughtException = new C2CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.ThreadUtils.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_ThreadUtils$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [V, java.lang.Object] */
            public void com_ss_ttlivestreamer_core_utils_ThreadUtils$5__run$___twin___() {
                try {
                    C2Result.this.value = callable.call();
                } catch (Exception e2) {
                    c2CaughtException.e = e2;
                }
                countDownLatch.countDown();
            }

            public static void com_ss_ttlivestreamer_core_utils_ThreadUtils$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_core_utils_ThreadUtils$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            Exception exc = new Exception("Handler is invalid");
            C16880lQ.LLLLIIL(exc);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(exc.getCause());
            LIZ.append(" ");
            LIZ.append(Log.getStackTraceString(exc));
            AVLog.ioe("ThreadUtils", X1D.LIZIZ(LIZ));
            countDownLatch.countDown();
        }
        awaitUninterruptibly(countDownLatch, j);
        if (c2CaughtException.e == null) {
            return c2Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c2CaughtException.e);
        runtimeException.setStackTrace(concatStackTraces(c2CaughtException.e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static long invokeAtFrontUninterruptibly(Handler handler, Runnable runnable, long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.ThreadUtils.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_ThreadUtils$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_ThreadUtils$6__run$___twin___() {
                countDownLatch.countDown();
            }

            public static void com_ss_ttlivestreamer_core_utils_ThreadUtils$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_core_utils_ThreadUtils$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            if (awaitUninterruptibly(countDownLatch, j)) {
                return 0L;
            }
            return j;
        }
        return -1L;
    }
}
