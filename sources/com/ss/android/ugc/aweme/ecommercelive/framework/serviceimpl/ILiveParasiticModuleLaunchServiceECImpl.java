package com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl;

import X.C31749Cd7;
import X.C32176Ck0;
import X.C71151RwB;
import X.C86393XvR;
import X.CK0;
import X.CN1;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes6.dex */
public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void LIZ() {
        C86393XvR LJJIJIL;
        LiveOuterService.LJJJLL().LJJJJJL();
        C31749Cd7.LIZIZ(new C32176Ck0());
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            LJJIJIL.LJLILLLLZI((C71151RwB) C71151RwB.LIZJ.getValue());
        }
        ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
        if (LJJJLL2 != null) {
            LJJJLL2.LIZJ();
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Dv(1, CK0.LIZ.getValue());
        }
    }
}
