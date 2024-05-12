package com.ss.android.ugc.aweme.commercialize.profile;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes10.dex */
public interface FakeUserAwemeApi {
    @E8L("/tiktok/v1/ad/diversion/post/")
    InterfaceC37276Ek4<FeedItemList> getFakeUserAwemeList(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("sec_user_id") String str2, @InterfaceC64986Pew("max_cursor") long j, @InterfaceC64986Pew("min_cursor") long j2, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("adv_id") String str3, @InterfaceC64986Pew("item_id") String str4);
}
