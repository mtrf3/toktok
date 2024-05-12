package com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.api;

import X.E8M;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes2.dex */
public interface IAutoMessageAPI {
    @E8M("/tiktok/v1/im/auto_message")
    Object triggerAutomessage(@InterfaceC64986Pew("uid") long j, @InterfaceC64986Pew("item_id") long j2, @InterfaceC64986Pew("link_id") String str, @InterfaceC64986Pew("checksum") String str2, @InterfaceC64986Pew("timestamp") String str3, @InterfaceC64986Pew("scene") int i, InterfaceC67352kd<? super AutoMessageResponse> interfaceC67352kd);
}
