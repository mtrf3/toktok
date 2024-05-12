package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper;

import X.C16880lQ;
import X.RBY;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;

/* loaded from: classes5.dex */
public final class BaAutoMessagingRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Boolean open(Context context, String str, Bundle bundle) {
        BizAccountInfo bizAccountInfo;
        if (context == null) {
            return null;
        }
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF != null && (bizAccountInfo = LJFF.getCurUser().getBizAccountInfo()) != null && bizAccountInfo.enableAutoMsg()) {
            Intent intent = new Intent(context, (Class<?>) BaMessageSettingActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            C16880lQ.LIZJ(context, intent);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
