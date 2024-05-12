package com.ss.android.ugc.aweme.poi.search;

import X.C62712d9;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.s;

/* loaded from: classes4.dex */
public final class PoiSearchPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String uri2;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (uri2 = uri.toString()) == null || !s.LJJJLZIJ(uri2, "//poi/search", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            extra.putExtra("page_start_ts", System.currentTimeMillis());
            return false;
        }
        return false;
    }
}
