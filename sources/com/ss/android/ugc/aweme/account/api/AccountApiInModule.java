package com.ss.android.ugc.aweme.account.api;

import X.C10K;
import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.account.loginsetting.BoolData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public final class AccountApiInModule {
    public static final String LIZ = "https://api-va.tiktokv.com";
    public static final Api LIZIZ = (Api) C46104I7o.LJIIZILJ("https://api-va.tiktokv.com", Api.class);

    /* loaded from: classes12.dex */
    public interface Api {
        @E4Q("/passport/password/has_set/")
        C76L<Object> checkPasswordSet();

        @InterfaceC195787mI
        @E4T("/passport/mobile/can_send_voice_code/")
        C10K<BoolData> checkVoiceCodeAvailability(@InterfaceC64987Pex("mobile") String str, @InterfaceC64987Pex("mix_mode") String str2);

        @InterfaceC195787mI
        @E4T("/aweme/v1/ad/ba/on/")
        C76L<BaseResponse> switchBusinessAccount(@InterfaceC64987Pex("category_name") String str);

        @InterfaceC195787mI
        @E4T("/aweme/v1/user/proaccount/setting/")
        C76L<BaseResponse> switchProAccount(@InterfaceC64987Pex("action_type") int i, @InterfaceC64987Pex("category_name") String str, @InterfaceC64987Pex("category_id") String str2, @InterfaceC64987Pex("pro_g") int i2);
    }
}
