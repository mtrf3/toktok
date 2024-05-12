package com.ss.ttlivestreamer.core.utils;

import X.AnonymousClass028;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class SafeHandlerThread extends NativeHandlerThread {
    public long mAliveTimeMs;
    public IDispatchInterceptMainException mDispatch;
    public boolean mEnableSafeMode;
    public SafeHandler mHandler;
    public boolean mHasStart;
    public final Object mLockFence;
    public AtomicBoolean mLocked;
    public boolean mQuiting;
    public final Runnable mReleaseRunnable;
    public Runnable mReleaseRunnableOuter;
    public volatile boolean mReleased;

    /* loaded from: classes12.dex */
    public interface IDispatchInterceptMainException {
        boolean dispatchInterceptMainException(String str, Throwable th);
    }

    public synchronized Handler getHandler() {
        return getHandlerInner();
    }

    public SafeHandlerThread lock() {
        return lock(null);
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        this.mQuiting = true;
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public boolean quitSafely() {
        this.mQuiting = true;
        return super.quitSafely();
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread, java.lang.Thread
    public synchronized void start() {
        synchronized (this) {
            if (!this.mHasStart) {
                this.mHasStart = true;
                try {
                    super.start();
                } finally {
                }
            }
        }
    }

    private SafeHandler getHandlerInner() {
        if (this.mHandler == null) {
            this.mHandler = new SafeHandler(getLooper());
        }
        return this.mHandler;
    }

    public boolean isLocked() {
        return this.mLocked.get();
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread
    public void release() {
        if (this.mIsNative) {
            super.release();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Release thread:");
        LIZ.append(getName());
        AVLog.ioi("SafeHandlerThread", X1D.LIZIZ(LIZ));
        try {
            quitSafely();
        } catch (Throwable unused) {
            super.quit();
        }
    }

    /* loaded from: classes12.dex */
    public static class SafeHandler extends Handler {
        public Handler.Callback mCallback;

        public SafeHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Handler.Callback callback = this.mCallback;
            if (callback != null) {
                callback.handleMessage(message);
            }
        }

        public void setHandlerCallback(Handler.Callback callback) {
            this.mCallback = callback;
        }
    }

    public SafeHandlerThread(String str) {
        this(str, 0);
    }

    public synchronized void enableSafeMode(IDispatchInterceptMainException iDispatchInterceptMainException) {
        if (this.mEnableSafeMode && this.mDispatch != null) {
            return;
        }
        this.mEnableSafeMode = true;
        this.mDispatch = iDispatchInterceptMainException;
        getHandler().post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThread.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_SafeHandlerThread$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_SafeHandlerThread$3__run$___twin___() {
                boolean dispatchInterceptMainException;
                while (!SafeHandlerThread.this.mQuiting) {
                    try {
                        Looper.loop();
                    } finally {
                        if (!dispatchInterceptMainException) {
                            try {
                                Thread.sleep(1000L);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }

            public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThread$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_utils_SafeHandlerThread$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public SafeHandlerThread lock(Handler.Callback callback) {
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (!isLocked() && !this.mReleased) {
            synchronized (this.mLockFence) {
                if (!this.mReleased) {
                    getHandlerInner().removeCallbacks(this.mReleaseRunnable);
                    this.mLocked.set(true);
                    setHandlerCallback(callback);
                    return this;
                }
                return null;
            }
        }
        return null;
    }

    public boolean post(int i) {
        return getHandler().sendEmptyMessage(i);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        return getHandler().postAtFrontOfQueue(runnable);
    }

    public void removeCallbacks(Runnable runnable) {
        getHandler().removeCallbacks(runnable);
    }

    public void setAliveTimeMs(long j) {
        this.mAliveTimeMs = j;
    }

    public void setHandlerCallback(Handler.Callback callback) {
        SafeHandler handlerInner = getHandlerInner();
        if (handlerInner != null) {
            handlerInner.setHandlerCallback(callback);
        }
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread
    public void setThreadName(final String str) {
        if (!post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThread.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_SafeHandlerThread$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_SafeHandlerThread$2__run$___twin___() {
                try {
                    SafeHandlerThread.super.setThreadName(str);
                } catch (Exception unused) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Set name failed.current:");
                    LIZ.append(SafeHandlerThread.this.getName());
                    LIZ.append(",new:");
                    LIZ.append(str);
                    AVLog.logKibana(6, "SafeHandlerThread", X1D.LIZIZ(LIZ), null);
                }
            }

            public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThread$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_utils_SafeHandlerThread$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Set name failed.current:");
            LIZ.append(getName());
            LIZ.append(",new:");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(LIZIZ);
            if (!AnonymousClass028.LJI(androidRuntimeException, "SafeHandlerThread.setThreadName")) {
                AVLog.logKibana(6, "SafeHandlerThread", LIZIZ, null);
                return;
            }
            throw androidRuntimeException;
        }
    }

    public void unlock(Runnable runnable) {
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (this.mAliveTimeMs > 0) {
            this.mReleaseRunnableOuter = runnable;
            getHandlerInner().postDelayed(this.mReleaseRunnable, this.mAliveTimeMs);
        }
        this.mLocked.set(false);
    }

    public boolean post(Runnable runnable) {
        return getHandler().post(runnable);
    }

    public void post(Message message) {
        getHandler().sendMessage(message);
    }

    public SafeHandlerThread(String str, int i) {
        super(str, i);
        this.mLocked = new AtomicBoolean(false);
        this.mAliveTimeMs = 0L;
        this.mLockFence = new Object();
        this.mReleaseRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThread.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_SafeHandlerThread$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_SafeHandlerThread$1__run$___twin___() {
                if (!SafeHandlerThread.this.isLocked() && !SafeHandlerThread.this.mReleased) {
                    synchronized (SafeHandlerThread.this.mLockFence) {
                        if (!SafeHandlerThread.this.isLocked()) {
                            SafeHandlerThread.this.mReleased = true;
                            Runnable runnable = SafeHandlerThread.this.mReleaseRunnableOuter;
                            if (runnable != null) {
                                runnable.run();
                            }
                            SafeHandlerThread.this.release();
                        }
                    }
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BUG! release error: locked:");
                LIZ.append(SafeHandlerThread.this.isLocked());
                LIZ.append(", released:");
                LIZ.append(SafeHandlerThread.this.mReleased);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                if (!AnonymousClass028.LJI(androidRuntimeException, "SafeHandlerThread.SafeHandlerThread")) {
                } else {
                    throw androidRuntimeException;
                }
            }

            public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThread$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_utils_SafeHandlerThread$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
    }

    public boolean post(int i, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, obj));
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return getHandler().postDelayed(runnable, j);
    }

    public boolean post(int i, int i2, int i3, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, i2, i3, obj));
    }
}
