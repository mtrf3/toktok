package com.ss.android.ugc.aweme.bnpl.network;

import X.C64797Pbt;
import X.C91820a0m;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import X.InterfaceC67352kd;
import X.InterfaceC91835a11;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinChangeConsultResult;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinForgotConsultResult;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinPublicKey;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.ConsultRegisterInfoResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.DoVerifyRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.DoVerifyResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.SendVerifyCodeRequest;

/* loaded from: classes20.dex */
public interface VerifyApi {
    public static final C91820a0m LIZ = C91820a0m.LIZ;

    @InterfaceC195787mI
    @E8M("/wallet/v1/user/confirm_register_mobile/")
    @InterfaceC91835a11
    Object confirmRegisterMobile(@InterfaceC64985Pev("mobile_no") String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<ConfirmRegisterMobileResponse>>> interfaceC67352kd);

    @E8M("/wallet/v1/user/consult_change_pin")
    @InterfaceC91835a11
    Object consultChangePin(InterfaceC67352kd<? super C64797Pbt<BaseResponse<PinChangeConsultResult>>> interfaceC67352kd);

    @E8M("/wallet/v1/user/consult_forgot_pin")
    @InterfaceC91835a11
    Object consultForgotPin(InterfaceC67352kd<? super C64797Pbt<BaseResponse<PinForgotConsultResult>>> interfaceC67352kd);

    @E8M("/wallet/v1/user/consult_register_info/")
    Object consultRegisterInfo(InterfaceC67352kd<? super C64797Pbt<BaseResponse<ConsultRegisterInfoResponse>>> interfaceC67352kd);

    @E8M("/payment/v1/risk/do_verify/")
    Object doVerify(@InterfaceC195727mC DoVerifyRequest doVerifyRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<DoVerifyResponse>>> interfaceC67352kd);

    @E8M("/wallet/v1/user/get_pin_pubkey")
    Object getPinPublicKey(InterfaceC67352kd<? super C64797Pbt<BaseResponse<PinPublicKey>>> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/wallet/v1/user/reset_pin")
    @InterfaceC91835a11
    Object resetPin(@InterfaceC64985Pev("scenario") String str, @InterfaceC64985Pev("encrypt_pin") String str2, @InterfaceC64985Pev("encrypt_random_salt") String str3, InterfaceC67352kd<? super C64797Pbt<BaseResponse<String>>> interfaceC67352kd);

    @E8M("/payment/v1/risk/send_verify_code/")
    Object sendVerifyCode(@InterfaceC195727mC SendVerifyCodeRequest sendVerifyCodeRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<Object>>> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/wallet/v1/user/submit_pin_and_register")
    @InterfaceC91835a11
    Object submitPinAndRegister(@InterfaceC64985Pev("encrypt_pin") String str, @InterfaceC64985Pev("encrypt_random_salt") String str2, InterfaceC67352kd<? super C64797Pbt<BaseResponse<String>>> interfaceC67352kd);
}
