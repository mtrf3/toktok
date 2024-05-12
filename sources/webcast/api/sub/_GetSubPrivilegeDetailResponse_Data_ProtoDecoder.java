package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgeConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgeDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._Badge_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BenefitView_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._CommunityDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SpotlightInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubAdminPermission_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubBenefit_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubCustomizedBenefit_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubLevel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubOnlyVideosBriefInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubTaskInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import emotes.model._EmoteListResult_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public final class _GetSubPrivilegeDetailResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetSubPrivilegeDetailResponse.Data> {
    public static GetSubPrivilegeDetailResponse.Data LIZIZ(Q9H q9h) {
        GetSubPrivilegeDetailResponse.Data data = new GetSubPrivilegeDetailResponse.Data();
        data.benefits = new ArrayList();
        data.customizedBenefits = new ArrayList();
        data.benefitList = new ArrayList();
        data.giftDetail = new ArrayList();
        data.taskInfoList = new ArrayList();
        data.allLevels = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.badgeConfig = _BadgeConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.emoteDetail = _EmoteListResult_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        data.benefitList.add(_SubBenefit_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        data.giftDetail.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        data.displayStrategy = q9h.LJIIJ();
                        break;
                    case 6:
                        data.anchorDetail = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        data.badge = _Badge_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        data.subscribePermission = _GetSubPrivilegeDetailResponse_Data_SubscribePermission_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        data.emoteConfig = _EmoteConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        data.currentBadgeDetail = _BadgeDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        data.paymentRedirect = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        data.subNoteInfo = _GetSubPrivilegeDetailResponse_Data_SubNoteInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        data.communityDetail = _CommunityDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 14:
                        data.taskInfoList.add(_SubTaskInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 15:
                        data.subInfo = _SubInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        data.allLevels.add(_SubLevel_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 17:
                        data.subScenario = q9h.LJIIJ();
                        break;
                    case 18:
                        data.scenarioText = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        data.goal = _LiveStreamGoal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 20:
                        data.webappPayment = Q9J.LIZ(q9h);
                        break;
                    case 21:
                        data.subTaskStatus = q9h.LJIIJ();
                        break;
                    case 22:
                        data.customizedBenefits.add(_SubCustomizedBenefit_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 23:
                        data.showCustomizedBenefit = Q9J.LIZ(q9h);
                        break;
                    case 24:
                        data.perksCount = q9h.LJIIJ();
                        break;
                    case 25:
                        data.subscriberCount = q9h.LJIIJ();
                        break;
                    case 26:
                        data.benefits.add(_BenefitView_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 27:
                        data.subOnlyVideosBriefInfo = _SubOnlyVideosBriefInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 28:
                        data.spotlightInfo = _SpotlightInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 29:
                        data.adminPermission = _SubAdminPermission_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 30:
                        data.userBuyGiftSubAuth = Q9J.LIZ(q9h);
                        break;
                    case 31:
                        data.showGiftSubProgress = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubPrivilegeDetailResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
