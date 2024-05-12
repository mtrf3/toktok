package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.M5X;
import X.OSZ;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SubscriptionOnlyAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        return new OSZ<>("sslocal://openShoot?enter_from=direct_shoot&tab=live&source_params=%7B%22open_subscription%22%3A1%2C%20%22show_entrance%22%3A%20%22sub_auto_email%22%2C%20%22open_sub_setting%22%3A0%2C%20%22open_sub_only_setting%22%3A1%7D", originalQueryMap);
    }
}
