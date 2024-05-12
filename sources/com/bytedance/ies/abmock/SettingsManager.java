package com.bytedance.ies.abmock;

import X.C78983UzD;
import X.DLZ;
import X.F67;
import X.FFM;
import X.FFN;
import X.FFO;
import X.FH5;
import X.FHD;
import X.FHE;
import X.UCH;
import X.X1D;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class SettingsManager {
    public static volatile SettingsManager LIZJ;
    public final List<F67> LIZIZ = new ArrayList();
    public final UCH LIZ = new UCH();

    public static SettingsManager LIZLLL() {
        if (LIZJ == null) {
            synchronized (SettingsManager.class) {
                if (LIZJ == null) {
                    LIZJ = new SettingsManager();
                }
            }
        }
        return LIZJ;
    }

    public FFO getSettingsValueProvider() {
        return this.LIZ;
    }

    public final void LJIIIZ(F67 f67) {
        if (f67 != null && ((Boolean) DLZ.LIZJ.getValue()).booleanValue()) {
            FFM ffm = new FFM(f67);
            ((ConcurrentHashMap) FFN.LIZ).put(f67, ffm);
            f67 = ffm;
        }
        synchronized (this.LIZIZ) {
            ((ArrayList) this.LIZIZ).add(f67);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(F67 f67) {
        Object remove;
        if (((Boolean) DLZ.LIZJ.getValue()).booleanValue() && f67 != null && (remove = ((ConcurrentHashMap) FFN.LIZ).remove(f67)) != 0) {
            f67 = remove;
        }
        synchronized (this.LIZIZ) {
            ((ArrayList) this.LIZIZ).remove(f67);
        }
    }

    public static boolean LIZ(String str, boolean z) {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LIZ(0, str, z, false);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return z;
        }
    }

    public static double LIZIZ(String str, double d) {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LIZIZ(str, d, false);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return d;
        }
    }

    public static float LIZJ(String str, float f) {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LIZJ(str, false, f);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return f;
        }
    }

    public static int LJ(String str, int i) {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LJ(i, 0, str, false);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return i;
        }
    }

    public static long LJFF(String str, long j) {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LJI(j, str, false);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return j;
        }
    }

    public static String LJI(String str, String str2) {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LJII(0, str, str2, false);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key: ");
            LIZ.append(str);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            return str2;
        }
    }

    public static Object LJII(String str, Class cls) {
        Object obj;
        if (FH5.LIZIZ().LIZLLL() && FH5.LIZIZ().LIZIZ.LIZLLL().enable() && (obj = FH5.LIZIZ().LIZIZ.LIZLLL().get(str)) != null) {
            String content = i0.LJFF(str, " use mock data!!");
            o.LJIIJ(content, "content");
            FH5 LIZIZ = FH5.LIZIZ();
            o.LJFF(LIZIZ, "ConfigurationManager.getInstance()");
            if (LIZIZ.LIZLLL()) {
                System.out.println((Object) i0.LJFF("@=>abmock  ", content));
                return obj;
            }
            return obj;
        }
        if (cls == String[].class) {
            FHD.LIZLLL().getClass();
            return FHD.LJIIIIZZ(0, str, false);
        }
        FHD.LIZLLL().getClass();
        return FHD.LJIIIZ(str, false, false, cls, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T LJIIIIZZ(String str, Class cls, Object obj) {
        try {
            T t = (T) LJII(str, cls);
            if (t == null) {
                this.LIZ.getClass();
                if (FHE.LIZLLL.LJIIIZ().LJFF(str)) {
                    return obj;
                }
            }
            return t;
        } catch (Throwable unused) {
            return obj;
        }
    }
}
