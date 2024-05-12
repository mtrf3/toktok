package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FTc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39020FTc {
    public static String LIZ;

    public static List LIZ(PackageManager packageManager, Intent intent, int i) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, Integer.valueOf(i)}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "8454504759992777727"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, i);
    }

    public static String LIZIZ(Context context, String targetUrl) {
        String str;
        ActivityInfo activityInfo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(targetUrl, "targetUrl");
        String str2 = LIZ;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(targetUrl));
        boolean z = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
            str = activityInfo.packageName;
        } else {
            str = null;
        }
        List<ResolveInfo> LIZ2 = LIZ(packageManager, intent, 0);
        ArrayList LIZIZ = s1.LIZIZ(LIZ2, "pm.queryIntentActivities(activityIntent, 0)");
        for (ResolveInfo resolveInfo : LIZ2) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                LIZIZ.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (LIZIZ.isEmpty()) {
            LIZ = null;
        } else if (LIZIZ.size() == 1) {
            LIZ = (String) ListProtector.get(LIZIZ, 0);
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    List LIZ3 = LIZ(context.getPackageManager(), intent, 64);
                    o.LJIIIIZZ(LIZ3, "pm.queryIntentActivities…VED_FILTER,\n            )");
                    if (LIZ3.size() != 0) {
                        Iterator it = LIZ3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResolveInfo resolveInfo2 = (ResolveInfo) it.next();
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                z = true;
                                break;
                            }
                        }
                    }
                } catch (RuntimeException e) {
                    C78983UzD.LJIIZILJ(e);
                }
                if (!z && LIZIZ.contains(str)) {
                    LIZ = str;
                }
            }
            if (LIZIZ.contains("com.android.chrome")) {
                LIZ = "com.android.chrome";
            } else if (LIZIZ.contains("com.chrome.beta")) {
                LIZ = "com.chrome.beta";
            } else if (LIZIZ.contains("com.chrome.dev")) {
                LIZ = "com.chrome.dev";
            } else if (LIZIZ.contains("com.google.android.apps.chrome")) {
                LIZ = "com.google.android.apps.chrome";
            }
        }
        return LIZ;
    }
}
