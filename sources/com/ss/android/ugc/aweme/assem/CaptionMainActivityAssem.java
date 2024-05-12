package com.ss.android.ugc.aweme.assem;

import X.AGR;
import X.C16880lQ;
import X.C38995FSd;
import X.C56662Kg;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;

/* loaded from: classes5.dex */
public final class CaptionMainActivityAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CaptionMainActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        C38995FSd.LIZIZ().execute(AGR.LJLIL);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }
}
