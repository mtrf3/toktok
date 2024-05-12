package com.ss.android.ugc.aweme.paidcontent.interceptor;

import X.AnonymousClass629;
import X.C16880lQ;
import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PaidContentInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        boolean z;
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Intent extra;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null && extra.getBooleanExtra("has_not_been_intercepted", false)) {
            z = true;
        } else {
            z = false;
        }
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
        String LIZIZ = X1D.LIZIZ(LIZ);
        int hashCode = LIZIZ.hashCode();
        if (hashCode == -951796768 ? LIZIZ.equals("aweme://paidcontent/collections") : hashCode == 43577964 ? LIZIZ.equals("aweme://paidcontent/collections/detail/reviews") : hashCode == 196682080 && LIZIZ.equals("aweme://paidcontent/collections/detail")) {
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2;
        String str3;
        SmartRoute buildRoute;
        Intent extra;
        Intent extra2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Intent extra3;
        Intent extra4;
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null) {
            extra4.putExtra("ttrc_session_id", LIZ);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (routeIntent != null && (extra3 = routeIntent.getExtra()) != null) {
            extra3.putExtra("ttrc_session_start_time", elapsedRealtime);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        Bundle bundle = null;
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            str = uri3.getScheme();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append("://");
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str2 = uri2.getHost();
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str3 = uri.getPath();
        } else {
            str3 = null;
        }
        LIZ2.append(str3);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (o.LJ(LIZIZ, "aweme://paidcontent/collections/detail/reviews")) {
            buildRoute = SmartRouter.buildRoute(context, "aweme://paidcontent/collections/detail");
            if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
                bundle = C16880lQ.LLJJIJI(extra2);
            }
            buildRoute.withParam(bundle);
            buildRoute.withParam("review_details", true);
        } else {
            buildRoute = SmartRouter.buildRoute(context, LIZIZ);
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                bundle = C16880lQ.LLJJIJI(extra);
            }
            buildRoute.withParam(bundle);
        }
        buildRoute.withParam("has_not_been_intercepted", true);
        buildRoute.open();
        return true;
    }
}
