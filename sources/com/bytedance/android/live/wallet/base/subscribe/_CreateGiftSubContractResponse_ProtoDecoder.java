package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CreateGiftSubContractResponse_ProtoDecoder implements InterfaceC31105CIr<CreateGiftSubContractResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreateGiftSubContractResponse LIZ(Q9H q9h) {
        CreateGiftSubContractResponse createGiftSubContractResponse = new CreateGiftSubContractResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        createGiftSubContractResponse.extra = _CreateGiftSubContractResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    createGiftSubContractResponse.data = _CreateGiftSubContractResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createGiftSubContractResponse;
            }
        }
    }
}
