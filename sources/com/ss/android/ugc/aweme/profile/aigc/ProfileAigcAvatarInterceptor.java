package com.ss.android.ugc.aweme.profile.aigc;

import X.C16880lQ;
import X.C26356AWa;
import X.C44460Hce;
import X.C62712d9;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.s;

/* loaded from: classes8.dex */
public final class ProfileAigcAvatarInterceptor implements IInterceptor {
    public static final C44460Hce Companion = new C44460Hce();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String uri2;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (uri2 = uri.toString()) == null || !s.LJJJLZIJ(uri2, "//aivatar", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle bundle;
        SmartRoute buildRoute;
        if (context == null || routeIntent == null || C26356AWa.LIZ()) {
            return false;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "fallback_user_id");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(routeIntent.getExtra());
        if (LLJJIJI != null) {
            bundle = new Bundle(LLJJIJI);
        } else {
            bundle = new Bundle();
        }
        bundle.remove("fallback_user_id");
        if (LLJJIJIIJIL == null) {
            buildRoute = SmartRouter.buildRoute(context, "//main");
            buildRoute.addFlags(536870912);
            buildRoute.addFlags(67108864);
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
            buildRoute.withParam(bundle);
        } else {
            buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            buildRoute.withParam("uid", LLJJIJIIJIL);
            buildRoute.withParam(bundle);
        }
        buildRoute.open();
        return true;
    }
}
