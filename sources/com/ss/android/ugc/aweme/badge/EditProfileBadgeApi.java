package com.ss.android.ugc.aweme.badge;

import X.AbstractC73638SvC;
import X.C221108m2;
import X.C62822Ol8;
import X.E4Q;
import X.EBK;
import X.InterfaceC64989Pez;

/* loaded from: classes7.dex */
public final class EditProfileBadgeApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EBK.LJLIL);

    /* loaded from: classes7.dex */
    public interface Api {
        @E4Q("/tiktok/v1/user/profile/self/badges/")
        AbstractC73638SvC<EditProfileBadgeResponse> getProfileBadgeList(@InterfaceC64989Pez("app_language") String str, @InterfaceC64989Pez("region") String str2, @InterfaceC64989Pez("locale") String str3);
    }
}
