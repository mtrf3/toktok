package com.ss.android.ugc.aweme.log;

import X.C58653N0f;
import X.C58685N1l;
import X.N1O;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import kotlin.jvm.internal.AqS141S0200000_10;

/* loaded from: classes11.dex */
public final class AdWebViewBlankLogRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        AdWebLogModel adWebLogModel = N1O.LIZ;
        if (adWebLogModel != null) {
            IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
            C58653N0f c58653N0f = C58685N1l.LJIILIIL;
            String cid = adWebLogModel.getCid();
            if (cid == null) {
                cid = "";
            }
            LJJIJ.LIZJ(c58653N0f, cid, adWebLogModel.getLogExtra(), null, new AqS141S0200000_10(adWebLogModel, bundle, 14));
        }
        return Boolean.TRUE;
    }
}
