package com.ss.android.ugc.aweme.pns.agegate;

import X.AbstractC40941G4z;
import X.C61502OBu;
import X.C63062Op0;
import X.C76800UCe;
import X.EnumC86095Xqd;
import X.InterfaceC65784Pro;
import X.InterfaceC86091XqZ;
import X.InterfaceC86100Xqi;
import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public interface IPNSAgeGateService {
    void LIZ(boolean z);

    void LIZIZ(Map<String, String> map);

    void LIZJ(PNSAgeGateApi pNSAgeGateApi);

    void LIZLLL();

    void LJ(C61502OBu c61502OBu);

    void LJFF(int i);

    void LJI(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void LJII(Locale locale);

    void LJIIIIZZ(EnumC86095Xqd enumC86095Xqd, AbstractC40941G4z abstractC40941G4z, Context context, InterfaceC86100Xqi interfaceC86100Xqi, InterfaceC86091XqZ interfaceC86091XqZ, C63062Op0 c63062Op0);

    void LJIIIZ(boolean z);

    void addValuesToLogParams(Map<String, String> map);

    void dismiss();

    void refreshUiModel();
}
