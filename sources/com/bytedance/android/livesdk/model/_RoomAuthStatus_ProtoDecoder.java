package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.message.proto._ToolBarManagement_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._AnchorLevelPermission_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _RoomAuthStatus_ProtoDecoder implements InterfaceC31105CIr<RoomAuthStatus> {
    public static RoomAuthStatus LIZIZ(Q9H q9h) {
        RoomAuthStatus roomAuthStatus = new RoomAuthStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    switch (LJI) {
                                        case 7:
                                            roomAuthStatus.enableRoomContributor = Q9J.LIZ(q9h);
                                            break;
                                        case 8:
                                            roomAuthStatus.enableProps = Q9J.LIZ(q9h);
                                            break;
                                        case 9:
                                            roomAuthStatus.usercard = Boolean.valueOf(Q9J.LIZ(q9h));
                                            break;
                                        case 10:
                                            roomAuthStatus.deprecated1 = Boolean.valueOf(Q9J.LIZ(q9h));
                                            break;
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                            roomAuthStatus.deprecated2 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 12:
                                            roomAuthStatus.bannerState = (int) q9h.LJIIJJI();
                                            break;
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                            roomAuthStatus.deprecated3 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 14:
                                            roomAuthStatus.deprecated4 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 15:
                                            roomAuthStatus.landscape = (int) q9h.LJIIJJI();
                                            break;
                                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                            roomAuthStatus.landscapechat = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 17:
                                            roomAuthStatus.messageType = (int) q9h.LJIIJJI();
                                            break;
                                        case 18:
                                            roomAuthStatus.anchorGiftType = (int) q9h.LJIIJJI();
                                            break;
                                        case 19:
                                            roomAuthStatus.deprecated5 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 20:
                                            roomAuthStatus.donationSticker = (int) q9h.LJIIJJI();
                                            break;
                                        case 21:
                                            roomAuthStatus.deprecated6 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 22:
                                            roomAuthStatus.deprecated7 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 23:
                                            roomAuthStatus.deprecated8 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 24:
                                            roomAuthStatus.deprecated9 = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 25:
                                            roomAuthStatus.enableQuestion = Q9J.LIZ(q9h);
                                            break;
                                        case 26:
                                            roomAuthStatus.enableChatL2 = Q9J.LIZ(q9h);
                                            break;
                                        case 27:
                                            roomAuthStatus.enableViewers = Q9J.LIZ(q9h);
                                            break;
                                        case 28:
                                            roomAuthStatus.enableShare = Q9J.LIZ(q9h);
                                            break;
                                        case 29:
                                            roomAuthStatus.giftRankSwitchStatus = q9h.LJIIJ();
                                            break;
                                        case 30:
                                            roomAuthStatus.enablePromote = Q9J.LIZ(q9h);
                                            break;
                                        case 31:
                                            roomAuthStatus.userCountDisplayState = (int) q9h.LJIIJJI();
                                            break;
                                        case 32:
                                            roomAuthStatus.rankState = (int) q9h.LJIIJJI();
                                            break;
                                        case 33:
                                            roomAuthStatus.broadcastmessage = Long.valueOf(q9h.LJIIJJI());
                                            break;
                                        case 34:
                                            roomAuthStatus.chatSubOnly = Q9J.LIZ(q9h);
                                            break;
                                        case 35:
                                            roomAuthStatus.anchorRedEnvelopeType = (int) q9h.LJIIJJI();
                                            break;
                                        case 36:
                                            roomAuthStatus.quickCommentState = (int) q9h.LJIIJJI();
                                            break;
                                        case 37:
                                            roomAuthStatus.enablePoll = (int) q9h.LJIIJJI();
                                            break;
                                        case 38:
                                            roomAuthStatus.enableGiftPoll = (int) q9h.LJIIJJI();
                                            break;
                                        default:
                                            switch (LJI) {
                                                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                                    roomAuthStatus.enableDrawGuess = q9h.LJIIJJI();
                                                    break;
                                                case 41:
                                                    roomAuthStatus.enableActivityTreasureBox = (int) q9h.LJIIJJI();
                                                    break;
                                                case 42:
                                                    roomAuthStatus.customizablepoll = Long.valueOf(q9h.LJIIJJI());
                                                    break;
                                                default:
                                                    switch (LJI) {
                                                        case 100:
                                                            roomAuthStatus.roomAuthOffReasons = _RoomAuthOffReasons_ProtoDecoder.LIZIZ(q9h);
                                                            break;
                                                        case 101:
                                                            roomAuthStatus.useUserPV = Q9J.LIZ(q9h);
                                                            break;
                                                        case 102:
                                                            roomAuthStatus.promoteOther = (int) q9h.LJIIJJI();
                                                            break;
                                                        case 103:
                                                            roomAuthStatus.ecRankSwitchStatus = q9h.LJIIJ();
                                                            break;
                                                        default:
                                                            switch (LJI) {
                                                                case 105:
                                                                    roomAuthStatus.eventpromotion = q9h.LJIIJ();
                                                                    break;
                                                                case 106:
                                                                    roomAuthStatus.commentFlaggedSwitch = Q9J.LIZ(q9h);
                                                                    break;
                                                                case 107:
                                                                    roomAuthStatus.commentFlaggedReviewSwitch = Q9J.LIZ(q9h);
                                                                    break;
                                                                case 108:
                                                                    roomAuthStatus.exploreEnabled = Q9J.LIZ(q9h);
                                                                    break;
                                                                case 109:
                                                                    roomAuthStatus.pictionarypermission = q9h.LJIIJJI();
                                                                    break;
                                                                case 110:
                                                                    roomAuthStatus.pictionarybubble = q9h.LJIIJJI();
                                                                    break;
                                                                case 111:
                                                                    roomAuthStatus.anchorLevelPermission = _AnchorLevelPermission_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case 112:
                                                                    roomAuthStatus.gamerankingswitch = q9h.LJIIJ();
                                                                    break;
                                                                case 113:
                                                                    roomAuthStatus.toolbarmanagement = _ToolBarManagement_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case 114:
                                                                    roomAuthStatus.multienablereserve = Q9J.LIZ(q9h);
                                                                    break;
                                                                case 115:
                                                                    roomAuthStatus.enablefanslevel = Q9J.LIZ(q9h);
                                                                    break;
                                                                case 116:
                                                                    roomAuthStatus.secretroom = q9h.LJIIJJI();
                                                                    break;
                                                                default:
                                                                    Q9J.LIZJ(q9h);
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    roomAuthStatus.enableDigg = Q9J.LIZ(q9h);
                                }
                            } else {
                                roomAuthStatus.enableLuckMoney = Q9J.LIZ(q9h);
                            }
                        } else {
                            roomAuthStatus.enableGift = Q9J.LIZ(q9h);
                        }
                    } else {
                        roomAuthStatus.enableDanmaku = Q9J.LIZ(q9h);
                    }
                } else {
                    roomAuthStatus.enableChat = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomAuthStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomAuthStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
