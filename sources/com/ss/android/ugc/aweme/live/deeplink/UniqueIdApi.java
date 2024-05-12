package com.ss.android.ugc.aweme.live.deeplink;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes2.dex */
public interface UniqueIdApi {
    @E8L("/aweme/v1/user/uniqueid/")
    AbstractC73672Svk<UserIdResponse> getRoomId(@InterfaceC64986Pew("id") String str);
}
