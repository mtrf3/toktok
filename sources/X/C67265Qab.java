package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.Qab, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67265Qab {
    public static boolean LIZ(int i, Context context) {
        if (!LIZIZ(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), "com.google.android.gms", 64);
            C68435QtT LIZ = C68435QtT.LIZ(context);
            LIZ.getClass();
            if (LLLLLLZ == null) {
                return false;
            }
            if (!C68435QtT.LIZLLL(LLLLLLZ, false) && (!C68435QtT.LIZLLL(LLLLLLZ, true) || !C67264Qaa.LIZ(LIZ.LIZ))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean LIZIZ(Context context, int i, String str) {
        C67166QXq LIZ = QCX.LIZ(context);
        LIZ.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C16880lQ.LLILL(LIZ.LIZ, "appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
