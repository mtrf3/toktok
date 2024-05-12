package com.ss.android.agilelogger;

import X.C03660Ck;
import X.C0IG;
import X.C0IH;
import X.C0II;
import X.C0IJ;
import X.C0IK;
import X.C0IL;
import X.C0IM;
import X.C15280iq;
import X.C16880lQ;
import X.C34331Ddf;
import X.C36706Eas;
import X.C40010Fn4;
import X.C42398GkU;
import X.C52701KmH;
import X.C64373POf;
import X.C66003PvL;
import X.C66004PvM;
import X.C66007PvP;
import X.C66008PvQ;
import X.C66009PvR;
import X.C66013PvV;
import X.C66016PvY;
import X.C66017PvZ;
import X.C66019Pvb;
import X.C78605Ut7;
import X.C78929UyL;
import X.EXI;
import X.EnumC66006PvO;
import X.InterfaceC15270ip;
import X.InterfaceC66023Pvf;
import X.InterfaceC66024Pvg;
import X.JBR;
import X.PN1;
import X.RunnableC66005PvN;
import X.ThreadFactoryC66012PvU;
import X.UC0;
import X.X1D;
import Y.ARunnableS18S0000000_11;
import Y.ARunnableS1S2000000_11;
import Y.IDHandlerS10S0000000_11;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import defpackage.a1;
import defpackage.b1;
import defpackage.i0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class ALog {
    public static volatile Set<String> mBlockTagSet = null;
    public static int prio = 3;
    public static Handler sAsyncHandler;
    public static HandlerThread sAsyncLogThread;
    public static C66004PvM sConfig;
    public static volatile boolean sDebug;
    public static volatile InterfaceC66024Pvg sILogCacheCallback;
    public static volatile boolean sInitSuccess;
    public static volatile List<InterfaceC66023Pvf> sINativeFuncAddrCallbackList = new ArrayList();
    public static ScheduledExecutorService sOuterExecutorService = null;
    public static Alog mainThreadRef = null;
    public static ArrayList<WeakReference<Alog>> sStandaloneInstances = new ArrayList<>();
    public static ExecutorService sSingleThreadExecutor = null;
    public static boolean sInitialized = false;
    public static Object sInitLock = new Object();
    public static final ThreadLocal<Long> sThreadId = new C36706Eas();

    public static void d(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(str, str2);
    }

    public static void e(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
    }

    public static void forceLogSharding() {
    }

    public static void i(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
    }

    public static int level2AlogCoreLevel(int i) {
        return i - 2;
    }

    public static void setILogCacheCallback(InterfaceC66024Pvg interfaceC66024Pvg) {
    }

    public static void setPrintStackTrace(boolean z) {
    }

    public static void setsPackageClassName(String str) {
    }

    public static void v(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(str, str2);
    }

    public static void w(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str, str2);
    }

    public static void asyncFlush() {
        Alog alog;
        ExecutorService executorService = sSingleThreadExecutor;
        if (executorService != null) {
            executorService.execute(new ARunnableS18S0000000_11(15));
        } else {
            Handler handler = sAsyncHandler;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
        }
        C15280iq.LIZ();
        Alog alog2 = mainThreadRef;
        if (alog2 != null) {
            alog2.LIZ();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            WeakReference<Alog> next = it.next();
            if (next != null && (alog = next.get()) != null) {
                alog.LIZ();
            }
        }
    }

    public static void destroy() {
        Alog.nativeSetDefaultInstance(0L);
        C15280iq.LIZ.LIZIZ();
        C15280iq.LIZ = null;
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.LIZIZ();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
        ExecutorService executorService = sSingleThreadExecutor;
        if (executorService != null) {
            executorService.shutdown();
            sSingleThreadExecutor = null;
        }
    }

    public static void flush() {
        ExecutorService executorService = sSingleThreadExecutor;
        if (executorService != null) {
            executorService.execute(new ARunnableS18S0000000_11(14));
        }
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C15280iq.LIZ();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.LIZ();
        }
    }

    public static long getALogSimpleWriteFuncAddr() {
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            return alog.LJFF();
        }
        return 0L;
    }

    public static long getALogWriteFuncAddr() {
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            return alog.LJ();
        }
        return 0L;
    }

    public static long getAlogNativeFlushV2FuncAddr() {
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            return alog.LIZJ();
        }
        return 0L;
    }

    public static long getAlogNativeLogStoreDirFuncAddr() {
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            return alog.LIZLLL();
        }
        return 0L;
    }

    public static HashMap<String, String> getLastFetchErrorInfo() {
        if (C15280iq.LIZ != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("start", Long.toString(C78929UyL.LJLJI));
            hashMap.put("end", Long.toString(C78929UyL.LJLJJI));
            hashMap.put("reason", C78929UyL.LJLJJLL);
            if (C78929UyL.LJLJJL != null) {
                StringBuilder sb = new StringBuilder();
                Iterator it = C78929UyL.LJLJJL.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.endsWith(".alog.hot")) {
                        str = str.substring(0, str.length() - 9);
                    }
                    sb.append(str);
                    sb.append(";");
                }
                hashMap.put("file", sb.toString());
            }
            C78929UyL.LJLJJLL = null;
            C78929UyL.LJLJJL = null;
            return hashMap;
        }
        return C03660Ck.LIZJ("reason", "Log.instance does not exist");
    }

    public static long getThreadId() {
        return sThreadId.get().longValue();
    }

    public static void release() {
        Alog.nativeSetDefaultInstance(0L);
        C15280iq.LIZ.LIZIZ();
        C15280iq.LIZ = null;
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.LIZIZ();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
        ExecutorService executorService = sSingleThreadExecutor;
        if (executorService != null) {
            executorService.shutdown();
            sSingleThreadExecutor = null;
        }
    }

    public static void syncFlush() {
        ExecutorService executorService = sSingleThreadExecutor;
        if (executorService != null) {
            executorService.execute(new ARunnableS18S0000000_11(12));
        }
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJIIIZ();
        }
        Alog alog2 = mainThreadRef;
        if (alog2 != null) {
            alog2.LJIIIZ();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog3 = it.next().get();
            if (alog3 != null) {
                alog3.LJIIIZ();
            }
        }
    }

    public static String getStatus() {
        try {
            return C15280iq.LIZLLL();
        } catch (Exception unused) {
            return "getStatus exception";
        }
    }

    public static Set<String> getBlockTagSet() {
        return mBlockTagSet;
    }

    public static List<InterfaceC66023Pvf> getNativeFuncAddrCallbackList() {
        return sINativeFuncAddrCallbackList;
    }

    public static boolean isInitSuccess() {
        return sInitSuccess;
    }

    public static void addMessageInterceptor(InterfaceC15270ip interfaceC15270ip) {
        if (interfaceC15270ip == null) {
            return;
        }
        if (Alog.LJIILJJIL == null) {
            Alog.LJIILJJIL = new CopyOnWriteArrayList();
        }
        if (((CopyOnWriteArrayList) Alog.LJIILJJIL).contains(interfaceC15270ip)) {
            return;
        }
        ((CopyOnWriteArrayList) Alog.LJIILJJIL).add(interfaceC15270ip);
    }

    public static void addNativeFuncAddrCallback(InterfaceC66023Pvf interfaceC66023Pvf) {
        sINativeFuncAddrCallbackList.add(interfaceC66023Pvf);
    }

    public static void changeLevel(int i) {
        prio = i;
        int level2AlogCoreLevel = level2AlogCoreLevel(i);
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJII(level2AlogCoreLevel);
        }
        Alog alog2 = mainThreadRef;
        if (alog2 != null) {
            alog2.LJII(level2AlogCoreLevel(i));
        }
    }

    public static void handleAsyncLog(C66009PvR c66009PvR) {
        String LJFF;
        int level2AlogCoreLevel = level2AlogCoreLevel(c66009PvR.LIZ);
        String str = "";
        EnumC66006PvO enumC66006PvO = c66009PvR.LJ;
        if (enumC66006PvO == null) {
            if (c66009PvR.LIZLLL == null) {
                str = c66009PvR.LIZJ;
            } else {
                if (c66009PvR.LIZJ == null) {
                    LJFF = "";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LJFF = JBR.LJFF(LIZ, c66009PvR.LIZJ, "\n", LIZ);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJFF);
                LIZ2.append(PN1.LIZ(c66009PvR.LIZLLL));
                str = X1D.LIZIZ(LIZ2);
            }
        } else {
            EnumC66006PvO enumC66006PvO2 = EnumC66006PvO.BORDER;
            if (enumC66006PvO == enumC66006PvO2) {
                str = C66007PvP.LIZJ(enumC66006PvO2, c66009PvR.LIZJ);
            } else {
                EnumC66006PvO enumC66006PvO3 = EnumC66006PvO.JSON;
                if (enumC66006PvO == enumC66006PvO3) {
                    str = C66007PvP.LIZJ(enumC66006PvO3, c66009PvR.LIZJ);
                } else {
                    EnumC66006PvO enumC66006PvO4 = EnumC66006PvO.BUNDLE;
                    if (enumC66006PvO == enumC66006PvO4) {
                        str = C66007PvP.LIZIZ(enumC66006PvO4, (Bundle) c66009PvR.LJFF);
                    } else {
                        EnumC66006PvO enumC66006PvO5 = EnumC66006PvO.INTENT;
                        if (enumC66006PvO == enumC66006PvO5) {
                            str = C66007PvP.LIZ(enumC66006PvO5, (Intent) c66009PvR.LJFF);
                        } else {
                            EnumC66006PvO enumC66006PvO6 = EnumC66006PvO.THROWABLE;
                            if (enumC66006PvO == enumC66006PvO6) {
                                str = C66007PvP.LJ(enumC66006PvO6, (Throwable) c66009PvR.LJFF);
                            } else {
                                EnumC66006PvO enumC66006PvO7 = EnumC66006PvO.THREAD;
                                if (enumC66006PvO == enumC66006PvO7) {
                                    str = C66007PvP.LIZLLL(enumC66006PvO7, (Thread) c66009PvR.LJFF);
                                } else {
                                    EnumC66006PvO enumC66006PvO8 = EnumC66006PvO.STACKTRACE;
                                    if (enumC66006PvO == enumC66006PvO8) {
                                        str = C66007PvP.LJFF(enumC66006PvO8, (StackTraceElement[]) c66009PvR.LJFF);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String str2 = c66009PvR.LIZIZ;
        long j = c66009PvR.LJI;
        long j2 = c66009PvR.LJII;
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJIIL(level2AlogCoreLevel, j, j2, str2, str);
        }
        c66009PvR.LIZIZ = null;
        c66009PvR.LIZJ = null;
        c66009PvR.LIZLLL = null;
        c66009PvR.LJ = null;
        c66009PvR.LJFF = null;
        c66009PvR.LJI = -1L;
        c66009PvR.LJII = 0L;
        c66009PvR.LJIIIIZZ = null;
        synchronized (C66009PvR.LJIIIZ) {
            int i = C66009PvR.LJIIJJI;
            if (i < 50) {
                c66009PvR.LJIIIIZZ = C66009PvR.LJIIJ;
                C66009PvR.LJIIJ = c66009PvR;
                C66009PvR.LJIIJJI = i + 1;
            }
        }
    }

    public static void handleItemMsg(C66019Pvb c66019Pvb) {
        String LJFF;
        switch (C66008PvQ.LIZ[c66019Pvb.LIZLLL.ordinal()]) {
            case 1:
                LJFF = (String) c66019Pvb.LJ;
                break;
            case 2:
                LJFF = PN1.LIZ((Throwable) c66019Pvb.LJ);
                break;
            case 3:
            case 4:
                LJFF = C66007PvP.LIZJ(c66019Pvb.LIZLLL, (String) c66019Pvb.LJ);
                break;
            case 5:
                LJFF = C66007PvP.LIZIZ(c66019Pvb.LIZLLL, (Bundle) c66019Pvb.LJ);
                break;
            case 6:
                LJFF = C66007PvP.LIZ(c66019Pvb.LIZLLL, (Intent) c66019Pvb.LJ);
                break;
            case 7:
                LJFF = C66007PvP.LJ(c66019Pvb.LIZLLL, (Throwable) c66019Pvb.LJ);
                break;
            case 8:
                LJFF = C66007PvP.LIZLLL(c66019Pvb.LIZLLL, (Thread) c66019Pvb.LJ);
                break;
            case 9:
                LJFF = C66007PvP.LJFF(c66019Pvb.LIZLLL, (StackTraceElement[]) c66019Pvb.LJ);
                break;
            default:
                LJFF = "";
                break;
        }
        c66019Pvb.LIZJ = LJFF;
    }

    public static boolean init(C66004PvM c66004PvM) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        C0II c0ii;
        C0IL c0il;
        C0IG c0ig;
        long j;
        C0II c0ii2;
        C0IL c0il2;
        C0IG c0ig2;
        if (c66004PvM == null) {
            return false;
        }
        sConfig = c66004PvM;
        try {
            Alog.LJI(new C78605Ut7());
            synchronized (sInitLock) {
                if (sInitialized) {
                    return false;
                }
                sInitialized = true;
                prio = c66004PvM.LJIIIIZZ;
                Context context = c66004PvM.LIZ;
                String LIZ = EXI.LIZ();
                if (LIZ == null || LIZ.contains(":") || (!LIZ.equals(context.getPackageName()) && !LIZ.equals(context.getApplicationInfo().processName))) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = c66004PvM.LJIIJJI;
                if (!z3 && c66004PvM.LJIIJ && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = c66004PvM.LJIIL;
                if (!z) {
                    c66004PvM.LIZJ = (int) (c66004PvM.LIZJ * c66004PvM.LJIILL);
                }
                C0IH c0ih = new C0IH(c66004PvM.LIZ);
                c0ih.LIZIZ("default");
                c0ih.LIZIZ = level2AlogCoreLevel(c66004PvM.LJIIIIZZ);
                c0ih.LIZJ = sDebug;
                c0ih.LJ = c66004PvM.LJFF;
                c0ih.LJFF = c66004PvM.LIZLLL;
                if (z2) {
                    i = (c66004PvM.LIZJ / 3) * 2;
                } else {
                    i = c66004PvM.LIZJ;
                }
                c0ih.LJI = i;
                c0ih.LJII = c66004PvM.LIZIZ;
                c0ih.LJIIIIZZ = c66004PvM.LJ;
                if (z) {
                    i2 = c66004PvM.LJIILJJIL * 1024;
                } else {
                    i2 = 32768;
                }
                c0ih.LJIIIZ = i2;
                if (z) {
                    i3 = c66004PvM.LJIILJJIL * 3 * 1024;
                } else {
                    i3 = 65536;
                }
                c0ih.LJIIJ = i3;
                C0IJ c0ij = C0IJ.SAFE;
                c0ih.LJIIL = c0ij.value;
                C0IM c0im = C0IM.RAW;
                c0ih.LJIILIIL = c0im.value;
                C0IK c0ik = C0IK.LEGACY;
                c0ih.LJIILJJIL = c0ik.value;
                if (c66004PvM.LJI) {
                    c0ii = C0II.ZSTD;
                } else {
                    c0ii = C0II.NONE;
                }
                c0ih.LJIILL = c0ii.value;
                boolean z5 = c66004PvM.LJII;
                if (z5) {
                    c0il = C0IL.TEA_16;
                } else {
                    c0il = C0IL.NONE;
                }
                c0ih.LJIILLIIL = c0il.value;
                if (z5) {
                    c0ig = C0IG.EC_SECP256K1;
                } else {
                    c0ig = C0IG.NONE;
                }
                c0ih.LJIIZILJ = c0ig.value;
                c0ih.LJIJ = c66004PvM.LJIIIZ;
                c0ih.LJIJI = c66004PvM.LJIILLIIL;
                Alog LIZ2 = c0ih.LIZ();
                C15280iq.LIZ = LIZ2;
                if (LIZ2 == null) {
                    j = 0;
                } else {
                    j = LIZ2.LJII;
                }
                Alog.nativeSetDefaultInstance(j);
                if (z3 && z) {
                    if (z4) {
                        sSingleThreadExecutor = C16880lQ.LLLLZLLLI(new ThreadFactoryC66012PvU());
                    } else {
                        HandlerThread handlerThread = new HandlerThread("Alog_main_delegate");
                        sAsyncLogThread = handlerThread;
                        handlerThread.start();
                        sAsyncHandler = new IDHandlerS10S0000000_11(sAsyncLogThread.getLooper(), 1);
                    }
                }
                if (z2) {
                    C0IH c0ih2 = new C0IH(c66004PvM.LIZ);
                    c0ih2.LIZIZ("main");
                    c0ih2.LIZIZ = level2AlogCoreLevel(c66004PvM.LJIIIIZZ);
                    c0ih2.LIZJ = sDebug;
                    c0ih2.LJ = c66004PvM.LJFF;
                    c0ih2.LJFF = c66004PvM.LIZLLL / 2;
                    c0ih2.LJI = c66004PvM.LIZJ / 3;
                    c0ih2.LJII = c66004PvM.LIZIZ;
                    c0ih2.LJIIIIZZ = c66004PvM.LJ;
                    c0ih2.LJIIIZ = 32768;
                    c0ih2.LJIIJ = 98304;
                    c0ih2.LJIIL = c0ij.value;
                    c0ih2.LJIILIIL = c0im.value;
                    c0ih2.LJIILJJIL = c0ik.value;
                    if (c66004PvM.LJI) {
                        c0ii2 = C0II.ZSTD;
                    } else {
                        c0ii2 = C0II.NONE;
                    }
                    c0ih2.LJIILL = c0ii2.value;
                    boolean z6 = c66004PvM.LJII;
                    if (z6) {
                        c0il2 = C0IL.TEA_16;
                    } else {
                        c0il2 = C0IL.NONE;
                    }
                    c0ih2.LJIILLIIL = c0il2.value;
                    if (z6) {
                        c0ig2 = C0IG.EC_SECP256K1;
                    } else {
                        c0ig2 = C0IG.NONE;
                    }
                    c0ih2.LJIIZILJ = c0ig2.value;
                    c0ih2.LJIJ = c66004PvM.LJIIIZ;
                    c0ih2.LJIJI = c66004PvM.LJIILLIIL;
                    mainThreadRef = c0ih2.LIZ();
                }
                String str = c66004PvM.LJ;
                String str2 = c66004PvM.LJFF;
                if (getNativeFuncAddrCallbackList().size() > 0) {
                    ARunnableS1S2000000_11 aRunnableS1S2000000_11 = new ARunnableS1S2000000_11(str, str2, 0);
                    ScheduledExecutorService scheduledExecutorService = sOuterExecutorService;
                    if (scheduledExecutorService == null) {
                        new PthreadThread(aRunnableS1S2000000_11, "_ALOG_OPT_").start();
                    } else {
                        scheduledExecutorService.execute(aRunnableS1S2000000_11);
                    }
                } else {
                    ScheduledExecutorService scheduledExecutorService2 = sOuterExecutorService;
                    if (scheduledExecutorService2 == null) {
                        new PthreadTimer("_ALOG_OPT_").schedule(new C66013PvV(str, str2), LivePlayEnforceIntervalSetting.DEFAULT);
                    } else {
                        scheduledExecutorService2.schedule(new ARunnableS1S2000000_11(str, str2, 1), 15L, TimeUnit.SECONDS);
                    }
                }
                sInitSuccess = true;
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void removeMessageInterceptor(InterfaceC15270ip interfaceC15270ip) {
        if (interfaceC15270ip == null || Alog.LJIILJJIL == null) {
            return;
        }
        ((CopyOnWriteArrayList) Alog.LJIILJJIL).remove(interfaceC15270ip);
    }

    public static void setBlockTagSet(Set<String> set) {
        mBlockTagSet = Collections.unmodifiableSet(set);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
        boolean z2 = sDebug;
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJIIIIZZ(z2);
        }
        Alog alog2 = mainThreadRef;
        if (alog2 != null) {
            alog2.LJIIIIZZ(sDebug);
        }
    }

    public static void setOuterExecutorService(ScheduledExecutorService scheduledExecutorService) {
        sOuterExecutorService = scheduledExecutorService;
    }

    public static void timedSyncFlush(int i) {
        ExecutorService executorService = sSingleThreadExecutor;
        if (executorService != null) {
            executorService.execute(new ARunnableS18S0000000_11(13));
        }
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJIIJ(i);
        }
        Alog alog2 = mainThreadRef;
        if (alog2 != null) {
            alog2.LJIIJ(i);
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog3 = it.next().get();
            if (alog3 != null) {
                alog3.LJIIJ(i);
            }
        }
    }

    public static void writeCachedItems(Queue<C66019Pvb> queue) {
        for (C66019Pvb c66019Pvb : queue) {
            if (checkPrioAndTag(c66019Pvb.LIZ, c66019Pvb.LIZIZ)) {
                handleItemMsg(c66019Pvb);
                C15280iq.LJFF(level2AlogCoreLevel(c66019Pvb.LIZ), c66019Pvb.LIZIZ, c66019Pvb.LIZJ);
            }
        }
    }

    public static boolean checkPrioAndTag(int i, String str) {
        if (i < prio) {
            return false;
        }
        Set<String> set = mBlockTagSet;
        if (set != null && !TextUtils.isEmpty(str) && set.contains(str)) {
            return false;
        }
        return true;
    }

    public static void com_ss_android_agilelogger_ALog__d$___twin___(String str, String str2) {
        if (checkPrioAndTag(3, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(3, str, str2);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(3, str, str2);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(3, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(3, str, str2);
                    return;
                }
            }
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(1, str, str2);
            } else {
                C15280iq.LJIIIIZZ(1, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__e$___twin___(String str, String str2) {
        if (checkPrioAndTag(6, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, str2);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(6, str, str2);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(6, str, str2);
                    return;
                }
            }
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(4, str, str2);
            } else {
                C15280iq.LJIIIIZZ(4, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__i$___twin___(String str, String str2) {
        if (checkPrioAndTag(4, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(4, str, str2);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(4, str, str2);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(4, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(4, str, str2);
                    return;
                }
            }
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(2, str, str2);
            } else {
                C15280iq.LJIIIIZZ(2, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__v$___twin___(String str, String str2) {
        if (checkPrioAndTag(2, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(2, str, str2);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(2, str, str2);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(2, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(2, str, str2);
                    return;
                }
            }
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(0, str, str2);
            } else {
                C15280iq.LJIIIIZZ(0, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__w$___twin___(String str, String str2) {
        if (checkPrioAndTag(5, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, str2);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(5, str, str2);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(5, str, str2);
                    return;
                }
            }
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(3, str, str2);
            } else {
                C15280iq.LJIIIIZZ(3, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(String str, String str2) {
        C52701KmH.LIZ.getClass();
        if (C52701KmH.LIZ() <= C52701KmH.LIZJ && !C40010Fn4.LIZJ().LIZIZ() && !C34331Ddf.LIZ()) {
            com_ss_android_agilelogger_ALog__d$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(String str, String str2) {
        C52701KmH.LIZ.getClass();
        if (C52701KmH.LIZ() <= C52701KmH.LJFF) {
            com_ss_android_agilelogger_ALog__e$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(String str, String str2) {
        C52701KmH.LIZ.getClass();
        if (C52701KmH.LIZ() <= C52701KmH.LIZLLL && !C40010Fn4.LIZJ().LIZIZ() && !C34331Ddf.LIZ()) {
            com_ss_android_agilelogger_ALog__i$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(String str, String str2) {
        C52701KmH.LIZ.getClass();
        if (C52701KmH.LIZ() <= C52701KmH.LIZIZ && !C40010Fn4.LIZJ().LIZIZ() && !C34331Ddf.LIZ()) {
            com_ss_android_agilelogger_ALog__v$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(String str, String str2) {
        C52701KmH.LIZ.getClass();
        if (C52701KmH.LIZ() <= C52701KmH.LJ && !C40010Fn4.LIZJ().LIZIZ() && !C34331Ddf.LIZ()) {
            com_ss_android_agilelogger_ALog__w$___twin___(str, str2);
        }
    }

    public static C64373POf createInstance(String str, C66004PvM c66004PvM) {
        String str2;
        String str3;
        C0II c0ii;
        C0IL c0il;
        C0IG c0ig;
        if (c66004PvM == null) {
            return null;
        }
        if (!sInitSuccess) {
            try {
                Alog.LJI(new C78605Ut7());
            } catch (Throwable unused) {
                return null;
            }
        }
        C0IH c0ih = new C0IH(c66004PvM.LIZ);
        c0ih.LIZIZ(str);
        c0ih.LIZIZ = level2AlogCoreLevel(c66004PvM.LJIIIIZZ);
        c0ih.LIZJ = sDebug;
        C66004PvM c66004PvM2 = sConfig;
        if (c66004PvM2 != null) {
            str2 = c66004PvM2.LJFF;
        } else {
            str2 = c66004PvM.LJFF;
        }
        c0ih.LJ = str2;
        c0ih.LJFF = c66004PvM.LIZLLL;
        c0ih.LJI = c66004PvM.LIZJ;
        c0ih.LJII = c66004PvM.LIZIZ;
        if (c66004PvM2 != null) {
            str3 = c66004PvM2.LJ;
        } else {
            str3 = c66004PvM.LJ;
        }
        c0ih.LJIIIIZZ = str3;
        c0ih.LJIIIZ = 65536;
        c0ih.LJIIJ = 196608;
        c0ih.LJIIL = C0IJ.SAFE.value;
        c0ih.LJIILIIL = C0IM.RAW.value;
        c0ih.LJIILJJIL = C0IK.LEGACY.value;
        if (c66004PvM.LJI) {
            c0ii = C0II.ZSTD;
        } else {
            c0ii = C0II.NONE;
        }
        c0ih.LJIILL = c0ii.value;
        boolean z = c66004PvM.LJII;
        if (z) {
            c0il = C0IL.TEA_16;
        } else {
            c0il = C0IL.NONE;
        }
        c0ih.LJIILLIIL = c0il.value;
        if (z) {
            c0ig = C0IG.EC_SECP256K1;
        } else {
            c0ig = C0IG.NONE;
        }
        c0ih.LJIIZILJ = c0ig.value;
        c0ih.LJIJ = c66004PvM.LJIIIZ;
        c0ih.LJIJI = c66004PvM.LJIILLIIL;
        Alog LIZ = c0ih.LIZ();
        if (LIZ == null) {
            return null;
        }
        sStandaloneInstances.add(new WeakReference<>(LIZ));
        return new C64373POf(LIZ);
    }

    public static void e(String str, Throwable th) {
        if (checkPrioAndTag(6, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, null, th, null, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(6, str, null, th, null, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, null, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(6, str, null, th, null, null);
                    return;
                }
            }
            String LIZ = PN1.LIZ(th);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(4, str, LIZ);
            } else {
                C15280iq.LJIIIIZZ(4, str, LIZ);
            }
        }
    }

    public static List<String> getALogFiles(long j, long j2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        try {
            Alog alog = C15280iq.LIZ;
            if (alog != null) {
                fileArr = C78929UyL.LJIIL(j3, j4, alog.LIZIZ, null, null);
            } else {
                fileArr = new File[0];
            }
            for (File file : fileArr) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void removeLegacyFiles(String str, String str2) {
        File[] listFiles;
        File[] listFiles2;
        File file = new File(str);
        if (file.exists() && (listFiles2 = file.listFiles(new C66017PvZ())) != null) {
            for (File file2 : listFiles2) {
                C16880lQ.LLLZZIL(file2);
            }
        }
        File file3 = new File(str2);
        if (file3.exists() && (listFiles = file3.listFiles(new C66016PvY())) != null) {
            for (File file4 : listFiles) {
                C16880lQ.LLLZZIL(file4);
            }
        }
    }

    public static void w(String str, Throwable th) {
        if (checkPrioAndTag(5, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, null, th, null, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(5, str, null, th, null, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, null, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(5, str, null, th, null, null);
                    return;
                }
            }
            String LIZ = PN1.LIZ(th);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(3, str, LIZ);
            } else {
                C15280iq.LJIIIIZZ(3, str, LIZ);
            }
        }
    }

    public static C64373POf createInstance(String str, Context context) {
        if (context == null) {
            return null;
        }
        return createInstance(str, new C66003PvL(context).LIZ());
    }

    public static void bundle(int i, String str, Bundle bundle) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.BUNDLE, bundle);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.BUNDLE, bundle);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.BUNDLE, bundle);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.BUNDLE, bundle);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LIZIZ2 = C66007PvP.LIZIZ(EnumC66006PvO.BUNDLE, bundle);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LIZIZ2);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LIZIZ2);
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (checkPrioAndTag(6, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, str2, th, null, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(6, str, str2, th, null, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, str2, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(6, str, str2, th, null, null);
                    return;
                }
            }
            StringBuilder LIZJ = b1.LIZJ(str2, "\n");
            LIZJ.append(PN1.LIZ(th));
            String LIZIZ2 = X1D.LIZIZ(LIZJ);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(4, str, LIZIZ2);
            } else {
                C15280iq.LJIIIIZZ(4, str, LIZIZ2);
            }
        }
    }

    public static void header(int i, String str, String str2) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, str2, null, EnumC66006PvO.BORDER, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, str2, null, EnumC66006PvO.BORDER, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, str2, null, EnumC66006PvO.BORDER, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, str2, null, EnumC66006PvO.BORDER, null);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LIZJ = C66007PvP.LIZJ(EnumC66006PvO.BORDER, str2);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LIZJ);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LIZJ);
            }
        }
    }

    public static void intent(int i, String str, Intent intent) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.INTENT, intent);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.INTENT, intent);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.INTENT, intent);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.INTENT, intent);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LIZ = C66007PvP.LIZ(EnumC66006PvO.INTENT, intent);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LIZ);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LIZ);
            }
        }
    }

    public static void json(int i, String str, String str2) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, str2, null, EnumC66006PvO.JSON, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, str2, null, EnumC66006PvO.JSON, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, str2, null, EnumC66006PvO.JSON, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, str2, null, EnumC66006PvO.JSON, null);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LIZJ = C66007PvP.LIZJ(EnumC66006PvO.JSON, str2);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LIZJ);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LIZJ);
            }
        }
    }

    public static void postAsyncLog(int i, String str, String str2) {
        postAsyncLog(i, str, str2, null, null, null);
    }

    public static void postAsyncLogByThreadPool(int i, String str, String str2) {
        postAsyncLogByThreadPool(i, str, str2, null, null, null);
    }

    public static void removeObsoleteInstance(String str, Context context, boolean z) {
        String absolutePath;
        String LJJ;
        String LIZ = EXI.LIZ();
        if (LIZ == null || LIZ.contains(":")) {
            return;
        }
        if (!z) {
            LIZ = C42398GkU.LIZIZ(LIZ, '-');
        }
        C66004PvM c66004PvM = sConfig;
        if (c66004PvM != null) {
            absolutePath = c66004PvM.LJFF;
            LJJ = c66004PvM.LJ;
        } else {
            File file = new File(C16880lQ.LLIIJLIL(context), "logs");
            if (!file.exists()) {
                file.mkdir();
            }
            absolutePath = file.getAbsolutePath();
            LJJ = UC0.LJJ(context);
        }
        File file2 = new File(absolutePath);
        if (!file2.exists() || !file2.isDirectory()) {
            return;
        }
        String LJ = a1.LJ("__", str, ".alog.hot");
        for (File file3 : file2.listFiles()) {
            String name = file3.getName();
            if (name != null && name.endsWith(LJ) && name.contains(LIZ)) {
                C16880lQ.LLLZZIL(file3);
            }
        }
        File file4 = new File(LJJ);
        if (!file4.exists() || !file4.isDirectory()) {
            return;
        }
        String LJFF = i0.LJFF("__", str);
        for (File file5 : file4.listFiles()) {
            String name2 = file5.getName();
            if (name2 != null && name2.contains(LJFF) && name2.contains(LIZ)) {
                C16880lQ.LLLZZIL(file5);
            }
        }
    }

    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.STACKTRACE, stackTraceElementArr);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.STACKTRACE, stackTraceElementArr);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.STACKTRACE, stackTraceElementArr);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.STACKTRACE, stackTraceElementArr);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LJFF = C66007PvP.LJFF(EnumC66006PvO.STACKTRACE, stackTraceElementArr);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LJFF);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LJFF);
            }
        }
    }

    public static void statcktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        stacktrace(i, str, stackTraceElementArr);
    }

    public static void thread(int i, String str, Thread thread) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.THREAD, thread);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.THREAD, thread);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC66006PvO.THREAD, thread);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.THREAD, thread);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LIZLLL = C66007PvP.LIZLLL(EnumC66006PvO.THREAD, thread);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LIZLLL);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LIZLLL);
            }
        }
    }

    public static void throwable(int i, String str, Throwable th) {
        if (checkPrioAndTag(i, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, th, EnumC66006PvO.THROWABLE, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, null, th, EnumC66006PvO.THROWABLE, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, th, EnumC66006PvO.THROWABLE, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC66006PvO.THROWABLE, th);
                    return;
                }
            }
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            String LJ = C66007PvP.LJ(EnumC66006PvO.THROWABLE, th);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LJ);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LJ);
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (checkPrioAndTag(5, str)) {
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, str2, th, null, null);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(5, str, str2, th, null, null);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, str2, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(5, str, str2, th, null, null);
                    return;
                }
            }
            StringBuilder LIZJ = b1.LIZJ(str2, "\n");
            LIZJ.append(PN1.LIZ(th));
            String LIZIZ2 = X1D.LIZIZ(LIZJ);
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(3, str, LIZIZ2);
            } else {
                C15280iq.LJIIIIZZ(3, str, LIZIZ2);
            }
        }
    }

    public static List<String> getALogFiles(String str, String str2, long j, long j2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        try {
            Alog alog = C15280iq.LIZ;
            if (alog != null) {
                fileArr = C78929UyL.LJIIL(j3, j4, alog.LIZIZ, str, str2);
            } else {
                fileArr = new File[0];
            }
            for (File file : fileArr) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void println(int i, String str, Object obj, EnumC66006PvO enumC66006PvO) {
        String LJFF;
        if (checkPrioAndTag(i, str)) {
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            switch (C66008PvQ.LIZ[enumC66006PvO.ordinal()]) {
                case 1:
                    LJFF = (String) obj;
                    break;
                case 2:
                    LJFF = PN1.LIZ((Throwable) obj);
                    break;
                case 3:
                    LJFF = C66007PvP.LIZJ(EnumC66006PvO.BORDER, (String) obj);
                    break;
                case 4:
                    LJFF = C66007PvP.LIZJ(EnumC66006PvO.JSON, (String) obj);
                    break;
                case 5:
                    LJFF = C66007PvP.LIZIZ(EnumC66006PvO.BUNDLE, (Bundle) obj);
                    break;
                case 6:
                    LJFF = C66007PvP.LIZ(EnumC66006PvO.INTENT, (Intent) obj);
                    break;
                case 7:
                    LJFF = C66007PvP.LJ(EnumC66006PvO.THROWABLE, (Throwable) obj);
                    break;
                case 8:
                    LJFF = C66007PvP.LIZLLL(EnumC66006PvO.THREAD, (Thread) obj);
                    break;
                case 9:
                    LJFF = C66007PvP.LJFF(EnumC66006PvO.STACKTRACE, (StackTraceElement[]) obj);
                    break;
                default:
                    LJFF = "";
                    break;
            }
            C66004PvM c66004PvM = sConfig;
            if (c66004PvM != null) {
                if (c66004PvM.LJIILIIL && sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, LJFF);
                    return;
                } else if (c66004PvM.LJIILIIL && sAsyncHandler != null) {
                    postAsyncLog(i, str, LJFF);
                    return;
                }
            }
            boolean LIZIZ = EXI.LIZIZ();
            if (LIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, LJFF);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, LJFF);
                    return;
                }
            }
            Alog alog = mainThreadRef;
            if (alog != null && LIZIZ) {
                alog.LJIIJJI(level2AlogCoreLevel, str, LJFF);
            } else {
                C15280iq.LJFF(level2AlogCoreLevel, str, LJFF);
            }
        }
    }

    public static void writeAsyncLog(int i, String str, String str2, long j, long j2) {
        int level2AlogCoreLevel = level2AlogCoreLevel(i);
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJIIL(level2AlogCoreLevel, j, j2, str, str2);
        }
    }

    public static void postAsyncLog(int i, String str, String str2, Throwable th, EnumC66006PvO enumC66006PvO, Object obj) {
        C66009PvR c66009PvR;
        synchronized (C66009PvR.LJIIIZ) {
            c66009PvR = C66009PvR.LJIIJ;
            if (c66009PvR != null) {
                C66009PvR.LJIIJ = c66009PvR.LJIIIIZZ;
                c66009PvR.LJIIIIZZ = null;
                C66009PvR.LJIIJJI--;
            } else {
                c66009PvR = new C66009PvR();
            }
        }
        c66009PvR.LIZ = i;
        c66009PvR.LIZIZ = str;
        c66009PvR.LIZJ = str2;
        c66009PvR.LIZLLL = th;
        c66009PvR.LJ = enumC66006PvO;
        c66009PvR.LJFF = obj;
        c66009PvR.LJI = getThreadId();
        c66009PvR.LJII = System.currentTimeMillis();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = c66009PvR;
        sAsyncHandler.sendMessage(obtain);
    }

    public static void postAsyncLogByThreadPool(int i, String str, String str2, Throwable th, EnumC66006PvO enumC66006PvO, Object obj) {
        sSingleThreadExecutor.execute(new RunnableC66005PvN(i, enumC66006PvO, th, str2, obj, str, getThreadId(), System.currentTimeMillis()));
    }
}
