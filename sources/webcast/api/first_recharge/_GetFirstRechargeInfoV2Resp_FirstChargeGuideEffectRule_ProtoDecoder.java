package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* loaded from: classes14.dex */
public final class _GetFirstRechargeInfoV2Resp_FirstChargeGuideEffectRule_ProtoDecoder implements InterfaceC31105CIr<GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule> {
    public static GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule LIZIZ(Q9H q9h) {
        GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule = new GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule();
        firstChargeGuideEffectRule.enterRoomShowTime = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            firstChargeGuideEffectRule.watchPkShowTime = q9h.LJIIJ();
                        }
                    } else {
                        firstChargeGuideEffectRule.enterRoomShowTime.add(Integer.valueOf(q9h.LJIIJ()));
                    }
                } else {
                    firstChargeGuideEffectRule.enableFirstRechargeGuideEffect = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return firstChargeGuideEffectRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
