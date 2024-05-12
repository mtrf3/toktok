package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.LwD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55865LwD extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "chat");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        super.LIZLLL(activity, uri, z);
        String queryParameter = UriProtector.getQueryParameter(uri, "multi_account_push_uid");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            C16880lQ.LIZIZ(activity, C55871LwJ.LIZ(activity, null, queryParameter));
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, uri.toString());
        buildRoute.withParam("enter_from", "outer_push");
        buildRoute.withParam("enter_method", "cell");
        buildRoute.open();
    }
}
