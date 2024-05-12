package com.ss.android.ugc.aweme.services;

import X.AbstractC40941G4z;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IRegistrationAgeGateService {
    void addValuesToLogParams(Map<String, String> map);

    void dismiss();

    void displayFeedback(PNSFeedbackModel pNSFeedbackModel);

    int getTreatmentGroupForYearOnlyFlow();

    boolean isFtcForRegistration();

    boolean isTreatedForYearOnlyFlow();

    boolean isYearOnlyBirthdaySelection();

    void refreshUiModel();

    void verifyAgeForRegistrationSDK(Context context, HashMap<String, String> hashMap, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, AbstractC40941G4z abstractC40941G4z, boolean z, InterfaceC88472Yns<? super ViewGroup, C76800UCe> interfaceC88472Yns);

    void yearOnlyLoginUpdate();

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void verifyAgeForRegistrationSDK$default(IRegistrationAgeGateService iRegistrationAgeGateService, Context context, HashMap hashMap, Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, AbstractC40941G4z abstractC40941G4z, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bundle = null;
                }
                if ((i & 64) != 0) {
                    interfaceC88472Yns = IRegistrationAgeGateService$verifyAgeForRegistrationSDK$1.INSTANCE;
                }
                iRegistrationAgeGateService.verifyAgeForRegistrationSDK(context, hashMap, bundle, ageGateSdkRegistrationFlow, abstractC40941G4z, z, interfaceC88472Yns);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyAgeForRegistrationSDK");
        }
    }
}
