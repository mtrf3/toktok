package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class FCD {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;

    public static boolean LIZLLL() {
        try {
            String str = Build.BRAND;
            if (C38354F3m.LJ(str) || !str.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (C38354F3m.LJ(str2)) {
                    return false;
                }
                if (!str2.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZJ() {
        String str = Build.DISPLAY;
        if (C38354F3m.LJ(str) || str.indexOf("Flyme") < 0) {
            if (!C38354F3m.LJ(Build.USER) && Build.USER.equals("flyme")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LJII() {
        if (!LIZIZ) {
            try {
                Class.forName("miui.os.Build");
                LIZ = true;
                LIZIZ = true;
                return true;
            } catch (Exception unused) {
                LIZIZ = true;
            }
        }
        return LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            java.lang.String r0 = X.C79081V1x.LJIILJJIL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            java.lang.String r5 = X.FCD.LIZJ
            boolean r0 = X.C38354F3m.LJ(r5)
            if (r0 != 0) goto L17
        L12:
            X.C79081V1x.LJLILLLLZI = r5
        L14:
            java.lang.String r0 = X.C79081V1x.LJLILLLLZI
            return r0
        L17:
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r6, r0)     // Catch: java.lang.Exception -> L43
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L43
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> L43
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L43
        L2b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L43
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L43
            int r0 = r1.pid     // Catch: java.lang.Exception -> L43
            if (r0 != r3) goto L2b
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Exception -> L43
            java.lang.String r5 = r1.processName     // Catch: java.lang.Exception -> L43
            X.FCD.LIZJ = r5     // Catch: java.lang.Exception -> L43
            goto L12
        L43:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L47:
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L8a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8a
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8a
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L8a
            r1.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L8b
        L77:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L8b
            if (r0 <= 0) goto L82
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L8b
            r1.append(r0)     // Catch: java.lang.Throwable -> L8b
            goto L77
        L82:
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8a:
            r4 = r5
        L8b:
            if (r4 == 0) goto L90
        L8d:
            r4.close()     // Catch: java.lang.Exception -> L90
        L90:
            X.FCD.LIZJ = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCD.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LJI(Context context) {
        String LIZ2 = LIZ(context);
        if (LIZ2 == null || LIZ2.contains(":") || !LIZ2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static Intent LIZIZ(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return launchIntentForPackage;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean LJ(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (intent == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-5480759840901980049"));
        if (LIZJ2.LIZ) {
            queryIntentActivities = (List) LIZJ2.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Context context, String str) {
        if (context == null || C38354F3m.LJ(str)) {
            return false;
        }
        try {
            if (C16880lQ.LLLLLLZ(context.getPackageManager(), str, 16777216) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
