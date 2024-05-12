package com.ss.android.ugc.aweme.im.sdk.privacy.data.api;

import X.AbstractC73638SvC;
import X.C92573kD;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public interface ChatAuthorityService {
    public static final C92573kD LIZ = C92573kD.LIZ;

    @E4Q("/aweme/v1/im/set/chatpriv/")
    AbstractC73638SvC<BaseResponse> setChatAuthority(@InterfaceC64989Pez("val") int i);
}
