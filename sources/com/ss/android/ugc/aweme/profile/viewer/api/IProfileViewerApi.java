package com.ss.android.ugc.aweme.profile.viewer.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface IProfileViewerApi {
    @InterfaceC195787mI
    @E8M("/tiktok/user/profile/view_record/get/v1")
    AbstractC73672Svk<ProfileViewerResponse> fetchViewerList(@InterfaceC64987Pex("from") Integer num, @InterfaceC64987Pex("count") Integer num2, @InterfaceC64987Pex("cursor") String str);

    @InterfaceC195787mI
    @E8M("/tiktok/user/profile/view_record/add/v1")
    AbstractC73672Svk<BaseResponse> reportView(@InterfaceC64987Pex("user_id") String str, @InterfaceC64987Pex("sec_user_id") String str2, @InterfaceC64987Pex("scene") String str3);
}
