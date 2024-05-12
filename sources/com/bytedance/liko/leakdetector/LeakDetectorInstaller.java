package com.bytedance.liko.leakdetector;

import X.C10K;
import X.C16880lQ;
import X.C39591FgJ;
import X.C39595FgN;
import X.C39596FgO;
import X.C39598FgQ;
import X.C84763XOl;
import X.EF7;
import X.F9J;
import X.F9S;
import X.HandlerC39590FgI;
import X.X1D;
import Y.ACallableS109S0100000_6;
import Y.ACallableS78S0101000_6;
import Y.AfS37S0101000_6;
import Y.IDHandlerS19S0100000_6;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LeakDetectorInstaller {
    public static final LeakDetectorInstaller INSTANCE = new LeakDetectorInstaller();
    public static Handler handler;
    public static boolean hasExcuteBackgroud;
    public static int retryCount;
    public static long trySumTime;

    public final Handler getHandler() {
        return handler;
    }

    public final boolean getHasExcuteBackgroud() {
        return hasExcuteBackgroud;
    }

    public final int getRetryCount() {
        return retryCount;
    }

    public final long getTrySumTime() {
        return trySumTime;
    }

    public final void initConfig(Context context) {
        C10K.LIZJ(new ACallableS109S0100000_6(context, 0));
    }

    public final synchronized void runAnalysis(String path) {
        o.LJIIJ(path, "path");
        C39591FgJ.LJFF = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start Analysis:hprof path:");
        LIZ.append(path);
        C39596FgO.LIZ(X1D.LIZIZ(LIZ));
        try {
            new AnalyzerEngine().runAnalysis(new File(path), MemoryConfig.getMemoryConfig());
        } catch (Throwable th) {
            C16880lQ.LLLZZIL(new File(path));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("runAnalysis fail! delete file ");
            LIZ2.append(th.toString());
            C39596FgO.LIZ(X1D.LIZIZ(LIZ2));
        }
        C39591FgJ.LJFF = false;
    }

    public final void setHandler(Handler handler2) {
        handler = handler2;
    }

    public final void setHasExcuteBackgroud(boolean z) {
        hasExcuteBackgroud = z;
    }

    public final void setRetryCount(int i) {
        retryCount = i;
    }

    public final void setTrySumTime(long j) {
        trySumTime = j;
    }

    public final void tryInstall(Context context) {
        boolean z;
        SharedPreferences LIZIZ;
        if ("local_test".equals(EF7.LJIILIIL)) {
            try {
                C39595FgN.LIZ = true;
                if (context == null || (LIZIZ = F9J.LIZIZ(context, 0, "LeakDetectorSp")) == null) {
                    z = true;
                } else {
                    z = LIZIZ.getBoolean("open_leak_detector_on_local_test", true);
                }
                C39595FgN.LIZ = z;
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SPHelper crash!\n");
                LIZ.append(th);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ));
                int i = retryCount;
                retryCount = i + 1;
                if (i < 1) {
                    new IDHandlerS19S0100000_6(context, C16880lQ.LLJJJJ(), 2).sendEmptyMessageDelayed(0, 10000L);
                    return;
                }
                return;
            }
        }
        IDHandlerS19S0100000_6 iDHandlerS19S0100000_6 = new IDHandlerS19S0100000_6(context, C16880lQ.LLJJJJ(), 1);
        handler = iDHandlerS19S0100000_6;
        iDHandlerS19S0100000_6.sendEmptyMessageDelayed(0, 10000L);
    }

    public final void excuteStrategy(Context context, int i) {
        o.LJIIJ(context, "context");
        C10K.LIZJ(new ACallableS78S0101000_6(i, context, 1));
    }

    public final void install(Context context, int i) {
        Context context2 = null;
        if (context != null) {
            context2 = C16880lQ.LLLLL(context);
        }
        if (!(context2 instanceof Application) || context2 == null) {
            return;
        }
        if ((i & 2) != 0) {
            try {
                F9S.LIZIZ = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new F9S(context));
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Leak detector install failed\n");
                LIZ.append(Log.getStackTraceString(th));
                C39596FgO.LIZ(X1D.LIZIZ(LIZ));
                return;
            }
        }
        if ((i & 8) != 0) {
            o.LJIIJ(context, "context");
            C39591FgJ.LIZLLL = context;
            if (!C39591FgJ.LJ) {
                HandlerThread handlerThread = C39591FgJ.LIZIZ;
                handlerThread.start();
                HandlerC39590FgI handlerC39590FgI = new HandlerC39590FgI(handlerThread.getLooper());
                C39591FgJ.LIZJ = handlerC39590FgI;
                handlerC39590FgI.sendEmptyMessageDelayed(0, 180000L);
                C39591FgJ.LJ = true;
            }
        }
        INSTANCE.runInbackground(context, i);
        if (!C39598FgQ.LIZ) {
            return;
        }
        FdLeakDetector.INSTANCE.install();
    }

    public final void runInbackground(Context context, int i) {
        o.LJIIJ(context, "context");
        if (EF7.LJIIIZ > 0) {
            C84763XOl.LJI().LJJJJZI(new AfS37S0101000_6(context, i, 0));
        } else {
            excuteStrategy(context, i);
        }
    }
}
