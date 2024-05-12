package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;

/* loaded from: classes14.dex */
public final class _MultiGuestReserveResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<MultiGuestReserveResponse.Extra> {
    public static MultiGuestReserveResponse.Extra LIZIZ(Q9H q9h) {
        MultiGuestReserveResponse.Extra extra = new MultiGuestReserveResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiGuestReserveResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
