package com.ss.android.ugc.aweme.route;

import X.C16880lQ;
import X.C197457oz;
import X.C54218LPq;
import X.C59895Nf1;
import X.C62712d9;
import X.M98;
import X.Z89;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class NowRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null && (url = routeIntent.getUrl()) != null && s.LJJJLZIJ(url, "//now/", false) && !o.LJ(routeIntent.getPath(), "/error")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context != null && routeIntent != null) {
            if (!C54218LPq.LJLIL.LIZ()) {
                C59895Nf1.LIZLLL(context, "//main", "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                return true;
            }
            String url = routeIntent.getUrl();
            o.LJIIIIZZ(url, "routeIntent.url");
            if (s.LJJJLZIJ(url, "//now/feed", false)) {
                C197457oz.LIZ(Z89.LIZIZ, context, C16880lQ.LLJJIJI(routeIntent.getExtra()), true, 8);
            }
            String url2 = routeIntent.getUrl();
            o.LJIIIIZZ(url2, "routeIntent.url");
            if (s.LJJJLZIJ(url2, "//now/never", false)) {
                Z89.LIZIZ.LJIIIZ(context, C16880lQ.LLJJIJI(routeIntent.getExtra()), null);
            }
            M98 m98 = M98.LIZIZ;
            String url3 = routeIntent.getUrl();
            o.LJIIIIZZ(url3, "routeIntent.url");
            if (m98.LIZ(url3)) {
                String url4 = routeIntent.getUrl();
                o.LJIIIIZZ(url4, "routeIntent.url");
                Intent extra = routeIntent.getExtra();
                o.LJIIIIZZ(extra, "routeIntent.extra");
                m98.LIZIZ(context, extra, url4);
                return true;
            }
        }
        return false;
    }
}
