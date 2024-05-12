package com.bytedance.router;

import X.C221108m2;
import X.C5H3;
import android.os.Bundle;
import com.bytedance.router.route.BaseRoute;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MultiRouteIntent extends RouteIntent {
    public final C5H3 routeIntents$delegate = C221108m2.LIZIZ(MultiRouteIntent$routeIntents$2.INSTANCE);
    public final C5H3 routes$delegate = C221108m2.LIZIZ(MultiRouteIntent$routes$2.INSTANCE);

    public final ArrayList<RouteIntent> getRouteIntents() {
        return (ArrayList) this.routeIntents$delegate.getValue();
    }

    public final ArrayList<BaseRoute> getRoutes() {
        return (ArrayList) this.routes$delegate.getValue();
    }

    /* loaded from: classes11.dex */
    public final class Builder {
        public final /* synthetic */ MultiRouteIntent this$0;

        public final MultiRouteIntent build() {
            return this.this$0;
        }

        public final Builder withBundleAnimation(Bundle bundle) {
            this.this$0.setAnimationBundle(bundle);
            return this;
        }

        public final Builder withCallback(OpenResultCallback openResultCallback) {
            this.this$0.setCallback(openResultCallback);
            return this;
        }

        public Builder(MultiRouteIntent multiRouteIntent, List<? extends RouteIntent> routeIntents) {
            o.LJIIIZ(routeIntents, "routeIntents");
            this.this$0 = multiRouteIntent;
            multiRouteIntent.getRouteIntents().addAll(routeIntents);
        }
    }
}
