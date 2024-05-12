package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FilterMsgRuleParamRandom_ProtoDecoder implements InterfaceC31105CIr<FilterMsgRuleParamRandom> {
    public static FilterMsgRuleParamRandom LIZIZ(Q9H q9h) {
        FilterMsgRuleParamRandom filterMsgRuleParamRandom = new FilterMsgRuleParamRandom();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    filterMsgRuleParamRandom.percentage = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return filterMsgRuleParamRandom;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FilterMsgRuleParamRandom LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
