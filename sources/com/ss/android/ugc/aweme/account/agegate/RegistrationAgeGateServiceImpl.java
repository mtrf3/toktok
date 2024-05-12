package com.ss.android.ugc.aweme.account.agegate;

import X.AbstractC40941G4z;
import X.C113554cx;
import X.C221108m2;
import X.C40940G4y;
import X.C43286Gyo;
import X.C58096Mr6;
import X.C58293MuH;
import X.C58382Mvi;
import X.C62822Ol8;
import X.C62960OnM;
import X.C62966OnS;
import X.C62970OnW;
import X.C62971OnX;
import X.C65429Pm5;
import X.C76800UCe;
import X.C85990Xow;
import X.C86060Xq4;
import X.C86075XqJ;
import X.C87093YGb;
import X.EnumC86095Xqd;
import X.HG3;
import X.InterfaceC88472Yns;
import X.RBX;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import defpackage.m0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class RegistrationAgeGateServiceImpl implements IRegistrationAgeGateService {
    public static InterfaceC88472Yns<? super ViewGroup, C76800UCe> LIZIZ = C58382Mvi.LJLIL;
    public static Map<String, String> LIZJ = C113554cx.LJJJLIIL();
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58293MuH.LJLIL);

    static {
        C113554cx.LJJJLIIL();
    }

    public static IRegistrationAgeGateService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IRegistrationAgeGateService.class, false);
        if (LIZ != null) {
            return (IRegistrationAgeGateService) LIZ;
        }
        if (C58096Mr6.LJJZ == null) {
            synchronized (IRegistrationAgeGateService.class) {
                if (C58096Mr6.LJJZ == null) {
                    C58096Mr6.LJJZ = new RegistrationAgeGateServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJZ;
    }

    public final IPNSAgeGateService LIZIZ() {
        return (IPNSAgeGateService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final boolean isYearOnlyBirthdaySelection() {
        return C62971OnX.LIZJ.getValue().LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void yearOnlyLoginUpdate() {
        C62971OnX value = C62971OnX.LIZJ.getValue();
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        o.LJIIIIZZ(curSecUserId, "userService().curSecUserId");
        value.getClass();
        Keva keva = C62971OnX.LIZIZ;
        if (!m0.LIZLLL("is_year_only_", curSecUserId, keva, false) && value.LIZ) {
            C65429Pm5.LJ("is_year_only_", curSecUserId, keva, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void dismiss() {
        LIZIZ().dismiss();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final int getTreatmentGroupForYearOnlyFlow() {
        return C62960OnM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final boolean isFtcForRegistration() {
        return a.LIZIZ().isFtcForRegistration();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final boolean isTreatedForYearOnlyFlow() {
        if (C62960OnM.LIZ() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void refreshUiModel() {
        LIZIZ().refreshUiModel();
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void addValuesToLogParams(Map<String, String> passedMap) {
        o.LJIIIZ(passedMap, "passedMap");
        LIZIZ().addValuesToLogParams(passedMap);
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void displayFeedback(PNSFeedbackModel pNSFeedbackModel) {
        LIZIZ().LJI(pNSFeedbackModel, C62970OnW.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.services.IRegistrationAgeGateService
    public final void verifyAgeForRegistrationSDK(Context context, HashMap<String, String> hashMap, Bundle bundle, AgeGateSdkRegistrationFlow flow, AbstractC40941G4z callback, boolean z, InterfaceC88472Yns<? super ViewGroup, C76800UCe> showTpnView) {
        Map<String, String> LJJJLIIL;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flow, "flow");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(showTpnView, "showTpnView");
        if (C62960OnM.LIZ() == 1) {
            if (hashMap != null) {
                hashMap.put("page_type", "birth_year");
            }
        } else if (C62960OnM.LIZ() == 2) {
            if (hashMap != null) {
                hashMap.put("page_type", "age_only");
            }
        } else if (hashMap != null) {
            hashMap.put("page_type", "birthday");
        }
        LIZIZ = showTpnView;
        if (hashMap == null || (LJJJLIIL = C113554cx.LJJLIIIJLLLLLLLZ(hashMap)) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        LIZJ = LJJJLIIL;
        LIZIZ().LIZ(isFtcForRegistration());
        IPNSAgeGateService LIZIZ2 = LIZIZ();
        C43286Gyo.LIZ.getClass();
        LIZIZ2.LJII(new Locale(C87093YGb.LIZ(), C85990Xow.LIZ()));
        if (hashMap != null) {
            LIZIZ().LIZIZ(hashMap);
        }
        LIZIZ().LJIIIZ(z);
        LIZIZ().LIZLLL();
        C62966OnS.LIZ(LIZIZ(), EnumC86095Xqd.REGISTRATION, new C40940G4y(flow, callback, hashMap, z), context, new C86060Xq4(bundle, flow, isFtcForRegistration()), new C86075XqJ(context, flow), null, 32);
    }
}
