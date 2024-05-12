package com.bytedance.android.livesdk.userservice;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes6.dex */
public interface BlockApi {
    @E8M("/webcast/user/relation/block_status/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> unblock(@InterfaceC64985Pev("block_type") int i, @InterfaceC64985Pev("target_uid") long j, @InterfaceC64985Pev("sec_target_uid") String str);
}
