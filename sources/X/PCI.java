package X;

import android.os.Build;
import android.text.TextUtils;
import defpackage.b1;

/* loaded from: classes12.dex */
public final class PCI {
    public static final PCL LIZ = new PCL();

    public static String LIZJ() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        try {
            str = "";
        } catch (Throwable unused) {
        }
        if (FCD.LJII()) {
            if (!FCD.LJII()) {
                return "";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("miui_");
            LIZ2.append(LIZ("ro.miui.ui.version.name"));
            LIZ2.append("_");
            LIZ2.append(Build.VERSION.INCREMENTAL);
            return X1D.LIZIZ(LIZ2);
        }
        if (FCD.LIZJ()) {
            String str2 = Build.DISPLAY;
            if (str2 == null || !str2.toLowerCase().contains("flyme")) {
                return "";
            }
            return str2;
        }
        String str3 = Build.MANUFACTURER;
        boolean z4 = false;
        if (!TextUtils.isEmpty(str3)) {
            z = str3.toLowerCase().contains("oppo");
        } else {
            z = false;
        }
        if (z) {
            if (!TextUtils.isEmpty(str3)) {
                z4 = str3.toLowerCase().contains("oppo");
            }
            if (!z4) {
                return "";
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("coloros_");
            LIZ3.append(LIZ("ro.build.version.opporom"));
            LIZ3.append("_");
            LIZ3.append(Build.DISPLAY);
            return X1D.LIZIZ(LIZ3);
        }
        String LIZIZ = LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ)) {
            return LIZIZ;
        }
        try {
            z2 = !TextUtils.isEmpty((String) C58323Mul.LIZ("ro.vivo.os.build.display.id"));
        } catch (Throwable unused2) {
            z2 = false;
        }
        if (z2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(C58323Mul.LIZ("ro.vivo.os.build.display.id"));
            LIZ4.append("_");
            LIZ4.append(C58323Mul.LIZ("ro.vivo.product.version"));
            return X1D.LIZIZ(LIZ4);
        }
        String str4 = Build.DISPLAY;
        if (!C38354F3m.LJ(str4) && str4.toLowerCase().contains("amigo")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(str4);
            LIZ5.append("_");
            LIZ5.append(LIZ("ro.gn.sv.version"));
            return X1D.LIZIZ(LIZ5);
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(Build.MANUFACTURER);
        LIZ6.append(Build.BRAND);
        String LIZIZ2 = X1D.LIZIZ(LIZ6);
        if (!TextUtils.isEmpty(LIZIZ2)) {
            String lowerCase = LIZIZ2.toLowerCase();
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(LIZ("ro.build.uiversion"));
            LIZ7.append("_");
            LIZ7.append(str4);
            return X1D.LIZIZ(LIZ7);
        }
        if (true ^ C38354F3m.LJ(LIZ("ro.letv.release.version"))) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("eui_");
            LIZ8.append(LIZ("ro.letv.release.version"));
            LIZ8.append("_");
            LIZ8.append(str4);
            str = X1D.LIZIZ(LIZ8);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return Build.DISPLAY;
    }

    public static boolean LIZLLL() {
        return ((Boolean) LIZ.LIZLLL(new Object[0])).booleanValue();
    }

    public static String LIZIZ() {
        String LIZIZ = EXC.LIZ().LIZIZ("ro.build.version.emui");
        if (LIZIZ.toLowerCase().contains("emotionui") || LIZIZ.toLowerCase().contains("magicui")) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, "_");
            LIZJ.append(Build.DISPLAY);
            return X1D.LIZIZ(LIZJ);
        }
        return "";
    }

    public static String LIZ(String str) {
        return EXC.LIZ().LIZIZ(str);
    }

    public static boolean LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            str = EXC.LIZ().LIZIZ("ro.build.version.emui");
        }
        if (!TextUtils.isEmpty(str) && (str.toLowerCase().contains("emotionui") || str.toLowerCase().contains("magicui"))) {
            return true;
        }
        String str2 = Build.BRAND;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().startsWith("huawei")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str3) && str3.toLowerCase().startsWith("huawei")) {
            return true;
        }
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().startsWith("honor")) {
            return true;
        }
        String str4 = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str4) && str4.toLowerCase().startsWith("honor")) {
            return true;
        }
        return false;
    }
}
