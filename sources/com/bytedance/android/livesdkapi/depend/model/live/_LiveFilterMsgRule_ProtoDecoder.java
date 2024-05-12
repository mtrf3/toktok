package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveFilterMsgRule_ProtoDecoder implements InterfaceC31105CIr<LiveFilterMsgRule> {
    public static LiveFilterMsgRule LIZIZ(Q9H q9h) {
        LiveFilterMsgRule liveFilterMsgRule = new LiveFilterMsgRule();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            liveFilterMsgRule.random = _FilterMsgRuleParamRandom_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        liveFilterMsgRule.rule = q9h.LJIIJ();
                    }
                } else {
                    liveFilterMsgRule.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveFilterMsgRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveFilterMsgRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
