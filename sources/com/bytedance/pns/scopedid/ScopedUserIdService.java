package com.bytedance.pns.scopedid;

import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC37276Ek4;

/* loaded from: classes2.dex */
public interface ScopedUserIdService {
    @E8M("/privacy_id/user_id")
    InterfaceC37276Ek4<GetScopedUserIdResponse> getScopedUserId(@InterfaceC195727mC GetScopedUserIdRequest getScopedUserIdRequest);
}
