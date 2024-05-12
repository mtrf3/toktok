package com.ss.android.ugc.aweme.contact.data.api;

import X.C74602wK;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.contact.model.IMContactListResponse;
import com.ss.android.ugc.aweme.contact.model.UserProfileResponse;

/* loaded from: classes2.dex */
public interface IMContactApi {
    public static final C74602wK LIZ = C74602wK.LIZ;

    @E4Q("/tiktok/v1/im/user/list/")
    Object getUserList(@InterfaceC64989Pez("user_type") Integer num, @InterfaceC64989Pez("index") Integer num2, @InterfaceC64989Pez("count") Integer num3, @InterfaceC64989Pez("user_type_cursor") int i, InterfaceC67352kd<? super IMContactListResponse> interfaceC67352kd);

    @E4Q("/tiktok/v1/im/user/profile/")
    Object getUsersByUids(@InterfaceC64989Pez("user_ids") String str, InterfaceC67352kd<? super UserProfileResponse> interfaceC67352kd);
}
