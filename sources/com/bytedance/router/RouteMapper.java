package com.bytedance.router;

import X.C06540Nm;
import X.C16880lQ;
import X.C79061V1d;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.mapping.ExternalSmartRouter$$Mapping;
import com.bytedance.router.mapping.SmartRouter$$Mapping;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class RouteMapper {
    public IConfigUpdateListener mConfigUpdateListener;
    public Context mContext;
    public IMappingInitializer mIMappingInitializer;
    public Map<String, String> mOriginExternalMap;
    public Map<String, String> mOriginMap;
    public ServerParam mServerParam;
    public final Object mRouteMapLock = new Object();
    public SmartRouter$$Mapping mSmartRouter$$Mapping = new SmartRouter$$Mapping();
    public ExternalSmartRouter$$Mapping mExternalSmartRouter$$Mapping = new ExternalSmartRouter$$Mapping();
    public AtomicBoolean mIsInited = new AtomicBoolean(false);
    public Map<String, String> mRouteMap = new HashMap(this.mSmartRouter$$Mapping.getMapSize() + 1, 1.0f);
    public Map<String, String> mExternalRouteMap = new HashMap(this.mExternalSmartRouter$$Mapping.getMapSize() + 1, 1.0f);
    public Map<String, List<String>> mRouteInterceptorMap = new HashMap();
    public Map<String, List<String>> mExternalRouteInterceptorMap = new HashMap();
    public List<String> mTestUrlList = new ArrayList();

    /* loaded from: classes11.dex */
    public interface IConfigUpdateListener {
        void onConfigChanged(RouterConfig routerConfig);
    }

    public void updateNetRouteConfig() {
    }

    private void initRouteMap() {
        synchronized (this.mRouteMapLock) {
            if (!this.mIsInited.get()) {
                this.mSmartRouter$$Mapping.init(this.mRouteMap);
                this.mExternalSmartRouter$$Mapping.init(this.mExternalRouteMap);
                this.mSmartRouter$$Mapping.initInterceptorMap(this.mRouteInterceptorMap);
                this.mExternalSmartRouter$$Mapping.initInterceptorMap(this.mExternalRouteInterceptorMap);
                this.mIsInited.set(true);
            }
        }
    }

    public void loadLocalRouteConfig() {
        String string = F9J.LIZIZ(this.mContext, 0, "smartrouter_conf").getString("smartrouter_config", "");
        if (!TextUtils.isEmpty(string)) {
            RouterConfig parse = RouterConfig.parse(string);
            if (this.mConfigUpdateListener != null && parse != null && !RouterConfig.isExpired(this.mContext, parse)) {
                this.mConfigUpdateListener.onConfigChanged(parse);
                if (Logger.isDebug()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Load local routerConfig: ");
                    LIZ.append(string);
                    Logger.d(X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public void requestRouteConfig() {
        ServerParam serverParam = this.mServerParam;
        if (serverParam == null || !serverParam.isAvailable()) {
            Logger.e("RouteMapper#requestRouteConfig serverParam is null or unavailable,You must use SmartRouter#init(Context, ServerParam) before !!!");
        } else {
            PthreadAsyncTask.execute(new Runnable() { // from class: com.bytedance.router.RouteMapper.2
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_router_RouteMapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_router_RouteMapper$2__run$___twin___() {
                    RouteMapper.this.updateNetRouteConfig();
                }

                public static void com_bytedance_router_RouteMapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_bytedance_router_RouteMapper$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public Map<String, String> getExternalRouteMap() {
        return this.mExternalRouteMap;
    }

    public Map<String, String> getRouteMap() {
        return this.mRouteMap;
    }

    public ServerParam getServerParam() {
        return this.mServerParam;
    }

    public List<String> getTestUrlList() {
        return this.mTestUrlList;
    }

    private void initDynamicRoutes(ServerParam serverParam) {
        this.mServerParam = serverParam;
        if (serverParam == null || !serverParam.isAvailable()) {
            Logger.e("RouteMapper#initDynamicRoutes serverParam is null or unavailable!!!");
        } else {
            PthreadAsyncTask.execute(new Runnable() { // from class: com.bytedance.router.RouteMapper.1
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_router_RouteMapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_router_RouteMapper$1__run$___twin___() {
                    RouteMapper.this.loadLocalRouteConfig();
                    RouteMapper.this.updateNetRouteConfig();
                }

                public static void com_bytedance_router_RouteMapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_bytedance_router_RouteMapper$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void init(Context context) {
        init(context, null, null);
    }

    public boolean installModuleMapping(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Object newInstance = Class.forName(C16880lQ.LLLZ("com.bytedance.router.mapping.SmartRouter$$Mapping$$%s", new Object[]{str.replace(".", "_")})).newInstance();
            if (newInstance instanceof IMappingInitializer) {
                synchronized (this.mRouteMapLock) {
                    ((IMappingInitializer) newInstance).init(this.mRouteMap);
                    ((IMappingInitializer) newInstance).initInterceptorMap(this.mRouteInterceptorMap);
                }
                return true;
            }
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
        } catch (InstantiationException e3) {
            C16880lQ.LLLLIIL(e3);
        }
        return false;
    }

    public boolean loadModuleMapping(String str) {
        Object newInstance;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            newInstance = Class.forName(C16880lQ.LLLZ("com.bytedance.router.generator.mapping.SmartrouterMapping$$%s", new Object[]{str})).newInstance();
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
        } catch (InstantiationException e3) {
            C16880lQ.LLLLIIL(e3);
        }
        if (newInstance.getClass() == SmartRouter$$Mapping.class) {
            synchronized (this.mRouteMapLock) {
                ((IMappingInitializer) newInstance).init(this.mRouteMap);
                ((IMappingInitializer) newInstance).initInterceptorMap(this.mRouteInterceptorMap);
            }
            return true;
        }
        if (newInstance.getClass() == ExternalSmartRouter$$Mapping.class) {
            synchronized (this.mRouteMapLock) {
                ((IMappingInitializer) newInstance).init(this.mExternalRouteMap);
                ((IMappingInitializer) newInstance).initInterceptorMap(this.mExternalRouteInterceptorMap);
            }
            return true;
        }
        return false;
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mIMappingInitializer = iMappingInitializer;
    }

    public void updateMapping(Map<String, String> map) {
        synchronized (this.mRouteMapLock) {
            if (this.mOriginMap == null) {
                HashMap hashMap = new HashMap();
                this.mOriginMap = hashMap;
                hashMap.putAll(this.mRouteMap);
                this.mRouteMap.putAll(map);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(this.mOriginMap);
                hashMap2.putAll(map);
                this.mRouteMap = hashMap2;
            }
        }
    }

    private String getTargetClassFromUri(String str, Map<String, String> map) {
        String realRouteUrl = Util.getRealRouteUrl(str);
        String str2 = map.get(realRouteUrl);
        if (TextUtils.isEmpty(str2) && realRouteUrl.endsWith("/") && realRouteUrl.length() > 1) {
            realRouteUrl = C79061V1d.LJ(realRouteUrl, 1, 0);
            str2 = map.get(realRouteUrl);
        }
        if (TextUtils.isEmpty(str2)) {
            realRouteUrl = Util.getRouteUrl(str);
            str2 = map.get(realRouteUrl);
        }
        if (TextUtils.isEmpty(str2) && realRouteUrl.endsWith("/") && realRouteUrl.length() > 1) {
            return map.get(realRouteUrl.substring(0, realRouteUrl.length() - 1));
        }
        return str2;
    }

    public List<String> getInterceptorList(String str, boolean z) {
        if (z) {
            if (this.mExternalRouteInterceptorMap == null) {
                return null;
            }
            return this.mExternalRouteInterceptorMap.get(Util.getRealRouteUrl(str));
        }
        if (this.mRouteInterceptorMap == null) {
            return null;
        }
        return this.mRouteInterceptorMap.get(Util.getRealRouteUrl(str));
    }

    public String getTargetClass(String str, boolean z) {
        String targetClassFromUri;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (z) {
            targetClassFromUri = getTargetClassFromUri(str, this.mExternalRouteMap);
        } else {
            targetClassFromUri = getTargetClassFromUri(str, this.mRouteMap);
        }
        if (TextUtils.isEmpty(targetClassFromUri) && !this.mIsInited.get()) {
            initRouteMap();
            if (z) {
                targetClassFromUri = getTargetClassFromUri(str, this.mExternalRouteMap);
            } else {
                targetClassFromUri = getTargetClassFromUri(str, this.mRouteMap);
            }
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("RouteMapper#getTargetClass url: ", str, "  |  targetClass: ", targetClassFromUri, "  |  isExternal: ");
        LIZLLL.append(z);
        Logger.d(X1D.LIZIZ(LIZLLL));
        return targetClassFromUri;
    }

    public void init(Context context, ServerParam serverParam, IConfigUpdateListener iConfigUpdateListener) {
        Logger.d("RouteMapper#init RouteMapper");
        this.mContext = context;
        this.mConfigUpdateListener = iConfigUpdateListener;
        if (!this.mIsInited.get()) {
            initRouteMap();
        }
        Logger.d(C16880lQ.LLLZ("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mRouteMap.size())}));
        Logger.d(C16880lQ.LLLZ("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mExternalRouteMap.size())}));
        if (serverParam != null) {
            initDynamicRoutes(serverParam);
        }
    }
}
