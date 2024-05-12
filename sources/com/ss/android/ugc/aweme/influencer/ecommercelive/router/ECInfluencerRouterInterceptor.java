package com.ss.android.ugc.aweme.influencer.ecommercelive.router;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C45804HyK;
import X.C62712d9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.EcommerceInfluencerServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ECInfluencerRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "ec");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        Bundle bundle;
        ActivityC45651qj LJJIFFI2;
        FragmentManager supportFragmentManager2;
        Bundle bundle2;
        if (routeIntent != null) {
            str = routeIntent.getPath();
        } else {
            str = null;
        }
        if (o.LJ(str, "/billboard_effect_v2")) {
            if (context == null || (LJJIFFI2 = C45804HyK.LJJIFFI(context)) == null || (supportFragmentManager2 = LJJIFFI2.getSupportFragmentManager()) == null) {
                return false;
            }
            IEcommerceInfluencerService LJ = EcommerceInfluencerServiceImpl.LJ();
            Intent extra = routeIntent.getExtra();
            if (extra != null && (bundle2 = C16880lQ.LLJJIJI(extra)) != null) {
                bundle2.putParcelable("uri", routeIntent.getUri());
            } else {
                bundle2 = new Bundle();
            }
            LJ.LIZJ(supportFragmentManager2, bundle2);
            return true;
        }
        if (!o.LJ(str, "/live_highlight") || context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return false;
        }
        IEcommerceInfluencerService LJ2 = EcommerceInfluencerServiceImpl.LJ();
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null && (bundle = C16880lQ.LLJJIJI(extra2)) != null) {
            bundle.putParcelable("uri", routeIntent.getUri());
        } else {
            bundle = new Bundle();
        }
        LJ2.LIZLLL(supportFragmentManager, bundle);
        return true;
    }
}
