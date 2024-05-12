package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC64986Pew;
import tikcast.api.anchor.ActionResponse;

/* loaded from: classes6.dex */
public interface LiveMoreApi {
    @E8M("/webcast/anchor/action/")
    AbstractC73672Svk<C28467BFf<ActionResponse>> updateMoreClickStatus(@InterfaceC64986Pew("action_type") int i, @InterfaceC64986Pew("action") int i2);
}
