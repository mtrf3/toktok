package com.ss.android.ugc.aweme.feed.api;

import X.C76L;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* loaded from: classes5.dex */
public interface FeedStatsApi {
    @E8L("/aweme/v1/aweme/modify/visibility/")
    C76L<PrivateUrlModel> feedStats(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("type") int i);

    @E8L("/aweme/v1/aweme/modify/visibility/")
    C76L<PrivateUrlModel> feedStats(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("video_hide_search") Integer num, @InterfaceC64986Pew("dont_share") Integer num2, @InterfaceC64986Pew("dont_share_list") String str2);
}
