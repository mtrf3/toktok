package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.C45804HyK;
import X.C62712d9;
import X.InterfaceC61208O0m;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* loaded from: classes8.dex */
public class FamilyPairingRouter implements InterfaceC61208O0m, IInterceptor {
    @Override // X.InterfaceC61208O0m
    public final boolean LIZ(Activity activity, String str) {
        return true;
    }

    @Override // X.InterfaceC61208O0m
    public final boolean open(String str) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null && routeIntent.getUri() != null) {
            str = routeIntent.getUri().getHost();
        } else {
            str = null;
        }
        return "teen_protection".equals(str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C45804HyK.LJIJJ(context);
        routeIntent.getOriginUrl();
        return true;
    }
}
