package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C42590Gna;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleMode;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleModeRequest;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* loaded from: classes8.dex */
public interface SuspendApi {
    public static final C42590Gna LIZ = C42590Gna.LIZ;

    @E4T("/aweme/v1/oec/creator/sale_mode/get")
    Object getCreatorSaleMode(@InterfaceC27211Am7 AnchorECSaleModeRequest anchorECSaleModeRequest, InterfaceC67352kd<? super BaseResponse<AnchorECSaleMode>> interfaceC67352kd);
}
