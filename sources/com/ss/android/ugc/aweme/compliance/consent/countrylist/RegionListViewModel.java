package com.ss.android.ugc.aweme.compliance.consent.countrylist;

import X.C73411SrX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;
import java.util.List;

/* loaded from: classes7.dex */
public final class RegionListViewModel extends ViewModel {
    public final MutableLiveData<List<RegionListAPI.Country>> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<String> LJLILLLLZI = new MutableLiveData<>();
    public C73411SrX LJLJI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        super.onCleared();
    }
}
