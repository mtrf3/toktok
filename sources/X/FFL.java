package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FFL {
    public static volatile FFL LIZIZ;
    public final java.util.Map<String, Object> LIZ = new ConcurrentHashMap();

    public static FFL LJIIIZ() {
        if (LIZIZ == null) {
            synchronized (FFL.class) {
                if (LIZIZ == null) {
                    LIZIZ = new FFL();
                }
            }
        }
        return LIZIZ;
    }

    public static C38704FGy LIZLLL() {
        return FH5.LIZIZ().LJFF;
    }

    public static double LIZ(String str, double d) {
        try {
            FHD.LIZLLL().getClass();
            d = FHD.LIZIZ(str, d, true);
            return d;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return d;
        }
    }

    public static float LIZIZ(String str, float f) {
        try {
            FHD.LIZLLL().getClass();
            f = FHD.LIZJ(str, true, f);
            return f;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return f;
        }
    }

    public static long LIZJ(long j, String str) {
        try {
            FHD.LIZLLL().getClass();
            j = FHD.LJI(j, str, true);
            return j;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return j;
        }
    }

    public final Object LJI(String str, Object obj) {
        Object obj2;
        C43659HBn c43659HBn = FH5.LIZIZ().LIZJ;
        if ((c43659HBn != null && c43659HBn.LIZLLL() != null && c43659HBn.LIZLLL().enable() && c43659HBn.LIZJ() && (obj2 = c43659HBn.LIZLLL().get(str)) != null) || (obj2 = ((ConcurrentHashMap) this.LIZ).get(str)) != null) {
            return obj2;
        }
        if (obj != null) {
            ((ConcurrentHashMap) this.LIZ).put(str, obj);
        }
        return obj;
    }

    public final int LJIIJJI(int i, String str) {
        try {
            return ((Integer) LJI(str, Integer.valueOf(i))).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    public static double LJII(int i, String str, double d) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LIZ(str, d);
            }
            return ((Double) LIZIZ2).doubleValue();
        }
        C38657FFd.LIZ(Double.valueOf(d), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), str, true);
        if (!FFI.LIZ()) {
            return LIZ(str, d);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LJ;
        if (concurrentHashMap.containsKey(str)) {
            return ((Double) concurrentHashMap.get(str)).doubleValue();
        }
        double LIZ = LIZ(str, d);
        if (!FFI.LIZ()) {
            return LIZ;
        }
        concurrentHashMap.put(str, Double.valueOf(LIZ));
        return LIZ;
    }

    public static float LJIIIIZZ(int i, String str, float f) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LIZIZ(str, f);
            }
            return ((Float) LIZIZ2).floatValue();
        }
        C38657FFd.LIZ(Float.valueOf(f), Float.valueOf(0.0f), str, true);
        if (!FFI.LIZ()) {
            return LIZIZ(str, f);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LIZLLL;
        if (concurrentHashMap.containsKey(str)) {
            return ((Float) concurrentHashMap.get(str)).floatValue();
        }
        float LIZIZ3 = LIZIZ(str, f);
        if (!FFI.LIZ()) {
            return LIZIZ3;
        }
        concurrentHashMap.put(str, Float.valueOf(LIZIZ3));
        return LIZIZ3;
    }

    public static long LJIILIIL(int i, long j, String str) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LIZJ(j, str);
            }
            return ((Long) LIZIZ2).longValue();
        }
        C38657FFd.LIZ(Long.valueOf(j), 0L, str, true);
        if (!FFI.LIZ()) {
            return LIZJ(j, str);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LIZJ;
        if (concurrentHashMap.containsKey(str)) {
            return ((Long) concurrentHashMap.get(str)).longValue();
        }
        long LIZJ = LIZJ(j, str);
        if (!FFI.LIZ()) {
            return LIZJ;
        }
        concurrentHashMap.put(str, Long.valueOf(LIZJ));
        return LIZJ;
    }

    public static Object LJIILLIIL(Class cls, String str, boolean z) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                FHD.LIZLLL().getClass();
                return FHD.LJIIIZ(str, z, false, cls, 0);
            }
            return LIZIZ2;
        }
        if (!z && !FFI.LJIIIIZZ) {
            FHD.LIZLLL().getClass();
            return FHD.LJIIIZ(str, z, false, cls, 0);
        }
        if (!FFI.LIZ()) {
            FHD.LIZLLL().getClass();
            return FHD.LJIIIZ(str, z, false, cls, 0);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LJI;
        if (concurrentHashMap.containsKey(str)) {
            Object obj = concurrentHashMap.get(str);
            if (obj != FFI.LJII) {
                return obj;
            }
            return null;
        }
        FHD.LIZLLL().getClass();
        Object LJIIIZ = FHD.LJIIIZ(str, z, false, cls, 0);
        if (!FFI.LIZ()) {
            return LJIIIZ;
        }
        if (LJIIIZ == null) {
            concurrentHashMap.put(str, FFI.LJII);
            return LJIIIZ;
        }
        concurrentHashMap.put(str, LJIIIZ);
        return LJIIIZ;
    }

    public static boolean LJ(int i, String str, boolean z, boolean z2) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LJFF(0, str, z, z2);
            }
            return ((Boolean) LIZIZ2).booleanValue();
        }
        C38657FFd.LIZ(Boolean.valueOf(z2), Boolean.FALSE, str, z);
        if (!z && !FFI.LJIIIIZZ) {
            return LJFF(0, str, z, z2);
        }
        if (TextUtils.equals("player_setting_enable_ab_cache", str)) {
            return LJFF(0, str, z, z2);
        }
        if (!FFI.LIZ()) {
            return LJFF(0, str, z, z2);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LIZ;
        if (concurrentHashMap.containsKey(str)) {
            return ((Boolean) concurrentHashMap.get(str)).booleanValue();
        }
        boolean LJFF = LJFF(0, str, z, z2);
        if (!FFI.LIZ()) {
            return LJFF;
        }
        concurrentHashMap.put(str, Boolean.valueOf(LJFF));
        return LJFF;
    }

    public static boolean LJFF(int i, String str, boolean z, boolean z2) {
        if (i == 1 && LIZLLL() != null) {
            LIZLLL().getClass();
            Boolean bool = (Boolean) C38704FGy.LIZIZ(str, z);
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        try {
            FHD.LIZLLL().getClass();
            return FHD.LIZ(i, str, z2, z);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return z2;
        }
    }

    public static int LJIIJ(int i, int i2, String str, boolean z) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LJIIL(i2, z, str, 0);
            }
            return ((Integer) LIZIZ2).intValue();
        }
        C38657FFd.LIZ(Integer.valueOf(i2), 0, str, z);
        if (!z && !FFI.LJIIIIZZ) {
            return LJIIL(i2, z, str, 0);
        }
        if (!FFI.LIZ()) {
            return LJIIL(i2, z, str, 0);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LIZIZ;
        if (concurrentHashMap.containsKey(str)) {
            return ((Integer) concurrentHashMap.get(str)).intValue();
        }
        int LJIIL = LJIIL(i2, z, str, 0);
        if (!FFI.LIZ()) {
            return LJIIL;
        }
        concurrentHashMap.put(str, Integer.valueOf(LJIIL));
        return LJIIL;
    }

    public static int LJIIL(int i, boolean z, String str, int i2) {
        if (i2 == 1 && LIZLLL() != null) {
            LIZLLL().getClass();
            Integer num = (Integer) C38704FGy.LIZIZ(str, z);
            if (num != null) {
                return num.intValue();
            }
        }
        try {
            FHD.LIZLLL().getClass();
            return FHD.LJ(i, i2, str, z);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return i;
        }
    }

    public static String LJIILJJIL(int i, String str, String str2, boolean z) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LJIILL(0, str, str2, z);
            }
            return (String) LIZIZ2;
        }
        C38657FFd.LIZ(str2, "", str, z);
        if (!z && !FFI.LJIIIIZZ) {
            return LJIILL(0, str, str2, z);
        }
        if (!FFI.LIZ()) {
            return LJIILL(0, str, str2, z);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LJFF;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        String LJIILL = LJIILL(0, str, str2, z);
        if (!FFI.LIZ()) {
            return LJIILL;
        }
        concurrentHashMap.put(str, LJIILL);
        return LJIILL;
    }

    public static String LJIILL(int i, String str, String str2, boolean z) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2 && LIZLLL() != null) {
            LIZLLL().getClass();
            String str3 = (String) C38704FGy.LIZIZ(str, z);
            if (str3 != null) {
                return str3;
            }
        }
        try {
            FHD.LIZLLL().getClass();
            return FHD.LJII(i, str, str2, z);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return str2;
        }
    }

    public static Object LJIIZILJ(int i, Object obj, String str, boolean z) {
        Object LIZ;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2) {
            try {
                if (LIZLLL() != null && (LIZ = LIZLLL().LIZ(str, z, obj)) != null) {
                    return LIZ;
                }
            } catch (Throwable unused) {
                return obj;
            }
        }
        FHD.LIZLLL().getClass();
        Object LJIIIIZZ = FHD.LJIIIIZZ(i, str, z);
        if (LJIIIIZZ == null) {
            FHC.LIZIZ().getClass();
            if (FHE.LIZLLL.LJIIIZ().LJFF(str)) {
                return obj;
            }
        }
        return LJIIIIZZ;
    }

    public static Object LJIJ(boolean z, String str, int i, Class cls, Object obj) {
        if (FFI.LIZJ(str)) {
            Object LIZIZ2 = FFI.LIZIZ(str);
            if (LIZIZ2 == null) {
                return LJIJI(z, str, i, cls, obj, 0);
            }
            return LIZIZ2;
        }
        if (!z && !FFI.LJIIIIZZ) {
            return LJIJI(false, str, i, cls, obj, 0);
        }
        if (!FFI.LIZ()) {
            return LJIJI(z, str, i, cls, obj, 0);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) FFI.LJI;
        if (concurrentHashMap.containsKey(str)) {
            Object obj2 = concurrentHashMap.get(str);
            if (obj2 != FFI.LJII) {
                return obj2;
            }
            return null;
        }
        Object LJIJI = LJIJI(z, str, i, cls, obj, 0);
        if (!FFI.LIZ()) {
            return LJIJI;
        }
        if (LJIJI == null) {
            concurrentHashMap.put(str, FFI.LJII);
            return LJIJI;
        }
        concurrentHashMap.put(str, LJIJI);
        return LJIJI;
    }

    public static Object LJIJI(boolean z, String str, int i, Class cls, Object obj, int i2) {
        Object LIZ;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2) {
            try {
                if (LIZLLL() != null && (LIZ = LIZLLL().LIZ(str, z, obj)) != null) {
                    return LIZ;
                }
            } catch (Throwable unused) {
                return obj;
            }
        }
        FHD.LIZLLL().getClass();
        Object LJIIIZ = FHD.LJIIIZ(str, z, false, cls, i2);
        if (LJIIIZ == null) {
            FHC.LIZIZ().getClass();
            if (FHE.LIZLLL.LJIIIZ().LJFF(str)) {
                return obj;
            }
        }
        return LJIIIZ;
    }
}
