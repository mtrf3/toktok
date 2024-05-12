package com.bytedance.router.interceptor;

import X.C62712d9;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class RewriteManager implements IInterceptor {
    public Object mLockObject = new Object();
    public Map<String, String> mRewriteMap;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public String getRewriteUrl(String str) {
        Map<String, String> map = this.mRewriteMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Map<String, String> map;
        String originUrl = routeIntent.getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return false;
        }
        String routeUrl = Util.getRouteUrl(originUrl);
        if (!TextUtils.isEmpty(routeUrl) && (map = this.mRewriteMap) != null && map.size() != 0) {
            String str = this.mRewriteMap.get(routeUrl);
            if (!TextUtils.isEmpty(str)) {
                routeIntent.setUrl(str);
                return true;
            }
        }
        return false;
    }

    public void setRewriteMap(Map<String, String> map) {
        synchronized (this.mLockObject) {
            if (map != null) {
                this.mRewriteMap = map;
            } else {
                this.mRewriteMap = Collections.EMPTY_MAP;
            }
        }
    }

    public void addRewriteValue(String str, String str2) {
        synchronized (this.mLockObject) {
            if (this.mRewriteMap == null) {
                this.mRewriteMap = new HashMap();
            }
            this.mRewriteMap.put(str, str2);
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RewriteManager#RouteIntent-originUrl: ");
        LIZ.append(routeIntent.getOriginUrl());
        Logger.d(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RewriteManager#RouteIntent-outputUrl: ");
        LIZ2.append(routeIntent.getUrl());
        Logger.d(X1D.LIZIZ(LIZ2));
        new RouteIntent.Builder(routeIntent.getUrl()).build();
        return false;
    }
}
