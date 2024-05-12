package com.bytedance.router.monitor;

import X.C113554cx;
import X.C16880lQ;
import X.C65777Prh;
import X.X1D;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class RouterMonitor {
    public static String currentRouteId;
    public static RouterMonitorListener mRouterMonitorListener;
    public static final RouterMonitor INSTANCE = new RouterMonitor();
    public static Map<String, RouteInfo> routeInfoMap = new LinkedHashMap();

    private final String generateRouteId() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(System.currentTimeMillis()));
        LIZ.append("-");
        LIZ.append(UUID.randomUUID().toString());
        return X1D.LIZIZ(LIZ);
    }

    private final JSONObject formatRouteLog(RouteInfo routeInfo) {
        JSONObject jSONObject = new JSONObject();
        Constants.Companion companion = Constants.Companion;
        jSONObject.put(companion.getKEY_URL(), routeInfo.getUrl());
        jSONObject.put(companion.getKEY_SCHEME(), routeInfo.getScheme());
        jSONObject.put(companion.getKEY_HOST(), routeInfo.getHost());
        jSONObject.put(companion.getKEY_PATH(), routeInfo.getPath());
        jSONObject.put(companion.getKEY_TOTAL_DURATION(), routeInfo.getTotalDuration());
        jSONObject.put(companion.getKEY_LOG_VERSION(), companion.getLOG_VERSION());
        jSONObject.put(companion.getKEY_TARGET_CLASS(), routeInfo.getTargetClass());
        jSONObject.put(companion.getKEY_PARAMS(), new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(routeInfo.getParams())));
        jSONObject.put(companion.getKEY_DURATIONS(), new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(routeInfo.getDurations())));
        jSONObject.put(companion.getKEY_URL_CHANGE_LOG(), new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(routeInfo.getUrlChangeLog())));
        return jSONObject;
    }

    private final void stopAllMeasureDuration(String str) {
        RouteInfo routeInfo;
        Map<String, Long> durations;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (durations = routeInfo.getDurations()) != null) {
            for (String str2 : durations.keySet()) {
                Long l = durations.get(str2);
                if (l != null && l.longValue() < 0) {
                    INSTANCE.stopMeasureDuration(str, str2);
                }
            }
        }
    }

    public final void init(Application application) {
        o.LJIIIZ(application, "application");
        application.registerActivityLifecycleCallbacks(new MonitorActivityLifecycleListener());
    }

    public final void reportSuccess(String str) {
        RouteInfo routeInfo = routeInfoMap.get(str);
        if (routeInfo != null) {
            routeInfo.setTotalDuration(System.currentTimeMillis() - routeInfo.getStartTime());
            RouterMonitor routerMonitor = INSTANCE;
            routerMonitor.stopAllMeasureDuration(str);
            JSONObject formatRouteLog = routerMonitor.formatRouteLog(routeInfo);
            RouterMonitorListener routerMonitorListener = mRouterMonitorListener;
            if (routerMonitorListener != null) {
                Constants.Companion companion = Constants.Companion;
                int status_success = companion.getSTATUS_SUCCESS();
                JSONObject jSONObject = new JSONObject();
                String key_category_route_host_path = companion.getKEY_CATEGORY_ROUTE_HOST_PATH();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(routeInfo.getHost());
                LIZ.append(routeInfo.getPath());
                jSONObject.put(key_category_route_host_path, X1D.LIZIZ(LIZ));
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_SCHEME(), routeInfo.getScheme());
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_STATUS(), companion.getSTATUS_SUCCESS());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(companion.getKEY_METRIC_TOTAL_DURATION(), routeInfo.getTotalDuration());
                jSONObject2.put(companion.getKEY_METRIC_INTERCEPTOR_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_INTERCEPTOR_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_ROUTE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_ROUTE_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_PAGE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_PAGE_DURATION()));
                routerMonitorListener.onReport(status_success, jSONObject, jSONObject2, formatRouteLog);
            }
            Map<String, RouteInfo> map = routeInfoMap;
            if (map != null) {
                C65777Prh.LIZJ(map).remove(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    public final void setRouterMonitorListener(RouterMonitorListener routerMonitorListener) {
        o.LJIIIZ(routerMonitorListener, "routerMonitorListener");
        mRouterMonitorListener = routerMonitorListener;
    }

    public final String startRoute(String str) {
        if (str != null) {
            String generateRouteId = INSTANCE.generateRouteId();
            RouteInfo routeInfo = new RouteInfo(System.currentTimeMillis(), str);
            Uri uri = UriProtector.parse(str);
            o.LJIIIIZZ(uri, "uri");
            String host = uri.getHost();
            String str2 = "";
            if (host == null) {
                host = "";
            }
            routeInfo.setHost(host);
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            routeInfo.setPath(path);
            String scheme = uri.getScheme();
            if (scheme != null) {
                str2 = scheme;
            }
            routeInfo.setScheme(str2);
            routeInfoMap.put(generateRouteId, routeInfo);
            currentRouteId = generateRouteId;
            return generateRouteId;
        }
        return null;
    }

    public final void collectExtra(String str, String str2) {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null) {
            routeInfo.setExtraInfo(str2);
        }
    }

    public final void collectParams(String str, Bundle bundle) {
        if (str != null && bundle != null) {
            Set<String> keySet = bundle.keySet();
            o.LJIIIIZZ(keySet, "keySet()");
            for (String it : keySet) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, it);
                if (LLJJIII != null) {
                    RouterMonitor routerMonitor = INSTANCE;
                    o.LJIIIIZZ(it, "it");
                    routerMonitor.collectParam(str, it, LLJJIII);
                }
            }
        }
    }

    public final void markRouterJump(Intent intent, String str) {
        if (intent != null) {
            Constants.Companion companion = Constants.Companion;
            intent.putExtra(companion.getKEY_ROUTER_JUMP_MARK(), true);
            intent.putExtra(companion.getKEY_CATEGORY_ROUTE_HOST_PATH(), str);
        }
    }

    public final void reportFail(String str, String str2) {
        RouteInfo routeInfo = routeInfoMap.get(str);
        if (routeInfo != null) {
            routeInfo.setErrorMsg(str2);
            routeInfo.setTotalDuration(System.currentTimeMillis() - routeInfo.getStartTime());
            RouterMonitor routerMonitor = INSTANCE;
            routerMonitor.stopAllMeasureDuration(str);
            JSONObject formatRouteLog = routerMonitor.formatRouteLog(routeInfo);
            Constants.Companion companion = Constants.Companion;
            formatRouteLog.put(companion.getKEY_ERROR_MSG(), str2);
            RouterMonitorListener routerMonitorListener = mRouterMonitorListener;
            if (routerMonitorListener != null) {
                int status_fail = companion.getSTATUS_FAIL();
                JSONObject jSONObject = new JSONObject();
                String key_category_route_host_path = companion.getKEY_CATEGORY_ROUTE_HOST_PATH();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(routeInfo.getHost());
                LIZ.append(routeInfo.getPath());
                jSONObject.put(key_category_route_host_path, X1D.LIZIZ(LIZ));
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_SCHEME(), routeInfo.getScheme());
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_STATUS(), companion.getSTATUS_FAIL());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(companion.getKEY_METRIC_TOTAL_DURATION(), routeInfo.getTotalDuration());
                jSONObject2.put(companion.getKEY_METRIC_INTERCEPTOR_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_INTERCEPTOR_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_ROUTE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_ROUTE_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_PAGE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_PAGE_DURATION()));
                routerMonitorListener.onReport(status_fail, jSONObject, jSONObject2, formatRouteLog);
            }
            Map<String, RouteInfo> map = routeInfoMap;
            if (map != null) {
                C65777Prh.LIZJ(map).remove(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    public final void reportIntercepted(String str, String str2) {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null) {
            routeInfo.setTotalDuration(System.currentTimeMillis() - routeInfo.getStartTime());
            RouterMonitor routerMonitor = INSTANCE;
            routerMonitor.stopAllMeasureDuration(str);
            JSONObject formatRouteLog = routerMonitor.formatRouteLog(routeInfo);
            Constants.Companion companion = Constants.Companion;
            formatRouteLog.put(companion.getKEY_INTERCEPTED_BY(), str2);
            RouterMonitorListener routerMonitorListener = mRouterMonitorListener;
            if (routerMonitorListener != null) {
                int status_intercepted = companion.getSTATUS_INTERCEPTED();
                JSONObject jSONObject = new JSONObject();
                String key_category_route_host_path = companion.getKEY_CATEGORY_ROUTE_HOST_PATH();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(routeInfo.getHost());
                LIZ.append(routeInfo.getPath());
                jSONObject.put(key_category_route_host_path, X1D.LIZIZ(LIZ));
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_SCHEME(), routeInfo.getScheme());
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_STATUS(), companion.getSTATUS_INTERCEPTED());
                jSONObject.put(companion.getKEY_INTERCEPTED_BY(), str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(companion.getKEY_METRIC_TOTAL_DURATION(), routeInfo.getTotalDuration());
                jSONObject2.put(companion.getKEY_METRIC_INTERCEPTOR_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_INTERCEPTOR_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_ROUTE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_ROUTE_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_PAGE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_PAGE_DURATION()));
                routerMonitorListener.onReport(status_intercepted, jSONObject, jSONObject2, formatRouteLog);
            }
            routeInfoMap.remove(str);
        }
    }

    public final void startMeasureDuration(String str, String name) {
        RouteInfo routeInfo;
        Map<String, Long> durations;
        o.LJIIIZ(name, "name");
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (durations = routeInfo.getDurations()) != null) {
            durations.put(name, Long.valueOf(-System.currentTimeMillis()));
        }
    }

    public final void stopMeasureDuration(String str, String name) {
        RouteInfo routeInfo;
        Map<String, Long> durations;
        Long l;
        o.LJIIIZ(name, "name");
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (durations = routeInfo.getDurations()) != null && (l = durations.get(name)) != null) {
            long longValue = l.longValue();
            if (l.longValue() > 0) {
                return;
            }
            durations.put(name, Long.valueOf(System.currentTimeMillis() + longValue));
        }
    }

    public final void targetClass(String str, String str2) {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null) {
            routeInfo.setTargetClass(str2);
        }
    }

    public final void collectParam(String str, String key, Object value) {
        RouteInfo routeInfo;
        Map<String, Object> params;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (params = routeInfo.getParams()) != null) {
            params.put(key, value);
        }
    }

    public final void reportIfUrlChanged(String str, String newUrl, String magician) {
        RouteInfo routeInfo;
        o.LJIIIZ(newUrl, "newUrl");
        o.LJIIIZ(magician, "magician");
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (!o.LJ(routeInfo.getUrl(), newUrl))) {
            Uri uri = UriProtector.parse(newUrl);
            Map<String, String> urlChangeLog = routeInfo.getUrlChangeLog();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(routeInfo.getUrl());
            LIZ.append(" => ");
            LIZ.append(newUrl);
            urlChangeLog.put(magician, X1D.LIZIZ(LIZ));
            routeInfo.setUrl(newUrl);
            o.LJIIIIZZ(uri, "uri");
            String host = uri.getHost();
            String str2 = "";
            if (host == null) {
                host = "";
            }
            routeInfo.setHost(host);
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            routeInfo.setPath(path);
            String scheme = uri.getScheme();
            if (scheme != null) {
                str2 = scheme;
            }
            routeInfo.setScheme(str2);
        }
    }

    public final void reportPageJump(String str, boolean z, String str2) {
        RouterMonitorListener routerMonitorListener;
        if (str != null && (routerMonitorListener = mRouterMonitorListener) != null) {
            routerMonitorListener.onReportPageJump(z, str, str2);
        }
    }

    public static /* synthetic */ void reportFail$default(RouterMonitor routerMonitor, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        routerMonitor.reportFail(str, str2);
    }
}
