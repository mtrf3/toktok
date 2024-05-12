package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.M5X;
import X.MWW;
import X.OSZ;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OpenNowsCameraAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        originalQueryMap.put("enter_method", "click_regular_push");
        if (!MWW.LIZ()) {
            originalQueryMap.put("REDIRECT_TAG", "never");
            return new OSZ<>("//now/feed", originalQueryMap);
        }
        return new OSZ<>("//studio/tiktoknow", originalQueryMap);
    }
}
