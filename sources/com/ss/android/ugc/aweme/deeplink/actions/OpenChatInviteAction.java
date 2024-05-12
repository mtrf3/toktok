package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C38586FCk;
import X.C76800UCe;
import X.HG3;
import X.M5X;
import X.OSZ;
import X.RBX;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OpenChatInviteAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri parse = UriProtector.parse(outerUrl);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(parse.getHost());
        LIZ.append(parse.getPath());
        return new OSZ<>(X1D.LIZIZ(LIZ), originalQueryMap);
    }

    @Override // X.AbstractC54344LUm
    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        String queryParameter = UriProtector.getQueryParameter(getOriginalUri(), "invite_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.length() <= 0 || !((RBX) HG3.LJIILL()).isLogin() || !(context instanceof Activity)) {
            return false;
        }
        if (!C38586FCk.LIZIZ()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        IMService.createIIMServicebyMonsterPlugin(false).getGroupChatService().LIZIZ((Activity) context, queryParameter);
        return true;
    }
}
