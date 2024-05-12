package com.ss.android.ugc.aweme.account.login.trusted;

import X.C10K;
import X.C221108m2;
import X.C36300EMm;
import X.C62822Ol8;
import X.C68536Qv6;
import X.C770830u;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import X.InterfaceC88472Yns;
import Y.AgS123S0100000_6;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TrustedEnvApi {
    public static final EndPoints LIZ;

    /* loaded from: classes7.dex */
    public interface EndPoints {
        @InterfaceC195757mF
        @E4T("/passport/device/trust_users/")
        C10K<TrustedUsersResponse> fetchTrustedUsers(@InterfaceC64987Pex("last_sec_user_id") String str, @InterfaceC64987Pex("d_ticket") String str2, @InterfaceC64987Pex("last_login_way") int i, @InterfaceC64987Pex("last_login_time") long j, @InterfaceC64987Pex("last_login_platform") String str3);

        @E4T("/passport/user/device_record_status/get/")
        C10K<LoginHistoryFeatureStateResponse> getLoginHistoryFeatureState();

        @InterfaceC195757mF
        @E4T("/passport/user/device_record_status/set/")
        C10K<LoginHistoryFeatureStateResponse> setLoginHistoryFeatureState(@InterfaceC64987Pex("user_device_record_status") int i);
    }

    static {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C36300EMm.LJLIL);
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = (String) LIZIZ.getValue();
        LIZ = (EndPoints) C770830u.LIZJ(str, "BASE_URL", LIZLLL, str).LIZ.LIZ(EndPoints.class);
    }

    public static void LIZ(InterfaceC88472Yns callback) {
        o.LJIIIZ(callback, "callback");
        LIZ.fetchTrustedUsers("", "", -1, 0L, "").LIZLLL(C68536Qv6.LIZ).LJ(new AgS123S0100000_6(callback, 20), C10K.LJIIIIZZ, null);
    }
}
