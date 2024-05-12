package X;

import Y.ARunnableS0S0001000_5;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FAJ {
    public static Boolean LIZJ;
    public static volatile Boolean LJ;
    public static volatile Boolean LJFF;
    public static final java.util.Map<String, Boolean> LIZ = new ConcurrentHashMap();
    public static int LIZIZ = 4;
    public static final java.util.Map<String, Object> LIZLLL = new ConcurrentHashMap();

    public static List LIZIZ(ActivityManager activityManager) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(101300, "android/app/ActivityManager", "getRecentTasks", activityManager, new Object[]{1, 1}, "java.util.List", new C65300Pk0(false, "(II)Ljava/util/List;", "7836594753334067994"));
        return LIZJ2.LIZ ? (List) LIZJ2.LIZIZ : activityManager.getRecentTasks(1, 1);
    }

    public static void LIZJ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7836594753334067994")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public static boolean LJI() {
        return C38354F3m.LIZJ(EF7.LJIILIIL, "qtp");
    }

    public static void LJII(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            obj = new Object();
            concurrentHashMap.put(str, obj);
        }
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void LJIIIIZZ(Runnable runnable) {
        SystemClock.uptimeMillis();
        runnable.run();
    }

    public static void LJIIIZ(long j) {
        FAM LIZ2 = C56662Kg.LIZ();
        LIZ2.getClass();
        LIZ2.LIZ.put("feed_total", Long.valueOf(j));
        LIZ2.LIZIZ.put("feed_total", Long.valueOf(j));
    }

    public static void LIZ(String str, boolean z) {
        if (z) {
            if (!C56662Kg.LIZ().LJII(str)) {
                C56662Kg.LIZ().LIZJ(str, false);
            }
            C56672Kh.LIZ().LIZJ(str);
        } else {
            C56662Kg.LIZ().LIZJ(str, false);
            C56672Kh.LIZ().LIZLLL(str);
        }
    }

    public static boolean LIZLLL(Choreographer choreographer, Runnable runnable) {
        try {
            Method LIZIZ2 = C36496EUa.LIZIZ(choreographer.getClass(), "postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            while (true) {
                int i = LIZIZ;
                if (i < 0) {
                    break;
                }
                try {
                    LIZJ(choreographer, LIZIZ2, new Object[]{Integer.valueOf(i), new ARunnableS0S0001000_5(2, 6), null, 0});
                    break;
                } catch (Throwable unused) {
                    LIZIZ--;
                }
            }
            int i2 = LIZIZ;
            if (i2 != 0) {
                LIZJ(choreographer, LIZIZ2, new Object[]{Integer.valueOf(i2), runnable, null, 0});
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    public static void LJ(long j, String str) {
        C56672Kh.LIZ().LJIIIZ(j, str);
        if (!C56662Kg.LIZ().LJIIIIZZ(str)) {
            C56662Kg.LIZ().LJ(j, str, false);
        }
    }

    public static void LJFF(String str, boolean z) {
        if (z) {
            C56672Kh.LIZ().LJIIJ(str);
            if (!C56662Kg.LIZ().LJIIIIZZ(str)) {
                C56662Kg.LIZ().LJFF(str, false);
                return;
            }
            return;
        }
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        FAK.LJI(LIZ2, str);
        C56662Kg.LIZ().LJFF(str, false);
    }

    public static void LJIIJ(AwemeHostApplication awemeHostApplication, Runnable runnable) {
        boolean z;
        Boolean bool = LIZJ;
        if (bool != null && bool.booleanValue()) {
            runnable.run();
        }
        if (LJI()) {
            runnable.run();
        }
        try {
            ActivityManager activityManager = (ActivityManager) C04330Ez.LJ(awemeHostApplication, ActivityManager.class);
            if (activityManager != null) {
                List LIZIZ2 = LIZIZ(activityManager);
                if (!C79004UzY.LJJIFFI(LIZIZ2)) {
                    boolean z2 = false;
                    Intent intent = ((ActivityManager.RecentTaskInfo) ListProtector.get(LIZIZ2, 0)).baseIntent;
                    String action = intent.getAction();
                    if (action != null && action.equals("android.intent.action.MAIN")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    java.util.Set<String> categories = intent.getCategories();
                    if (categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                        z2 = true;
                    }
                    if (z && z2) {
                        LIZJ = Boolean.TRUE;
                        runnable.run();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
