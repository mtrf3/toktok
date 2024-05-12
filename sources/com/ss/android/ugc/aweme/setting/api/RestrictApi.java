package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.ss.android.ugc.aweme.setting.model.RestrictInfoResponse;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public final class RestrictApi {
    public static final RealApi LIZ = (RealApi) C46104I7o.LJIIZILJ(EFJ.LIZJ, RealApi.class);

    /* loaded from: classes11.dex */
    public interface RealApi {
        @E4Q("/aweme/v1/item/restrict/info/")
        C76L<RestrictInfoResponse> getRestrictInfo(@InterfaceC64989Pez("target_iid") String str);

        @InterfaceC195787mI
        @E4T("/aweme/v1/item/restrict/")
        C76L<CommonResponse> restrictAweme(@InterfaceC64987Pex("target_iid") String str);

        @InterfaceC195787mI
        @E4T("/aweme/v1/user/restrict/")
        C76L<CommonResponse> restrictUser(@InterfaceC64987Pex("target_uid") String str);
    }

    public static RestrictInfo LIZ(String str) {
        try {
            RestrictInfoResponse restrictInfoResponse = LIZ.getRestrictInfo(str).get();
            if (restrictInfoResponse != null) {
                restrictInfoResponse.mRestrictInfo.awemeId = str;
                return restrictInfoResponse.mRestrictInfo;
            }
            return null;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static CommonResponse LIZIZ(String str) {
        try {
            return LIZ.restrictAweme(str).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static CommonResponse LIZJ(String str) {
        try {
            return LIZ.restrictUser(str).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
