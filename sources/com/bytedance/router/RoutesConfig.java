package com.bytedance.router;

import X.C16880lQ;
import X.C1FJ;
import android.text.TextUtils;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.BroadcastRoute;
import com.bytedance.router.route.ServiceRoute;
import com.bytedance.router.util.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class RoutesConfig {
    public Set<String> mOtherSchemeSet;
    public String[] mOtherSchemes;
    public Map<String, Class<? extends BaseRoute>> mRouteMap;
    public String mScheme;

    public static RoutesConfig defaultConfig() {
        RoutesConfig routesConfig = new RoutesConfig("snssdk143");
        routesConfig.withOtherSchemes(RouterConstant.DEFAULT_HISTORY_SCHEME);
        routesConfig.withSupportRoute("bt.service", ServiceRoute.class);
        routesConfig.withSupportRoute("bt.broadcast", BroadcastRoute.class);
        return routesConfig;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder("scheme:");
        sb.append(this.mScheme);
        sb.append("\nother schemes: ");
        String[] strArr = this.mOtherSchemes;
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(',');
            }
            sb.append("\n");
        }
        Map<String, Class<? extends BaseRoute>> map = this.mRouteMap;
        if (map != null) {
            i = map.size();
        } else {
            i = 0;
        }
        sb.append(C16880lQ.LLLZ("other supported routes: %s routes\n", new Object[]{Integer.valueOf(i)}));
        if (i > 0) {
            for (Map.Entry<String, Class<? extends BaseRoute>> entry : this.mRouteMap.entrySet()) {
                sb.append("\t");
                sb.append(((Class) C1FJ.LIZJ(sb, entry.getKey(), ":", entry)).getName());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public String[] getOtherSchemes() {
        return this.mOtherSchemes;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public RoutesConfig(String str) {
        this.mScheme = str;
        HashMap hashMap = new HashMap();
        this.mRouteMap = hashMap;
        hashMap.put("bt.service", ServiceRoute.class);
        this.mRouteMap.put("bt.broadcast", BroadcastRoute.class);
    }

    public Class<? extends BaseRoute> getRouteClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mRouteMap.get(str);
    }

    public boolean supportScheme(String str) {
        if (str == null || str.length() == 0 || str.equals(this.mScheme)) {
            return true;
        }
        Set<String> set = this.mOtherSchemeSet;
        if (set != null && set.contains(str)) {
            return true;
        }
        return false;
    }

    public RoutesConfig withOtherSchemes(String[] strArr) {
        this.mOtherSchemes = strArr;
        if (strArr == null || strArr.length == 0) {
            this.mOtherSchemeSet = null;
        } else {
            Set<String> set = this.mOtherSchemeSet;
            if (set != null) {
                set.clear();
            } else {
                this.mOtherSchemeSet = new HashSet();
            }
            this.mOtherSchemeSet.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public RoutesConfig withSupportRoute(String str, Class<? extends BaseRoute> cls) {
        if (TextUtils.isEmpty(str) || cls == null) {
            Logger.w("RoutesConfig#withHostRoute() host or routeClass is null!!!");
            return this;
        }
        if (this.mRouteMap == null) {
            this.mRouteMap = new HashMap();
        }
        this.mRouteMap.put(str, cls);
        return this;
    }
}
