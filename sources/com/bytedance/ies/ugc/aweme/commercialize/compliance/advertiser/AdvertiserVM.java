package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.GIV;
import X.GKJ;
import X.UTU;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;

/* loaded from: classes8.dex */
public final class AdvertiserVM extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final ICommercializeComplianceApi LJLIL;
    public final MutableLiveData<Advertiser> LJLILLLLZI;
    public final MutableLiveData<AdvertiserModel> LJLJI;

    public AdvertiserVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LJLIL = GKJ.LIZ();
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
    }

    public final void gv0(AdvertiserModel advertiserModel) {
        if (advertiserModel == null || UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        Integer advStatus = advertiserModel.getAdvStatus();
        int i = 2;
        if (advStatus != null && advStatus.intValue() == 2) {
            i = 1;
        }
        this.LJLIL.setAdvertiser(advertiserModel.getAdvId(), String.valueOf(i)).enqueue(new GIV(advertiserModel, i, this));
    }
}
