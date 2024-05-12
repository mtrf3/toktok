package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FC0 {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-2280723476397140261"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 65536);
    }

    public static boolean LIZIZ(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        List LIZ2 = LIZ(context.getPackageManager(), intent);
        o.LJIIIIZZ(LIZ2, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ2, 10));
        Iterator it = LIZ2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return !arrayList.isEmpty();
    }

    public static boolean LIZJ(Context context, android.net.Uri uri) {
        if (context == null || uri == null || C59303NPf.LIZJ(uri.getScheme())) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        List LIZ2 = LIZ(packageManager, intent);
        o.LJIIIIZZ(LIZ2, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ2, 10));
        Iterator it = LIZ2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return !arrayList.isEmpty();
    }
}
