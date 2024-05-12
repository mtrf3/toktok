package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _RankUpdate_ProtoDecoder implements InterfaceC31105CIr<RankUpdate> {
    public static RankUpdate LIZIZ(Q9H q9h) {
        RankUpdate rankUpdate = new RankUpdate();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankUpdate.rankType = q9h.LJIIJ();
                        break;
                    case 2:
                        rankUpdate.ownRank = q9h.LJIIJJI();
                        break;
                    case 3:
                        rankUpdate.defaultContent = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        rankUpdate.countdown = q9h.LJIIJJI();
                        break;
                    case 7:
                        rankUpdate.animationInfo = _RankAnimationInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        rankUpdate.belongType = q9h.LJIIJ();
                        break;
                    case 9:
                        rankUpdate.requestFirstShowType = q9h.LJIIJ();
                        break;
                    case 10:
                        rankUpdate.supportedVersion = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rankUpdate.owneronrank = Q9J.LIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankUpdate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankUpdate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
