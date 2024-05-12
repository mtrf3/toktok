package com.ss.android.ugc.aweme.story.userstory.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;

/* loaded from: classes10.dex */
public interface IUserStoryApi {
    @E8L("/tiktok/v1/story/get_user_stories")
    AbstractC73672Svk<UserStoriesResponse> getUserStories(@InterfaceC64986Pew("author_ids") String str);

    @E8L("/tiktok/v1/story/get_user_story")
    AbstractC73672Svk<UserStoryResponse> getUserStory(@InterfaceC64986Pew("author_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("load_before") boolean z, @InterfaceC64986Pew("count") int i);
}
