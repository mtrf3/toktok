package com.ss.android.ugc.aweme.compliance.privacy.paprompt.viewmodel;

import X.C72039SPb;
import X.C72041SPd;
import X.C72043SPf;
import X.C73969T1h;
import X.C76800UCe;
import X.C77119UOl;
import X.E7W;
import X.InterfaceC65784Pro;
import X.SNL;
import X.SPP;
import X.SPQ;
import X.T16;
import Y.AfS61S0200000_12;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.api.PaPromptApi;

/* loaded from: classes13.dex */
public final class PaPromptViewModel extends ViewModel {
    public final MutableLiveData<SPP> LJLIL = new MutableLiveData<>(SPP.NONE);
    public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>(Boolean.FALSE);

    public final void gv0() {
        int i;
        C72041SPd LIZIZ = SNL.LIZIZ();
        SPP value = this.LJLIL.getValue();
        if (value == null) {
            i = -1;
        } else {
            i = SPQ.LIZ[value.ordinal()];
        }
        int i2 = 1;
        if (i == 1) {
            i2 = 2;
        }
        LIZIZ.getClass();
        C72043SPf.LIZIZ(i2, "private_account_prompt");
        C72039SPb.LJFF(i2, "private_account_prompt");
    }

    public final void hv0(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        int i;
        this.LJLILLLLZI.postValue(Boolean.TRUE);
        E7W e7w = PaPromptApi.LIZ;
        if (this.LJLIL.getValue() == SPP.PUBLIC) {
            i = 0;
        } else {
            i = 1;
        }
        e7w.getClass();
        C77119UOl.LJIJ(E7W.LIZIZ.updatePrivateAccountAndFetchPrivacySettings(i), "/tiktok/privacy/user/private_account_prompt/v1").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0200000_12(this, interfaceC65784Pro, 3), new AfS61S0200000_12(this, interfaceC65784Pro2, 4));
    }
}
