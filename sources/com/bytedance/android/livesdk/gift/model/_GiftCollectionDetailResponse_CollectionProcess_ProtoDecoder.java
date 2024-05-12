package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftCollectionDetailResponse;

/* loaded from: classes17.dex */
public final class _GiftCollectionDetailResponse_CollectionProcess_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionDetailResponse.CollectionProcess> {
    public static GiftCollectionDetailResponse.CollectionProcess LIZIZ(Q9H q9h) {
        GiftCollectionDetailResponse.CollectionProcess collectionProcess = new GiftCollectionDetailResponse.CollectionProcess();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                collectionProcess.collectedNum = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            collectionProcess.targetNum = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        collectionProcess.round = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    collectionProcess.periodId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return collectionProcess;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftCollectionDetailResponse.CollectionProcess LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
