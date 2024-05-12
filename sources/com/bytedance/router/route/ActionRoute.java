package com.bytedance.router.route;

import X.C16880lQ;
import android.content.Context;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteManager;

/* loaded from: classes11.dex */
public class ActionRoute extends BaseRoute {
    public IRouteAction mMethodRoute;

    public ActionRoute(Class cls) {
        try {
            this.mMethodRoute = (IRouteAction) cls.newInstance();
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InstantiationException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        IRouteAction iRouteAction = this.mMethodRoute;
        if (iRouteAction != null) {
            Object open = iRouteAction.open(context, getUrl(), getParams());
            OpenResultCallback callback = getRouteIntent().getCallback();
            if (callback != null) {
                callback.onActionResult(open);
            }
            RouteManager.getInstance().getRouteCallbackProxy().onSuccess();
        }
    }
}
