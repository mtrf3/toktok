package com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired;

import X.C91222Zr8;
import X.C91413ZuD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class ExpirePlayableVM extends AssemViewModel<C91413ZuD> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C91413ZuD defaultState() {
        return new C91413ZuD();
    }

    public static boolean gv0(String itemId, boolean z) {
        o.LJIIIZ(itemId, "itemId");
        if (z ? ExpiredPlayableManager.INSTANCE.isPreviewPlayableExpiredToday(itemId) : ExpiredPlayableManager.INSTANCE.isPlayableExpiredToday(itemId)) {
            ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
            if (!expiredPlayableManager.isWhitePlayable(itemId) && !expiredPlayableManager.isTodayPlayableLimited()) {
                return true;
            }
        }
        return false;
    }

    public static void hv0(String itemId, boolean z) {
        o.LJIIIZ(itemId, "itemId");
        C91222Zr8.LIZ.put(itemId, Boolean.valueOf(z));
    }
}
