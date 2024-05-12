package com.ss.android.ugc.aweme.trending.service;

import X.C59895Nf1;
import X.C62712d9;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.s;

/* loaded from: classes9.dex */
public final class TrendingInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (routeIntent != null) {
            String url = routeIntent.getUrl();
            if (url != null && s.LJJJLZIJ(url, "//trending/detail", false)) {
                return true;
            }
            String url2 = routeIntent.getUrl();
            if (url2 != null && s.LJJJLZIJ(url2, "//trending/billboard", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        String url2;
        if (routeIntent != null && (((url = routeIntent.getUrl()) != null && s.LJJJLZIJ(url, "//trending/detail", false)) || ((url2 = routeIntent.getUrl()) != null && s.LJJJLZIJ(url2, "//trending/billboard", false)))) {
            TrendingDetailServiceImpl.LIZLLL().LIZIZ();
            return false;
        }
        C59895Nf1.LIZLLL(context, "//search", "keyword", "Trending");
        return true;
    }
}
