package com.bytedance.android.livesdk.battle.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.battle.model.BattleTriggerGuideResponse;

/* loaded from: classes14.dex */
public final class _BattleTriggerGuideResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BattleTriggerGuideResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final BattleTriggerGuideResponse.ResponseData LIZ(Q9H q9h) {
        BattleTriggerGuideResponse.ResponseData responseData = new BattleTriggerGuideResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
