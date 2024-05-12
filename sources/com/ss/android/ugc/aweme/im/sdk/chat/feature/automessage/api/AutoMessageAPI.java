package com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.api;

import X.C77800Ug8;
import X.E8M;
import X.EFJ;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes2.dex */
public final class AutoMessageAPI implements IAutoMessageAPI {
    public static final AutoMessageAPI LIZIZ = new AutoMessageAPI();
    public final /* synthetic */ IAutoMessageAPI LIZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.api.IAutoMessageAPI
    @E8M("/tiktok/v1/im/auto_message")
    public Object triggerAutomessage(@InterfaceC64986Pew("uid") long j, @InterfaceC64986Pew("item_id") long j2, @InterfaceC64986Pew("link_id") String str, @InterfaceC64986Pew("checksum") String str2, @InterfaceC64986Pew("timestamp") String str3, @InterfaceC64986Pew("scene") int i, InterfaceC67352kd<? super AutoMessageResponse> interfaceC67352kd) {
        return this.LIZ.triggerAutomessage(j, j2, str, str2, str3, i, interfaceC67352kd);
    }

    public AutoMessageAPI() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IAutoMessageAPI) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IAutoMessageAPI.class);
    }
}
