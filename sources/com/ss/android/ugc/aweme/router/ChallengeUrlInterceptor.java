package com.ss.android.ugc.aweme.router;

import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.Set;
import ujb.o;

/* loaded from: classes2.dex */
public final class ChallengeUrlInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.getPath();
        }
        LIZ.append(str2);
        return o.LJJJLIIL(X1D.LIZIZ(LIZ), "aweme/challenge/detail", false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Set<String> set;
        String str;
        Uri uri;
        Uri.Builder buildUpon = UriProtector.parse("aweme://challenge/detail").buildUpon();
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            set = UriProtector.getQueryParameterNames(uri);
        } else {
            set = null;
        }
        if (set != null && !set.isEmpty()) {
            for (String str2 : set) {
                Uri uri2 = routeIntent.getUri();
                if (uri2 != null) {
                    str = UriProtector.getQueryParameter(uri2, str2);
                } else {
                    str = null;
                }
                buildUpon.appendQueryParameter(str2, str);
            }
        }
        if (routeIntent != null) {
            routeIntent.setUrl(buildUpon.toString());
        }
        return false;
    }
}
