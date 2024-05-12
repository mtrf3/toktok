package com.ss.android.ugc.aweme.bnpl.network;

import X.C64797Pbt;
import X.C91819a0l;
import X.E8M;
import X.EKC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.Nonce;

/* loaded from: classes20.dex */
public interface CheckoutApi {
    public static final C91819a0l LIZ = C91819a0l.LIZ;

    @E8M("/credit/v1/repayment/nonce")
    @EKC({"Content-Type: application/json"})
    Object getNonce(InterfaceC67352kd<? super C64797Pbt<BaseResponse<Nonce>>> interfaceC67352kd);
}
