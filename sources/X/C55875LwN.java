package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.LwN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55875LwN extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "notification";
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return o.LJ(X1D.LIZIZ(LIZ), "user/imfans");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//notification");
        buildRoute.withParam("from_where", 0);
        return buildRoute.buildIntent();
    }
}
