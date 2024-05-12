package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.C36021EBt;
import X.C36022EBu;
import X.KFN;
import X.XKQ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes7.dex */
public final class DynamicSearchShopVM extends AssemViewModel<C36022EBu> {
    public XKQ LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C36022EBu defaultState() {
        return new C36022EBu(0);
    }

    public final void gv0(KFN kfn) {
        XKQ xkq = this.LJLIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLIL = XKX.LIZLLL(getAssemVMScope(), null, null, new C36021EBt(kfn, this, null), 3);
    }
}
