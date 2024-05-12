package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class JFV {
    public static final java.util.Map<String, Executor> LIZ = new ConcurrentHashMap(4);
    public static final java.util.Map<String, ExecutorService> LIZIZ = new ConcurrentHashMap(4);
    public static final java.util.Map<String, Looper> LIZJ = new ConcurrentHashMap(4);
    public static final java.util.Map<String, Handler> LIZLLL = new ConcurrentHashMap(4);
    public static final JFU LJ = new JFU();
    public static final JFS LJFF = new JFS();
    public static final JFW LJI = new JFW();
    public static final JFX LJII = new JFX();

    public static String LIZ(java.util.Map map) {
        java.util.Set keySet;
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            if (concurrentHashMap.size() == 0 || (keySet = concurrentHashMap.keySet()) == null || keySet.size() <= 0) {
                return null;
            }
            return (String) keySet.iterator().next();
        }
        return null;
    }

    public static Handler LIZIZ(String str) {
        Looper LIZJ2;
        if (str == null) {
            return LJII.LIZIZ(new Object[0]);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL;
        Handler handler = (Handler) concurrentHashMap.get(str);
        if (handler == null && (LIZJ2 = LIZJ(str)) != null) {
            Handler handler2 = new Handler(LIZJ2);
            concurrentHashMap.put(str, handler2);
            return handler2;
        }
        return handler;
    }

    public static Looper LIZJ(String str) {
        if (str == null) {
            return LJI.LIZIZ(new Object[0]);
        }
        Looper looper = (Looper) ((ConcurrentHashMap) LIZJ).get(str);
        if (looper != null) {
            return looper;
        }
        return LJI.LIZIZ(new Object[0]);
    }

    public static void LIZLLL(Runnable runnable, String str) {
        if (Looper.myLooper() == LIZJ(str)) {
            runnable.run();
            return;
        }
        Handler LIZIZ2 = LIZIZ(str);
        if (LIZIZ2 == null) {
            LIZIZ2 = LJII.LIZIZ(new Object[0]);
        }
        LIZIZ2.post(runnable);
    }

    public static void LJ(Runnable runnable, String str) {
        Executor executor;
        if (str == null) {
            executor = LJ.LIZIZ(new Object[0]);
        } else {
            executor = (Executor) ((ConcurrentHashMap) LIZ).get(str);
            if (executor == null) {
                executor = LJ.LIZIZ(new Object[0]);
            }
        }
        executor.execute(runnable);
    }
}
