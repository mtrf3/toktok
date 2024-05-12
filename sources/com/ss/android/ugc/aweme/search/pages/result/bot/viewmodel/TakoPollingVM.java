package com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel;

import X.C214188as;
import X.C49517Jc1;
import X.C49518Jc2;
import X.C49530JcE;
import X.C49543JcR;
import X.C78404Ups;
import X.XKQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import kotlin.jvm.internal.AqS96S0101000_8;

/* loaded from: classes9.dex */
public final class TakoPollingVM extends AssemViewModel<C49517Jc1> {
    public static final /* synthetic */ int LJLJI = 0;
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C49530JcE.LJLIL);
    public XKQ LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C49517Jc1 defaultState() {
        return new C49517Jc1(0);
    }

    public final void gv0() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoPollingVM", "stopPolling");
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        setState(C49518Jc2.LJLIL);
    }

    public final void hv0(PollingInfo pollingInfo) {
        int i;
        PollingInfo pollingInfo2;
        Integer limit;
        if (pollingInfo != null && (limit = pollingInfo.getLimit()) != null) {
            i = limit.intValue();
        } else {
            i = 0;
        }
        int LIZIZ = C49543JcR.LIZIZ();
        if (i > LIZIZ) {
            i = LIZIZ;
        }
        if (pollingInfo != null) {
            pollingInfo2 = PollingInfo.copy$default(pollingInfo, null, null, Integer.valueOf(i), null, null, null, 59, null);
        } else {
            pollingInfo2 = null;
        }
        setState(new AqS96S0101000_8(i, pollingInfo2, 0));
    }
}
