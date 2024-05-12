package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import X.C46416IJo;
import X.ILC;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes9.dex */
public final class BGAudioViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL;
    public final MutableLiveData<ILC> LJLILLLLZI;

    public BGAudioViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.valueOf(C46416IJo.LIZJ()));
        this.LJLIL = mutableLiveData;
        MutableLiveData<ILC> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(C46416IJo.LIZ());
        this.LJLILLLLZI = mutableLiveData2;
    }
}
