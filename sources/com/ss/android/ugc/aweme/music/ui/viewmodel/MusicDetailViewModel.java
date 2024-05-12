package com.ss.android.ugc.aweme.music.ui.viewmodel;

import X.C73318Sq2;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* loaded from: classes2.dex */
public final class MusicDetailViewModel extends ViewModel {
    public final MutableLiveData<OSZ<UrlModel, Integer>> LJLIL = new MutableLiveData<>();
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.dispose();
    }
}
