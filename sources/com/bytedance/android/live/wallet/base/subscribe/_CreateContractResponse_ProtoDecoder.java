package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CreateContractResponse_ProtoDecoder implements InterfaceC31105CIr<CreateContractResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreateContractResponse LIZ(Q9H q9h) {
        CreateContractResponse createContractResponse = new CreateContractResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        createContractResponse.extra = _CreateContractResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    createContractResponse.data = _CreateContractResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createContractResponse;
            }
        }
    }
}
