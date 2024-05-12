package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleFinishResult_ProtoDecoder implements InterfaceC31105CIr<BattleFinishResult> {
    @Override // X.InterfaceC31105CIr
    public final BattleFinishResult LIZ(Q9H q9h) {
        BattleFinishResult battleFinishResult = new BattleFinishResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleFinishResult.data = _BattleFinishResult_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleFinishResult;
            }
        }
    }
}
