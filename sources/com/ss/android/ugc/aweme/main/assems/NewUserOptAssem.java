package com.ss.android.ugc.aweme.main.assems;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C2QU;
import X.C35818E3y;
import X.C36089EEj;
import X.C36093EEn;
import X.C36152EGu;
import X.C38987FRv;
import X.C39077FVh;
import X.C39079FVj;
import X.C56662Kg;
import X.E3T;
import X.FGR;
import X.FW5;
import X.HandlerC39071FVb;
import Y.ACallableS41S0000000_6;
import Y.ARunnableS42S0100000_6;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ConsistentContentAndAdChoiceServiceImpl;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class NewUserOptAssem extends BaseMainContainerAssem {
    public ARunnableS42S0100000_6 LJLIL = new ARunnableS42S0100000_6(this, 45);

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(NewUserOptAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C2QU.LIZ(new ARunnableS42S0100000_6(this, 46), LIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false));
            C56662Kg.LIZ().LJFF(LLLZ, false);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        String str;
        String str2;
        String str3;
        IComplianceBusinessService LJJJJIZL;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(NewUserOptAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && !LIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
            if (((ArrayList) ((LinkedHashMap) C2QU.LIZIZ).get("nuj_premain")) != null && (!r0.isEmpty())) {
                C2QU.LIZLLL("nuj_premain");
                this.LJLIL = null;
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZ(C39077FVh.LIZIZ.LIZJ());
                LJIIIZ.LIZJ();
                v3();
                IConsistentContentAndAdChoiceService LJII = ConsistentContentAndAdChoiceServiceImpl.LJII();
                if (LJII != null) {
                    str = LJII.LJFF();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (LJII != null) {
                        str2 = LJII.LJFF();
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.equals(str2, "VIDEO_PERSONALIZED")) {
                        IComplianceBusinessService LJJJJIZL2 = ComplianceBusinessServiceImpl.LJJJJIZL();
                        if (LJJJJIZL2 != null) {
                            LJJJJIZL2.LJJIL(false);
                        }
                    } else {
                        if (LJII != null) {
                            str3 = LJII.LJFF();
                        } else {
                            str3 = null;
                        }
                        if (TextUtils.equals(str3, "VIDEO_GENERIC") && (LJJJJIZL = ComplianceBusinessServiceImpl.LJJJJIZL()) != null) {
                            LJJJJIZL.LJJIL(true);
                        }
                    }
                    if (LJII != null) {
                        LJII.LJI(null);
                    }
                }
            } else {
                v3();
            }
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public static void v3() {
        if ((E3T.LIZ() == E3T.LIZLLL || E3T.LIZ() == E3T.LIZJ) && C38987FRv.LIZLLL().booleanValue()) {
            if ((FW5.LIZ == null || FW5.LJI()) && C39079FVj.LIZIZ.LIZ().getData() == null) {
                if (FW5.LIZ == null) {
                    C39079FVj.LIZIZ.LIZ().LIZJ(FW5.LJFF(E3T.LIZIZ()));
                    FW5.LIZ("no_response", "fake_response");
                    return;
                }
                FGR.LIZIZ().LIZ(new HandlerC39071FVb(), new ACallableS41S0000000_6(8), 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        if (!z || !z2 || C36152EGu.LJI() == 1) {
            return;
        }
        C35818E3y.LJ(1);
    }
}
