package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftModeMeta_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BattleSetting_ProtoDecoder implements InterfaceC31105CIr<BattleSetting> {
    public static BattleSetting LIZIZ(Q9H q9h) {
        BattleSetting battleSetting = new BattleSetting();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleSetting.battleId = q9h.LJIIJJI();
                        break;
                    case 2:
                        battleSetting.startTimeMs = q9h.LJIIJJI();
                        break;
                    case 3:
                        battleSetting.duration = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        battleSetting.channelId = q9h.LJIIJJI();
                        break;
                    case 5:
                        battleSetting.status = q9h.LJIIJ();
                        break;
                    case 6:
                        battleSetting.inviteType = q9h.LJIIJ();
                        break;
                    case 7:
                        battleSetting.giftModeMeta = _GiftModeMeta_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        battleSetting.battleType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleSetting;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleSetting LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
