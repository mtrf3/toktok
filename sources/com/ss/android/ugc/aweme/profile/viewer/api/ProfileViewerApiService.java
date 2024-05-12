package com.ss.android.ugc.aweme.profile.viewer.api;

import X.AbstractC73672Svk;
import X.C790738l;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileViewerApiService implements IProfileViewerApi {
    public static final ProfileViewerApiService LIZIZ = new ProfileViewerApiService();
    public final /* synthetic */ IProfileViewerApi LIZ = (IProfileViewerApi) C790738l.LIZIZ.create(IProfileViewerApi.class);

    @Override // com.ss.android.ugc.aweme.profile.viewer.api.IProfileViewerApi
    @InterfaceC195787mI
    @E8M("/tiktok/user/profile/view_record/get/v1")
    public AbstractC73672Svk<ProfileViewerResponse> fetchViewerList(@InterfaceC64987Pex("from") Integer num, @InterfaceC64987Pex("count") Integer num2, @InterfaceC64987Pex("cursor") String str) {
        return this.LIZ.fetchViewerList(num, num2, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.viewer.api.IProfileViewerApi
    @InterfaceC195787mI
    @E8M("/tiktok/user/profile/view_record/add/v1")
    public AbstractC73672Svk<BaseResponse> reportView(@InterfaceC64987Pex("user_id") String str, @InterfaceC64987Pex("sec_user_id") String secUserId, @InterfaceC64987Pex("scene") String scene) {
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(scene, "scene");
        return this.LIZ.reportView(str, secUserId, scene);
    }
}
