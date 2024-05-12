package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GiftListResult_ProtoDecoder implements InterfaceC31105CIr<GiftListResult> {
    public static GiftListResult LIZIZ(Q9H q9h) {
        GiftListResult giftListResult = new GiftListResult();
        giftListResult.doodleTemplates = new ArrayList();
        giftListResult.giftPages = new ArrayList();
        giftListResult.hotFields = new ArrayList();
        giftListResult.giftList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftListResult.giftsInfo = _GiftsInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        giftListResult.giftList.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        giftListResult.giftPages.add(_GiftPage_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        giftListResult.doodleTemplates.add(_DoodleTemplate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        giftListResult.responseHash = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        giftListResult.refreshStatus = q9h.LJIIJ();
                        break;
                    case 7:
                        giftListResult.coldGiftHash = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        giftListResult.isFullGiftData = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        giftListResult.hotFields.add(Q9J.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftListResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftListResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
