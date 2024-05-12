package com.ss.android.ugc.aweme.relation.dialog;

import X.FWR;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes10.dex */
public final class SocialRecFriendsConditionViewModel extends ViewModel implements FWR {
    public static final /* synthetic */ int LJLJI = 0;
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>();

    @Override // X.FWR
    public final void ZE(boolean z) {
        this.LJLILLLLZI.postValue(Boolean.valueOf(z));
    }

    @Override // X.FWR
    public final void ie0(boolean z) {
        this.LJLIL.postValue(Boolean.valueOf(z));
    }
}
