package com.ss.android.ugc.aweme.stemfeed.utils;

import X.AV1;
import X.C52240Keq;
import X.LGE;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings;
import defpackage.t1;
import yq4.a;

/* loaded from: classes10.dex */
public final class StemFeedTabRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (C52240Keq.LIZ() && FeedMultiTabOrderSettings.LIZ().contains("homepage_stem") && a.LJIIZILJ().LJIL().isOn() && t1.LJI() && !AV1.LJIILLIIL()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//main");
            buildRoute.withParam("tab", LGE.STEM.getValue());
            buildRoute.open();
        } else {
            SmartRouter.buildRoute(context, "//contentpreference").open();
        }
        return Boolean.TRUE;
    }
}
