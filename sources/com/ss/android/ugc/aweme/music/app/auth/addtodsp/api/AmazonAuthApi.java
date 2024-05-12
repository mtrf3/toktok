package com.ss.android.ugc.aweme.music.app.auth.addtodsp.api;

import X.E8M;
import X.EKC;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse;

/* loaded from: classes34.dex */
public interface AmazonAuthApi {
    @InterfaceC195787mI
    @E8M("/auth/o2/token")
    @EKC({"x-tt-dataflow-id: AmazonOauth"})
    Object getAccessToken(@InterfaceC64987Pex("grant_type") String str, @InterfaceC64987Pex("code") String str2, @InterfaceC64987Pex("client_id") String str3, @InterfaceC64987Pex("client_secret") String str4, @InterfaceC64987Pex("redirect_uri") String str5, @InterfaceC64987Pex("code_verifier") String str6, InterfaceC67352kd<? super AmazonAccessTokenResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/auth/o2/token")
    @EKC({"x-tt-dataflow-id: AmazonOauth"})
    Object refreshAmazonAccessToken(@InterfaceC64987Pex("grant_type") String str, @InterfaceC64987Pex("refresh_token") String str2, @InterfaceC64987Pex("client_id") String str3, @InterfaceC64987Pex("client_secret") String str4, InterfaceC67352kd<? super AmazonAccessTokenResponse> interfaceC67352kd);
}
