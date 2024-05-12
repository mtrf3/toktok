package com.ss.android.ugc.aweme.search.detail.shoot.viewmodel;

import X.C2303592h;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class CreationIntentionMusicShootVM extends AssemViewModel<C2303592h> {
    public final List<InterfaceC65784Pro<C76800UCe>> LJLIL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C2303592h defaultState() {
        return new C2303592h(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ArrayList) this.LJLIL).clear();
    }
}
