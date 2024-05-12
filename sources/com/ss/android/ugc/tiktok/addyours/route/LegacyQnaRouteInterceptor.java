package com.ss.android.ugc.tiktok.addyours.route;

import X.C05L;
import X.C16880lQ;
import X.C221018lt;
import X.C234869Jq;
import X.C55480Lq0;
import X.C62712d9;
import X.C78857UxB;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import ujb.s;

/* loaded from: classes4.dex */
public final class LegacyQnaRouteInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null && (url = routeIntent.getUrl()) != null && s.LJJJLZIJ(url, "//qna/detail", false) && (!QnaService.LIZ().enablePublicQna() || C234869Jq.LIZ())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Intent extra;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInterceptRoute, routeIntent=");
        LIZ.append(routeIntent);
        C221018lt.LJFF("LegacyQnaRouteInterceptor", X1D.LIZIZ(LIZ));
        if (context == null) {
            return false;
        }
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            str = C16880lQ.LLJJIJIIJIL(extra, "id");
        } else {
            str = null;
        }
        if (C78857UxB.LJJJIL(str) && C234869Jq.LIZ()) {
            String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
            C55480Lq0.LIZIZ.LIZIZ(1);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("//add_yours/hub/");
            LIZ2.append(curUserId);
            SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ2));
            buildRoute.withParam("show_topic_detail", 1);
            buildRoute.withParam("topic_id", str);
            buildRoute.withParam("is_from_qa", true);
            buildRoute.withParam(routeIntent.getExtra());
            buildRoute.open();
        } else {
            C05L.LIZLLL(context, R.string.pqk);
        }
        return true;
    }
}
