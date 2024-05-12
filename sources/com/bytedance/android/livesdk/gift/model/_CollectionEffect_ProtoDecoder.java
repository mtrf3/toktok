package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _CollectionEffect_ProtoDecoder implements InterfaceC31105CIr<CollectionEffect> {
    public static CollectionEffect LIZIZ(Q9H q9h) {
        CollectionEffect collectionEffect = new CollectionEffect();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        collectionEffect.effectId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        collectionEffect.effectName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        collectionEffect.effectContent = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        collectionEffect.firstContributor = _CollectionUser_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        collectionEffect.isRareEffect = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 6:
                        collectionEffect.hasBeenCollected = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 7:
                        collectionEffect.img = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        collectionEffect.nonActivatedImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return collectionEffect;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CollectionEffect LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
