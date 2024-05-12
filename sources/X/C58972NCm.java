package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NCm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58972NCm {
    public static List LIZJ(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "8565255670404344724"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 65536);
    }

    public static List LIZIZ(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse("http://"));
        List LIZJ = LIZJ(packageManager, intent);
        o.LJIIIIZZ(LIZJ, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZJ, 10));
        Iterator it = LIZJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    public static List LIZ(Context context, android.net.Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        List LIZJ = LIZJ(packageManager, intent);
        o.LJIIIIZZ(LIZJ, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZJ, 10));
        Iterator it = LIZJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    public static final boolean LIZLLL(Context context, android.net.Uri uri) {
        if (context == null || uri == null || !NO5.LJ(uri)) {
            return false;
        }
        return !ORZ.LLILIL(LIZ(context, uri), LIZIZ(context)).isEmpty();
    }

    public static final boolean LJ(Context context, android.net.Uri uri) {
        if (context == null || uri == null || NO5.LJ(uri)) {
            return false;
        }
        return !((ArrayList) LIZ(context, uri)).isEmpty();
    }

    public static final boolean LJFF(Context context, android.net.Uri uri) {
        if (context == null || uri == null || !LIZLLL(context, uri)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        java.util.Set LLILIL = ORZ.LLILIL(LIZ(context, uri), LIZIZ(context));
        if (!LLILIL.isEmpty()) {
            intent.setPackage((String) ListProtector.get(ORZ.LLJI(LLILIL), 0));
            intent.addFlags(268435456);
            intent.putExtra("pns.sandbox.dataflow_id", 1207964161);
            return NO5.LJIL(context, intent);
        }
        return false;
    }

    public static final boolean LJII(Context context, android.net.Uri uri) {
        if (context == null || !LJ(context, uri)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        List LIZ = LIZ(context, uri);
        if ((!((ArrayList) LIZ).isEmpty()) && LIZ != null) {
            intent.setPackage((String) ListProtector.get(ORZ.LLJI(LIZ), 0));
            intent.addFlags(268435456);
            intent.putExtra("pns.sandbox.dataflow_id", 1207964161);
            return NO5.LJIL(context, intent);
        }
        return false;
    }

    public static final void LJI(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        o.LJIIIZ(context, "context");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "open_url_app", awemeRawAd);
        LIZLLL.LIZIZ(str, "app_url");
        LIZLLL.LJII();
        NO5.LJIJI(new N2S(awemeRawAd, str, z));
        NO5.LJIJJ(new N2T(awemeRawAd));
    }
}
