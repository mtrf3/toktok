package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _DynamicGiftListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<DynamicGiftListResponse.Data> {
    public static DynamicGiftListResponse.Data LIZIZ(Q9H q9h) {
        DynamicGiftListResponse.Data data = new DynamicGiftListResponse.Data();
        data.pages = new ArrayList();
        data.hotFields = new ArrayList();
        data.specialGifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.giftsInfo = _GiftsInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.pages.add(_GiftPage_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        data.coldGiftHash = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        data.pannelRefresh = q9h.LJIIJ();
                        break;
                    case 5:
                        data.hotFields.add(Q9J.LIZIZ(q9h));
                        break;
                    case 6:
                        data.specialGifts.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        data.coldGiftUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        data.coldGiftFallbackUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        data.isFullGiftData = Q9J.LIZ(q9h);
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
    public final DynamicGiftListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
