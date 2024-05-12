package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class JF5 {
    public static Boolean LIZ;
    public static int LIZIZ;

    static {
        new HashMap();
    }

    public static boolean LJ() {
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if ((invoke instanceof String) && !C38354F3m.LJ((String) invoke)) {
                if (!"unknown".equals((String) invoke)) {
                    z = true;
                }
            }
        } catch (Throwable unused) {
        }
        LIZ = Boolean.valueOf(z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r5) {
        /*
            r2 = r5
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.ContentResolver r1 = r2.getContentResolver()
            java.lang.String r0 = "force_fsg_nav_bar"
            r4 = 0
            int r0 = android.provider.Settings.Global.getInt(r1, r0, r4)
            if (r0 == 0) goto L11
        L10:
            return r4
        L11:
            boolean r0 = LJ()
            if (r0 == 0) goto L67
            java.lang.String r1 = android.os.Build.MANUFACTURER
            if (r1 == 0) goto L5a
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "HUAWEI"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L5a
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r1 = X.C36843Ed5.LIZ(r0)
            java.lang.String r0 = "EmotionUI 3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            java.lang.String r0 = "EmotionUI_3.1"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L51
        L41:
            r0 = 1
        L42:
            java.lang.String r1 = "navigationbar_is_min"
            if (r0 != 0) goto L5c
            android.content.ContentResolver r0 = r2.getContentResolver()
            int r0 = android.provider.Settings.Global.getInt(r0, r1, r4)
            if (r0 == 0) goto L67
            goto L10
        L51:
            java.lang.String r0 = "EmotionUI_3.0"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5a
            goto L41
        L5a:
            r0 = 0
            goto L42
        L5c:
            android.content.ContentResolver r0 = r2.getContentResolver()
            int r0 = android.provider.Settings.System.getInt(r0, r1, r4)
            if (r0 == 0) goto L67
            goto L10
        L67:
            android.view.WindowManager r0 = r2.getWindowManager()
            android.view.Display r1 = r0.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1.getRealMetrics(r0)
            int r3 = r0.heightPixels
            int r2 = r0.widthPixels
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1.getMetrics(r0)
            int r1 = r0.heightPixels
            int r0 = r0.widthPixels
            int r2 = r2 - r0
            if (r2 > 0) goto L8d
            int r3 = r3 - r1
            if (r3 <= 0) goto L10
        L8d:
            java.lang.String r3 = "navigation_bar_height"
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch: android.content.res.Resources.NotFoundException -> L10
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r2.getIdentifier(r3, r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L10
            if (r1 <= 0) goto L10
            android.content.res.Resources r0 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L10
            int r3 = r0.getDimensionPixelSize(r1)     // Catch: android.content.res.Resources.NotFoundException -> L10
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch: android.content.res.Resources.NotFoundException -> L10
            int r0 = r0.getDimensionPixelSize(r1)     // Catch: android.content.res.Resources.NotFoundException -> L10
            if (r0 < r3) goto Lb2
            r4 = r0
            goto L10
        Lb2:
            android.content.res.Resources r0 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L10
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: android.content.res.Resources.NotFoundException -> L10
            float r2 = r0.density     // Catch: android.content.res.Resources.NotFoundException -> L10
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch: android.content.res.Resources.NotFoundException -> L10
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: android.content.res.Resources.NotFoundException -> L10
            float r1 = r0.density     // Catch: android.content.res.Resources.NotFoundException -> L10
            float r0 = (float) r3     // Catch: android.content.res.Resources.NotFoundException -> L10
            float r0 = r0 * r1
            float r0 = r0 / r2
            int r4 = java.lang.Math.round(r0)     // Catch: android.content.res.Resources.NotFoundException -> L10
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JF5.LIZ(android.content.Context):int");
    }

    public static int LIZIZ(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        if (orientation == 1 || orientation == 3) {
            return displayMetrics.widthPixels;
        }
        return displayMetrics.heightPixels;
    }

    public static int LIZJ(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        if (orientation == 1 || orientation == 3) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.widthPixels;
    }

    public static int LIZLLL(Context context) {
        int LIZJ;
        int i = LIZIZ;
        if (i > 0) {
            return i;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0 || (LIZJ = context.getResources().getDimensionPixelSize(identifier)) == 0) {
            LIZJ = (int) KL2.LIZJ(context, 25.0f);
        }
        LIZIZ = LIZJ;
        return LIZJ;
    }
}
