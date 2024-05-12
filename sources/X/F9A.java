package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F9A extends M56 {
    @Override // X.M56
    public final boolean LJI(String scheme, String host, String path) {
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        return o.LJ(host, "anywhere");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return SmartRouter.buildRoute(activity, uri.toString()).buildIntent();
    }
}
