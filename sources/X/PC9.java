package X;

import android.os.Build;
import android.text.TextUtils;
import defpackage.a1;
import defpackage.b1;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class PC9 {
    public static int LIZ = -1;

    public static boolean LIZIZ() {
        int i = LIZ;
        if (i != -1) {
            if (i != 1) {
                return false;
            }
            return true;
        }
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            LIZ = 1;
        } catch (Throwable unused) {
            LIZ = 0;
        }
        if (LIZ != 1) {
            return false;
        }
        return true;
    }

    public static String LIZ() {
        String str;
        String str2 = "";
        if (FCW.LIZIZ()) {
            if (!FCW.LIZIZ()) {
                return "";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("miui_");
            LIZ2.append(C16880lQ.LLIILZL("ro.miui.ui.version.name"));
            LIZ2.append("_");
            LIZ2.append(Build.VERSION.INCREMENTAL);
            return X1D.LIZIZ(LIZ2);
        }
        String str3 = Build.DISPLAY;
        if (str3.contains("Flyme") || Build.USER.equals("flyme")) {
            if (!C47614ImQ.LIZ(str3, "flyme")) {
                return "";
            }
            return str3;
        }
        String str4 = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str4) && C47614ImQ.LIZ(str4, "oppo")) {
            if (TextUtils.isEmpty(str4) || !C47614ImQ.LIZ(str4, "oppo")) {
                return "";
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("coloros_");
            LIZ3.append(C16880lQ.LLIILZL("ro.build.version.opporom"));
            LIZ3.append("_");
            LIZ3.append(str3);
            return X1D.LIZIZ(LIZ3);
        }
        String LIZIZ = EXC.LIZ().LIZIZ("ro.build.version.emui");
        if (!C47614ImQ.LIZ(LIZIZ, "emotionui")) {
            str = "";
        } else {
            str = a1.LJ(LIZIZ, "_", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String LLIILZL = C16880lQ.LLIILZL("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(LLIILZL) && C47614ImQ.LIZ(LLIILZL, "funtouch")) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(C16880lQ.LLIILZL("ro.vivo.os.build.display.id"));
            LIZ4.append("_");
            LIZ4.append(C16880lQ.LLIILZL("ro.vivo.product.version"));
            return X1D.LIZIZ(LIZ4);
        }
        if (!TextUtils.isEmpty(str3) && C47614ImQ.LIZ(str3, "amigo")) {
            StringBuilder LIZJ = b1.LIZJ(str3, "_");
            LIZJ.append(C16880lQ.LLIILZL("ro.gn.sv.version"));
            return X1D.LIZIZ(LIZJ);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(str4);
        LIZ5.append(Build.BRAND);
        String LIZIZ2 = X1D.LIZIZ(LIZ5);
        if (!TextUtils.isEmpty(LIZIZ2)) {
            String lowerCase = LIZIZ2.toLowerCase(Locale.getDefault());
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(C16880lQ.LLIILZL("ro.build.uiversion"));
                LIZ6.append("_");
                LIZ6.append(str3);
                return X1D.LIZIZ(LIZ6);
            }
        }
        if (!TextUtils.isEmpty(C16880lQ.LLIILZL("ro.letv.release.version"))) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("eui_");
            LIZ7.append(C16880lQ.LLIILZL("ro.letv.release.version"));
            LIZ7.append("_");
            LIZ7.append(str3);
            str2 = X1D.LIZIZ(LIZ7);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str3;
    }
}
