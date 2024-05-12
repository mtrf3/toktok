package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.TopViewLiveInfo;

/* loaded from: classes2.dex */
public interface FeedTopViewLiveApi {
    @E8L("/aweme/v1/topview/live/")
    AbstractC73672Svk<TopViewLiveInfo> getTopViewLiveInfo(@InterfaceC64986Pew("sec_uid") String str);
}
