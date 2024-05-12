package com.bytedance.bdlocation.thread;

import X.C06M;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class ThreadLooperManager {
    public static HandlerThread sBleScanWorker;
    public static HandlerThread sConfigWorker;
    public static HandlerThread sLocationWorker;
    public static HandlerThread sNetworkCollectWorker;
    public static HandlerThread sPollUploadWorker;
    public static HandlerThread sSchedulerWorker;
    public static HandlerThread sShakeTaskWorker;
    public static Handler sWorkerHandler;

    public static synchronized Looper getBleScanWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sBleScanWorker == null) {
                sBleScanWorker = C06M.LIZ("BleScanWorker");
            }
            looper = sBleScanWorker.getLooper();
        }
        return looper;
    }

    public static synchronized Looper getConfigWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sConfigWorker == null) {
                sConfigWorker = C06M.LIZ("ConfigWorker");
            }
            looper = sConfigWorker.getLooper();
        }
        return looper;
    }

    public static synchronized Looper getLocationWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sLocationWorker == null) {
                sLocationWorker = C06M.LIZ("LocationWorker");
            }
            looper = sLocationWorker.getLooper();
        }
        return looper;
    }

    public static synchronized Looper getNetworkCollectWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sNetworkCollectWorker == null) {
                sNetworkCollectWorker = C06M.LIZ("NetworkCollectWorker");
            }
            looper = sNetworkCollectWorker.getLooper();
        }
        return looper;
    }

    public static synchronized Looper getPollUploadWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sPollUploadWorker == null) {
                sPollUploadWorker = C06M.LIZ("PollUploadWorker");
            }
            looper = sPollUploadWorker.getLooper();
        }
        return looper;
    }

    public static synchronized Looper getSchedulerWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sSchedulerWorker == null) {
                sSchedulerWorker = C06M.LIZ("SchedulerWorker");
            }
            looper = sSchedulerWorker.getLooper();
        }
        return looper;
    }

    public static synchronized Looper getShakeTaskWorker() {
        Looper looper;
        synchronized (ThreadLooperManager.class) {
            if (sShakeTaskWorker == null) {
                sShakeTaskWorker = C06M.LIZ("ShakeTaskWorker");
            }
            looper = sShakeTaskWorker.getLooper();
        }
        return looper;
    }

    public static HandlerThread getNewThread(String str) {
        return C06M.LIZ(str);
    }

    public static synchronized void postWorkRunner(Runnable runnable) {
        synchronized (ThreadLooperManager.class) {
            if (sWorkerHandler == null) {
                sWorkerHandler = new Handler(getConfigWorker());
            }
            sWorkerHandler.post(runnable);
        }
    }
}
