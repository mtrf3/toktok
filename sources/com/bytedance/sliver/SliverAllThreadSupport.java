package com.bytedance.sliver;

import X.C16880lQ;
import X.C39149FYb;
import X.FY8;
import X.InterfaceC39148FYa;
import X.RunnableC39150FYc;
import X.X1D;
import Y.ARunnableS12S1000000_6;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public final class SliverAllThreadSupport {
    public static InterfaceC39148FYa filter;
    public static final List<C39149FYb> threadGroups = new LinkedList();
    public static final Thread mainThread = C16880lQ.LLJJJJ().getThread();
    public static volatile boolean isStart = false;
    public static volatile boolean isRunning = false;
    public static int samplingRateMs = 10;
    public static Handler threadHandler = null;
    public static ThreadGroup systemThreadGroup = null;

    public static boolean initSystemThreadGroup() {
        try {
            if (systemThreadGroup == null) {
                Field declaredField = ThreadGroup.class.getDeclaredField("systemThreadGroup");
                declaredField.setAccessible(true);
                systemThreadGroup = (ThreadGroup) declaredField.get(null);
            }
        } catch (Throwable unused) {
        }
        return systemThreadGroup != null;
    }

    public static native void nClearSliverGroup(long j);

    public static native void nDumpSliverGroup(long j, String str);

    public static native int nGetThreadId(long j);

    public static native void nNotifySliverGroup(long j, Thread[] threadArr, long[] jArr);

    public static native void nPauseSliverGroup(long j);

    public static native void nResumeSliverGroup(long j);

    public static native long nStartSliverGroup(int i, int i2, int i3, int i4);

    public static native void nStopSliverGroup(long j);

    public static boolean clearAll() {
        if (!isStart) {
            return false;
        }
        for (C39149FYb c39149FYb : threadGroups) {
            synchronized (c39149FYb) {
                nClearSliverGroup(c39149FYb.LIZLLL);
            }
        }
        return true;
    }

    public static synchronized void deleteThreadHandler() {
        synchronized (SliverAllThreadSupport.class) {
            Handler handler = threadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                threadHandler.getLooper().quitSafely();
                threadHandler = null;
            }
        }
    }

    public static List<Thread> getAllThread() {
        int activeCount = systemThreadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount / 2) + activeCount];
        int enumerate = systemThreadGroup.enumerate(threadArr);
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i = 0; i < enumerate; i++) {
            Thread thread = threadArr[i];
            if (thread != mainThread && !thread.getName().contains("sliver")) {
                arrayList.add(threadArr[i]);
            }
        }
        return arrayList;
    }

    public static synchronized Handler newThreadHandler() {
        Handler handler;
        synchronized (SliverAllThreadSupport.class) {
            if (threadHandler == null) {
                HandlerThread handlerThread = new HandlerThread("sliver_check_thread");
                handlerThread.start();
                threadHandler = new Handler(handlerThread.getLooper());
            }
            handler = threadHandler;
        }
        return handler;
    }

    public static boolean pauseAll() {
        if (!isStart || !isRunning) {
            return false;
        }
        for (C39149FYb c39149FYb : threadGroups) {
            synchronized (c39149FYb) {
                nPauseSliverGroup(c39149FYb.LIZLLL);
            }
        }
        deleteThreadHandler();
        isRunning = false;
        return true;
    }

    public static boolean resumeAll() {
        if (!isStart || isRunning) {
            return false;
        }
        for (C39149FYb c39149FYb : threadGroups) {
            synchronized (c39149FYb) {
                nResumeSliverGroup(c39149FYb.LIZLLL);
            }
        }
        newThreadHandler().post(new RunnableC39150FYc(samplingRateMs));
        isRunning = true;
        return true;
    }

    public static boolean stopAll() {
        if (!isStart) {
            return false;
        }
        for (C39149FYb c39149FYb : threadGroups) {
            synchronized (c39149FYb) {
                if (c39149FYb.LIZLLL != 0) {
                    nStopSliverGroup(c39149FYb.LIZLLL);
                }
            }
        }
        threadGroups.clear();
        deleteThreadHandler();
        isStart = false;
        isRunning = false;
        return true;
    }

    public static boolean isStart() {
        return isStart;
    }

    public static boolean dumpHeader(String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str));
            try {
                bufferedWriter2.write("# sliver\n");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("# pid:");
                LIZ.append(Process.myPid());
                LIZ.append("\n");
                bufferedWriter2.write(X1D.LIZIZ(LIZ));
                bufferedWriter2.flush();
                try {
                    bufferedWriter2.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (Throwable unused2) {
                bufferedWriter = bufferedWriter2;
                try {
                    bufferedWriter.close();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            }
        } catch (Throwable unused4) {
            if (0 == 0) {
                return false;
            }
        }
    }

    public static boolean dumpAll(String str, boolean z) {
        if (!isStart) {
            return false;
        }
        ARunnableS12S1000000_6 aRunnableS12S1000000_6 = new ARunnableS12S1000000_6(str, 3);
        if (z) {
            aRunnableS12S1000000_6.run();
            return true;
        }
        newThreadHandler().post(aRunnableS12S1000000_6);
        return true;
    }

    public static boolean startAll(int i, int i2, int i3, FY8 fy8, InterfaceC39148FYa interfaceC39148FYa) {
        if (Build.VERSION.SDK_INT > 31 || isStart || !initSystemThreadGroup()) {
            return false;
        }
        samplingRateMs = i2;
        List<C39149FYb> list = threadGroups;
        list.clear();
        int max = Math.max(i, 2);
        C39149FYb c39149FYb = new C39149FYb(0, i2, i3, fy8);
        Thread thread = mainThread;
        synchronized (c39149FYb) {
            c39149FYb.LIZJ.add(thread);
            c39149FYb.LJI = true;
        }
        c39149FYb.LIZIZ();
        list.add(c39149FYb);
        for (int i4 = 1; i4 < max; i4++) {
            threadGroups.add(new C39149FYb(i4, i2, i3, fy8));
        }
        newThreadHandler().post(new RunnableC39150FYc(i2 * 5));
        isStart = true;
        isRunning = true;
        return true;
    }
}
