package com.bytedance.android.live.liveinteract.match.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleInviteRequestParams_ProtoDecoder implements InterfaceC31105CIr<BattleInviteRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final BattleInviteRequestParams LIZ(Q9H q9h) {
        BattleInviteRequestParams battleInviteRequestParams = new BattleInviteRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    battleInviteRequestParams.giftId = q9h.LJIIJJI();
                                }
                            } else {
                                battleInviteRequestParams.targetUserId = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            battleInviteRequestParams.inviteType = q9h.LJIIJ();
                        }
                    } else {
                        battleInviteRequestParams.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    battleInviteRequestParams.channelId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleInviteRequestParams;
            }
        }
    }
}