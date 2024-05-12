package com.ss.android.ugc.aweme.music.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicLandingPageViewModel extends ViewModel {
    public final MutableLiveData<String> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<String> LJLJI;
    public final MutableLiveData LJLJJI;

    public MusicLandingPageViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        this.LJLJJI = mutableLiveData2;
    }

    public final void gv0(String status) {
        o.LJIIIZ(status, "status");
        this.LJLJI.setValue(status);
    }
}
