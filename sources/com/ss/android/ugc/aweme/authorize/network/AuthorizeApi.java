package com.ss.android.ugc.aweme.authorize.network;

import X.AbstractC73638SvC;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;

/* loaded from: classes11.dex */
public interface AuthorizeApi {
    @InterfaceC195787mI
    @E4T("/passport/open/web/auth/")
    AbstractC73638SvC<BCAuthorizationResponse> confirmBCAuthorize(@InterfaceC64987Pex("client_key") String str, @InterfaceC64987Pex("scope") String str2, @InterfaceC64987Pex("source") String str3, @InterfaceC64987Pex("redirect_uri") String str4);

    @InterfaceC195787mI
    @E4T("/passport/open/confirm_qrcode/")
    AbstractC73638SvC<ScanCommonResponse> confirmQroceAuthorize(@InterfaceC64987Pex("token") String str, @InterfaceC64987Pex("scopes") String str2);

    @InterfaceC195787mI
    @E4T("passport/open/auth/v2/")
    Object getAuthCode(@InterfaceC64987Pex("client_key") String str, @InterfaceC64987Pex("response_type") String str2, @InterfaceC64987Pex("scope") String str3, @InterfaceC64987Pex("source") String str4, @InterfaceC64987Pex("from") String str5, @InterfaceC64987Pex("state") String str6, @InterfaceC64987Pex("redirect_uri") String str7, @InterfaceC64987Pex("app_identity") String str8, @InterfaceC64987Pex("certificate") String str9, @InterfaceC64987Pex("sign") String str10, @InterfaceC64987Pex("sdk_name") String str11, @InterfaceC64987Pex("code_challenge") String str12, @InterfaceC64987Pex("code_challenge_method") String str13, InterfaceC67352kd<? super AuthCodeResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/aweme/v1/openapi/authorized/page/detail/")
    AbstractC73638SvC<AuthorizedPage> getAuthPageInfo(@InterfaceC64987Pex("client_key") String str, @InterfaceC64987Pex("authorized_pattern") int i, @InterfaceC64987Pex("scope") String str2, @InterfaceC64987Pex("redirect_uri") String str3, @InterfaceC64987Pex("bc_params") String str4, @InterfaceC64987Pex("certificate") String str5, @InterfaceC64987Pex("signature") String str6, @InterfaceC64987Pex("sdk_name") String str7, @InterfaceC64987Pex("source") String str8, @InterfaceC64987Pex("auth_version") String str9);

    @E4Q("/passport/open/auth_info/v2/")
    Object requestTicketInfo(@InterfaceC64989Pez("client_key") String str, @InterfaceC64989Pez("scope") String str2, InterfaceC67352kd<? super AuthInfoResponse> interfaceC67352kd);

    @E4Q("/passport/open/scan_qrcode/")
    AbstractC73638SvC<ScanCommonResponse> scanQrcode(@InterfaceC64989Pez("ticket") String str, @InterfaceC64989Pez("token") String str2, @InterfaceC64989Pez("auth_type") Integer num, @InterfaceC64989Pez("client_key") String str3, @InterfaceC64989Pez("client_ticket") String str4, @InterfaceC64989Pez("scope") String str5, @InterfaceC64989Pez("next_url") String str6);
}
