package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import kotlin.jvm.internal.o;

/* renamed from: X.FZc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39176FZc {
    public static boolean LIZ(android.net.Uri uri) {
        android.net.Uri parse;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin(true)) {
            return true;
        }
        String str = null;
        if (uri != null) {
            if (o.LJ(uri.getHost(), "webview")) {
                if (TextUtils.equals(uri.getHost(), "webview") && UriProtector.getQueryParameter(uri, "url") != null && (parse = UriProtector.parse(UriProtector.getQueryParameter(uri, "url"))) != null && !parse.isOpaque()) {
                    str = UriProtector.getQueryParameter(parse, "awedp_require_login");
                }
            } else {
                str = UriProtector.getQueryParameter(uri, "awedp_require_login");
            }
        }
        return o.LJ("normal", str);
    }

    public static void LIZIZ(Activity activity, String str, boolean z) {
        o.LJIIIZ(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) RequireLoginActivity.class);
        intent.putExtra("deep_link_intent", activity.getIntent());
        intent.putExtra("enter_from", str);
        intent.putExtra("is_new_procedure", z);
        activity.overridePendingTransition(0, 0);
        C16880lQ.LIZIZ(activity, intent);
    }
}
