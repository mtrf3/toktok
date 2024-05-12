package com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel;

import X.C221108m2;
import X.C243319gl;
import X.C243329gm;
import X.C243369gq;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C73318Sq2;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class FeatureVideoAwemeListNavBarViewModel extends AssemViewModel<C243319gl> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C243329gm.LJLIL);
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C243369gq.class, "hierarchy_data_feature_video"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C243319gl defaultState() {
        return new C243319gl(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }
}
