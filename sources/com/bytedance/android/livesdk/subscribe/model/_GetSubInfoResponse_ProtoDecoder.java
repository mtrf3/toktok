package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._AnchorEmailInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._C2CTransformationPageInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._CommunityIDInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._LiveSubOnlyConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._PriceTierInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._ShareInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SpotlightInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubOnlyVideosBriefInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._ToolsInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.subscribe.model.gift._SubGifInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.goal._SubGoalInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubAvailable_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubEnable_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationEntrance_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _GetSubInfoResponse_ProtoDecoder implements InterfaceC31105CIr<GetSubInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetSubInfoResponse LIZ(Q9H q9h) {
        GetSubInfoResponse getSubInfoResponse = new GetSubInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 20) {
                    if (LJI != 21) {
                        switch (LJI) {
                            case 1:
                                getSubInfoResponse.badgeInfo = _SubSettingStatus_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 2:
                                getSubInfoResponse.emotesInfo = _SubSettingStatus_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 3:
                                getSubInfoResponse.qualification = Q9J.LIZ(q9h);
                                break;
                            case 4:
                                getSubInfoResponse.initialized = Q9J.LIZ(q9h);
                                break;
                            case 5:
                                getSubInfoResponse.enable = Q9J.LIZ(q9h);
                                break;
                            case 6:
                                getSubInfoResponse.bubbleInfo = _BubbleInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 7:
                                getSubInfoResponse.payPalBindInfo = _PayPalBindInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 8:
                                getSubInfoResponse.hasOptIn = Q9J.LIZ(q9h);
                                break;
                            case 9:
                                getSubInfoResponse.noteInfo = _SubSettingStatus_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 10:
                                getSubInfoResponse.communityInfo = _SubSettingStatus_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                getSubInfoResponse.invitationEntrance = _SubInvitationEntrance_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 12:
                                getSubInfoResponse.subGoalInfo = _SubGoalInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                getSubInfoResponse.subOverview = _SubDataOverview_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 14:
                                getSubInfoResponse.subGiftInfo = _SubGifInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                switch (LJI) {
                                    case 25:
                                        getSubInfoResponse.subEntrance = _SubEntrance_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 26:
                                        getSubInfoResponse.subAvailable = _SubAvailable_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 27:
                                        getSubInfoResponse.subEnable = _SubEnable_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 28:
                                        getSubInfoResponse.subOptInScenario = q9h.LJIIJ();
                                        break;
                                    case 29:
                                        getSubInfoResponse.communityIdInfo = _CommunityIDInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 30:
                                        getSubInfoResponse.toolsInfo = _ToolsInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 31:
                                        getSubInfoResponse.showPreviewSubBubble = Q9J.LIZ(q9h);
                                        break;
                                    case 32:
                                        getSubInfoResponse.congratsFigures = q9h.LJIIJJI();
                                        break;
                                    case 33:
                                        getSubInfoResponse.c2cPeriod = q9h.LJIIJ();
                                        break;
                                    case 34:
                                        getSubInfoResponse.c2cTransAvailable = Q9J.LIZ(q9h);
                                        break;
                                    case 35:
                                        getSubInfoResponse.c2cTransStatus = q9h.LJIIJJI();
                                        break;
                                    case 36:
                                        getSubInfoResponse.isRevoked = Q9J.LIZ(q9h);
                                        break;
                                    case 37:
                                        getSubInfoResponse.c2cTransPageInfo = _C2CTransformationPageInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 38:
                                        getSubInfoResponse.timerDetail = _TimerDetail_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 39:
                                        getSubInfoResponse.priceTierInfo = _PriceTierInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                        getSubInfoResponse.shareInfo = _ShareInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 41:
                                        getSubInfoResponse.subOnlyVideosBriefInfo = _SubOnlyVideosBriefInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 42:
                                        getSubInfoResponse.anchorEmailInfo = _AnchorEmailInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                                        getSubInfoResponse.enableWaveStatus = Q9J.LIZ(q9h);
                                        break;
                                    case 44:
                                        getSubInfoResponse.spotlightInfo = _SpotlightInfo_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 45:
                                        getSubInfoResponse.showSubOnlyLiveBanner = Q9J.LIZ(q9h);
                                        break;
                                    case 46:
                                        getSubInfoResponse.anchorGiftSubAuth = Q9J.LIZ(q9h);
                                        break;
                                    case 47:
                                        getSubInfoResponse.banner = _SubLiveBanner_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                        }
                    } else {
                        getSubInfoResponse.liveSubOnlyConfig = _LiveSubOnlyConfig_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getSubInfoResponse.customBenefitEntrance = _CustomBenefitEntrance_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubInfoResponse;
            }
        }
    }
}
