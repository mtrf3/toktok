package com.ss.android.ugc.aweme.openauthorize;

import X.C16880lQ;
import X.C62712d9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.s;

/* loaded from: classes11.dex */
public final class OpenAuthorizeParseInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String path;
        if (routeIntent == null || (path = routeIntent.getPath()) == null || !s.LJJJLZIJ(path, "aweme://authorize", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context != null && routeIntent != null) {
            Bundle bundle = new Bundle();
            Intent extra = routeIntent.getExtra();
            if (C16880lQ.LLJJIJIIJIL(extra, "client_key") != null && C16880lQ.LLJJIJIIJIL(extra, "scope") != null && (C16880lQ.LLJJIJIIJIL(extra, "token") != null || C16880lQ.LLJJIJIIJIL(extra, "bc_params") != null)) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra, "authType");
                if (LLJJIJIIJIL != null) {
                    bundle.putInt("authType", CastIntegerProtector.parseInt(LLJJIJIIJIL));
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://authorize");
                buildRoute.withParam("_bytedance_params_client_key", C16880lQ.LLJJIJIIJIL(extra, "client_key"));
                buildRoute.withParam("_bytedance_params_client_secret", C16880lQ.LLJJIJIIJIL(extra, "client_ticket"));
                buildRoute.withParam("_bytedance_params_next_url", C16880lQ.LLJJIJIIJIL(extra, "next_url"));
                buildRoute.withParam("_bytedance_params_scope", C16880lQ.LLJJIJIIJIL(extra, "scope"));
                buildRoute.withParam("key_qrcode_auth", true);
                buildRoute.withParam("key_qrcode_token", C16880lQ.LLJJIJIIJIL(extra, "token"));
                buildRoute.withParam("key_qrcode_bc_params", C16880lQ.LLJJIJIIJIL(extra, "bc_params"));
                buildRoute.withParam("key_qrcode_redirect_uri", C16880lQ.LLJJIJIIJIL(extra, "redirect_url"));
                buildRoute.withParam("_bytedance_params_extra", bundle);
                buildRoute.open();
                return true;
            }
        }
        return false;
    }
}
