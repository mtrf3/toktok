package com.ss.android.ugc.aweme.pns.agegate;

import X.AbstractC40941G4z;
import X.AbstractC86076XqK;
import X.C162476Zf;
import X.C16880lQ;
import X.C61502OBu;
import X.C63062Op0;
import X.C65777Prh;
import X.C76800UCe;
import X.C86057Xq1;
import X.C86078XqM;
import X.C86079XqN;
import X.C86080XqO;
import X.C86092Xqa;
import X.C86094Xqc;
import X.C86097Xqf;
import X.C86098Xqg;
import X.C86099Xqh;
import X.EnumC86095Xqd;
import X.InterfaceC65784Pro;
import X.InterfaceC86091XqZ;
import X.InterfaceC86100Xqi;
import X.InterfaceC86102Xqk;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateTranslucentActivity;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSAgeGateServiceImpl implements IPNSAgeGateService {
    public static final C86092Xqa LIZ = new C86092Xqa();
    public static PNSAgeGateApi LIZIZ;
    public static InterfaceC86102Xqk LIZJ;
    public static boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZLLL() {
        LIZLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void dismiss() {
        PNSAgeGateActivity pNSAgeGateActivity = PNSAgeGateActivity.LJLJLLL;
        if (pNSAgeGateActivity == null) {
            return;
        }
        pNSAgeGateActivity.finish();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void refreshUiModel() {
        C86057Xq1 LJ;
        PNSAgeGateActivity pNSAgeGateActivity = PNSAgeGateActivity.LJLJLLL;
        if (pNSAgeGateActivity == null) {
            return;
        }
        PNSBaseAgeGateViewModel LLII = pNSAgeGateActivity.LLII();
        MutableLiveData<C86057Xq1> mutableLiveData = LLII.LJLLJ;
        InterfaceC86091XqZ interfaceC86091XqZ = LLII.LJLJI;
        if (interfaceC86091XqZ == null) {
            LJ = null;
        } else {
            LJ = interfaceC86091XqZ.LJ();
        }
        mutableLiveData.postValue(LJ);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZ(boolean z) {
        LIZ.setFtc(z);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZIZ(Map<String, String> passedMap) {
        o.LJIIIZ(passedMap, "passedMap");
        C86092Xqa c86092Xqa = LIZ;
        c86092Xqa.getLogParams().clear();
        c86092Xqa.getLogParams().putAll(passedMap);
        Map<String, String> logParams = c86092Xqa.getLogParams();
        if (!C65777Prh.LJII(logParams) || logParams == null) {
            return;
        }
        logParams.put("pns_agegate_sdk", "1");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZJ(PNSAgeGateApi api) {
        o.LJIIIZ(api, "api");
        LIZIZ = api;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJ(C61502OBu monitor) {
        o.LJIIIZ(monitor, "monitor");
        LIZJ = monitor;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJFF(int i) {
        LIZ.setConfirmationType(i);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJII(Locale locale) {
        LIZ.setLocale(locale);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJIIIZ(boolean z) {
        LIZ.setGuestMode(z);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void addValuesToLogParams(Map<String, String> passedMap) {
        o.LJIIIZ(passedMap, "passedMap");
        Map<String, String> logParams = LIZ.getLogParams();
        if (C65777Prh.LJII(logParams) && logParams != null) {
            logParams.putAll(passedMap);
        }
        PNSAgeGateActivity pNSAgeGateActivity = PNSAgeGateActivity.LJLJLLL;
        if (pNSAgeGateActivity == null) {
            return;
        }
        Map<String, String> map = pNSAgeGateActivity.LLII().LJLJJI;
        if (!C65777Prh.LJII(map) || map == null) {
            return;
        }
        map.putAll(passedMap);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJI(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        PNSAgeGateBaseFragment LLFII;
        o.LJIIIZ(action, "action");
        PNSAgeGateActivity pNSAgeGateActivity = PNSAgeGateActivity.LJLJLLL;
        if (pNSAgeGateActivity == null || (LLFII = pNSAgeGateActivity.LLFII()) == null) {
            return;
        }
        LLFII.vl(pNSFeedbackModel, action);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJIIIIZZ(EnumC86095Xqd scenario, AbstractC40941G4z abstractC40941G4z, Context context, InterfaceC86100Xqi interfaceC86100Xqi, InterfaceC86091XqZ interfaceC86091XqZ, C63062Op0 c63062Op0) {
        Intent intent;
        AbstractC86076XqK c86080XqO;
        o.LJIIIZ(scenario, "scenario");
        o.LJIIIZ(context, "context");
        if (interfaceC86091XqZ == null) {
            int i = C86094Xqc.LIZ[scenario.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c86080XqO = new C86079XqN(context);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    c86080XqO = new C86078XqM(context);
                }
            } else {
                c86080XqO = new C86080XqO(context);
            }
            if (c63062Op0 != null) {
                c86080XqO.LIZ = c63062Op0;
            }
            C86098Xqg.LIZ.put(scenario, c86080XqO);
        } else {
            if (c63062Op0 != null) {
                interfaceC86091XqZ.LIZLLL(c63062Op0);
            }
            C86098Xqg.LIZ.put(scenario, interfaceC86091XqZ);
        }
        C86092Xqa c86092Xqa = LIZ;
        c86092Xqa.setScene(scenario);
        C86099Xqh.LIZ.put(scenario, interfaceC86100Xqi);
        C86097Xqf.LIZ.put(scenario, abstractC40941G4z);
        if (LIZLLL) {
            intent = new Intent(context, (Class<?>) PNSAgeGateTranslucentActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) PNSAgeGateActivity.class);
        }
        intent.addFlags(268435456);
        intent.putExtra("age_gate_params", c86092Xqa);
        C16880lQ.LIZJ(context, intent);
    }
}
