package com.ss.android.ugc.aweme.teens;

import X.AbstractC73672Svk;
import X.C2K8;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes3.dex */
public interface TeensApi {
    @E8L("/aweme/v1/teen/protector/vote/")
    AbstractC73672Svk<C2K8> sendTeensGuardian(@InterfaceC64986Pew("vote_id") String str, @InterfaceC64986Pew("option_id") int i, @InterfaceC64986Pew("vote_option") int i2);
}
