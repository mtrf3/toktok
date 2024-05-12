package X;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHI {
    public static final OHI LIZ = new OHI();

    public static boolean LIZLLL() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static Intent LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("package:");
        LIZ2.append(context.getPackageName());
        intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ2)));
        return intent;
    }

    public static Intent LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            if (LIZ(context, intent)) {
                return intent;
            }
        }
        return LIZIZ(context);
    }

    public static boolean LJFF(Context context) {
        o.LJIIIZ(context, "context");
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        if (!LIZLLL()) {
            return true;
        }
        Object LLILL = C16880lQ.LLILL(context, "appops");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.AppOpsManager");
        try {
            Class<?> cls = LLILL.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Object obj = LLILL.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(cls2);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            Object invoke = method.invoke(LLILL, Integer.valueOf(((Integer) obj).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName());
            o.LJII(invoke, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) invoke).intValue() == 0) {
                z = true;
            }
            return z;
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public static void LJII(Context context) {
        o.LJIIIZ(context, "context");
        C16880lQ.LIZJ(context, LIZIZ(context));
    }

    public static boolean LIZ(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-4272553763089164137"));
        if (LIZJ.LIZ) {
            queryIntentActivities = (List) LIZJ.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        o.LJIIIIZZ(queryIntentActivities, "context.packageManager.q…CH_DEFAULT_ONLY\n        )");
        return !queryIntentActivities.isEmpty();
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static boolean LJ(Context context, String str) {
        OHO LIZ2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(str, OHQ.LIZ);
        if (!LIZLLL()) {
            return true;
        }
        if (OHL.LIZ.containsKey(str) && (LIZ2 = OHL.LIZ(str)) != null) {
            return LIZ2.LIZIZ((Activity) context);
        }
        try {
            if (C04330Ez.LIZ(context, str) == 0) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static boolean LJI(Activity activity, String str) {
        boolean z;
        OHO LIZ2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(str, OHQ.LIZ);
        if (!LIZLLL()) {
            return false;
        }
        if (OHL.LIZ.containsKey(str) && (LIZ2 = OHL.LIZ(str)) != null) {
            if (!LIZ2.LIZJ(activity) || !C58743N3r.LIZ(str)) {
                return false;
            }
            return true;
        }
        if (activity.checkSelfPermission(str) == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
        boolean LIZ3 = C58743N3r.LIZ(str);
        if (!z || shouldShowRequestPermissionRationale || !LIZ3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static void LJIIIIZZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(str, OHQ.LIZ);
        OHO LIZ2 = OHL.LIZ(str);
        if (LIZ2 != null) {
            Intent LIZ3 = LIZ2.LIZ(context);
            if (LIZ3 == null) {
                LIZ.getClass();
                LIZ3 = LIZIZ(context);
            }
            C16880lQ.LIZJ(context, LIZ3);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZ.getClass();
        C16880lQ.LIZJ(context, LIZIZ(context));
    }
}
