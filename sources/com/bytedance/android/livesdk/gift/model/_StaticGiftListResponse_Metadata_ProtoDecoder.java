package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.StaticGiftListResponse;

/* loaded from: classes14.dex */
public final class _StaticGiftListResponse_Metadata_ProtoDecoder implements InterfaceC31105CIr<StaticGiftListResponse.Metadata> {
    public static StaticGiftListResponse.Metadata LIZIZ(Q9H q9h) {
        StaticGiftListResponse.Metadata metadata = new StaticGiftListResponse.Metadata();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            metadata.timestamp = q9h.LJIIJJI();
                        }
                    } else {
                        metadata.hash = Q9J.LIZIZ(q9h);
                    }
                } else {
                    metadata.numGifts = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return metadata;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StaticGiftListResponse.Metadata LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
