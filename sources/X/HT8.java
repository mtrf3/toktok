package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HT8 extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "challenge_detail";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "tag");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        CommerceChallengeServiceImpl.LIZIZ().LJIIIZ(uri, UriProtector.getQueryParameter(uri, "id"));
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//challenge/detail");
        buildRoute.withParam("id", UriProtector.getQueryParameter(uri, "id"));
        buildRoute.withParam("enter_from", UriProtector.getQueryParameter(uri, "enter_from"));
        M62.LIZIZ.LIZIZ(uri, "challenge_detail", z);
        return buildRoute.buildIntent();
    }
}
