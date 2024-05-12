package com.ss.android.ugc.aweme.api;

import X.C10K;
import X.C2UM;
import X.C76L;
import X.C770830u;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC27211Am7;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC789838c;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.api.resp.AnchorSelectionResponse;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;

/* loaded from: classes8.dex */
public final class AnchorApi {
    public static final InterfaceC789838c LIZ;
    public static final InterfaceC789838c LIZIZ;

    /* loaded from: classes8.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/anchor/history/delete/")
        C10K<C2UM> getAnchorDeleteHistoryResponse(@InterfaceC64987Pex("type") int i, @InterfaceC64987Pex("ids") String str, @InterfaceC64987Pex("clear_all") boolean z);

        @E4T("/api/v1/shop/item/product_info/get")
        C10K<GetItemProductInfoResponse> getAnchorProductInfoResponse(@InterfaceC27211Am7 GetItemProductInfoRequest getItemProductInfoRequest);

        @E4Q("/aweme/v1/anchor/search/")
        C76L<AnchorSearchResponse> getAnchorSearchResponse(@InterfaceC64989Pez("type") int i, @InterfaceC64989Pez("keyword") String str, @InterfaceC64989Pez("page") int i2, @InterfaceC64989Pez("page_size") int i3);

        @E4Q("/aweme/v1/anchor/selection/")
        C76L<AnchorSelectionResponse> getAnchorSelectionResponse(@InterfaceC64989Pez("type") int i, @InterfaceC64989Pez("tab_id") int i2, @InterfaceC64989Pez("page") int i3, @InterfaceC64989Pez("page_size") int i4);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = Api.LIZ;
        LIZ = C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str);
        LIZIZ = RetrofitFactory.LIZLLL().create("https://oec-api.tiktokv.com/");
    }
}
