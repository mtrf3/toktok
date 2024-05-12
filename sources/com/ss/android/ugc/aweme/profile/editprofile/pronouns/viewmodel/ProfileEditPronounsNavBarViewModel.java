package com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import X.C232829Bu;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C78404Ups;
import X.C9TF;
import X.EV6;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class ProfileEditPronounsNavBarViewModel extends AssemViewModel<C232829Bu> {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final EV6 LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C9TF.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C232829Bu defaultState() {
        return new C232829Bu(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL.dispose();
        super.onCleared();
    }
}
