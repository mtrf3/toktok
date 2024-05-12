package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.DeadObjectException;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fsk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40362Fsk {
    public static boolean LIZ;

    public static boolean LIZ() {
        String BRAND = Build.BRAND;
        o.LJIIIIZZ(BRAND, "BRAND");
        String lowerCase = BRAND.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        if (o.LJ(lowerCase, "tecno") || o.LJ(lowerCase, "infinix") || o.LJ(lowerCase, "itel")) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Context context) {
        int i;
        List<ResolveInfo> queryIntentServices;
        try {
            Intent intent = new Intent("com.transsion.tms.sdk.TMS_SERVER");
            if (Build.VERSION.SDK_INT >= 24) {
                i = 1048576;
            } else {
                i = 0;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (queryIntentServices = packageManager.queryIntentServices(intent, i)) == null) {
                return false;
            }
            if (!(!queryIntentServices.isEmpty())) {
                return false;
            }
            return true;
        } catch (DeadObjectException unused) {
            return false;
        }
    }
}
