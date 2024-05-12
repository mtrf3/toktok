package com.bytedance.effectcreatormobile.objectselect.viewmodel;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C76800UCe;
import X.C93624aTs;
import X.C93625aTt;
import X.C93670aUc;
import X.C93977aZZ;
import X.C94031aaR;
import X.C94033aaT;
import X.C94098abW;
import X.InterfaceC88471Ynr;
import X.OSZ;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectLibViewModel extends StateViewModel {
    public final C93624aTs<HashMap<C94031aaR, List<C94033aaT>>> LJLILLLLZI = new C93624aTs<>();

    public static void jv0(Long l, boolean z) {
        String str;
        OSZ[] oszArr = new OSZ[1];
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        oszArr[0] = new OSZ("deliver_result", str);
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (l != null) {
            LJJLIIIIJ.put("time_cost", String.valueOf(l.longValue()));
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("server_deliver_effect_sheet_page", LJJLIIIIJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iv0(String id, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(id, "id");
        AbstractC65781Prl abstractC65781Prl = (AbstractC65781Prl) interfaceC88471Ynr;
        ((ArrayList) this.LJLIL).add(abstractC65781Prl);
        C93625aTt c93625aTt = new C93625aTt(this, abstractC65781Prl);
        IEffectDataResProvider LIZ = C93977aZZ.LIZ();
        if (LIZ != null) {
            LIZ.downloadRes(id, new C94098abW(c93625aTt));
            return;
        }
        InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) c93625aTt.get();
        if (interfaceC88471Ynr2 == null) {
            return;
        }
        interfaceC88471Ynr2.invoke(Boolean.FALSE, "");
    }
}
