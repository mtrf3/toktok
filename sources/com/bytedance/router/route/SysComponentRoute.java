package com.bytedance.router.route;

import X.C16880lQ;
import X.X1D;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.util.Logger;

/* loaded from: classes11.dex */
public abstract class SysComponentRoute extends BaseRoute {
    public abstract void openComponent(Context context, Intent intent);

    @Override // com.bytedance.router.route.BaseRoute
    public Intent getComponent(Context context) {
        Class<?> cls;
        RouteIntent routeIntent = getRouteIntent();
        if (routeIntent == null) {
            RouteManager.getInstance().getRouteCallbackProxy();
            throw new NullPointerException("getOriginUrl");
        }
        String targetClass = getTargetClass();
        if (TextUtils.isEmpty(targetClass)) {
            RouteManager.getInstance().getRouteCallbackProxy().onFail(routeIntent.getOriginUrl(), "ClassPath is null");
            Logger.e("SysComponentRoute open routeIntent but the classPath is null!!!");
            return null;
        }
        Intent extra = routeIntent.getExtra();
        if (extra == null) {
            RouteManager.getInstance().getRouteCallbackProxy().onFail(routeIntent.getOriginUrl(), "Intent is null");
            Logger.e("SysComponentRoute open routeIntent but the intent is null!!!");
            return null;
        }
        try {
            cls = Class.forName(targetClass);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        extra.setComponent(new ComponentName(context, cls));
        extra.setPackage(context.getPackageName());
        return extra;
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        String str;
        Intent component = getComponent(context);
        if (component == null) {
            return;
        }
        if (getRouteIntent() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getRouteIntent().getHost());
            LIZ.append(getRouteIntent().getPath());
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "";
        }
        RouterMonitor.INSTANCE.markRouterJump(component, str);
        RouteManager.getInstance().getRouteCallbackProxy().onOpen(component);
        openComponent(context, component);
        RouteManager.getInstance().getRouteCallbackProxy().onSuccess(component);
    }
}
