package com.ss.android.ugc.profile.platform.base.data;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC195737mD;
import X.InterfaceC64989Pez;

/* loaded from: classes5.dex */
public interface UpdateProfileUserAPI {
    @E8L("/aweme/v1/user/")
    AbstractC73672Svk<ProfileUser> getLegacyInfo(@InterfaceC64989Pez("scene_id") String str, @InterfaceC64989Pez("uid") String str2);

    @E8L("/tiktok/user/profile/other/v1")
    AbstractC73672Svk<ProfileUser> getOtherUserInfo(@InterfaceC64989Pez("scene_id") String str, @InterfaceC64989Pez("creative_id") String str2, @InterfaceC64989Pez("sec_user_id") String str3, @InterfaceC64989Pez("user_id") String str4, @InterfaceC64989Pez("from") int i, @InterfaceC64989Pez("need_nofify_settings") String str5, @InterfaceC64989Pez("with_mutual") boolean z);

    @E8L("/tiktok/user/profile/self/v1")
    AbstractC73672Svk<ProfileUser> getSelfUserInfo(@InterfaceC64989Pez("scene_id") String str, @InterfaceC64989Pez("from") int i, @InterfaceC195737mD Object obj);
}
