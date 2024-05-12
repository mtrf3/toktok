package com.ss.android.ugc.aweme.story.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.archive.model.StoryArchiveList;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewerListResponse;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;

/* loaded from: classes10.dex */
public interface IStoryApi {
    @E8L("/tiktok/v1/story/bullet/list")
    AbstractC73672Svk<StoryBulletListResponse> fetchStoryBulletList(@InterfaceC64986Pew("story_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i);

    @E8L("/tiktok/v2/story/viewer/list")
    InterfaceC37276Ek4<StoryViewerListResponse> fetchStoryViewerList(@InterfaceC64986Pew("story_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("story_insert_viewer") String str2);

    @E8L("/tiktok/v1/story/get_feed_by_page")
    AbstractC73672Svk<StoryGetFeedByPageResponse> getFeedByPage(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("insert_stories") String str, @InterfaceC64986Pew("scene") long j3);

    @E8L("/tiktok/v1/story/get_feed_by_page")
    Object getFeedByPageByCont(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("insert_stories") String str, @InterfaceC64986Pew("scene") long j3, InterfaceC67352kd<? super StoryGetFeedByPageResponse> interfaceC67352kd);

    @E8L("/tiktok/story/archive/detail/v1")
    AbstractC73672Svk<StoryArchDetailResponse> getStoryArchDetail();

    @E8L("/tiktok/story/archive/list/v1")
    AbstractC73672Svk<StoryArchiveList> getStoryArchList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2);

    @E8L("/tiktok/v1/story/get_user_stories")
    AbstractC73672Svk<UserStoriesResponse> getUserStories(@InterfaceC64986Pew("author_ids") String str);

    @E8L("/tiktok/v1/story/get_user_stories")
    AbstractC73638SvC<UserStoriesResponse> getUserStoriesSingle(@InterfaceC64986Pew("author_ids") String str, @InterfaceC64986Pew("start_view_stories") String str2);

    @E8L("/tiktok/v1/story/get_user_story")
    AbstractC73672Svk<UserStoryResponse> getUserStory(@InterfaceC64986Pew("author_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("load_before") boolean z, @InterfaceC64986Pew("count") int i);

    @E8L("/aweme/v1/multi/aweme/detail/")
    AbstractC73672Svk<BatchDetailList> queryBatchAwemeRx(@InterfaceC64986Pew("aweme_ids") String str, @InterfaceC64986Pew("origin_type") String str2, @InterfaceC64986Pew("push_params") String str3, @InterfaceC64986Pew("story_req_source") int i);

    @E8M("/tiktok/v1/story/guide_card/dislike")
    AbstractC73638SvC<BaseResponse> reportGuideCardDislike();

    @E8M("/tiktok/story/view/report/v1")
    @InterfaceC195757mF
    AbstractC73638SvC<BaseResponse> reportStoryViewed(@InterfaceC64985Pev("story_id") String str);

    @E8M("/tiktok/story/exchange/")
    @InterfaceC195757mF
    AbstractC73672Svk<SwitchToStoryResponse> switchStoryToNormal(@InterfaceC64985Pev("story_id") String str);
}
