package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.M5X;
import X.OSZ;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PoiDetailAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public String getTargetPageName() {
        return "poi_detail";
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        return new OSZ<>("aweme://poi/detail", originalQueryMap);
    }
}
