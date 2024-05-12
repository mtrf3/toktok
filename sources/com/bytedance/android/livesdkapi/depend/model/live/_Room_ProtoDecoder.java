package com.bytedance.android.livesdkapi.depend.model.live;

import X.C61447O9r;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubPinCard_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.message.proto._LiveProInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._StarCommentConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model._BaLeadsGenInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Creator_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.android.livesdk.model._InteractionQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._MaskLayer_ProtoDecoder;
import com.bytedance.android.livesdk.model._OfficialChannelInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._PollInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomDecoration_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomStats_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomSticker_ProtoDecoder;
import com.bytedance.android.livesdk.model._ShortTouchItem_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFanTicket_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFrameSummary_ProtoDecoder;
import com.bytedance.android.livesdk.model._WarningTag_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUserSettings_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.HashMap;
import webcast.data._EventCard_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _Room_ProtoDecoder implements InterfaceC31105CIr<Room> {
    /* JADX WARN: Multi-variable type inference failed */
    public static Room LIZIZ(Q9H q9h) {
        Room room = new Room();
        room.feedRoomLabelList = new ArrayList();
        room.topFanTickets = new ArrayList();
        room.rankCommentGroups = new ArrayList();
        room.mIndicators = new ArrayList();
        room.shortTouchItems = new ArrayList();
        room.roomStickerList = new ArrayList();
        room.effectInfo = new ArrayList();
        room.filterRule = new ArrayList();
        room.adminEcShowPermission = new HashMap();
        room.decorationList = new ArrayList();
        room.linkerMap = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Object obj = null;
                switch (LJI) {
                    case 1:
                        room.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        room.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        room.status = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        room.ownerUserId = q9h.LJIIJJI();
                        break;
                    case 5:
                        room.title = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        room.userCount = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        room.createTime = q9h.LJIIJJI();
                        break;
                    case 8:
                    case 10:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case 12:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case 14:
                    case 15:
                    case 19:
                    case 27:
                    case 30:
                    case 31:
                    case 33:
                    case 37:
                    case 38:
                    case 39:
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    case 41:
                    case 44:
                    case 45:
                    case 47:
                    case C61447O9r.LJIIJ:
                    case 50:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case BaseNotice.CREATOR /* 62 */:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 92:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 121:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 146:
                    case 148:
                    case 150:
                    case 154:
                    case 156:
                    case 160:
                    case 161:
                    case 162:
                    case 164:
                    case 168:
                    case 171:
                    case 173:
                    case 175:
                    case 178:
                    case 181:
                    case 188:
                    case 190:
                    case 195:
                    case 243:
                    case 244:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 9:
                        room.finishTime = q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        room.platform = (int) q9h.LJIIJJI();
                        break;
                    case 17:
                        room.clientVersion = String.valueOf(q9h.LJIIJJI());
                        break;
                    case 18:
                        room.withLinkMic = Q9J.LIZ(q9h);
                        break;
                    case 20:
                        room.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 21:
                        room.dynamicCover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 22:
                        room.dynamicCoverLow = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 23:
                        room.shareUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 24:
                        room.anchorShareText = Q9J.LIZIZ(q9h);
                        break;
                    case 25:
                        room.userShareText = Q9J.LIZIZ(q9h);
                        break;
                    case 26:
                        room.streamId = q9h.LJIIJJI();
                        break;
                    case 28:
                        room.streamUrl = _StreamUrl_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 29:
                        room.mosaicStatus = (int) q9h.LJIIJJI();
                        break;
                    case 32:
                        room.linkMicInfoGson = _RoomLinkInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 34:
                        room.decorationList.add(_RoomDecoration_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 35:
                        room.topFanTickets.add(_TopFanTicket_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 36:
                        room.stats = _RoomStats_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 42:
                        room.feedRoomLabel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        room.labels = Q9J.LIZIZ(q9h);
                        break;
                    case 46:
                        room.owner = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        room.hasCommerceGoods = Q9J.LIZ(q9h);
                        break;
                    case 51:
                        room.liveTypeAudio = Q9J.LIZ(q9h);
                        break;
                    case 52:
                        room.isThirdParty = Q9J.LIZ(q9h);
                        break;
                    case 53:
                        room.isScreenshot = Q9J.LIZ(q9h);
                        break;
                    case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                        room.mRoomAuthStatus = _RoomAuthStatus_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 83:
                        room.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 84:
                        room.layout = q9h.LJIIJJI();
                        break;
                    case 90:
                        room.unusedEffect = Q9J.LIZ(q9h);
                        break;
                    case 91:
                        room.giftMessageStyle = (int) q9h.LJIIJJI();
                        break;
                    case 93:
                        room.finish_url = Q9J.LIZIZ(q9h);
                        break;
                    case 101:
                        room.roomLayout = (int) q9h.LJIIJJI();
                        break;
                    case 111:
                        room.likeCount = q9h.LJIIJJI();
                        break;
                    case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                        room.anchorTabType = q9h.LJIIJ();
                        break;
                    case 122:
                        room.officialChannelInfo = _OfficialChannelInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 130:
                        long LIZJ2 = q9h.LIZJ();
                        Long l = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        l = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    obj = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (obj != null) {
                                    if (l != null) {
                                        room.linkerMap.put(obj, l);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 138:
                        room.webcastSdkVersion = q9h.LJIIJJI();
                        break;
                    case 139:
                        room.mNameMode = (int) q9h.LJIIJJI();
                        break;
                    case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                        room.roomCreateAbParam = Q9J.LIZIZ(q9h);
                        break;
                    case 145:
                        room.commerceStruct = _CommerceStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 147:
                        room.streamCover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 149:
                        room.questionVersion = q9h.LJIIJ();
                        break;
                    case 151:
                        room.liveEventInfo = _LiveEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 152:
                        room.hashtag = _Hashtag_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 153:
                        room.baLinkStruct = _BALinkStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 155:
                        room.answeringQuestion = Q9J.LIZIZ(q9h);
                        break;
                    case 157:
                        room.warningTag = _WarningTag_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 158:
                        room.maskLayer = _MaskLayer_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 159:
                        room.liveRoomMode = q9h.LJIIJ();
                        break;
                    case 163:
                        room.finishUrlLynx = Q9J.LIZIZ(q9h);
                        break;
                    case 165:
                        room.likeInfo = _LikeInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 166:
                        room.shortTouchItems.add(_ShortTouchItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 167:
                        room.filterRule.add(_LiveFilterMsgRule_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 169:
                        room.mBoostCardRoomStatus = _LiveGiftBoostCardRoomStatus_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 170:
                        room.feedRoomLabelList.add(_FeedRoomLabel_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 172:
                        room.haveWishList = Q9J.LIZ(q9h);
                        break;
                    case 174:
                        room.multiLiveUserSettings = _MultiLiveUserSettings_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 176:
                        room.interactionQuestion = _InteractionQuestionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 177:
                        room.roomStickerList.add(_RoomSticker_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 179:
                        room.advancedPollInfo = _PollInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 180:
                        room.giftPollVoteEnabled = Q9J.LIZ(q9h);
                        break;
                    case 182:
                        room.skin = _Skin_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 183:
                        room.squareCoverImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 184:
                        room.rectangleCoverImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 185:
                        room.mRoomAuthMessage = _RoomAuthMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 186:
                        room.paidEvent = _PaidEvent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 187:
                        room.pictionaryFullInfo = _PictionaryFullInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 189:
                        room.ageRestricted = _AgeRestricted_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 191:
                        room.pinInfo = _PinInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 192:
                        room.mIndicators.add(Q9J.LIZIZ(q9h));
                        break;
                    case 193:
                        room.topFrameSummary = _TopFrameSummary_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 194:
                        room.bcToggleInfo = _BcToggleInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 196:
                        room.commentHasTextEmojiEmote = (int) q9h.LJIIJJI();
                        break;
                    case 197:
                        room.partnershipInfo = _PartnershipInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 198:
                        room.streamStatus = (int) q9h.LJIIJJI();
                        break;
                    case 199:
                        room.creator = _Creator_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 200:
                        room.drawerTabPosition = Q9J.LIZIZ(q9h);
                        break;
                    case 201:
                        room.baLeadsGenInfo = _BaLeadsGenInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 202:
                        room.effectInfo.add(_EffectInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 203:
                        room.audioMute = q9h.LJIIJ();
                        break;
                    case 204:
                        room.liveEventCard = _EventCard_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 205:
                        room.liveSubOnly = q9h.LJIIJJI();
                        break;
                    case 206:
                        room.supportQuiz = q9h.LJIIJJI();
                        break;
                    case 207:
                        long LIZJ3 = q9h.LIZJ();
                        Long l2 = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        l2 = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    obj = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (obj != null) {
                                    if (l2 != null) {
                                        room.adminEcShowPermission.put(obj, l2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 208:
                        room.blurredCover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 209:
                        room.captionInfo = _CaptionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 210:
                        room.adjustDisplayOrder = q9h.LJIIJJI();
                        break;
                    case 211:
                        room.commerceInfoBackup = _CommerceStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 212:
                        room.allowPreviewTime = q9h.LJIIJJI();
                        break;
                    case 213:
                        room.paidContentInfo = _PaidContentInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 214:
                        room.subPinCard = _SubPinCard_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 215:
                        room.enableServerDrop = q9h.LJIIJJI();
                        break;
                    case 216:
                        room.disablePreviewSubOnly = q9h.LJIIJJI();
                        break;
                    case 217:
                        room.liteUserVisible = Q9J.LIZ(q9h);
                        break;
                    case 218:
                        room.liteUserNotVisible = Q9J.LIZ(q9h);
                        break;
                    case 219:
                        room.dropCommentGroup = q9h.LJIIJJI();
                        break;
                    case 220:
                        room.picoLiveType = q9h.LJIIJ();
                        break;
                    case 221:
                        room.giftSuspension = _GiftSuspension_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 222:
                        room.pollingStarComment = Q9J.LIZ(q9h);
                        break;
                    case 223:
                        room.hasUsedMusic = Q9J.LIZ(q9h);
                        break;
                    case 224:
                        room.anchorLiveProInfo = _LiveProInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 225:
                        room.rankCommentGroups.add(Q9J.LIZIZ(q9h));
                        break;
                    case 226:
                        room.multiStreamScene = q9h.LJIIJJI();
                        break;
                    case 227:
                        room.multiStreamId = q9h.LJIIJJI();
                        break;
                    case 228:
                        room.multiStreamIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 229:
                        room.multiStreamUrl = _StreamUrl_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 230:
                        room.idcRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 231:
                        room.regionalRestricted = _RegionalRestricted_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 232:
                        room.commercialContentToggle = _CommercialContentToggle_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 233:
                        room.maxPreviewTime = q9h.LJIIJJI();
                        break;
                    case 234:
                        room.karaokeInfo = _KaraokeInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 235:
                        room.starCommentConfig = _StarCommentConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 236:
                        room.showStarCommentEntrance = Q9J.LIZ(q9h);
                        break;
                    case 237:
                        room.cppVersion = q9h.LJIIJ();
                        break;
                    case 238:
                        room.liveSubOnlyUseMusic = q9h.LJIIJJI();
                        break;
                    case 239:
                        room.likeEffect = _LikeEffect_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 240:
                        room.roomPcu = q9h.LJIIJJI();
                        break;
                    case 241:
                        room.fypCommerceInfo = _FYPCommerceStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 242:
                        room.netMode = q9h.LJIIJJI();
                        break;
                    case 245:
                        room.rtcAppId = Q9J.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                room.init();
                return room;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Room LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
