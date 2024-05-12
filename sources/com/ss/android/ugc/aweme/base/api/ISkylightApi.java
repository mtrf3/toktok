package com.ss.android.ugc.aweme.base.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;

/* loaded from: classes10.dex */
public interface ISkylightApi {
    @E8L("/tiktok/v1/story/get_feed_by_page")
    InterfaceC37276Ek4<StoryGetFeedByPageResponse> getStorySkylightData(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("insert_stories") String str, @InterfaceC64986Pew("scene") long j3);
}
