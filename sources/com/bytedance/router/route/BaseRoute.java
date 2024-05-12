package com.bytedance.router.route;

import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteMapper;

/* loaded from: classes11.dex */
public abstract class BaseRoute implements IRoute {
    public RouteIntent mRouteIntent;
    public RouteMapper mRouteMapper;
    public Uri mUri;
    public String mUrl;

    public Intent getComponent(Context context) {
        return null;
    }

    @Override // com.bytedance.router.route.IRoute
    public String getHost() {
        return this.mUri.getHost();
    }

    @Override // com.bytedance.router.route.IRoute
    public Bundle getParams() {
        if (this.mRouteIntent.getExtra() != null) {
            return C16880lQ.LLJJIJI(this.mRouteIntent.getExtra());
        }
        return new Bundle();
    }

    @Override // com.bytedance.router.route.IRoute
    public String getPath() {
        return this.mUri.getPath();
    }

    @Override // com.bytedance.router.route.IRoute
    public String getScheme() {
        return this.mUri.getScheme();
    }

    public String getTargetClass() {
        return getTargetClass(this.mUrl, this.mRouteIntent.isExternalType());
    }

    public RouteIntent getRouteIntent() {
        return this.mRouteIntent;
    }

    @Override // com.bytedance.router.route.IRoute
    public String getUrl() {
        return this.mUrl;
    }

    public String getTargetClass(String str, boolean z) {
        return this.mRouteMapper.getTargetClass(str, z);
    }

    public void init(RouteIntent routeIntent, RouteMapper routeMapper) {
        this.mRouteIntent = routeIntent;
        String url = routeIntent.getUrl();
        this.mUrl = url;
        this.mUri = UriProtector.parse(url);
        this.mRouteMapper = routeMapper;
    }
}
