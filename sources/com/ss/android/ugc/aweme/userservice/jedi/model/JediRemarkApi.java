package com.ss.android.ugc.aweme.userservice.jedi.model;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;

/* loaded from: classes2.dex */
public interface JediRemarkApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/user/remark/name/")
    AbstractC73672Svk<CommitRemarkNameResponse> commitRemarkName(@InterfaceC64987Pex("remark_name") String str, @InterfaceC64987Pex("user_id") String str2, @InterfaceC64987Pex("sec_user_id") String str3);
}
