package com.bytedance.sliver;

import X.C16880lQ;
import X.FY8;
import X.FYZ;
import X.InterfaceC39145FXx;
import X.InterfaceC39148FYa;
import Y.ARunnableS1S2100000_6;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class Sliver {
    public static volatile boolean isInit;
    public static final Field threadPeerField;
    public static final Field threadPeerFieldDalvik;
    public static final Map<Thread, FYZ> cache = new ConcurrentHashMap(16);
    public static final Map<String, Long> mark = new ConcurrentHashMap(16);
    public static final List<InterfaceC39145FXx> sListenerList = new CopyOnWriteArrayList();
    public static final boolean isArt = isArt();

    public static boolean isArt() {
        return true;
    }

    public static native void nClear(long j);

    public static native void nDump(long j, String str, long j2);

    public static native long[] nGetMethodStackTrace(Thread thread, long j);

    public static native String nGetStackTrace(Thread thread, long j);

    public static native String nGetStackTrace(long[] jArr);

    public static native String[] nGetStackTrace3(long[] jArr);

    public static native void nInit(int i, Method method, boolean z, boolean z2);

    public static native void nPause(long j);

    public static native void nResume(long j);

    public static native long nStart(Thread thread, long j, int i, int i2, int i3);

    public static native void nStop(long j);

    static {
        Field field;
        Field declaredField;
        Field field2 = null;
        try {
            if (isArt()) {
                declaredField = Thread.class.getDeclaredField("nativePeer");
            } else {
                declaredField = Thread.class.getDeclaredField("vmThread");
                try {
                    field2 = Class.forName("java.lang.VMThread").getDeclaredField("vmData");
                    field2.setAccessible(true);
                } catch (Throwable unused) {
                    field = field2;
                    field2 = declaredField;
                }
            }
            field = field2;
            field2 = declaredField;
            try {
                declaredField.setAccessible(true);
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            field = null;
        }
        threadPeerField = field2;
        threadPeerFieldDalvik = field;
    }

    public static synchronized boolean clearAll() {
        boolean clearAll;
        synchronized (Sliver.class) {
            clearAll = SliverAllThreadSupport.clearAll();
        }
        return clearAll;
    }

    public static boolean loadLibrary() {
        try {
            C16880lQ.LLJJJIL("sliver");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static synchronized boolean pauseAll() {
        boolean pauseAll;
        synchronized (Sliver.class) {
            pauseAll = SliverAllThreadSupport.pauseAll();
        }
        return pauseAll;
    }

    public static synchronized boolean resumeAll() {
        boolean resumeAll;
        synchronized (Sliver.class) {
            resumeAll = SliverAllThreadSupport.resumeAll();
        }
        return resumeAll;
    }

    public static synchronized boolean stopAll() {
        boolean stopAll;
        synchronized (Sliver.class) {
            stopAll = SliverAllThreadSupport.stopAll();
        }
        return stopAll;
    }

    public static boolean clear() {
        return clear(C16880lQ.LLLLIIIILLL());
    }

    public static boolean pause() {
        return pause(C16880lQ.LLLLIIIILLL());
    }

    public static boolean resume() {
        return resume(C16880lQ.LLLLIIIILLL());
    }

    public static boolean stop() {
        return stop(C16880lQ.LLLLIIIILLL());
    }

    public static boolean isInit() {
        return isInit;
    }

    public static synchronized boolean clear(Thread thread) {
        synchronized (Sliver.class) {
            if (!isInit) {
                return false;
            }
            FYZ fyz = cache.get(thread);
            if (fyz == null) {
                return false;
            }
            nClear(fyz.LIZ);
            return true;
        }
    }

    public static boolean dump(String str) {
        return dump(C16880lQ.LLLLIIIILLL(), str);
    }

    public static synchronized boolean dumpAll(String str) {
        boolean dumpAll;
        synchronized (Sliver.class) {
            dumpAll = dumpAll(str, false);
        }
        return dumpAll;
    }

    public static synchronized long[] getMethodStackTrace(Thread thread) {
        synchronized (Sliver.class) {
            if (!init(false)) {
                return new long[0];
            }
            long threadPeer = getThreadPeer(thread);
            if (threadPeer == 0) {
                return new long[0];
            }
            return nGetMethodStackTrace(thread, threadPeer);
        }
    }

    public static synchronized String getStackTrace(Thread thread) {
        synchronized (Sliver.class) {
            if (!init(false)) {
                return "";
            }
            long threadPeer = getThreadPeer(thread);
            if (threadPeer == 0) {
                return "";
            }
            return nGetStackTrace(thread, threadPeer);
        }
    }

    public static synchronized String[] getStackTraceArray(long[] jArr) {
        synchronized (Sliver.class) {
            if (jArr != null) {
                if (jArr.length != 0) {
                    return nGetStackTrace3(jArr);
                }
            }
            return null;
        }
    }

    public static long getThreadPeer(Thread thread) {
        Field field;
        Object obj;
        Object obj2;
        try {
            if (isArt()) {
                Field field2 = threadPeerField;
                if (field2 != null && (obj2 = field2.get(thread)) != null) {
                    return ((Long) obj2).longValue();
                }
                return 0L;
            }
            Field field3 = threadPeerField;
            if (field3 != null && (field = threadPeerFieldDalvik) != null && (obj = field.get(field3.get(thread))) != null) {
                return ((Integer) obj).intValue();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static synchronized boolean init(boolean z) {
        Method method;
        synchronized (Sliver.class) {
            int i = Build.VERSION.SDK_INT;
            if (i > 31) {
                return false;
            }
            if (isInit) {
                return true;
            }
            if (!loadLibrary()) {
                return false;
            }
            try {
                method = Looper.class.getMethod("loop", new Class[0]);
            } catch (Throwable unused) {
                method = null;
            }
            nInit(i, method, z, isArt);
            isInit = true;
            return true;
        }
    }

    public static void mark(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mark.put(str, Long.valueOf(System.nanoTime()));
    }

    public static int mode2Int(FY8 fy8) {
        if (fy8 == FY8.RING || fy8 != FY8.NORMAL) {
            return 0;
        }
        return 1;
    }

    public static synchronized boolean pause(Thread thread) {
        synchronized (Sliver.class) {
            FYZ fyz = cache.get(thread);
            if (fyz == null) {
                return false;
            }
            if (!fyz.LIZIZ) {
                return true;
            }
            nPause(fyz.LIZ);
            fyz.LIZIZ = false;
            return true;
        }
    }

    public static void registerSamplingListener(InterfaceC39145FXx interfaceC39145FXx) {
        List<InterfaceC39145FXx> list = sListenerList;
        if (list.contains(interfaceC39145FXx)) {
            return;
        }
        list.add(interfaceC39145FXx);
    }

    public static synchronized boolean resume(Thread thread) {
        synchronized (Sliver.class) {
            FYZ fyz = cache.get(thread);
            if (fyz == null) {
                return false;
            }
            if (fyz.LIZIZ) {
                return true;
            }
            nResume(fyz.LIZ);
            fyz.LIZIZ = true;
            return true;
        }
    }

    public static boolean start(int i) {
        return start(C16880lQ.LLLLIIIILLL(), i, ImagePreloadExperiment.PRIORITY_DEFAULT, FY8.RING);
    }

    public static synchronized boolean stop(Thread thread) {
        synchronized (Sliver.class) {
            if (!isInit) {
                return false;
            }
            FYZ remove = cache.remove(thread);
            if (remove == null) {
                return true;
            }
            nStop(remove.LIZ);
            return true;
        }
    }

    public static void unRegisterSamplingListener(InterfaceC39145FXx interfaceC39145FXx) {
        sListenerList.remove(interfaceC39145FXx);
    }

    public static synchronized String getStackTrace(long[] jArr) {
        synchronized (Sliver.class) {
            if (jArr != null) {
                if (jArr.length != 0) {
                    return nGetStackTrace(jArr);
                }
            }
            return "";
        }
    }

    public static boolean dump(String str, String str2) {
        return dump(C16880lQ.LLLLIIIILLL(), str, str2);
    }

    public static synchronized boolean dumpAll(String str, boolean z) {
        boolean dumpAll;
        synchronized (Sliver.class) {
            dumpAll = SliverAllThreadSupport.dumpAll(str, z);
        }
        return dumpAll;
    }

    public static boolean startAll(int i, int i2) {
        return startAll(i, i2, LiveExchangeConfirmThreshold.DEFAULT, FY8.RING, null);
    }

    public static boolean dump(Thread thread, String str) {
        return dump(thread, str, false);
    }

    public static synchronized boolean dump(Thread thread, String str, boolean z) {
        boolean dump;
        synchronized (Sliver.class) {
            dump = dump(thread, str, z, null);
        }
        return dump;
    }

    public static synchronized void reportStack(Thread thread, long[] jArr, long j) {
        synchronized (Sliver.class) {
            int i = 0;
            while (true) {
                List<InterfaceC39145FXx> list = sListenerList;
                if (i < list.size()) {
                    ((InterfaceC39145FXx) ListProtector.get(list, i)).LIZ(thread, jArr);
                    i++;
                }
            }
        }
    }

    public static boolean dump(Thread thread, String str, String str2) {
        return dump(thread, str, false, str2);
    }

    public static synchronized boolean dump(Thread thread, String str, boolean z, String str2) {
        synchronized (Sliver.class) {
            if (!isInit) {
                return false;
            }
            FYZ fyz = cache.get(thread);
            if (fyz == null) {
                return false;
            }
            ARunnableS1S2100000_6 aRunnableS1S2100000_6 = new ARunnableS1S2100000_6(fyz, str2, str, 0);
            if (z) {
                aRunnableS1S2100000_6.run();
            } else {
                new PthreadThread(aRunnableS1S2100000_6, "sliver/Sliver").start();
            }
            return true;
        }
    }

    public static synchronized boolean start(Thread thread, int i, int i2, FY8 fy8) {
        synchronized (Sliver.class) {
            if (SliverAllThreadSupport.isStart()) {
                return false;
            }
            if (!init(false)) {
                return false;
            }
            Map<Thread, FYZ> map = cache;
            if (map.containsKey(thread)) {
                return true;
            }
            long threadPeer = getThreadPeer(thread);
            if (threadPeer == 0) {
                return false;
            }
            long nStart = nStart(thread, threadPeer, i, i2, mode2Int(fy8));
            if (nStart == 0) {
                return false;
            }
            FYZ fyz = new FYZ();
            fyz.LIZ = nStart;
            fyz.LIZIZ = true;
            map.put(thread, fyz);
            return true;
        }
    }

    public static synchronized boolean startAll(int i, int i2, int i3, FY8 fy8, InterfaceC39148FYa interfaceC39148FYa) {
        synchronized (Sliver.class) {
            if (!cache.isEmpty()) {
                return false;
            }
            if (!init(false)) {
                return false;
            }
            return SliverAllThreadSupport.startAll(i, i2, i3, fy8, interfaceC39148FYa);
        }
    }
}
