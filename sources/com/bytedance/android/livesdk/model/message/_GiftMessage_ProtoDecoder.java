package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._FlyingMicResources_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LynxGiftExtra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._MatchInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model._GiftTrayInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftsBoxInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftMessage_ProtoDecoder implements InterfaceC31105CIr<GiftMessage> {
    public static GiftMessage LIZIZ(Q9H q9h) {
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.lynxExtra = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        giftMessage.giftId = q9h.LJIIJJI();
                        break;
                    case 3:
                        giftMessage.fanTicketCount = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        giftMessage.groupCount = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        giftMessage.repeatCount = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        giftMessage.comboCount = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        giftMessage.fromUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        giftMessage.toUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        giftMessage.repeatEnd = q9h.LJIIJ();
                        break;
                    case 10:
                        giftMessage.textEffect = _TextEffect_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        giftMessage.groupId = q9h.LJIIJJI();
                        break;
                    case 12:
                        giftMessage.incomeTaskgifts = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        giftMessage.roomFanTicketCount = q9h.LJIIJJI();
                        break;
                    case 14:
                        giftMessage.priority = _GiftIMPriority_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 15:
                        giftMessage.mGift = _Gift_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        giftMessage.mLogId = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        giftMessage.sendType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 18:
                        giftMessage.publicAreaCommon = _PublicAreaCommon_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 19:
                        giftMessage.trayDisplayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 20:
                        giftMessage.bannedDisplayEffects = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 21:
                        giftMessage.mTrayInfo = _GiftTrayInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 22:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 23:
                        giftMessage.giftMonitorInfo = _GiftMonitorInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 24:
                        giftMessage.colorId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 25:
                        giftMessage.isFirstSendGift = Q9J.LIZ(q9h);
                        break;
                    case 26:
                        giftMessage.displayTextForAnchor = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 27:
                        giftMessage.displayTextForAudience = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 28:
                        giftMessage.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case 29:
                        giftMessage.giftsInBox = _GiftsBoxInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 30:
                        giftMessage.msgFilter = _MsgFilter_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 31:
                        giftMessage.lynxExtra.add(_LynxGiftExtra_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 32:
                        giftMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 33:
                        giftMessage.matchInfo = _MatchInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 34:
                        giftMessage.linkmicGiftExpressionStrategy = q9h.LJIIJ();
                        break;
                    case 35:
                        giftMessage.flyingMicResources = _FlyingMicResources_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 36:
                        giftMessage.disableGiftTracking = Q9J.LIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
