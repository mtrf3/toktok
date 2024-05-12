package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class FGU {
    public static volatile boolean LIZ;
    public static final java.util.Set<String> LIZIZ = new HashSet();

    public static void LIZ(Context context) {
        ServiceInfo[] serviceInfoArr;
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 4);
            if (LLLLLLZ != null && (serviceInfoArr = LLLLLLZ.services) != null) {
                FGG.LIZ(context);
                String str = FGG.LIZ;
                FGG.LIZ(context);
                String str2 = FGG.LIZIZ;
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (serviceInfo != null && (TextUtils.equals(str, serviceInfo.processName) || TextUtils.equals(str2, serviceInfo.processName))) {
                        ((HashSet) LIZIZ).add(serviceInfo.name);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean LIZIZ(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        if (context == null || intent == null) {
            return false;
        }
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
                return false;
            }
            String str = serviceInfo.processName;
            FGG.LIZ(context);
            if (!TextUtils.equals(FGG.LIZ, str)) {
                FGG.LIZ(context);
                if (!TextUtils.equals(FGG.LIZIZ, str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
