package com.bytedance.router;

import X.C16880lQ;
import X.C25620zW;
import X.X1D;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteMapper;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.fragment.PopOp;
import com.bytedance.router.fragment.PushOp;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.listener.IRouteIntentInterceptor;
import com.bytedance.router.listener.RouteCallbackProxy;
import com.bytedance.router.monitor.Constants;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.plugin.Plugin;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.route.ActivityRoute;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.IRoute;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.router.route.RouteFactory;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public class RouteManager {
    public Boolean alReadyInit;
    public IRouterInjectInitializer iRouterInjectInitializer;
    public Context mContext;
    public InterceptManager mInterceptManager;
    public List<Plugin> mPluginsList;
    public RouteCallbackProxy mRouteCallbackProxy;
    public IRouteIntentInterceptor mRouteIntentInterceptor;
    public RouteMapper mRouteMapper;
    public RoutesConfig mRoutesConfig;
    public ServerParam mServerParam;
    public SupportPluginCallback mSupportPluginCallback;

    /* loaded from: classes11.dex */
    public static class SingleBuilder {
        public static RouteManager sInstance = new RouteManager();
    }

    /* loaded from: classes11.dex */
    public static class StartupLock {
        public static ReentrantLock lock = new ReentrantLock();

        /* loaded from: classes11.dex */
        public static class SingletonHolder {
            public static final StartupLock INSTANCE = new StartupLock();
        }

        public void lock() {
            lock.lock();
        }

        public void unlock() {
            lock.unlock();
        }

        public StartupLock() {
        }

        public static StartupLock getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }

    private void tryInit() {
        if (this.alReadyInit.booleanValue()) {
            return;
        }
        try {
            StartupLock.getInstance().lock();
            if (this.alReadyInit.booleanValue()) {
                return;
            }
            this.mRouteMapper.init(this.mContext, this.mServerParam, new RouteMapper.IConfigUpdateListener() { // from class: com.bytedance.router.RouteManager.1
                @Override // com.bytedance.router.RouteMapper.IConfigUpdateListener
                public void onConfigChanged(RouterConfig routerConfig) {
                    if (routerConfig == null) {
                        return;
                    }
                    RouteManager.this.mRouteMapper.updateMapping(routerConfig.getIncMapping());
                    RouteManager.this.setRewriteMap(routerConfig.getRewriteMapping());
                }
            });
            this.mInterceptManager.initInterceptors();
            IRouterInjectInitializer iRouterInjectInitializer = this.iRouterInjectInitializer;
            if (iRouterInjectInitializer != null) {
                iRouterInjectInitializer.injectInitialize();
            }
            this.alReadyInit = Boolean.TRUE;
        } finally {
            StartupLock.getInstance().unlock();
        }
    }

    public List<String> getTestUrlList() {
        return this.mRouteMapper.getTestUrlList();
    }

    public void requestRouteConfig() {
        this.mRouteMapper.requestRouteConfig();
    }

    public RouteManager() {
        this.mRoutesConfig = RoutesConfig.defaultConfig();
        this.alReadyInit = Boolean.FALSE;
        this.iRouterInjectInitializer = null;
        this.mRouteMapper = new RouteMapper();
        this.mInterceptManager = new InterceptManager();
        this.mRouteCallbackProxy = new RouteCallbackProxy();
    }

    public Map<String, String> getExternalRouteMap() {
        tryInit();
        return this.mRouteMapper.getExternalRouteMap();
    }

    public Map<String, String> getRouteMap() {
        tryInit();
        return this.mRouteMapper.getRouteMap();
    }

    public static final RouteManager getInstance() {
        return SingleBuilder.sInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    public RouteCallbackProxy getRouteCallbackProxy() {
        return this.mRouteCallbackProxy;
    }

    public RoutesConfig getRoutesConfig() {
        return this.mRoutesConfig;
    }

    private void callbackFragmentNavigationRouteIntent(FragmentNavigationRouteIntent fragmentNavigationRouteIntent) {
        PushOp pushOp = fragmentNavigationRouteIntent.getPushOp();
        if (pushOp != null) {
            String targetClass = this.mRouteMapper.getTargetClass(pushOp.getUrl(), false);
            if (targetClass == null || targetClass.isEmpty()) {
                this.mRouteCallbackProxy.onMissed(pushOp.getUrl());
            } else {
                this.mRouteCallbackProxy.onMatched(pushOp.getUrl());
            }
        }
    }

    private boolean checkLegality(RouteIntent routeIntent) {
        IRouteIntentInterceptor iRouteIntentInterceptor = this.mRouteIntentInterceptor;
        if (iRouteIntentInterceptor != null && iRouteIntentInterceptor.onIntercept(routeIntent)) {
            return false;
        }
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            return true;
        }
        String url = routeIntent.getUrl();
        if (Util.isLegalUrl(url, this.mRoutesConfig)) {
            return true;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("RouteManager#checkLegality originUrl is illegal: ", url, ". \n");
        LIZIZ.append(this.mRoutesConfig.toString());
        Logger.e(X1D.LIZIZ(LIZIZ));
        return false;
    }

    private String completeUrl(String str) {
        if (!Util.isLegalUrl(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RouteManager#RouteIntent-outputUrl is illegal and url is : ");
            LIZ.append(str);
            Logger.e(X1D.LIZIZ(LIZ));
            return null;
        }
        return Util.completeUrl(this.mRoutesConfig.getScheme(), str);
    }

    private synchronized boolean loadPluginsSchemas(String str) {
        SupportPluginCallback supportPluginCallback = this.mSupportPluginCallback;
        boolean z = false;
        if (supportPluginCallback == null) {
            Logger.w("if you use urls in plugins, you must set SupportPluginCallback to support plugins.");
            return false;
        }
        if (this.mPluginsList == null) {
            this.mPluginsList = supportPluginCallback.initPlugins();
        }
        if (this.mPluginsList == null) {
            throw new NullPointerException("size");
        }
        Iterator<Plugin> it = this.mPluginsList.iterator();
        while (it.hasNext()) {
            Plugin next = it.next();
            if (next.containsUrl(str)) {
                this.mSupportPluginCallback.loadPlugin(next, str);
                if (this.mRouteMapper.loadModuleMapping(next.getName())) {
                    z = true;
                }
                it.remove();
            }
        }
        return z;
    }

    private RouteIntent processFragmentNavigationRouteIntent(FragmentNavigationRouteIntent fragmentNavigationRouteIntent) {
        PushOp pushOp = fragmentNavigationRouteIntent.getPushOp();
        PopOp popOp = fragmentNavigationRouteIntent.getPopOp();
        if (pushOp != null) {
            pushOp.setUrl(completeUrl(pushOp.getUrl()));
        }
        if (popOp != null) {
            popOp.setUrl(completeUrl(popOp.getUrl()));
        }
        return fragmentNavigationRouteIntent;
    }

    private RouteIntent processRouteIntent(RouteIntent routeIntent) {
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            FragmentNavigationRouteIntent fragmentNavigationRouteIntent = (FragmentNavigationRouteIntent) routeIntent;
            processFragmentNavigationRouteIntent(fragmentNavigationRouteIntent);
            return fragmentNavigationRouteIntent;
        }
        routeIntent.setUrl(completeUrl(routeIntent.getUrl()));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RouteManager#processRouteIntent originUlr: ");
        LIZ.append(routeIntent.getOriginUrl());
        Logger.d(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RouteManager#processRouteIntent outputUlr: ");
        LIZ2.append(routeIntent.getUrl());
        Logger.d(X1D.LIZIZ(LIZ2));
        return routeIntent;
    }

    public void addGlobalResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.addCallback(openResultCallback);
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addInterceptor(iInterceptor);
    }

    public void addInterceptroProvider(IInterceptorProvider iInterceptorProvider) {
        this.mInterceptManager.addInterceptorProvider(iInterceptorProvider);
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addLastInterceptor(iInterceptor);
    }

    public boolean canOpen(String str) {
        return canOpen(str, false);
    }

    public void init(Context context) {
        init(context, null);
    }

    public void injectInitializer(IRouterInjectInitializer iRouterInjectInitializer) {
        this.iRouterInjectInitializer = iRouterInjectInitializer;
    }

    public void installModuleMappings(Collection<String> collection) {
        tryInit();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            this.mRouteMapper.installModuleMapping(it.next());
        }
    }

    public void removeGlobalResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.removeCallback(openResultCallback);
    }

    public void setConfig(RoutesConfig routesConfig) {
        this.mRoutesConfig = routesConfig;
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mRouteMapper.setCustomInitializer(iMappingInitializer);
    }

    public void setRewriteMap(Map<String, String> map) {
        this.mInterceptManager.getRewriteManager().setRewriteMap(map);
    }

    public void setRouteIntentInterceptor(IRouteIntentInterceptor iRouteIntentInterceptor) {
        this.mRouteIntentInterceptor = iRouteIntentInterceptor;
    }

    public void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        this.mSupportPluginCallback = supportPluginCallback;
    }

    public void setTempResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.setTempCallback(openResultCallback);
    }

    private IRoute getRoute(Context context, RouteIntent routeIntent) {
        List<String> interceptorList;
        if (!checkLegality(routeIntent)) {
            RouterMonitor.INSTANCE.reportFail(routeIntent.getRouteId(), "OriginUrl is illegal");
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            return null;
        }
        if (routeIntent.getNeedIntercept()) {
            RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
            String routeId = routeIntent.getRouteId();
            Constants.Companion companion = Constants.Companion;
            routerMonitor.startMeasureDuration(routeId, companion.getKEY_METRIC_INTERCEPTOR_DURATION());
            if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
                this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
                this.mRouteCallbackProxy.onSuccess(routeIntent.getExtra());
                return null;
            }
            routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), companion.getKEY_METRIC_INTERCEPTOR_DURATION());
        }
        processRouteIntent(routeIntent);
        if (routeIntent.getNeedIntercept() && (interceptorList = this.mRouteMapper.getInterceptorList(routeIntent.getUrl(), routeIntent.isExternalType())) != null && this.mInterceptManager.processAssignInterceptor(context, interceptorList, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            callbackFragmentNavigationRouteIntent((FragmentNavigationRouteIntent) routeIntent);
            return getRoute(routeIntent, (String) null);
        }
        String targetClass = this.mRouteMapper.getTargetClass(routeIntent.getUrl(), routeIntent.isExternalType());
        if (TextUtils.isEmpty(targetClass)) {
            if (!loadPluginsSchemas(routeIntent.getUrl())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RouteManager#open cannot find the routeUri with ");
                LIZ.append(routeIntent.getUrl());
                Logger.w(X1D.LIZIZ(LIZ));
                return null;
            }
            this.mRouteMapper.getTargetClass(routeIntent.getUrl(), routeIntent.isExternalType());
        }
        if (TextUtils.isEmpty(targetClass)) {
            this.mRouteCallbackProxy.onMissed(routeIntent.getOriginUrl());
        } else {
            this.mRouteCallbackProxy.onMatched(routeIntent.getUrl());
            RouterMonitor.INSTANCE.targetClass(routeIntent.getRouteId(), targetClass);
        }
        IRoute route = getRoute(routeIntent, targetClass);
        if (route == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RouteManager#Not support the route with url：");
            LIZ2.append(routeIntent.getUrl());
            Logger.e(X1D.LIZIZ(LIZ2));
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "Not support the route");
            return null;
        }
        return route;
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        this.mInterceptManager.addAssignInterceptor(str, iInterceptor);
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent) {
        tryInit();
        this.mRouteCallbackProxy.setTempCallback(routeIntent.getCallback());
        if (!checkLegality(routeIntent)) {
            RouterMonitor.INSTANCE.reportFail(routeIntent.getRouteId(), "OriginUrl is illegal");
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            return null;
        }
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String routeId = routeIntent.getRouteId();
        Constants.Companion companion = Constants.Companion;
        routerMonitor.startMeasureDuration(routeId, companion.getKEY_METRIC_INTERCEPTOR_DURATION());
        if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
        routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), companion.getKEY_METRIC_INTERCEPTOR_DURATION());
        processRouteIntent(routeIntent);
        List<String> interceptorList = this.mRouteMapper.getInterceptorList(routeIntent.getUrl(), routeIntent.isExternalType());
        if (interceptorList != null && this.mInterceptManager.processAssignInterceptor(context, interceptorList, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
        String targetClass = this.mRouteMapper.getTargetClass(routeIntent.getUrl(), routeIntent.isExternalType());
        if (TextUtils.isEmpty(targetClass)) {
            if (!loadPluginsSchemas(routeIntent.getUrl())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RouteManager#buildIntent cannot find the routeUri with ");
                LIZ.append(routeIntent.getUrl());
                Logger.w(X1D.LIZIZ(LIZ));
                return null;
            }
            targetClass = this.mRouteMapper.getTargetClass(routeIntent.getUrl(), routeIntent.isExternalType());
        }
        if (TextUtils.isEmpty(targetClass)) {
            routerMonitor.reportFail(routeIntent.getRouteId(), "buildIntent: TargetClass is null");
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "TargetClass is null");
            return null;
        }
        try {
            if (IRouteAction.class.isAssignableFrom(Class.forName(targetClass))) {
                return null;
            }
        } catch (ClassNotFoundException e) {
            RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
            String routeId2 = routeIntent.getRouteId();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("buildIntent: ");
            LIZ2.append(e.getMessage());
            routerMonitor2.reportFail(routeId2, X1D.LIZIZ(LIZ2));
            C16880lQ.LLLLIIL(e);
        }
        routeIntent.getExtra().setComponent(new ComponentName(context.getPackageName(), targetClass));
        this.mRouteCallbackProxy.onSuccess();
        return routeIntent.getExtra();
    }

    public boolean canOpen(String str, boolean z) {
        tryInit();
        if (TextUtils.isEmpty(str)) {
            Logger.w("SmartRoute#url is null!!!");
            return false;
        }
        if (!Util.isLegalUrl(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SmartRoute#url is illegal and url is ");
            LIZ.append(str);
            Logger.w(X1D.LIZIZ(LIZ));
            return false;
        }
        String realRouteUrl = Util.getRealRouteUrl(str);
        String rewriteUrl = this.mInterceptManager.getRewriteManager().getRewriteUrl(realRouteUrl);
        if (!TextUtils.isEmpty(rewriteUrl)) {
            realRouteUrl = rewriteUrl;
        }
        String scheme = UriProtector.parse(realRouteUrl).getScheme();
        if (TextUtils.isEmpty(scheme)) {
            scheme = UriProtector.parse(str).getScheme();
        }
        if (!this.mRoutesConfig.supportScheme(scheme)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SmartRouter not supports this scheme: ");
            LIZ2.append(scheme);
            Logger.w(X1D.LIZIZ(LIZ2));
            return false;
        }
        if (!this.mRoutesConfig.supportScheme(scheme)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SmartRouter not supports this scheme: ");
            LIZ3.append(scheme);
            Logger.w(X1D.LIZIZ(LIZ3));
            return false;
        }
        String targetClass = this.mRouteMapper.getTargetClass(realRouteUrl, z);
        if (TextUtils.isEmpty(targetClass) && loadPluginsSchemas(realRouteUrl)) {
            targetClass = this.mRouteMapper.getTargetClass(realRouteUrl, z);
        }
        if (TextUtils.isEmpty(targetClass) && !this.mInterceptManager.whetherIntercept(str)) {
            return false;
        }
        return true;
    }

    public void fragmentNavigation(Context context, RouteIntent routeIntent) {
        tryInit();
        open(context, routeIntent);
    }

    public void init(Context context, ServerParam serverParam) {
        this.mContext = context;
        this.mServerParam = serverParam;
    }

    public void open(Context context, RouteIntent routeIntent) {
        tryInit();
        this.mRouteCallbackProxy.setTempCallback(routeIntent.getCallback());
        IRoute route = getRoute(context, routeIntent);
        if (route == null) {
            RouterMonitor.INSTANCE.reportFail(routeIntent.getRouteId(), "getRoute failed");
            return;
        }
        try {
            RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
            String routeId = routeIntent.getRouteId();
            Constants.Companion companion = Constants.Companion;
            routerMonitor.startMeasureDuration(routeId, companion.getKEY_METRIC_OPEN_ROUTE_DURATION());
            route.open(context);
            routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), companion.getKEY_METRIC_OPEN_ROUTE_DURATION());
            routerMonitor.reportSuccess(routeIntent.getRouteId());
        } catch (Exception e) {
            Logger.e("Please check the scheme and its mapping class!!!");
            C16880lQ.LLLLIIL(e);
            RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
            String routeId2 = routeIntent.getRouteId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(e.getMessage());
            LIZ.append(" : Please check the scheme and its mapping class!!!");
            routerMonitor2.reportFail(routeId2, X1D.LIZIZ(LIZ));
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "Please check the scheme and its mapping class!");
        }
    }

    public void openMulti(Context context, MultiRouteIntent multiRouteIntent) {
        tryInit();
        ArrayList<RouteIntent> routeIntents = multiRouteIntent.getRouteIntents();
        ArrayList arrayList = new ArrayList();
        this.mRouteCallbackProxy.setMultiTempCallback(multiRouteIntent.getCallback());
        Iterator<RouteIntent> it = routeIntents.iterator();
        while (it.hasNext()) {
            RouteIntent next = it.next();
            next.setNeedIntercept(false);
            IRoute route = getRoute(context, next);
            if (route != null) {
                if (route instanceof ActivityRoute) {
                    arrayList.add(route);
                } else {
                    throw new IllegalArgumentException("Now only Activity route is supported");
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.mRouteCallbackProxy.onEmpty();
        } else {
            multiRouteIntent.getRoutes().addAll(arrayList);
            getRoute(multiRouteIntent, (String) null).open(context);
        }
    }

    public void putRewriteValue(String str, String str2) {
        this.mInterceptManager.getRewriteManager().addRewriteValue(str, str2);
    }

    private IRoute getRoute(RouteIntent routeIntent, String str) {
        BaseRoute createRoute = RouteFactory.createRoute(routeIntent, str, this.mRoutesConfig);
        if (createRoute != null) {
            createRoute.init(routeIntent, this.mRouteMapper);
        }
        return createRoute;
    }
}
