package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import java.text.SimpleDateFormat;
import java.util.List;

/* loaded from: classes11.dex */
public final class O7K {
    public static final C61399O7v LIZ = new C61399O7v();

    public static String LIZ(long j) {
        SimpleDateFormat simpleDateFormat = LIZ.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(Long.valueOf(j));
        }
        return String.valueOf(j);
    }

    public static String LIZIZ(String str) {
        if (!C78886Uxe.LJJIIZI(str)) {
            try {
                return new String(Base64.decode(str, 0), "utf-8");
            } catch (Throwable unused) {
                C61476OAu.LIZ("error decoding video url");
            }
        }
        return "";
    }

    public static boolean LIZJ(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "5208705067326467582"));
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
