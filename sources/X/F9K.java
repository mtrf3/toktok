package X;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class F9K {
    public static String LIZ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-4497325620433096741"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    public static void LIZIZ(int i) {
        boolean z;
        String str;
        try {
            StringBuilder LIZ = X1D.LIZ();
            boolean z2 = true;
            try {
                SettingsManager.LIZLLL().getClass();
                z = SettingsManager.LIZ("http_cookie_error", true);
            } catch (Exception unused) {
                z = true;
            }
            if (!z) {
                str = "";
            } else {
                str = "https://";
            }
            LIZ.append(str);
            LIZ.append("tiktokv.com");
            String cookie = LIZ(CookieManager.getInstance(), X1D.LIZIZ(LIZ));
            if (!TextUtils.isEmpty(cookie)) {
                o.LJIIIIZZ(cookie, "cookie");
                if (s.LJJJLZIJ(cookie, "sessionid", false)) {
                    return;
                }
            }
            if (C38891fp.LJJI(C64734Pas.LJIIIZ(EF7.LIZIZ()).LIZLLL(".tiktokv.com"))) {
                z2 = false;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("cookie1", cookie);
            int i2 = 2;
            c188727au.LIZLLL(2, "empty");
            if (!z2) {
                i2 = 3;
            }
            c188727au.LIZLLL(i2, "in_share_cookie");
            if (!z2) {
                c188727au.LJI("share_cookie", F9J.LIZIZ(EF7.LIZIZ(), 0, "ss_app_config").getString("share_cookie_host_list", ""));
            }
            c188727au.LIZLLL(i, "enter_from");
            FMX.LJIIL("cookie_status", c188727au.LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
