package com.bytedance.android.livesdk.battle.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.battle.model.BattleTriggerGuideResponse;

/* loaded from: classes14.dex */
public final class _BattleTriggerGuideResponse_ProtoDecoder implements InterfaceC31105CIr<BattleTriggerGuideResponse> {
    @Override // X.InterfaceC31105CIr
    public final BattleTriggerGuideResponse LIZ(Q9H q9h) {
        BattleTriggerGuideResponse battleTriggerGuideResponse = new BattleTriggerGuideResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    BattleTriggerGuideResponse.ResponseData responseData = new BattleTriggerGuideResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    battleTriggerGuideResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTriggerGuideResponse;
            }
        }
    }
}
