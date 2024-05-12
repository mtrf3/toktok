package com.bytedance.router;

import X.C16880lQ;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.mapping.SmartRouterInterceptor;
import com.bytedance.router.monitor.RouterMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class InterceptManager {
    public IInterceptorProvider interceptorProvider;
    public volatile boolean mInterceptorProviderIsInited;
    public RewriteManager mRewriteManager;
    public SmartRouterInterceptor mSmartRouterInterceptor;
    public AtomicBoolean mIsInited = new AtomicBoolean(false);
    public List<IInterceptor> mInterceptors = new LinkedList();
    public List<IInterceptor> mLastInterceptors = new LinkedList();
    public Map<String, IInterceptor> mAssignInterceptors = new HashMap();

    public void initInterceptors() {
        if (!this.mIsInited.get()) {
            ArrayList arrayList = new ArrayList();
            this.mSmartRouterInterceptor.initInterceptors(arrayList);
            synchronized (this) {
                this.mInterceptors.addAll(arrayList);
            }
            HashMap hashMap = new HashMap();
            this.mSmartRouterInterceptor.initAssignInterceptors(hashMap);
            this.mAssignInterceptors.putAll(hashMap);
        }
        this.mIsInited.set(true);
    }

    public InterceptManager() {
        if (this.mRewriteManager == null) {
            this.mRewriteManager = new RewriteManager();
        }
        synchronized (this) {
            this.mInterceptors.add(this.mRewriteManager);
        }
        this.mSmartRouterInterceptor = new SmartRouterInterceptor();
    }

    public RewriteManager getRewriteManager() {
        return this.mRewriteManager;
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return;
        }
        synchronized (this) {
            this.mInterceptors.add(iInterceptor);
        }
    }

    public void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        if (iInterceptorProvider == null) {
            return;
        }
        this.interceptorProvider = iInterceptorProvider;
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return;
        }
        synchronized (this) {
            this.mLastInterceptors.add(iInterceptor);
        }
    }

    public boolean whetherIntercept(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            if (!this.mInterceptorProviderIsInited) {
                IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                if (iInterceptorProvider != null) {
                    this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                }
                this.mInterceptorProviderIsInited = true;
            }
            RouteIntent build = new RouteIntent.Builder(str).build();
            Iterator it = new ArrayList(this.mInterceptors).iterator();
            while (it.hasNext()) {
                if (((IInterceptor) it.next()).shouldHandleRoute(build)) {
                    return true;
                }
            }
            Iterator it2 = new ArrayList(this.mLastInterceptors).iterator();
            while (it2.hasNext()) {
                if (((IInterceptor) it2.next()).shouldHandleRoute(build)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        if (TextUtils.isEmpty(str) || iInterceptor == null) {
            return;
        }
        synchronized (this) {
            this.mAssignInterceptors.put(str, iInterceptor);
        }
    }

    public boolean processRouteIntent(Context context, RouteIntent routeIntent) {
        boolean z;
        boolean z2;
        IInterceptor iInterceptor;
        RouterMonitor routerMonitor;
        if (routeIntent == null) {
            return true;
        }
        synchronized (this) {
            if (!this.mInterceptorProviderIsInited) {
                IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                if (iInterceptorProvider != null) {
                    this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                }
                this.mInterceptorProviderIsInited = true;
            }
            Iterator it = new ArrayList(this.mInterceptors).iterator();
            do {
                z = false;
                if (it.hasNext()) {
                    iInterceptor = (IInterceptor) it.next();
                    routerMonitor = RouterMonitor.INSTANCE;
                    routerMonitor.startMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                    if (iInterceptor.matchInterceptRules(routeIntent)) {
                        z = iInterceptor.onInterceptRoute(context, routeIntent);
                        routerMonitor.reportIfUrlChanged(routeIntent.getRouteId(), routeIntent.getUrl(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                    }
                    routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                } else {
                    Iterator it2 = new ArrayList(this.mLastInterceptors).iterator();
                    while (it2.hasNext()) {
                        IInterceptor iInterceptor2 = (IInterceptor) it2.next();
                        RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
                        routerMonitor2.startMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor2.getClass()));
                        if (iInterceptor2.matchInterceptRules(routeIntent)) {
                            z2 = iInterceptor2.onInterceptRoute(context, routeIntent);
                            routerMonitor2.reportIfUrlChanged(routeIntent.getRouteId(), routeIntent.getUrl(), C16880lQ.LJLLJ(iInterceptor2.getClass()));
                        } else {
                            z2 = false;
                        }
                        routerMonitor2.stopMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor2.getClass()));
                        if (z2) {
                            routerMonitor2.reportIntercepted(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor2.getClass()));
                            return true;
                        }
                    }
                    return false;
                }
            } while (!z);
            routerMonitor.reportIntercepted(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
            return true;
        }
    }

    public boolean processAssignInterceptor(Context context, List<String> list, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return true;
        }
        synchronized (this) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                IInterceptor iInterceptor = this.mAssignInterceptors.get(it.next());
                if (iInterceptor != null) {
                    RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
                    routerMonitor.startMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                    if (iInterceptor.onInterceptRoute(context, routeIntent)) {
                        routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                        routerMonitor.reportIntercepted(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                        return true;
                    }
                    routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), C16880lQ.LJLLJ(iInterceptor.getClass()));
                }
            }
            return false;
        }
    }
}
