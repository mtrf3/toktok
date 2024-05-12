package com.ss.android.ugc.feed.platform.popupclean;

import X.C10K;
import X.C16880lQ;
import X.C54969Lhl;
import X.C56662Kg;
import X.C73411SrX;
import X.CallableC53953LFl;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;

/* loaded from: classes10.dex */
public final class NewUserPopupCleanAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(NewUserPopupCleanAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        C10K.LIZJ(CallableC53953LFl.LJLIL);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = C54969Lhl.LIZIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C54969Lhl.LIZIZ = null;
    }
}
