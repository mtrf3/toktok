package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._GiftTrayInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftsBoxInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _GiftResultData_ProtoDecoder implements InterfaceC31105CIr<GiftResultData> {
    public static GiftResultData LIZIZ(Q9H q9h) {
        GiftResultData giftResultData = new GiftResultData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftResultData.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        giftResultData.describe = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftResultData.giftId = q9h.LJIIJJI();
                        break;
                    case 4:
                        giftResultData.groupCount = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        giftResultData.repeatCount = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        giftResultData.comboCount = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        giftResultData.msgId = q9h.LJIIJJI();
                        break;
                    case 8:
                        giftResultData.trayDisplayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 10:
                        giftResultData.mTrayInfo = _GiftTrayInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        giftResultData.mGift = _Gift_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        giftResultData.displayTextForAnchor = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        giftResultData.displayTextForAudience = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 14:
                        giftResultData.giftsInBox = _GiftsBoxInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftResultData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftResultData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
