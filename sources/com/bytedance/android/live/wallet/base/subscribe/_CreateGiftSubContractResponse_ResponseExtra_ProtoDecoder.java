package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.wallet.base.subscribe.CreateGiftSubContractResponse;

/* loaded from: classes17.dex */
public final class _CreateGiftSubContractResponse_ResponseExtra_ProtoDecoder implements InterfaceC31105CIr<CreateGiftSubContractResponse.ResponseExtra> {
    public static CreateGiftSubContractResponse.ResponseExtra LIZIZ(Q9H q9h) {
        CreateGiftSubContractResponse.ResponseExtra responseExtra = new CreateGiftSubContractResponse.ResponseExtra();
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
    public final CreateGiftSubContractResponse.ResponseExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
