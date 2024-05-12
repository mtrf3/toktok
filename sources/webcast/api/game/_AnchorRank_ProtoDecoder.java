package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _AnchorRank_ProtoDecoder implements InterfaceC31105CIr<AnchorRank> {
    public static AnchorRank LIZIZ(Q9H q9h) {
        AnchorRank anchorRank = new AnchorRank();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorRank.anchorUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        anchorRank.anchorName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        anchorRank.rank = q9h.LJIIJ();
                        break;
                    case 4:
                        anchorRank.anchorAvatar = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        anchorRank.newAudienceNum = q9h.LJIIJ();
                        break;
                    case 6:
                        anchorRank.isOnline = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        anchorRank.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        anchorRank.canSubscribe = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        anchorRank.canSubStatus = q9h.LJIIJ();
                        break;
                    case 10:
                        anchorRank.claimedRewardNum = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        anchorRank.badge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        anchorRank.isInGracePeriod = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        anchorRank.anchorSecUid = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorRank;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorRank LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
