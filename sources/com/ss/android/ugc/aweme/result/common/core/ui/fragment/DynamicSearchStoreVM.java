package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.C35649Dyv;
import X.C36014EBm;
import X.KFN;
import X.XKQ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes7.dex */
public final class DynamicSearchStoreVM extends AssemViewModel<C35649Dyv> {
    public XKQ LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35649Dyv defaultState() {
        return new C35649Dyv(0);
    }

    public final void gv0(KFN kfn) {
        XKQ xkq = this.LJLIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLIL = XKX.LIZLLL(getAssemVMScope(), null, null, new C36014EBm(kfn, this, null), 3);
    }
}
