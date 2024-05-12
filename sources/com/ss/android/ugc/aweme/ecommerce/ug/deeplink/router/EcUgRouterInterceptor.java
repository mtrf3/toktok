package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router;

import X.C62712d9;
import X.FCY;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* loaded from: classes7.dex */
public final class EcUgRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        Uri uri2 = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (!FCY.LIZIZ(uri)) {
            if (routeIntent != null) {
                uri2 = routeIntent.getUri();
            }
            if (!FCY.LIZJ(uri2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        Uri LIZ;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || ((!FCY.LIZIZ(uri) && !FCY.LIZJ(uri)) || (LIZ = FCY.LIZ(uri, false, false)) == null)) {
            return false;
        }
        FCY.LIZLLL(context, LIZ);
        return true;
    }
}
