package com.ss.android.ugc.aweme.inteceptor;

import X.C111294Yj;
import X.C16880lQ;
import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AnalyticsDetailInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        StringBuilder LIZ = X1D.LIZ();
        String str3 = null;
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            str = uri3.getScheme();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("://");
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str2 = uri2.getHost();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str3 = uri.getPath();
        }
        LIZ.append(str3);
        return o.LJ(X1D.LIZIZ(LIZ), "aweme://analytics");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle bundle;
        Intent extra;
        Intent extra2;
        if (((Boolean) C111294Yj.LIZ.getValue()).booleanValue()) {
            if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
                extra2.putExtra("video_from", "from_analytics_detail");
                extra2.putExtra("refer", "analytics");
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                bundle = C16880lQ.LLJJIJI(extra);
            } else {
                bundle = null;
            }
            buildRoute.withParam(bundle);
            buildRoute.open();
            return true;
        }
        return false;
    }
}
