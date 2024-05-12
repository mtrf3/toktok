package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F99 extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (!ujb.o.LJJJLIIL(host, "wallet_index", false) && !o.LJ(host, "wallet")) {
            return false;
        }
        return true;
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
    }
}
