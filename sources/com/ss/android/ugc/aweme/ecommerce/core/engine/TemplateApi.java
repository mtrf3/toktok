package com.ss.android.ugc.aweme.ecommerce.core.engine;

import X.C27213Am9;
import X.C64797Pbt;
import X.E4T;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* loaded from: classes5.dex */
public interface TemplateApi {
    public static final C27213Am9 LIZ = C27213Am9.LIZ;

    @E4T("/api/v1/shop/pre_biz_parser")
    Object loadBizParserInfo(InterfaceC67352kd<? super C64797Pbt<Response<PreBizParserResponseData>>> interfaceC67352kd);
}
