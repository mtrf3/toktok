package com.bytedance.router;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.autowire.AutowiredService;
import com.bytedance.router.autowire.ISerializationService;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.fragment.FindNavigationContainerResult;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.util.Logger;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes11.dex */
public class SmartRouter {
    public static ISerializationService serializationService;

    public static boolean isDebug() {
        return Logger.isDebug();
    }

    public static void requestRouteConfig() {
        RouteManager.getInstance().requestRouteConfig();
    }

    public static ISerializationService getSerializationService() {
        return serializationService;
    }

    public static void addInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().addInterceptor(iInterceptor);
    }

    public static void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        RouteManager.getInstance().addInterceptroProvider(iInterceptorProvider);
    }

    public static void addLastInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().addLastInterceptor(iInterceptor);
    }

    public static void addRewriteMap(Map<String, String> map) {
        RouteManager.getInstance().setRewriteMap(map);
    }

    public static void autowire(Object obj) {
        AutowiredService.inst().autowire(obj);
    }

    public static boolean canOpen(String str) {
        return RouteManager.getInstance().canOpen(str);
    }

    public static RoutesConfig configRouter(String str) {
        RoutesConfig routesConfig = new RoutesConfig(str);
        RouteManager.getInstance().setConfig(routesConfig);
        return routesConfig;
    }

    public static FragmentRoute fragmentNavigation(Fragment fragment) {
        FindNavigationContainerResult findNavigationContainer = NavigationUtils.findNavigationContainer(fragment);
        if (findNavigationContainer != null) {
            FragmentRoute fragmentRoute = new FragmentRoute(null, fragment, findNavigationContainer.getContainer());
            fragmentRoute.withFragmentManager(findNavigationContainer.getFragmentManager());
            return fragmentRoute;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("you should implement FragmentNavigationContainer in your activity or the parent fragment for ");
        LIZ.append(fragment.getClass().getName());
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public static void init(Context context) {
        RouteManager.getInstance().init(C16880lQ.LLLLL(context));
        RouterMonitor.INSTANCE.init((Application) C16880lQ.LLLLL(context));
    }

    public static void injectInitializer(IRouterInjectInitializer iRouterInjectInitializer) {
        RouteManager.getInstance().injectInitializer(iRouterInjectInitializer);
    }

    public static boolean isSmartIntent(Intent intent) {
        return SmartIntent.isSmartIntent(intent);
    }

    public static void onPluginInstall(Collection<String> collection) {
        RouteManager.getInstance().installModuleMappings(collection);
    }

    public static void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        RouteManager.getInstance().setCustomInitializer(iMappingInitializer);
    }

    public static void setDebug(boolean z) {
        Logger.setDebug(z);
    }

    public static void setSerializationService(ISerializationService iSerializationService) {
        serializationService = iSerializationService;
    }

    public static void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        RouteManager.getInstance().setSupportPluginCallback(supportPluginCallback);
    }

    public static SmartBundle smartBundle(Bundle bundle) {
        return new SmartBundle(bundle);
    }

    public static Intent smartIntent(Intent intent) {
        return SmartIntent.smartIntent(intent);
    }

    public static FragmentRoute fragmentNavigation(ActivityC45651qj activityC45651qj) {
        FindNavigationContainerResult findNavigationContainer = NavigationUtils.findNavigationContainer(activityC45651qj);
        if (findNavigationContainer != null) {
            FragmentRoute fragmentRoute = new FragmentRoute(activityC45651qj, findNavigationContainer.getContainer());
            fragmentRoute.withFragmentManager(findNavigationContainer.getFragmentManager());
            return fragmentRoute;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("you should implement FragmentNavigationContainer in your activity named ");
        LIZ.append(activityC45651qj.getClass().getName());
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public static SmartRoute buildFragmentRoute(Fragment fragment, String str) {
        SmartRoute smartRoute = new SmartRoute(fragment.mo49getActivity());
        smartRoute.withUrl(str);
        smartRoute.withFragment(fragment);
        return smartRoute;
    }

    public static SmartRoute buildRoute(Fragment fragment, String str) {
        SmartRoute smartRoute = new SmartRoute(fragment.mo49getActivity());
        smartRoute.withUrl(str);
        return smartRoute;
    }

    public static boolean canOpen(String str, boolean z) {
        return RouteManager.getInstance().canOpen(str, z);
    }

    public static void init(Context context, ServerParam serverParam) {
        RouteManager.getInstance().init(context, serverParam);
        RouterMonitor.INSTANCE.init((Application) C16880lQ.LLLLL(context));
    }

    public static void putRewriteValue(String str, String str2) {
        RouteManager.getInstance().putRewriteValue(str, str2);
    }

    public static SmartRoute buildRoute(Context context, String str) {
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(str);
        return smartRoute;
    }
}
