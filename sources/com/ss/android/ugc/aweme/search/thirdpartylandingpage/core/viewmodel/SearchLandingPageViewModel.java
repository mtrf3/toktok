package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchLandingPageViewModel extends ViewModel {
    public final MutableLiveData<String> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<String> LJLJI;
    public final MutableLiveData<Integer> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final MutableLiveData LJLJJLL;

    public SearchLandingPageViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData3;
        this.LJLJJL = mutableLiveData2;
        this.LJLJJLL = mutableLiveData3;
    }

    public final void gv0(String status) {
        o.LJIIIZ(status, "status");
        this.LJLIL.setValue(status);
    }
}
