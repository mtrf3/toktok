package com.ss.android.ugc.aweme.setting.experiment;

import X.C16880lQ;
import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MarketInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "googleplay");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("market://details?id=");
            LIZ.append(packageName);
            C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ))));
            return true;
        } catch (Exception unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("https://play.google.com/store/apps/details?id=");
            LIZ2.append(packageName);
            C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ2))));
            return true;
        }
    }
}
