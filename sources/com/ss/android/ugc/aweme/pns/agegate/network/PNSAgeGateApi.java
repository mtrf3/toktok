package com.ss.android.ugc.aweme.pns.agegate.network;

import X.C10K;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;

/* loaded from: classes16.dex */
public interface PNSAgeGateApi {
    @E8L("/tiktok/v1/calculate/age/")
    C10K<DoBResponse> calculateAge(@InterfaceC64986Pew("birthday") String str, @InterfaceC64986Pew("update_birthdate_type") int i, @InterfaceC64986Pew("session_register_type") int i2);

    @E8L("/tiktok/age/confirmation/get/v2/")
    C10K<BaseResponse> confirmAge(@InterfaceC64986Pew("birthday") String str, @InterfaceC64986Pew("update_birthdate_type") int i, @InterfaceC64986Pew("session_register_type") int i2);

    @E8M("/aweme/v3/verification/age/")
    C10K<AgeGateResponse> verifyAge(@InterfaceC64986Pew("birthday") String str, @InterfaceC64986Pew("update_birthdate_type") int i, @InterfaceC64986Pew("session_registered") int i2, @InterfaceC64986Pew("is_guest") boolean z);
}
