package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig;

/* loaded from: classes2.dex */
public interface IDMMediaApi {
    @E8M("/tiktok/v1/im/media_message/force_mask")
    Object forceMask(@InterfaceC64986Pew("inbox_type") int i, @InterfaceC64986Pew("conversation_type") int i2, @InterfaceC64986Pew("conversation_id") String str, @InterfaceC64986Pew("conversation_short_id") long j, @InterfaceC64986Pew("selected_server_message_id") long j2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/v1/im/upload_config")
    AbstractC73672Svk<DMMediaAuthConfig> getDMMediaUploadAuthConfig(@InterfaceC64986Pew("upload_scene") int i);

    @E8M("/tiktok/v1/im/media_message/unmask")
    Object unmask(@InterfaceC64986Pew("inbox_type") int i, @InterfaceC64986Pew("conversation_type") int i2, @InterfaceC64986Pew("conversation_id") String str, @InterfaceC64986Pew("conversation_short_id") long j, @InterfaceC64986Pew("selected_server_message_id") long j2, @InterfaceC64986Pew("scene") int i3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
