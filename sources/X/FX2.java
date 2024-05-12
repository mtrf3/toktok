package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URISyntaxException;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FX2 {
    public static List LIZ(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-9009141589761473990"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 0);
    }

    public static String LIZLLL(String str) {
        if (C38354F3m.LJ(str)) {
            return str;
        }
        try {
            String scheme = UriProtector.parse(str).getScheme();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("snssdk");
            LIZ.append(EF7.LJIIIZ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                return str.replace(scheme, LIZIZ);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean LIZJ(Context context, String str) {
        Intent intent;
        PackageManager packageManager;
        try {
            intent = Intent.parseUri(str, 1);
        } catch (URISyntaxException unused) {
            intent = null;
        }
        if (intent != null && (packageManager = C27740Aue.LIZ(context).getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            intent.addFlags(268435456);
            if (intent.getComponent() == null || !context.getPackageName().equals(intent.getComponent().getPackageName())) {
                JSONObject jSONObject = new JSONObject();
                C77123UOp.LJJJJZI("openUrl", str, jSONObject);
                C77123UOp.LJJJLIIL(jSONObject, "intentActivities", LIZ(C27740Aue.LIZ(context).getPackageManager(), intent));
                HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
                C79605VMb c79605VMb = new C79605VMb("jump_other_app_through_olg_logic");
                c79605VMb.LIZIZ = "sparkTrace";
                c79605VMb.LIZLLL = jSONObject;
                hybridMultiMonitor.customReport(c79605VMb.LIZ());
                C16880lQ.LIZJ(context, intent);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r1.equals(r6) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FX2.LIZIZ(android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}
