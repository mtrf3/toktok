package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M52 extends M56 {
    @Override // X.M56
    public final boolean LJI(String scheme, String host, String path) {
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (o.LJ(scheme, "https") || o.LJ(scheme, "http")) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent(activity, (Class<?>) CrossPlatformActivity.class);
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        if (!z) {
            str = "deeplink";
        } else {
            str = "push";
        }
        intent.setData(UriProtector.parse(M60.LIZ(uri2, str)));
        intent.putExtra("need_sec_link", true);
        intent.putExtra("need_detect_2_jump", true);
        intent.putExtra("sec_link_scene", "deeplink");
        if (z) {
            intent.putExtra("hide_more", false);
            intent.putExtra("enter_from", "notification");
        }
        M62.LIZIZ.LIZIZ(uri, "h5", z);
        return intent;
    }
}
