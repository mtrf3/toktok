package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.api;

import X.C76L;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.PdpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SemiPdpRequest;
import java.util.Map;

/* loaded from: classes13.dex */
public interface PdpV2Api {
    @E4T("/api/v1/shop/product_info/get")
    Object getCloseProduct(@InterfaceC27211Am7 Map<String, Object> map, InterfaceC67352kd<? super PdpResponse> interfaceC67352kd);

    @E4T("/api/v1/product/api/open_loop_pdp")
    Object getSemiProduct(@InterfaceC27211Am7 SemiPdpRequest semiPdpRequest, InterfaceC67352kd<? super PdpResponse> interfaceC67352kd);

    @E4T("/api/v1/product/api/open_loop_pdp")
    C76L<PdpResponse> getSemiProductPreload(@InterfaceC27211Am7 SemiPdpRequest semiPdpRequest);
}
