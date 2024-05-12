package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.AbstractC40941G4z;
import X.C10K;
import X.C48360IyS;
import X.C86092Xqa;
import X.EnumC62974Ona;
import X.InterfaceC86091XqZ;
import Y.AgS22S0100100_15;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeGateServiceImpl;
import com.ss.android.ugc.aweme.pns.agegate.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSExistingAgeGateViewModel extends PNSBaseAgeGateViewModel {
    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void mv0() {
        C10K<BaseResponse> confirmAge;
        C48360IyS.LIZ("choose_birthday_next", new HashMap(), this.LJLJJI);
        if (this.LJLL != EnumC62974Ona.NONE.getValue()) {
            this.LJLLLL.postValue(Boolean.TRUE);
            long currentTimeMillis = System.currentTimeMillis();
            PNSAgeGateApi pNSAgeGateApi = PNSAgeGateServiceImpl.LIZIZ;
            if (pNSAgeGateApi == null || (confirmAge = pNSAgeGateApi.confirmAge(hv0(), this.LLD, this.LLF)) == null) {
                return;
            }
            confirmAge.LJ(new AgS22S0100100_15(this, currentTimeMillis, 3), C10K.LJIIIIZZ, null);
            return;
        }
        ov0();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void kv0(AbstractC40941G4z abstractC40941G4z, InterfaceC86091XqZ interfaceC86091XqZ, long j, C86092Xqa params) {
        String str;
        String str2;
        o.LJIIIZ(params, "params");
        super.kv0(abstractC40941G4z, interfaceC86091XqZ, j, params);
        this.LLD = 1;
        this.LLF = 2;
        if (this.LJLJJL) {
            str = "f_age_gate_show";
        } else {
            str = "age_gate_show";
        }
        C48360IyS.LIZ(str, new LinkedHashMap(), this.LJLJJI);
        if (this.LJLJJL) {
            str2 = "f_age_gate_response";
        } else {
            str2 = "age_gate_response";
        }
        this.LLFF = str2;
    }
}
