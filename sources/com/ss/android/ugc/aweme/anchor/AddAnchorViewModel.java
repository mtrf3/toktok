package com.ss.android.ugc.aweme.anchor;

import X.C221108m2;
import X.C236559Qd;
import X.C236589Qg;
import X.C62822Ol8;
import X.C73318Sq2;
import X.XKQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class AddAnchorViewModel extends AssemViewModel<C236559Qd> {
    public XKQ LJLILLLLZI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLIL = "";
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C236589Qg.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C236559Qd defaultState() {
        return new C236559Qd(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLJI.getValue()).dispose();
    }
}
