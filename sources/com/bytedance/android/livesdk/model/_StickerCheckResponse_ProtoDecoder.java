package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StickerCheckResponse_ProtoDecoder implements InterfaceC31105CIr<StickerCheckResponse> {
    @Override // X.InterfaceC31105CIr
    public final StickerCheckResponse LIZ(Q9H q9h) {
        StickerCheckResponse stickerCheckResponse = new StickerCheckResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return stickerCheckResponse;
    }
}
