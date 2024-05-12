package com.ss.android.ugc.aweme.openauthorize;

import X.C16880lQ;
import X.C62712d9;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.s;

/* loaded from: classes10.dex */
public final class DeeplinkAuthorizeParseInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String path;
        if (routeIntent == null || (path = routeIntent.getPath()) == null || !s.LJJJLZIJ(path, "aweme://v2/authorize", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context == null || routeIntent == null) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        if (C16880lQ.LLJJIJIIJIL(extra, "client_key") == null) {
            return false;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://v2/authorize");
        buildRoute.withParam("_bytedance_params_client_key", C16880lQ.LLJJIJIIJIL(extra, "client_key"));
        buildRoute.withParam("_bytedance_params_scope", C16880lQ.LLJJIJIIJIL(extra, "scope"));
        buildRoute.withParam("_bytedance_params_state", C16880lQ.LLJJIJIIJIL(extra, "state"));
        buildRoute.withParam("_bytedance_params_redirect_uri", C16880lQ.LLJJIJIIJIL(extra, "redirect_uri"));
        buildRoute.withParam("_bytedance_params_response_type", C16880lQ.LLJJIJIIJIL(extra, "response_type"));
        buildRoute.withParam("_bytedance_params_source", "web");
        buildRoute.open();
        return true;
    }
}
