package com.ttnet.org.chromium.net.impl;

import J.N;
import X.C16880lQ;
import X.C78939UyV;
import X.F32;
import X.O6T;
import X.VI5;
import Y.ARunnableS18S0000000_11;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import java.io.File;

/* loaded from: classes12.dex */
public class CronetLibraryLoader {
    public static final Object LIZ = new Object();
    public static final HandlerThread LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static final ConditionVariable LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;

    static {
        C16880lQ.LJLLJ(CronetLibraryLoader.class);
        LIZIZ = new HandlerThread("CronetInit");
        LIZJ = false;
        LJ = new ConditionVariable();
    }

    public static void LIZIZ() {
        if (LIZLLL) {
            return;
        }
        LJFF = System.currentTimeMillis();
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.LJFF.LJII(true, new VI5());
        LJ.block();
        N.MyweRqSS();
        LIZLLL = true;
        LJI = System.currentTimeMillis();
    }

    public static void ensureInitializedFromNative() {
        synchronized (LIZ) {
            LIZJ = true;
            LJ.open();
        }
        LIZ(O6T.LIZ, null);
    }

    public static String getDefaultUserAgent() {
        return F32.LIZ(O6T.LIZ);
    }

    public static void LIZJ(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str = cronetEngineBuilderImpl.LJJIII;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && !file.isDirectory()) {
                Object[] objArr = {str};
                C78939UyV.LJIILIIL("cronet so load: %s", C78939UyV.LJJII(objArr), objArr);
                System.load(str);
                return;
            }
        }
        if (cronetEngineBuilderImpl.LJJIIJZLJL() != null) {
            cronetEngineBuilderImpl.LJJIIJZLJL().loadLibrary("sscronet");
        } else {
            C16880lQ.LLJJJIL("sscronet");
        }
    }

    public static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }

    public static void LIZ(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (LIZ) {
            if (!LIZLLL) {
                O6T.LIZ = context;
                HandlerThread handlerThread = LIZIZ;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                ARunnableS18S0000000_11 aRunnableS18S0000000_11 = new ARunnableS18S0000000_11(16);
                if (handlerThread.getLooper() == Looper.myLooper()) {
                    aRunnableS18S0000000_11.run();
                } else {
                    new Handler(handlerThread.getLooper()).post(aRunnableS18S0000000_11);
                }
            }
            if (!LIZJ) {
                long uptimeMillis = SystemClock.uptimeMillis();
                LIZJ(cronetEngineBuilderImpl);
                LJII = SystemClock.uptimeMillis() - uptimeMillis;
                if ("107.0.5273.2".equals(N.MVlvYo_c())) {
                    Object[] objArr = {"107.0.5273.2", System.getProperty("os.arch")};
                    C78939UyV.LJIILIIL("Cronet version: %s, arch: %s", C78939UyV.LJJII(objArr), objArr);
                    LIZJ = true;
                    LJ.open();
                } else {
                    throw new RuntimeException(C16880lQ.LLLZ("Expected Cronet version number %s, actual version number %s.", new Object[]{"107.0.5273.2", N.MVlvYo_c()}));
                }
            }
        }
    }
}
