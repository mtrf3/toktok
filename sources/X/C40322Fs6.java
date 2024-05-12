package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;

/* renamed from: X.Fs6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40322Fs6 {
    public static boolean LIZIZ(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
                if (notificationManager == null || notificationManager.getNotificationChannel("im_push").getImportance() == 0) {
                    return false;
                }
                return true;
            }
            return LIZJ(context);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean LIZJ(Context context) {
        try {
            return new AnonymousClass078(context).LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LIZLLL(Context context) {
        Intent intent;
        if (context == null) {
            return;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("package:");
            LIZ.append(context.getPackageName());
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ)));
            intent.addFlags(268435456);
        } catch (Exception unused) {
        }
        if (LIZ(context, intent)) {
            intent.putExtra("pns.sandbox.dataflow_id", 1207965697);
            C16880lQ.LIZJ(context, intent);
        } else {
            LJI(context);
        }
    }

    public static void LJ(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26 && !C1DH.LJJIFFI()) {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                intent.putExtra("pns.sandbox.dataflow_id", 1207965697);
                if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
                    C16880lQ.LIZJ(context, intent);
                    return;
                }
                return;
            }
            LIZLLL(context);
        } catch (Exception unused) {
            LJI(context);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:5|(3:7|8|(1:10)(1:11))|15|16|(2:18|10)(1:19)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(android.content.Context r12) {
        /*
            r11 = 0
            r7 = 1
            r6 = -1
            if (r12 != 0) goto L6
        L5:
            return r11
        L6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L2d
            java.lang.String r0 = "notification"
            java.lang.Object r0 = X.C16880lQ.LLILL(r12, r0)     // Catch: java.lang.Exception -> L29
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Exception -> L29
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.on(r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = "areNotificationsEnabled"
            com.bytedance.common.utility.reflect.Reflect r0 = r1.call(r0)     // Catch: java.lang.Exception -> L29
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L29
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L29
            boolean r6 = r0.booleanValue()     // Catch: java.lang.Exception -> L29
            goto L8c
        L29:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L2d:
            java.lang.String r0 = "appops"
            java.lang.Object r2 = X.C16880lQ.LLILL(r12, r0)     // Catch: java.lang.Throwable -> L8c
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Throwable -> L8c
            android.content.pm.ApplicationInfo r1 = r12.getApplicationInfo()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = X.C16880lQ.LLLLL(r12)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r10 = r0.getPackageName()     // Catch: java.lang.Throwable -> L8c
            int r9 = r1.uid     // Catch: java.lang.Throwable -> L8c
            com.bytedance.common.utility.reflect.Reflect r8 = com.bytedance.common.utility.reflect.Reflect.on(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "OP_POST_NOTIFICATION"
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L8c
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L8c
            r0[r11] = r2     // Catch: java.lang.Throwable -> L8c
            com.bytedance.common.utility.reflect.Reflect r0 = r8.field(r1, r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L8c
            int r5 = r0.intValue()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "checkOpNoThrow"
            r1 = 3
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L8c
            r3[r11] = r2     // Catch: java.lang.Throwable -> L8c
            r3[r7] = r2     // Catch: java.lang.Throwable -> L8c
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2 = 2
            r3[r2] = r0     // Catch: java.lang.Throwable -> L8c
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L8c
            r1[r11] = r0     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L8c
            r1[r7] = r0     // Catch: java.lang.Throwable -> L8c
            r1[r2] = r10     // Catch: java.lang.Throwable -> L8c
            com.bytedance.common.utility.reflect.Reflect r0 = r8.call(r4, r3, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L8c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L5
            goto L8e
        L8c:
            if (r6 != r7) goto L5
        L8e:
            r11 = 1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40322Fs6.LJFF(android.content.Context):boolean");
    }

    public static void LJI(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!LIZ(context, intent)) {
                return;
            }
            intent.putExtra("pns.sandbox.dataflow_id", 1207965697);
            C16880lQ.LIZJ(context, intent);
        } catch (Exception unused) {
        }
    }

    public static boolean LIZ(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "6955836456996434689"));
        if (LIZJ.LIZ) {
            queryIntentActivities = (List) LIZJ.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
