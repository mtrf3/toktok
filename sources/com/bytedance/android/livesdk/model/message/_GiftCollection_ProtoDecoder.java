package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftCollection_ProtoDecoder implements InterfaceC31105CIr<GiftCollection> {
    public static GiftCollection LIZIZ(Q9H q9h) {
        GiftCollection giftCollection = new GiftCollection();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftCollection.round = q9h.LJIIJJI();
                        break;
                    case 2:
                        giftCollection.effectNameKey = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftCollection.gift = _Gift_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        giftCollection.messageType = q9h.LJIIJJI();
                        break;
                    case 5:
                        giftCollection.isFilterHost = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        giftCollection.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftCollection;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftCollection LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
