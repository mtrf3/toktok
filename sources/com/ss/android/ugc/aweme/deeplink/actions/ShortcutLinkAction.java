package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C38586FCk;
import X.C76800UCe;
import X.LUS;
import X.M5X;
import X.OSZ;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShortcutLinkAction extends AbstractC54341LUj<C76800UCe> {
    public static final LUS Companion = new LUS();

    @Override // X.AbstractC54341LUj
    public String getTargetPageName() {
        return "//shortcut/proxy";
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        return new OSZ<>("//shortcut/proxy", originalQueryMap);
    }

    @Override // X.AbstractC54344LUm
    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        if (!C38586FCk.LIZIZ()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        return super.doRealOpen(context, routePrefix, params, arrayList);
    }
}
