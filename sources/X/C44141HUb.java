package X;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.HUb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44141HUb extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        return AV1.LJIIJJI();
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent();
        intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        M62.LIZIZ.LIZIZ(uri, "homepage_hot", z);
        return intent;
    }
}
