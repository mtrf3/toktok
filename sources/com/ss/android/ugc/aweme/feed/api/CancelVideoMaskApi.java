package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73672Svk;
import X.C198517qh;
import X.C770830u;
import X.C8HX;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CancelVideoMaskApi {
    public static final RealApi LIZ;

    /* loaded from: classes4.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/mask/cancel/")
        AbstractC73672Svk<BaseResponse> cancelVideoMask(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("mask_type") Integer num, @InterfaceC64987Pex("status") Integer num2);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (RealApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RealApi.class);
    }

    public static void LIZ(int i) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", "/aweme/v1/mask/cancel/");
        c198517qh.LIZ.put("status", Integer.valueOf(i));
        C8HX.LIZIZ("tns_api_status", "", c198517qh.LJ());
    }

    public static void LIZIZ(String str, String error_code) {
        o.LJIIIZ(error_code, "error_code");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", "/aweme/v1/mask/cancel/");
        c198517qh.LIZ.put("status", 1);
        c198517qh.LIZ.put("error_message", error_code);
        c198517qh.LIZ.put("tns_logId", str);
        C8HX.LIZIZ("tns_api_status", "", c198517qh.LJ());
    }
}
