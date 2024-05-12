package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RankEntrance_ProtoDecoder implements InterfaceC31105CIr<RankEntrance> {
    public static RankEntrance LIZIZ(Q9H q9h) {
        RankEntrance rankEntrance = new RankEntrance();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankEntrance.rankType = q9h.LJIIJ();
                        break;
                    case 2:
                        rankEntrance.countdown = q9h.LJIIJJI();
                        break;
                    case 3:
                        rankEntrance.defaultContent = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        rankEntrance.rollConfig = _RollCfg_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        rankEntrance.blockMessage = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        rankEntrance.ownerRankIdx = q9h.LJIIJJI();
                        break;
                    case 7:
                        rankEntrance.ownerOnRank = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        rankEntrance.belongRankType = q9h.LJIIJ();
                        break;
                    case 9:
                        rankEntrance.requestFirstShowType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
