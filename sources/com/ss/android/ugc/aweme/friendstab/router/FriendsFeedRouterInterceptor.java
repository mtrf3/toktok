package com.ss.android.ugc.aweme.friendstab.router;

import X.C16880lQ;
import X.C32I;
import X.C53295Kvr;
import X.C54029LIj;
import X.C62712d9;
import X.HG3;
import X.LWM;
import X.ORZ;
import X.RBX;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.s;

/* loaded from: classes4.dex */
public final class FriendsFeedRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null || !s.LJJJLZIJ(url, "//friends_tab", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String string;
        String string2;
        if (context == null || routeIntent == null || !((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        String url = routeIntent.getUrl();
        if (url != null && !s.LJJJLZIJ(url, "//friends_tab", false)) {
            return false;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(routeIntent.getExtra());
        if (C53295Kvr.LIZ()) {
            if (LLJJIJI != null && (string2 = LLJJIJI.getString("insert_ids")) != null) {
                LWM lwm = LWM.LIZIZ;
                List LJLJJL = s.LJLJJL(string2, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
                Iterator it = LJLJJL.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                lwm.LIZ.LIZIZ(arrayList);
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//main");
            buildRoute.addFlags(67108864);
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "Following");
            if (LLJJIJI != null) {
                buildRoute.withParam(LLJJIJI);
            }
            buildRoute.open();
        } else if (C54029LIj.LIZIZ.LJJIZ()) {
            if (LLJJIJI != null) {
                String string3 = LLJJIJI.getString("insert_ids");
                if (string3 != null) {
                    List LJLJJL2 = s.LJLJJL(string3, new String[]{","}, 0, 6);
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJLJJL2, 10));
                    Iterator it2 = LJLJJL2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next());
                    }
                    C54029LIj.LIZIZ.LIZ.LIZIZ(arrayList2);
                }
                C54029LIj.LIZIZ.LJIIL(LLJJIJI.getBoolean("insert_asc"));
            }
            SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//main");
            buildRoute2.addFlags(67108864);
            buildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
            if (LLJJIJI != null) {
                buildRoute2.withParam(LLJJIJI);
            }
            buildRoute2.open();
        } else {
            if (LLJJIJI == null || (string = LLJJIJI.getString("insert_ids")) == null || (str = (String) ORZ.LJLLLLLL(0, s.LJLJJL(string, new String[]{","}, 0, 6))) == null) {
                str = "";
            }
            if (str.length() > 0) {
                SmartRoute buildRoute3 = SmartRouter.buildRoute(context, "//aweme/detail");
                buildRoute3.withParam("id", str);
                buildRoute3.withParam(LLJJIJI);
                buildRoute3.open();
            } else {
                SmartRoute buildRoute4 = SmartRouter.buildRoute(context, "//main");
                buildRoute4.withParam(LLJJIJI);
                buildRoute4.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                buildRoute4.open();
            }
            return true;
        }
        return false;
    }
}
