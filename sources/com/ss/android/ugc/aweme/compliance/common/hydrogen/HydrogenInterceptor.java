package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.C16880lQ;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.util.Util;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HydrogenInterceptor extends RewriteManager {
    @Override // com.bytedance.router.interceptor.RewriteManager, com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        o.LJIIIZ(routeIntent, "routeIntent");
        Uri.Builder buildUpon = UriProtector.parse(Util.getRouteUrl(routeIntent.getUrl())).buildUpon();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(routeIntent.getExtra());
        if (LLJJIJI != null) {
            for (String str : LLJJIJI.keySet()) {
                buildUpon.appendQueryParameter(str, String.valueOf(C16880lQ.LLJJIII(LLJJIJI, str)));
            }
        }
        SmartRouter.buildRoute(context, buildUpon.build().toString()).open();
        return true;
    }
}
