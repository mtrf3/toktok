package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.wallet.base.subscribe.CreateContractResponse;

/* loaded from: classes17.dex */
public final class _CreateContractResponse_ResponseExtra_ProtoDecoder implements InterfaceC31105CIr<CreateContractResponse.ResponseExtra> {
    public static CreateContractResponse.ResponseExtra LIZIZ(Q9H q9h) {
        CreateContractResponse.ResponseExtra responseExtra = new CreateContractResponse.ResponseExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreateContractResponse.ResponseExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
