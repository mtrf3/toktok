package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import tikcast.api.privilege._PayGradeInfo_ProtoDecoder;
import webcast.data._FansLevelInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SendGiftResult_ProtoDecoder implements InterfaceC31105CIr<SendGiftResult> {
    public static SendGiftResult LIZIZ(Q9H q9h) {
        SendGiftResult sendGiftResult = new SendGiftResult();
        sendGiftResult.lynxExtra = new ArrayList();
        sendGiftResult.gifts = new ArrayList();
        sendGiftResult.balanceResult = new ArrayList();
        sendGiftResult.props = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        sendGiftResult.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        sendGiftResult.fanTicketCount = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        sendGiftResult.describe = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        sendGiftResult.mGiftId = q9h.LJIIJJI();
                        break;
                    case 5:
                        sendGiftResult.groupCount = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        sendGiftResult.mLeftDiamonds = q9h.LJIIJJI();
                        break;
                    case 7:
                        sendGiftResult.repeatCount = (int) q9h.LJIIJJI();
                        break;
                    case 8:
                        sendGiftResult.comboCount = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        sendGiftResult.propId = q9h.LJIIJJI();
                        break;
                    case 10:
                        sendGiftResult.propType = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        sendGiftResult.props.add(_Prop_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        sendGiftResult.msgId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case 14:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 15:
                        sendGiftResult.gifts.add(_GiftResultData_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        sendGiftResult.roomFanTicketCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 17:
                        sendGiftResult.groupId = q9h.LJIIJJI();
                        break;
                    case 18:
                        sendGiftResult.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        sendGiftResult.mCalmDownInfo = _CalmDownInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 20:
                        sendGiftResult.balanceResult.add(_ExchangeGiftResultData_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 21:
                        sendGiftResult.monitorExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 22:
                        sendGiftResult.isFirstSend = Q9J.LIZ(q9h);
                        break;
                    case 23:
                        sendGiftResult.freqLimitRemaintimes = q9h.LJIIJ();
                        break;
                    case 24:
                        sendGiftResult.payGradeInfo = _PayGradeInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 25:
                        sendGiftResult.lynxExtra.add(_LynxGiftExtra_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 26:
                        sendGiftResult.matchInfo = _MatchInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 27:
                        sendGiftResult.linkmicGiftExpressionStrategy = q9h.LJIIJ();
                        break;
                    case 28:
                        sendGiftResult.fansLevelInfo = _FansLevelInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 29:
                        sendGiftResult.anchorFansCount = q9h.LJIIJJI();
                        break;
                    case 30:
                        sendGiftResult.flyingMicResources = _FlyingMicResources_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return sendGiftResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SendGiftResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
