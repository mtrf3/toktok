package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftCollectionDetailResponse;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _GiftCollectionDetailResponse_Gift_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionDetailResponse.Gift> {
    public static GiftCollectionDetailResponse.Gift LIZIZ(Q9H q9h) {
        GiftCollectionDetailResponse.Gift gift = new GiftCollectionDetailResponse.Gift();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gift.giftId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        gift.img = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        gift.sendIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        gift.bgImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        gift.roundName = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        gift.topicText = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        gift.topicCompleteText = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        gift.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        gift.endTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        gift.round = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        gift.giftType = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 12:
                        gift.diamondCount = Integer.valueOf(q9h.LJIIJ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gift;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftCollectionDetailResponse.Gift LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
