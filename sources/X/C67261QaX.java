package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.QaX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67261QaX {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static Boolean LIZLLL;

    public static boolean LIZ(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (LIZ == null) {
            LIZ = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!LIZ.booleanValue()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (LIZIZ == null) {
                LIZIZ = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (!LIZIZ.booleanValue() || C44389HbV.LIZ()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
