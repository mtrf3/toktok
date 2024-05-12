package com.ss.android.ugc.aweme.music.vm;

import X.C2310494y;
import X.InterfaceC26350AVu;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class LegacyCommunicateViewModel extends AssemViewModel<C2310494y> {
    public InterfaceC26350AVu LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C2310494y defaultState() {
        return new C2310494y(null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = false;
    }
}
