package com.ss.android.ugc.aweme.bnpl.network;

import X.C64797Pbt;
import X.C65087PgZ;
import X.C91826a0s;
import X.C92365a9Z;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import X.InterfaceC65002PfC;
import X.InterfaceC67352kd;
import X.InterfaceC91835a11;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.ExchangeTokenResult;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.RiskInfoInterceptor;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;

/* loaded from: classes20.dex */
public final class BNPLApi {
    public static IBNPLApi LIZ;

    /* loaded from: classes20.dex */
    public interface IBNPLApi {
        @E8M("/wallet/v1/user/exchange_session")
        Object exchangeToken(@InterfaceC65002PfC("pipo-fp-token") String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<ExchangeTokenResult>>> interfaceC67352kd);

        @InterfaceC195787mI
        @E8M("/credit/v1/decision/get_step_code/")
        @InterfaceC91835a11
        Object fetchEntry(@InterfaceC64985Pev("source") String str, @InterfaceC64985Pev("country_code") String str2, @InterfaceC65002PfC("pipo-fp-token") String str3, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BNPLEntryData>>> interfaceC67352kd);
    }

    public static void LIZ() {
        if (LIZ == null) {
            C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(C91826a0s.LIZ);
            LIZ2.LIZIZ(new RiskInfoInterceptor());
            LIZ2.LIZIZ(new CommonParamInterceptor());
            LIZ2.LJIIIIZZ.LIZ(new C92365a9Z());
            LIZ = (IBNPLApi) LIZ2.LJFF().LIZ.LIZ(IBNPLApi.class);
        }
    }
}
