package com.ttnet.org.chromium.base;

import X.C16880lQ;
import X.CallableC79496VHw;
import X.VI0;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes15.dex */
public class ThreadUtils {
    public static final Object LIZ = new Object();
    public static Handler LIZIZ;

    public static Handler LIZ() {
        boolean z;
        synchronized (LIZ) {
            if (LIZIZ == null) {
                LIZIZ = new Handler(C16880lQ.LLJJJJ());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            TraceEvent.LJLJI.set(true);
            if (TraceEvent.LJLILLLLZI) {
                VI0.LIZ();
            }
        }
        return LIZIZ;
    }

    public static boolean LIZJ() {
        if (LIZ().getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static Object LIZIZ(CallableC79496VHw callableC79496VHw) {
        try {
            FutureTask futureTask = new FutureTask(callableC79496VHw);
            if (LIZJ()) {
                futureTask.run();
            } else {
                LIZ().post(futureTask);
            }
            try {
                return futureTask.get();
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted waiting for callable", e);
            }
        } catch (ExecutionException e2) {
            throw new RuntimeException("Error occurred waiting for callable", e2);
        }
    }

    public static boolean isThreadPriorityAudio(int i) {
        if (Process.getThreadPriority(i) == -16) {
            return true;
        }
        return false;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    public static void setThreadPriorityOnCurrentThread(int i) {
        Process.setThreadPriority(i);
    }
}
