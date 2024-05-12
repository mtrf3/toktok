package com.ss.android.ugc.aweme.feed.assems;

import X.C16880lQ;
import X.C52937Kq5;
import X.C53914LDy;
import X.C56662Kg;
import X.LDZ;
import X.QD3;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class RecommendFeedMainActivityAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(RecommendFeedMainActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSettingsDoneEvent(C53914LDy c53914LDy) {
        LDZ ldz = LDZ.LJLIL;
        if (C52937Kq5.LIZ()) {
            ldz.run();
        }
    }
}
