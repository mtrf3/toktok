package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.GKJ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.TherePartyDataControlModel;

/* loaded from: classes8.dex */
public final class ComplianceVM extends ViewModel {
    public static final /* synthetic */ int LJLJJL = 0;
    public final ICommercializeComplianceApi LJLIL;
    public final MutableLiveData<TherePartyDataControlModel> LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;

    public ComplianceVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LJLIL = GKJ.LIZ();
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
    }
}
