package com.ss.android.ugc.aweme.ecommerce.mall.repository.api;

import X.C64797Pbt;
import X.E8M;
import X.EBT;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunRequest;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunResponse;

/* loaded from: classes7.dex */
public interface MallRacunApi {
    public static final EBT LIZ = EBT.LIZ;

    @E8M("/api/v1/mall/channel/content/get")
    Object getContentChannel(@InterfaceC195727mC MallRacunRequest mallRacunRequest, InterfaceC67352kd<? super C64797Pbt<Response<MallRacunResponse>>> interfaceC67352kd);
}
