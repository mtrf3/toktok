package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.AbstractC73638SvC;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64992Pf2;
import X.XJ3;
import java.util.Map;

/* loaded from: classes15.dex */
public interface IRuInstantLoginApi {
    public static final XJ3 LIZ = XJ3.LIZ;

    @InterfaceC195787mI
    @E4T("/notify/app/gen_vendor_ticket")
    AbstractC73638SvC<GetTicketResponse> getLoginTicket(@InterfaceC64992Pf2 Map<String, String> map);

    @InterfaceC195787mI
    @E4T("/notify/app/gen_vendor_auth_token")
    AbstractC73638SvC<GetTokenResponse> getSIToken(@InterfaceC64992Pf2 Map<String, String> map);

    @InterfaceC195787mI
    @E4T("/notify/app/vendor_conf_info")
    AbstractC73638SvC<GetVendorInfoResponse> getVendorInfo(@InterfaceC64992Pf2 Map<String, String> map);
}
