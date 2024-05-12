package com.ss.android.ugc.aweme.profile.widgets.redpoint;

import X.C214188as;
import X.C245849kq;
import X.C245929ky;
import X.C245949l0;
import X.C78404Ups;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class UserProfileBlockVM extends AssemViewModel<C245849kq> {
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C245929ky.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C245849kq defaultState() {
        return new C245849kq(null, null);
    }

    public final void gv0(int i, String str, String str2) {
        XKX.LIZLLL(getAssemVMScope(), null, null, new C245949l0(this, str, str2, i, null), 3);
    }
}
