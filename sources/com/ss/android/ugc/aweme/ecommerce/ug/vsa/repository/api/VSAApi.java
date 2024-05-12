package com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.api;

import X.C64797Pbt;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import X.OLB;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;

/* loaded from: classes11.dex */
public interface VSAApi {
    public static final OLB LIZ = OLB.LIZ;

    @E8M("/api/v1/mall/feed/product/get")
    Object fetchVSAProductCards(@InterfaceC195727mC VSAProductCardsRequest vSAProductCardsRequest, InterfaceC67352kd<? super C64797Pbt<Response<VSAProductCardsResponse>>> interfaceC67352kd);
}
