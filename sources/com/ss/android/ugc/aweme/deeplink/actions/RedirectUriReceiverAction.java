package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.M5X;
import X.OSZ;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RedirectUriReceiverAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public String getTargetPageName() {
        return "create-account-sg-singpass";
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            return new OSZ<>("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass-test", originalQueryMap);
        }
        return new OSZ<>("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass", originalQueryMap);
    }
}
