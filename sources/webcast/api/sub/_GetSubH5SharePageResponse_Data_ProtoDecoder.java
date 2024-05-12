package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._Badge_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BenefitView_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._CommunityDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SpotlightInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubCustomizedBenefit_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubLevel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import emotes.model._EmoteListResult_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.sub.GetSubH5SharePageResponse;

/* loaded from: classes6.dex */
public final class _GetSubH5SharePageResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetSubH5SharePageResponse.Data> {
    public static GetSubH5SharePageResponse.Data LIZIZ(Q9H q9h) {
        GetSubH5SharePageResponse.Data data = new GetSubH5SharePageResponse.Data();
        data.benefits = new ArrayList();
        data.customizedBenefits = new ArrayList();
        data.giftDetail = new ArrayList();
        data.allLevels = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 2:
                        data.emoteDetail = _EmoteListResult_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                    case 5:
                    case 10:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case 14:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 4:
                        data.giftDetail.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        data.anchorDetail = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        data.badge = _Badge_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        data.subscribePermission = _GetSubH5SharePageResponse_Data_SubscribePermission_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        data.emoteConfig = _EmoteConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        data.subNoteInfo = _GetSubH5SharePageResponse_Data_SubNoteInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        data.communityDetail = _CommunityDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        data.allLevels.add(_SubLevel_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 17:
                        data.subScenario = q9h.LJIIJ();
                        break;
                    case 22:
                        data.customizedBenefits.add(_SubCustomizedBenefit_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 23:
                        data.showCustomizedBenefit = Q9J.LIZ(q9h);
                        break;
                    case 25:
                        data.subscriberCount = q9h.LJIIJ();
                        break;
                    case 26:
                        data.benefits.add(_BenefitView_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 27:
                        data.spotlightInfo = _SpotlightInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubH5SharePageResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
