package com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.network;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.E7V;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.pns.agegate.network.BaseResponse;
import java.util.List;

/* loaded from: classes7.dex */
public interface ConsentApi {
    public static final E7V LIZ = E7V.LIZ;

    @InterfaceC195787mI
    @E4T("/tiktok/consent/api/record/create/v1")
    AbstractC73672Svk<BaseResponse> createConsentRecord(@InterfaceC64987Pex("entity_key") String str, @InterfaceC64987Pex("business_flow") String str2, @InterfaceC64987Pex("status") int i);

    @InterfaceC195787mI
    @E4Q("/tiktok/consent/api/entity/get/v1")
    AbstractC73672Svk<BaseResponse> getConsentEntity(@InterfaceC64987Pex("key") String str);

    @InterfaceC195787mI
    @E4Q("/tiktok/consent/api/record/get/v1")
    AbstractC73672Svk<BaseResponse> getConsentRecord(@InterfaceC64987Pex("entity_key") String str);

    @InterfaceC195787mI
    @E4Q("/tiktok/consent/api/entity/list/v1")
    AbstractC73672Svk<BaseResponse> listConsentEntity(@InterfaceC64987Pex("keys") List<String> list);

    @InterfaceC195787mI
    @E4Q("/tiktok/consent/api/record/list/v1")
    AbstractC73672Svk<BaseResponse> listConsentRecord(@InterfaceC64987Pex("keys") List<String> list);
}
