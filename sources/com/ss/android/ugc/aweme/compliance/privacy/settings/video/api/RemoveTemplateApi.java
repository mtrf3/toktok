package com.ss.android.ugc.aweme.compliance.privacy.settings.video.api;

import X.AbstractC73672Svk;
import X.C770830u;
import X.E8M;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public final class RemoveTemplateApi {
    public static final RemoveTemplateDataApi LIZ;

    /* loaded from: classes2.dex */
    public interface RemoveTemplateDataApi {
        @InterfaceC195787mI
        @E8M("/templates/del/template")
        AbstractC73672Svk<BaseResponse> postTemplateRemove(@InterfaceC64985Pev("aid") String str, @InterfaceC64985Pev("template_id") String str2, @InterfaceC64985Pev("type") int i);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (RemoveTemplateDataApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RemoveTemplateDataApi.class);
    }
}
