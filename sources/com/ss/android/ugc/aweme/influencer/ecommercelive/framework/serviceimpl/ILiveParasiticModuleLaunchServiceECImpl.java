package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl;

import X.C31749Cd7;
import X.C31761CdJ;
import X.C32177Ck1;
import X.CN1;
import com.bytedance.android.live.usercard.IUserCardService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes6.dex */
public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void LIZ() {
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        LJJJLL.LJJJJJL();
        C31749Cd7.LIZIZ(new C32177Ck1());
        LJJJLL.LJJII();
        C31761CdJ c31761CdJ = new C31761CdJ();
        IUserCardService iUserCardService = (IUserCardService) CN1.LIZ(IUserCardService.class);
        if (iUserCardService == null) {
            return;
        }
        iUserCardService.nw(c31761CdJ, 2);
    }
}
