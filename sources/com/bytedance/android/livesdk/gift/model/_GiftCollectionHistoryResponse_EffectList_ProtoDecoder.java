package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftCollectionHistoryResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GiftCollectionHistoryResponse_EffectList_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionHistoryResponse.EffectList> {
    public static GiftCollectionHistoryResponse.EffectList LIZIZ(Q9H q9h) {
        GiftCollectionHistoryResponse.EffectList effectList = new GiftCollectionHistoryResponse.EffectList();
        effectList.effects = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        effectList.effects.add(_CollectionEffect_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    effectList.round = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return effectList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftCollectionHistoryResponse.EffectList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
