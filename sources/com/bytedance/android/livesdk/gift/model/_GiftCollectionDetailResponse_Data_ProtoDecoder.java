package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftCollectionDetailResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GiftCollectionDetailResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionDetailResponse.Data> {
    public static GiftCollectionDetailResponse.Data LIZIZ(Q9H q9h) {
        GiftCollectionDetailResponse.Data data = new GiftCollectionDetailResponse.Data();
        data.effects = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.anchorInfo = _CollectionUser_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.giftInfo = _GiftCollectionDetailResponse_Gift_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        data.collectionProcess = _GiftCollectionDetailResponse_CollectionProcess_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        data.effects.add(_CollectionEffect_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        data.isHost = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 6:
                        data.cardDescription = _CollectionDescription_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        data.jumpText = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        data.sendText = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        data.ruleUrl = Q9J.LIZIZ(q9h);
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
    public final GiftCollectionDetailResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
