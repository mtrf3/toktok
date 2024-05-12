package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.C30R;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes2.dex */
public interface CommerceProfileAdApi {
    public static final C30R LIZ = C30R.LIZ;

    @E8L("/tiktok/v1/ad/profile_page/")
    Object getAdAweme(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("author_id") String str2, @InterfaceC64986Pew("aweme_list") String str3, @InterfaceC64986Pew("pull_type") int i, @InterfaceC64986Pew("showed_groups_before_ad") int i2, @InterfaceC64986Pew("gaid") String str4, @InterfaceC64986Pew("cmpl_enc") String str5, @InterfaceC64986Pew("ad_personality_mode") Integer num, InterfaceC67352kd<? super CommerceProfileAdResponse> interfaceC67352kd);
}
