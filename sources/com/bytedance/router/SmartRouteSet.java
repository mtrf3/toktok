package com.bytedance.router;

import X.C221108m2;
import X.C5H3;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.MultiRouteIntent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SmartRouteSet {
    public static final Companion Companion = new Companion();
    public Bundle animationBundle;
    public OpenResultCallback callback;
    public final Context context;
    public final C5H3 routes$delegate;

    public static final SmartRouteSet buildRoute(Context context) {
        return Companion.buildRoute(context);
    }

    private final ArrayList<RouteIntent> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    private final MultiRouteIntent buildRouteIntent() {
        MultiRouteIntent.Builder builder = new MultiRouteIntent.Builder(new MultiRouteIntent(), getRoutes());
        builder.withBundleAnimation(this.animationBundle);
        builder.withCallback(this.callback);
        return builder.build();
    }

    public final void open() {
        RouteManager.getInstance().openMulti(this.context, buildRouteIntent());
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SmartRouteSet buildRoute(Context context) {
            o.LJIIIZ(context, "context");
            return new SmartRouteSet(context);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public SmartRouteSet(Context context) {
        o.LJIIIZ(context, "context");
        this.context = context;
        this.routes$delegate = C221108m2.LIZIZ(SmartRouteSet$routes$2.INSTANCE);
    }

    public final SmartRouteSet addRoute(SmartRoute route) {
        o.LJIIIZ(route, "route");
        RouteIntent routeIntent = route.buildRouteIntent();
        ArrayList<RouteIntent> routes = getRoutes();
        ArrayList arrayList = new ArrayList();
        Iterator<RouteIntent> it = routes.iterator();
        while (it.hasNext()) {
            RouteIntent next = it.next();
            String url = next.getUrl();
            o.LJIIIIZZ(routeIntent, "routeIntent");
            if (o.LJ(url, routeIntent.getUrl())) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            o.LJIIIIZZ(routeIntent, "routeIntent");
            if (routeIntent.getAnimationBundle() == null) {
                if (routeIntent.getEnterAnim() == -1 || routeIntent.getExitAnim() == -1) {
                    getRoutes().add(routeIntent);
                    return this;
                }
                "Don't support setAnimation for single Route".toString();
                throw new IllegalArgumentException("Don't support setAnimation for single Route");
            }
            "Don't support setAnimationBundle for single Route, Use SmartRouteSet.withBundleAnimation instead".toString();
            throw new IllegalArgumentException("Don't support setAnimationBundle for single Route, Use SmartRouteSet.withBundleAnimation instead");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Already contains a route with same url: ");
        o.LJIIIIZZ(routeIntent, "routeIntent");
        LIZ.append(routeIntent.getUrl());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final SmartRouteSet withBundleAnimation(Bundle bundle) {
        this.animationBundle = bundle;
        return this;
    }

    public final SmartRouteSet withCallBack(OpenResultCallback openResultCallback) {
        this.callback = openResultCallback;
        return this;
    }
}
