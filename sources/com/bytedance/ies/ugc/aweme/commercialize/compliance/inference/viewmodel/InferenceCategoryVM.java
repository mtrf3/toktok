package com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.viewmodel;

import X.GKJ;
import X.UTU;
import Y.IDdS379S0100000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.InferenceCategory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.LabelData;

/* loaded from: classes8.dex */
public final class InferenceCategoryVM extends ViewModel {
    public static int LJLJJI = 3;
    public final MutableLiveData<InferenceCategory> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<LabelData> LJLILLLLZI = new MutableLiveData<>();
    public final ICommercializeComplianceApi LJLJI;

    public final void gv0() {
        if (UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        this.LJLJI.getUserLabelList().enqueue(new IDdS379S0100000_7(this, 0));
    }

    public InferenceCategoryVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LJLJI = GKJ.LIZ();
    }
}
