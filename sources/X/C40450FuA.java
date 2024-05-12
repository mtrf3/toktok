package X;

import android.content.Context;
import android.webkit.CookieManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FuA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40450FuA {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Context context) {
        if (context == null || R41.LJI()) {
            return;
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", "normal");
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "newBuilder().addValuePai…_from\", \"normal\").build()");
        Q13.LIZIZ("monitor_clear_cookie", 1, LJ);
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            if (cookieManager != null) {
                cookieManager.removeAllCookie();
                cookieManager.flush();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
