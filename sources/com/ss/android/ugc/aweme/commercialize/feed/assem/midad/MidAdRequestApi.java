package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.AbstractC73672Svk;
import X.C48734JAs;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes9.dex */
public interface MidAdRequestApi {
    public static final C48734JAs LIZ = C48734JAs.LIZ;

    @E8L("/tiktok/v1/ad/long_video/mid_roll/")
    AbstractC73672Svk<MidAdResponse> request(@InterfaceC64986Pew("author_id") String str, @InterfaceC64986Pew("recent_items_from_client") String str2, @InterfaceC64986Pew("long_video_item_id") long j, @InterfaceC64986Pew("cmpl_enc") String str3, @InterfaceC64986Pew("ad_user_agent") String str4);
}
