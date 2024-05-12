package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes12.dex */
public final class PCH {
    public static final String LIZ;
    public static final C58559MyZ LIZIZ;
    public static final String LIZJ;
    public static String LIZLLL;

    static {
        String str;
        String valueOf = String.valueOf(Build.VERSION.SDK);
        LIZ = valueOf;
        LIZIZ = new C58559MyZ();
        LIZJ = valueOf;
        try {
            str = LIZ();
        } catch (Throwable unused) {
            str = null;
        }
        if (C38354F3m.LJ(str)) {
            str = LIZ;
        }
        LIZJ = str;
    }

    public static String LIZ() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = true;
        try {
            String LIZIZ2 = LIZIZ("ro.build.version.emui");
            LIZLLL = LIZIZ2;
            boolean LJ = C38354F3m.LJ(LIZIZ2);
            if (!LJ) {
                LIZLLL = LIZLLL.toLowerCase();
            }
            z = !LJ;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            if (C38354F3m.LJ(LIZLLL)) {
                LIZLLL = LIZIZ("ro.build.version.emui");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZLLL);
            LIZ2.append("_");
            LIZ2.append(Build.DISPLAY);
            String lowerCase = X1D.LIZIZ(LIZ2).toLowerCase();
            if (!C38354F3m.LJ(lowerCase)) {
                return lowerCase.toLowerCase();
            }
            return LIZ;
        }
        String LIZIZ3 = LIZIZ("ro.vivo.os.build.display.id");
        if (C38354F3m.LJ(LIZIZ3) || !LIZIZ3.toLowerCase().contains("funtouch")) {
            z4 = false;
        }
        if (z4) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ("ro.vivo.os.build.display.id"));
            LIZ3.append("_");
            LIZ3.append(LIZIZ("ro.vivo.product.version"));
            return X1D.LIZIZ(LIZ3).toLowerCase();
        }
        String str = Build.MANUFACTURER;
        if (!C38354F3m.LJ(str)) {
            z2 = str.toLowerCase().contains("oppo");
        } else {
            z2 = false;
        }
        if (z2) {
            if (!C38354F3m.LJ(str)) {
                z3 = str.toLowerCase().contains("oppo");
            }
            if (z3) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("coloros_");
                LIZ4.append(LIZIZ("ro.build.version.opporom"));
                LIZ4.append("_");
                LIZ4.append(Build.DISPLAY);
                return X1D.LIZIZ(LIZ4).toLowerCase();
            }
            return LIZ;
        }
        if (FCD.LJII()) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("miui_");
            LIZ5.append(LIZIZ("ro.miui.ui.version.name"));
            LIZ5.append("_");
            LIZ5.append(Build.VERSION.INCREMENTAL);
            return X1D.LIZIZ(LIZ5).toLowerCase();
        }
        return LIZ;
    }

    public static boolean LIZJ() {
        if (!FCD.LJII()) {
            return false;
        }
        try {
            if (CastIntegerProtector.parseInt(LIZIZ("ro.miui.ui.version.name").substring(1)) < 12) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String LIZIZ(String str) {
        return LIZIZ.LIZ(str);
    }
}
