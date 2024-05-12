package com.ss.android.ugc.aweme.im.sdk.search.viewmodel;

import X.C221108m2;
import X.C33A;
import X.C33P;
import X.C33U;
import X.C62822Ol8;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes2.dex */
public final class IMSearchDefaultVM extends AssemViewModel<C33P> {
    public C33A LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C33U.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33P defaultState() {
        return new C33P(false, false, null, null);
    }

    public final void gv0(String str) {
        C33A c33a;
        if (str != null && (c33a = this.LJLIL) != null) {
            c33a.LIZIZ.LJ(1, str);
        }
    }
}
