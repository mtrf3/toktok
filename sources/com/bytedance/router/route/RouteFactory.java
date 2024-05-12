package com.bytedance.router.route;

import X.C16880lQ;
import X.X1D;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RoutesConfig;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.util.Logger;

/* loaded from: classes11.dex */
public class RouteFactory {
    public static boolean isSchemeLegal(String str, RoutesConfig routesConfig) {
        if (str.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String str2 : otherSchemes) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static BaseRoute createRoute(RouteIntent routeIntent, String str, RoutesConfig routesConfig) {
        if (routeIntent instanceof MultiRouteIntent) {
            return new MultiRoute();
        }
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            return new FragmentNavigationRoute();
        }
        String url = routeIntent.getUrl();
        Class<?> cls = null;
        if (TextUtils.isEmpty(url)) {
            Logger.e("RouteFactory#createRoute url is null!!!");
            return null;
        }
        Uri parse = UriProtector.parse(url);
        if (!parse.isHierarchical()) {
            Logger.e("RouteFactory#createRoute url is not illegal!!!");
            return null;
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            Logger.e("RouteFactory#createRoute scheme is null!!!");
            return null;
        }
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            Logger.e("RouteFactory#createRoute host is null!!!");
            return null;
        }
        if (!isSchemeLegal(scheme, routesConfig)) {
            Logger.e(C16880lQ.LLLZ("RouteFactory#createRoute router cannot support this scheme protocol: %s\nRouteConfig:\n%s", new Object[]{routeIntent.getUrl(), routesConfig.toString()}));
            return null;
        }
        if (host.startsWith("bt.")) {
            Class<? extends BaseRoute> routeClass = routesConfig.getRouteClass(host);
            if (routeClass == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RouteFactory#createRoute there is no route for this host: ");
                LIZ.append(host);
                Logger.e(X1D.LIZIZ(LIZ));
                return null;
            }
            try {
                return routeClass.newInstance();
            } catch (Exception e) {
                Logger.e("RouteFactory#createRoute routeClass new instance exception!!!");
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e2) {
            C16880lQ.LLLLIIL(e2);
        } catch (Throwable unused) {
        }
        if (cls != null) {
            if (Service.class.isAssignableFrom(cls)) {
                return new ServiceRoute();
            }
            if (BroadcastReceiver.class.isAssignableFrom(cls)) {
                return new BroadcastRoute();
            }
            if (IRouteAction.class.isAssignableFrom(cls)) {
                return new ActionRoute(cls);
            }
        }
        return new ActivityRoute();
    }
}
