package com.ss.android.ugc.aweme.share.api;

import X.AbstractC73672Svk;
import X.C73969T1h;
import X.C770830u;
import X.E8M;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import X.InterfaceC65784Pro;
import X.T16;
import Y.AfS17S1100000_1;
import Y.AfS50S0200000_1;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

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

    public static void LIZ(Context context, String aid, String templateId, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(templateId, "templateId");
        LIZ.postTemplateRemove(aid, templateId, 0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS50S0200000_1(context, interfaceC65784Pro, 10), new AfS17S1100000_1(context, templateId, 4));
    }
}
