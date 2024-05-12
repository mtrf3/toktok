package com.ss.android.ugc.aweme.notification;

import X.C221018lt;
import X.C52408KhY;
import X.C62712d9;
import X.X1D;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiggListRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("matchInterceptRules path = ");
        String str2 = null;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        b0.LJFF(LIZ, str, LIZ, "DiggListRouterInterceptor");
        if (routeIntent != null) {
            str2 = routeIntent.getHost();
        }
        if (o.LJ(str2, "digglist")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        if (!C52408KhY.LIZ || !matchInterceptRules(routeIntent) || routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(url, "diggType", "digg_type", false), "awemeId", "aweme_id", false), "refId", "ref_id", false), "isNew", "is_new", false), "coverURL", "cover_url", false), "lastReadTime", "last_read_time", false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInterceptRoute replaceResult = ");
        LIZ.append(LJJJJZ);
        C221018lt.LJFF("DiggListRouterInterceptor", X1D.LIZIZ(LIZ));
        if (routeIntent != null) {
            routeIntent.setUrl(LJJJJZ);
        }
        return false;
    }
}
