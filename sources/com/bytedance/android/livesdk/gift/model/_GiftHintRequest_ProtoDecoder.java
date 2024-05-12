package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftHintRequest_ProtoDecoder implements InterfaceC31105CIr<GiftHintRequest> {
    @Override // X.InterfaceC31105CIr
    public final GiftHintRequest LIZ(Q9H q9h) {
        GiftHintRequest giftHintRequest = new GiftHintRequest();
        giftHintRequest.hintIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftHintRequest.hintIds.add(Integer.valueOf(q9h.LJIIJ()));
                }
            } else {
                q9h.LJ(LIZJ);
                return giftHintRequest;
            }
        }
    }
}
