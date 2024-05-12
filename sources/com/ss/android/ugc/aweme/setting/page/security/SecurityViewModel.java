package com.ss.android.ugc.aweme.setting.page.security;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes2.dex */
public final class SecurityViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL;

    public SecurityViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.LJLIL = mutableLiveData;
    }
}
