package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.schema;

import X.C3Q9;
import X.C43001GuD;
import X.C4WC;
import X.C63120Opw;
import X.C75782yE;
import X.C76662ze;
import X.C79004UzY;
import X.C80533Eb;
import X.C81273Gx;
import X.C98593tv;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* loaded from: classes2.dex */
public final class RecommendedChatsRoute implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String string;
        boolean z;
        if (bundle == null || (string = bundle.getString("conversation_id")) == null) {
            return Boolean.FALSE;
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(string);
        new C43001GuD();
        long LIZLLL = C81273Gx.LIZLLL(string);
        IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(LIZLLL), C79004UzY.LJIIL(LIZ, String.valueOf(LIZLLL)));
        C76662ze.LJLIL.getClass();
        boolean containsKey = C76662ze.LJIIIZ().containsKey(string);
        C98593tv c98593tv = new C98593tv(context, LJIIJ);
        c98593tv.setEnterFromForMob("inner_push");
        c98593tv.setEnterMethodForMob("cell");
        c98593tv.setFullScreenByDefault(false);
        c98593tv.setRecommendedChat(containsKey);
        c98593tv.setShowKeyBoardByDefault(false);
        c98593tv.setQuickChat(true);
        if (LIZ != null) {
            z = C79004UzY.LJJIIJZLJL(LIZ);
        } else {
            z = false;
        }
        c98593tv.setTCM(z);
        IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJFF(c98593tv);
        return Boolean.TRUE;
    }
}
