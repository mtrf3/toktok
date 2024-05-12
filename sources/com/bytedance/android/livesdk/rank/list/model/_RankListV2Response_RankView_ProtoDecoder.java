package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model._SubRankTabInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import webcast.api.ranklist._RankExtraInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RankListV2Response_RankView_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.RankView> {
    public static RankListV2Response.RankView LIZIZ(Q9H q9h) {
        RankListV2Response.RankView rankView = new RankListV2Response.RankView();
        rankView.subTabs = new ArrayList();
        rankView.ranks = new ArrayList();
        rankView.cutOffLine = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankView.title = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        rankView.ruleUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        rankView.ranks.add(_RankListV2Response_RankInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        rankView.ownerRank = _RankListV2Response_RankInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        rankView.countdown = q9h.LJIIJJI();
                        break;
                    case 6:
                        rankView.rankType = q9h.LJIIJ();
                        break;
                    case 7:
                        rankView.weeklyRegionInfo = _WeeklyRankRegionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        rankView.history = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        rankView.isPositionSafe = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        rankView.bulletin = _RankListV2Response_Bulletin_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rankView.subTabs.add(_SubRankTabInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        rankView.cutOffLine.add(_RankListV2Response_CutOffLine_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rankView.rankExtraInfo = _RankExtraInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 14:
                        rankView.bulletinLoop = _RankListV2Response_BulletinLoop_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankView;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.RankView LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
