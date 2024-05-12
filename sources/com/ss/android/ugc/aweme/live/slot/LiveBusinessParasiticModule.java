package com.ss.android.ugc.aweme.live.slot;

import X.C31740Ccy;
import X.CN1;
import com.bytedance.android.live.slot.ISlotService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes6.dex */
public final class LiveBusinessParasiticModule implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void LIZ() {
        LiveOuterService.LJJJLL().LJJJJJL();
        C31740Ccy c31740Ccy = new C31740Ccy();
        ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
        if (iSlotService == null) {
            return;
        }
        iSlotService.registerAggregateSlot(c31740Ccy);
    }
}
