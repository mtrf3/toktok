package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel;

import X.C55008LiO;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes10.dex */
public final class AdHomePageDataVM extends ViewModel {
    public static final /* synthetic */ int LJLJJL = 0;
    public boolean LJLIL;
    public final MutableLiveData<C55008LiO> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Float> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>();

    public final boolean gv0() {
        C55008LiO value = this.LJLILLLLZI.getValue();
        if (value == null || value.LJLIL == 4) {
            return false;
        }
        return true;
    }
}
