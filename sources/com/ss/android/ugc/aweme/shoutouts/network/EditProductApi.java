package com.ss.android.ugc.aweme.shoutouts.network;

import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public final class EditProductApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("/tiktok/shoutouts/product/edit/v1")
        InterfaceC37276Ek4<BaseResponse> get(@InterfaceC64987Pex("product_id") String str, @InterfaceC64987Pex("product") String str2);
    }
}
