package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.LwE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55866LwE extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "private");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent();
        String queryParameter = UriProtector.getQueryParameter(uri, "multi_account_push_uid");
        intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        intent.putExtra("label", UriProtector.getQueryParameter(uri, "label"));
        intent.putExtra("uid", uri.getLastPathSegment());
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return C55871LwJ.LIZ(activity, intent, queryParameter);
        }
        return intent;
    }
}
