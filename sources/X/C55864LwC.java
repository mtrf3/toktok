package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.LwC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55864LwC extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (SC5.LIZIZ(str, "host", str2, "path", str, "notification") || o.LJ(str, "inbox")) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        String queryParameter = UriProtector.getQueryParameter(uri, "multi_account_push_uid");
        if (o.LJ("notification", host) || o.LJ("inbox", host)) {
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("enter_from", "outer_push");
            intent.putExtra("enter_method", "cell");
            String queryParameter2 = UriProtector.getQueryParameter(uri, "label");
            intent.putExtra("label", queryParameter2);
            M62.LIZIZ.LIZIZ(uri, queryParameter2, z);
            if (TextUtils.equals(queryParameter2, "check_profile")) {
                intent.putExtra("push", true);
            }
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                return C55871LwJ.LIZ(activity, intent, queryParameter);
            }
            return intent;
        }
        return null;
    }
}
