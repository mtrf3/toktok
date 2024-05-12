package com.ss.avframework.livestreamv2.core.interact.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;

/* loaded from: classes12.dex */
public class InteractThreadUtils {
    public static HandlerThread mLogUpThread;
    public static Handler mLogUploadThreadHandler;
    public static HandlerThread mWorkThread;
    public static Handler mWorkThreadHandler;

    public static synchronized void destroyThread() {
        synchronized (InteractThreadUtils.class) {
            mWorkThreadHandler = null;
            HandlerThread handlerThread = mWorkThread;
            mWorkThread = null;
            if (handlerThread != null) {
                try {
                    handlerThread.quitSafely();
                } catch (Throwable unused) {
                    handlerThread.quit();
                }
            }
            mLogUploadThreadHandler = null;
            HandlerThread handlerThread2 = mLogUpThread;
            mLogUpThread = null;
            if (handlerThread2 != null) {
                try {
                    handlerThread2.quitSafely();
                } catch (Throwable unused2) {
                    handlerThread2.quit();
                }
            }
        }
    }

    public static synchronized Handler getLogUppThreadHandler() {
        Handler handler;
        synchronized (InteractThreadUtils.class) {
            handler = mLogUploadThreadHandler;
        }
        return handler;
    }

    public static synchronized Handler getWorkThreadHandler() {
        Handler handler;
        synchronized (InteractThreadUtils.class) {
            handler = mWorkThreadHandler;
        }
        return handler;
    }

    public static synchronized void initThread() {
        synchronized (InteractThreadUtils.class) {
            if (mWorkThread == null && mLogUpThread == null) {
                HandlerThread handlerThread = new HandlerThread("InteractWorkThread", TTLSThreadConfigHelper.getPriority("InteractWorkThread", 0));
                mWorkThread = handlerThread;
                handlerThread.start();
                mWorkThreadHandler = new Handler(mWorkThread.getLooper());
                HandlerThread handlerThread2 = new HandlerThread("InteractLogUploadThread", TTLSThreadConfigHelper.getPriority("InteractLogUploadThread", 0));
                mLogUpThread = handlerThread2;
                handlerThread2.start();
                mLogUploadThreadHandler = new Handler(mLogUpThread.getLooper());
            }
        }
    }

    public static synchronized void postLogUpTask(Runnable runnable) {
        synchronized (InteractThreadUtils.class) {
            Handler handler = mLogUploadThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public static synchronized void postWorkTask(Runnable runnable) {
        synchronized (InteractThreadUtils.class) {
            Handler handler = mWorkThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public static synchronized void removeWorkerCallback(Runnable runnable) {
        synchronized (InteractThreadUtils.class) {
            if (mWorkThread != null) {
                mWorkThreadHandler.removeCallbacks(runnable);
            }
        }
    }

    public static synchronized void postLogUpDelayed(Runnable runnable, long j) {
        synchronized (InteractThreadUtils.class) {
            Handler handler = mLogUploadThreadHandler;
            if (handler != null) {
                handler.postDelayed(runnable, j);
            }
        }
    }

    public static synchronized void postWorkDelayed(Runnable runnable, long j) {
        synchronized (InteractThreadUtils.class) {
            Handler handler = mWorkThreadHandler;
            if (handler != null) {
                handler.postDelayed(runnable, j);
            }
        }
    }
}
