package com.ss.android.ugc.aweme.story.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.E8M;
import X.EFJ;
import X.InterfaceC195757mF;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
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
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryApi implements IStoryApi {
    public static final StoryApi LIZIZ = new StoryApi();
    public final /* synthetic */ IStoryApi LIZ;

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v1/story/bullet/list")
    public AbstractC73672Svk<StoryBulletListResponse> fetchStoryBulletList(@InterfaceC64986Pew("story_id") String aid, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.fetchStoryBulletList(aid, j, i);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v2/story/viewer/list")
    public InterfaceC37276Ek4<StoryViewerListResponse> fetchStoryViewerList(@InterfaceC64986Pew("story_id") String aid, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("story_insert_viewer") String str) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.fetchStoryViewerList(aid, j, i, str);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v1/story/get_feed_by_page")
    public AbstractC73672Svk<StoryGetFeedByPageResponse> getFeedByPage(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("insert_stories") String str, @InterfaceC64986Pew("scene") long j3) {
        return this.LIZ.getFeedByPage(j, j2, str, j3);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v1/story/get_feed_by_page")
    public Object getFeedByPageByCont(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("insert_stories") String str, @InterfaceC64986Pew("scene") long j3, InterfaceC67352kd<? super StoryGetFeedByPageResponse> interfaceC67352kd) {
        return this.LIZ.getFeedByPageByCont(j, j2, str, j3, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/story/archive/detail/v1")
    public AbstractC73672Svk<StoryArchDetailResponse> getStoryArchDetail() {
        return this.LIZ.getStoryArchDetail();
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/story/archive/list/v1")
    public AbstractC73672Svk<StoryArchiveList> getStoryArchList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2) {
        return this.LIZ.getStoryArchList(j, j2);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v1/story/get_user_stories")
    public AbstractC73672Svk<UserStoriesResponse> getUserStories(@InterfaceC64986Pew("author_ids") String uidList) {
        o.LJIIIZ(uidList, "uidList");
        return this.LIZ.getUserStories(uidList);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v1/story/get_user_stories")
    public AbstractC73638SvC<UserStoriesResponse> getUserStoriesSingle(@InterfaceC64986Pew("author_ids") String uidList, @InterfaceC64986Pew("start_view_stories") String str) {
        o.LJIIIZ(uidList, "uidList");
        return this.LIZ.getUserStoriesSingle(uidList, str);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/tiktok/v1/story/get_user_story")
    public AbstractC73672Svk<UserStoryResponse> getUserStory(@InterfaceC64986Pew("author_id") String uid, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("load_before") boolean z, @InterfaceC64986Pew("count") int i) {
        o.LJIIIZ(uid, "uid");
        return this.LIZ.getUserStory(uid, j, z, i);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8L("/aweme/v1/multi/aweme/detail/")
    public AbstractC73672Svk<BatchDetailList> queryBatchAwemeRx(@InterfaceC64986Pew("aweme_ids") String str, @InterfaceC64986Pew("origin_type") String str2, @InterfaceC64986Pew("push_params") String str3, @InterfaceC64986Pew("story_req_source") int i) {
        return this.LIZ.queryBatchAwemeRx(str, str2, str3, i);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8M("/tiktok/v1/story/guide_card/dislike")
    public AbstractC73638SvC<BaseResponse> reportGuideCardDislike() {
        return this.LIZ.reportGuideCardDislike();
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8M("/tiktok/story/view/report/v1")
    @InterfaceC195757mF
    public AbstractC73638SvC<BaseResponse> reportStoryViewed(@InterfaceC64985Pev("story_id") String storyId) {
        o.LJIIIZ(storyId, "storyId");
        return this.LIZ.reportStoryViewed(storyId);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @E8M("/tiktok/story/exchange/")
    @InterfaceC195757mF
    public AbstractC73672Svk<SwitchToStoryResponse> switchStoryToNormal(@InterfaceC64985Pev("story_id") String storyId) {
        o.LJIIIZ(storyId, "storyId");
        return this.LIZ.switchStoryToNormal(storyId);
    }

    public StoryApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IStoryApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IStoryApi.class);
    }
}
