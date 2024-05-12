package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BattleStatsMeta_ProtoDecoder implements InterfaceC31105CIr<BattleStatsMeta> {
    @Override // X.InterfaceC31105CIr
    public final BattleStatsMeta LIZ(Q9H q9h) {
        BattleStatsMeta battleStatsMeta = new BattleStatsMeta();
        battleStatsMeta.battleScores = new ArrayList();
        battleStatsMeta.battleArmies = new ArrayList();
        battleStatsMeta.anchors = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleStatsMeta.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        battleStatsMeta.battleId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        battleStatsMeta.battleMode = _BattleMode_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        battleStatsMeta.battleSettings = _BattleSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        battleStatsMeta.battleArmies.add(_BattleArmy_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        battleStatsMeta.channelInfo = _ChannelInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        battleStatsMeta.battleScores.add(_BattleScore_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        battleStatsMeta.anchors.add(_User_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 9:
                        battleStatsMeta.loserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleStatsMeta;
            }
        }
    }
}
