package com.bytedance.android.livesdk.battle.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleRecentContribResponse_ProtoDecoder implements InterfaceC31105CIr<BattleRecentContribResponse> {
    @Override // X.InterfaceC31105CIr
    public final BattleRecentContribResponse LIZ(Q9H q9h) {
        BattleRecentContribResponse battleRecentContribResponse = new BattleRecentContribResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleRecentContribResponse.data = _BattleRecentContribResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleRecentContribResponse;
            }
        }
    }
}
