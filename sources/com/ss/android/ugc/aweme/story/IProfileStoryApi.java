package com.ss.android.ugc.aweme.story;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewInfoResponse;

/* loaded from: classes10.dex */
public interface IProfileStoryApi {
    @E8L("/tiktok/story/archive/detail/v1")
    AbstractC73672Svk<StoryArchDetailResponse> getStoryArchDetail();

    @E8L("/tiktok/story/view/info/v1")
    AbstractC73672Svk<StoryViewInfoResponse> getStoryViewInfo(@InterfaceC64986Pew("sec_author_id") String str, @InterfaceC64986Pew("author_id") String str2);
}
