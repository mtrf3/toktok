package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.E8M;
import X.EFJ;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig;

/* loaded from: classes2.dex */
public final class DMMediaApi implements IDMMediaApi {
    public static final DMMediaApi LIZIZ = new DMMediaApi();
    public final /* synthetic */ IDMMediaApi LIZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.IDMMediaApi
    @E8M("/tiktok/v1/im/media_message/force_mask")
    public Object forceMask(@InterfaceC64986Pew("inbox_type") int i, @InterfaceC64986Pew("conversation_type") int i2, @InterfaceC64986Pew("conversation_id") String str, @InterfaceC64986Pew("conversation_short_id") long j, @InterfaceC64986Pew("selected_server_message_id") long j2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return this.LIZ.forceMask(i, i2, str, j, j2, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.IDMMediaApi
    @E8L("/tiktok/v1/im/upload_config")
    public AbstractC73672Svk<DMMediaAuthConfig> getDMMediaUploadAuthConfig(@InterfaceC64986Pew("upload_scene") int i) {
        return this.LIZ.getDMMediaUploadAuthConfig(i);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.IDMMediaApi
    @E8M("/tiktok/v1/im/media_message/unmask")
    public Object unmask(@InterfaceC64986Pew("inbox_type") int i, @InterfaceC64986Pew("conversation_type") int i2, @InterfaceC64986Pew("conversation_id") String str, @InterfaceC64986Pew("conversation_short_id") long j, @InterfaceC64986Pew("selected_server_message_id") long j2, @InterfaceC64986Pew("scene") int i3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return this.LIZ.unmask(i, i2, str, j, j2, i3, interfaceC67352kd);
    }

    public DMMediaApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IDMMediaApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IDMMediaApi.class);
    }
}
