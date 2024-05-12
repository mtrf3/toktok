package com.bytedance.router.route;

import X.C04250Er;
import X.C32I;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MultiRoute extends BaseRoute {
    @Override // com.bytedance.router.route.BaseRoute
    public MultiRouteIntent getRouteIntent() {
        RouteIntent routeIntent = super.getRouteIntent();
        if (routeIntent != null) {
            return (MultiRouteIntent) routeIntent;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.router.MultiRouteIntent");
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        o.LJIIIZ(context, "context");
        ArrayList<BaseRoute> routes = getRouteIntent().getRoutes();
        ArrayList arrayList = new ArrayList(C32I.LJJL(routes, 10));
        Iterator<BaseRoute> it = routes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getComponent(context));
        }
        Object[] array = arrayList.toArray(new Intent[0]);
        if (array != null) {
            C04250Er.LIZ(context, (Intent[]) array, getRouteIntent().getAnimationBundle());
            RouteManager routeManager = RouteManager.getInstance();
            o.LJIIIIZZ(routeManager, "RouteManager.getInstance()");
            routeManager.getRouteCallbackProxy().onSuccess(null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
