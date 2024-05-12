package com.ss.android.ugc.aweme.router;

import X.C16880lQ;
import X.C51029K0z;
import X.C61017Nx7;
import X.C62712d9;
import X.C84763XOl;
import X.EF7;
import X.HG3;
import X.InterfaceC61208O0m;
import X.J9P;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LoginRouterInterceptor implements IInterceptor, InterfaceC61208O0m {
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
        return o.LJ("login", str);
    }

    @Override // X.InterfaceC61208O0m
    public final boolean open(String url) {
        o.LJIIIZ(url, "url");
        LIZIZ(null, url);
        return true;
    }

    @Override // X.InterfaceC61208O0m
    public final boolean LIZ(Activity activity, String str) {
        LIZIZ(activity, str);
        return true;
    }

    public final boolean LIZIZ(Activity activity, String str) {
        if (o.LJ("push", UriProtector.getQueryParameter(UriProtector.parse(str), "enter_from"))) {
            Intent LJIJI = C51029K0z.LJIJI(activity);
            Intent intent = new Intent(activity, (Class<?>) PushLoginActivity.class);
            if (activity != null && !((RBX) HG3.LJIILL()).isLogin()) {
                if (C61017Nx7.LIZ().LIZIZ()) {
                    C16880lQ.LIZIZ(activity, intent);
                } else {
                    activity.startActivities(new Intent[]{LJIJI, intent});
                }
            } else {
                Context LIZIZ = EF7.LIZIZ();
                LJIJI.setFlags(268435456);
                C16880lQ.LIZJ(LIZIZ, LJIJI);
            }
            return true;
        }
        if (activity == null) {
            J9P.LIZIZ(C84763XOl.LJIIIIZZ(), "h5", "", null, null);
        } else {
            J9P.LIZIZ(activity, "h5", "", null, null);
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            LIZIZ(activity, str2);
            return true;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            LIZIZ(LJIIIIZZ, str2);
            return true;
        }
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        LIZIZ(null, str);
        return true;
    }
}
