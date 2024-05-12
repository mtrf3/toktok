package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class M56 {
    public Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return null;
    }

    public void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
    }

    public boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        return false;
    }

    public String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return DeepLinkServiceImpl.LIZ().LJIIIIZZ(uri);
    }

    public boolean LJI(String scheme, String host, String path) {
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        return LJFF(host, path);
    }

    public boolean LJ(android.net.Uri uri, String scheme, String host, String path) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        return LJI(scheme, host, path);
    }

    public Intent LIZIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return LIZ(activity, uri, host, path, fromTokenType, z);
    }
}
