package com.ss.android.ugc.aweme.feed.assem.earlyfeedback;

import X.C221108m2;
import X.C2305092w;
import X.C59920NfQ;
import X.C62822Ol8;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;

/* loaded from: classes11.dex */
public final class EarlyFeedbackVM extends AssemViewModel<C2305092w> {
    public long LJLILLLLZI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C59920NfQ.LJLIL);
    public long LJLJI = System.currentTimeMillis();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C2305092w defaultState() {
        return new C2305092w(null);
    }

    public final IEarlyFeedbackService gv0() {
        return (IEarlyFeedbackService) this.LJLIL.getValue();
    }

    public final void hv0() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLILLLLZI += currentTimeMillis - this.LJLJI;
        this.LJLJI = currentTimeMillis;
    }
}
