package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CollectionDescription_ProtoDecoder implements InterfaceC31105CIr<CollectionDescription> {
    public static CollectionDescription LIZIZ(Q9H q9h) {
        CollectionDescription collectionDescription = new CollectionDescription();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            collectionDescription.audienceDescription = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        collectionDescription.hostDescription = Q9J.LIZIZ(q9h);
                    }
                } else {
                    collectionDescription.commonDescription = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return collectionDescription;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CollectionDescription LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
