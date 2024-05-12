package X;

import Y.ACallableS24S0001000_6;
import android.app.Activity;
import android.app.ActivityManager;
import android.os.Build;
import java.util.HashMap;
import java.util.jar.JarFile;

/* renamed from: X.FIh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38739FIh {
    public static HashMap<java.net.URL, JarFile> LIZ;

    public static void LIZ(int i) {
        try {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(EF7.LIZIZ(), "activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            int i2 = (int) ((memoryInfo.availMem / 1024) / 1024);
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            String str = "";
            if (((Boolean) C38742FIk.LIZ.getValue()).booleanValue()) {
                if (LJIIIIZZ != null) {
                    str = LJIIIIZZ.getClass().getName();
                }
            } else {
                str = LJIIIIZZ.getClass().getName();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("   freeMem :");
            LIZ2.append(i2);
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("memoryLevel", Integer.valueOf(i));
            c198517qh.LIZ.put("page", str);
            c198517qh.LIZ.put("freeMemory", Integer.valueOf(i2));
            FUA.LIZJ("TYPE_TRIM_MEMORY", c198517qh.LJ());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            if (W5U.LIZLLL) {
                W5U.LIZ.trimMemory(i);
            }
        } catch (Exception e2) {
            PJZ.LIZIZ(e2, "trimMemory : Lighten");
            C16880lQ.LLLLIIL(e2);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            C10K.LIZJ(new ACallableS24S0001000_6(0, 1));
        }
        if (5 == i) {
            C36922EeM.LJ("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            System.gc();
            return;
        }
        if (10 == i) {
            if (((Boolean) C38740FIi.LIZ.getValue()).booleanValue()) {
                C58993NDh c58993NDh = NDZ.LIZ;
                c58993NDh.LIZ.clear();
                c58993NDh.LIZIZ.evictAll();
            }
            C36922EeM.LJ("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            System.gc();
            return;
        }
        if (40 == i) {
            C36922EeM.LJ("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
            return;
        }
        C36922EeM.LJ("trimMemory level:" + i);
    }
}
