package com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.api;

import X.C30L;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model.DMStoryStatusResponse;

/* loaded from: classes2.dex */
public interface DMSocPubStatusApi {
    public static final C30L LIZ = C30L.LIZ;

    @E4Q("/tiktok/v1/story/user_related_info")
    Object getStatus(@InterfaceC64989Pez("author_ids") String str, InterfaceC67352kd<? super DMStoryStatusResponse> interfaceC67352kd);
}
