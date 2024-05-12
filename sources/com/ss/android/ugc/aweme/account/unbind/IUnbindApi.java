package com.ss.android.ugc.aweme.account.unbind;

import X.C10K;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC65002PfC;
import X.XJ4;

/* loaded from: classes16.dex */
public interface IUnbindApi {
    public static final XJ4 LIZ = XJ4.LIZ;

    @InterfaceC195787mI
    @E4T("/passport/email/unbind/")
    C10K<UnbindResponse> unbindEmail(@InterfaceC64987Pex("ticket") String str, @InterfaceC65002PfC("x-tt-passport-csrf-token") String str2);

    @E4T("/passport/email/unbind/")
    C10K<UnbindResponse> unbindEmailWithPassportTicket(@InterfaceC64989Pez("passport_ticket") String str, @InterfaceC65002PfC("x-tt-passport-csrf-token") String str2);

    @InterfaceC195787mI
    @E4T("/passport/mobile/unbind/")
    C10K<UnbindResponse> unbindMobile(@InterfaceC64987Pex("ticket") String str, @InterfaceC65002PfC("x-tt-passport-csrf-token") String str2);

    @E4T("/passport/mobile/unbind/")
    C10K<UnbindResponse> unbindMobileWithPassportTicket(@InterfaceC64989Pez("passport_ticket") String str, @InterfaceC65002PfC("x-tt-passport-csrf-token") String str2);
}
