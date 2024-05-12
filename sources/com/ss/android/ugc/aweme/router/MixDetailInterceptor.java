package com.ss.android.ugc.aweme.router;

import X.C1046948z;
import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import ujb.o;

/* loaded from: classes2.dex */
public final class MixDetailInterceptor implements IInterceptor {
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
        return o.LJJJLIIL(X1D.LIZIZ(LIZ), "mix/detail", false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        String queryParameter;
        String queryParameter2;
        if (context == null || routeIntent == null || (uri = routeIntent.getUri()) == null || (queryParameter = UriProtector.getQueryParameter(uri, "from_share")) == null || !kotlin.jvm.internal.o.LJ(queryParameter, "true") || (queryParameter2 = UriProtector.getQueryParameter(uri, "mix_id")) == null) {
            return false;
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "user_id");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
        LJJIJIIJIL.LJIILIIL(context, null, null, "from_profile_mix_list", "click_chat_card", queryParameter2, queryParameter3, queryParameter3, true, null, "chat", Boolean.TRUE);
        C1046948z.LIZIZ(LJJIJIIJIL, "chat", queryParameter2, null, null, 0.0f, "click_chat_card", null, 128);
        LJJIJIIJIL.LJIILLIIL("chat", queryParameter2, null, null, "click_chat_card", null, null);
        return true;
    }
}
