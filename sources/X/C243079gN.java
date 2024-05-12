package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.9gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243079gN {
    public static String LIZ(int i, String str) {
        String str2;
        String str3 = "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch";
        String str4 = null;
        try {
            SettingsManager.LIZLLL().getClass();
            str2 = SettingsManager.LJI("account_switch_schema", "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            o.LJI(str2);
            str3 = str2;
        }
        String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(str3, "((page_action_type))", String.valueOf(i), false), "((enter_from))", str, false);
        Locale LIZIZ = C39386Fd0.LIZIZ(EF7.LIZIZ());
        if (LIZIZ != null) {
            str4 = LIZIZ.getLanguage();
        }
        if (str4 == null) {
            str4 = "";
        }
        return ujb.o.LJJJJZ(LJJJJZ, "((locale))", str4, false);
    }
}
