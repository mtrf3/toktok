package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C10K;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC789838c;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;

/* loaded from: classes8.dex */
public final class AnchorApi {
    public static final InterfaceC789838c LIZ = RetrofitFactory.LIZLLL().create("https://oec-api.tiktokv.com/");

    /* loaded from: classes8.dex */
    public interface RealApi {
        @E4T("/api/v1/shop/item/product_info/get")
        C10K<GetItemProductInfoResponse> getAnchorProductInfoResponse(@InterfaceC27211Am7 GetItemProductInfoRequest getItemProductInfoRequest);
    }

    public static C10K LIZ(GetItemProductInfoRequest getItemProductInfoRequest) {
        return ((RealApi) LIZ.create(RealApi.class)).getAnchorProductInfoResponse(getItemProductInfoRequest);
    }
}
