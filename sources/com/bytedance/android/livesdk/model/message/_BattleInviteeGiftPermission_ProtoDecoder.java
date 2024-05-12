package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleInviteeGiftPermission_ProtoDecoder implements InterfaceC31105CIr<BattleInviteeGiftPermission> {
    public static BattleInviteeGiftPermission LIZIZ(Q9H q9h) {
        BattleInviteeGiftPermission battleInviteeGiftPermission = new BattleInviteeGiftPermission();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleInviteeGiftPermission.giftPermissionType = q9h.LJIIJ();
                    }
                } else {
                    battleInviteeGiftPermission.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleInviteeGiftPermission;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleInviteeGiftPermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
