package com.ss.android.ugc.aweme.story.userstory.api;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserStoryApi implements IUserStoryApi {
    public final /* synthetic */ IUserStoryApi LIZ;

    static {
        new UserStoryApi();
    }

    @Override // com.ss.android.ugc.aweme.story.userstory.api.IUserStoryApi
    @E8L("/tiktok/v1/story/get_user_stories")
    public AbstractC73672Svk<UserStoriesResponse> getUserStories(@InterfaceC64986Pew("author_ids") String uidList) {
        o.LJIIIZ(uidList, "uidList");
        return this.LIZ.getUserStories(uidList);
    }

    @Override // com.ss.android.ugc.aweme.story.userstory.api.IUserStoryApi
    @E8L("/tiktok/v1/story/get_user_story")
    public AbstractC73672Svk<UserStoryResponse> getUserStory(@InterfaceC64986Pew("author_id") String uid, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("load_before") boolean z, @InterfaceC64986Pew("count") int i) {
        o.LJIIIZ(uid, "uid");
        return this.LIZ.getUserStory(uid, j, z, i);
    }

    public UserStoryApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IUserStoryApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IUserStoryApi.class);
    }
}
