package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.AbstractC40941G4z;
import X.C48360IyS;
import X.C86057Xq1;
import X.C86092Xqa;
import X.InterfaceC86091XqZ;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSRegistrationAgeGateViewModel extends PNSBaseAgeGateViewModel {
    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void mv0() {
        C48360IyS.LIZ("choose_birthday_next", new HashMap(), this.LJLJJI);
        if (this.LLFFF && !this.LJLJJL) {
            gv0();
        } else {
            ov0();
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final boolean onBackPressed() {
        C86057Xq1 LJ;
        PNSFeedbackModel LIZIZ;
        InterfaceC86091XqZ interfaceC86091XqZ = this.LJLJI;
        if (interfaceC86091XqZ != null && (LJ = interfaceC86091XqZ.LJ()) != null && o.LJ(LJ.getCanQuit(), Boolean.TRUE)) {
            InterfaceC86091XqZ interfaceC86091XqZ2 = this.LJLJI;
            if (interfaceC86091XqZ2 == null) {
                LIZIZ = null;
            } else {
                LIZIZ = interfaceC86091XqZ2.LIZIZ();
            }
            jv0(LIZIZ, new AqS165S0100000_15(this, 516));
        }
        return false;
    }

    public static final /* synthetic */ void pv0(PNSRegistrationAgeGateViewModel pNSRegistrationAgeGateViewModel) {
        super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void kv0(AbstractC40941G4z abstractC40941G4z, InterfaceC86091XqZ interfaceC86091XqZ, long j, C86092Xqa params) {
        String str;
        String str2;
        o.LJIIIZ(params, "params");
        super.kv0(abstractC40941G4z, interfaceC86091XqZ, j, params);
        this.LLD = 1;
        this.LLF = 1;
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
        this.LLFFF = true;
    }
}
