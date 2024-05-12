package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;

/* loaded from: classes14.dex */
public final class _BattleInviteResult_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BattleInviteResult.ResponseData> {
    public static BattleInviteResult.ResponseData LIZIZ(Q9H q9h) {
        BattleInviteResult.ResponseData responseData = new BattleInviteResult.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.inviterGiftPermissionType = q9h.LJIIJ();
                    }
                } else {
                    responseData.battleId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleInviteResult.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
