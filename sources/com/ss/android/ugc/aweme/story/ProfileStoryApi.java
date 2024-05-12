package com.ss.android.ugc.aweme.story;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewInfoResponse;

/* loaded from: classes10.dex */
public final class ProfileStoryApi implements IProfileStoryApi {
    public static final ProfileStoryApi LIZIZ = new ProfileStoryApi();
    public final /* synthetic */ IProfileStoryApi LIZ;

    @Override // com.ss.android.ugc.aweme.story.IProfileStoryApi
    @E8L("/tiktok/story/archive/detail/v1")
    public AbstractC73672Svk<StoryArchDetailResponse> getStoryArchDetail() {
        return this.LIZ.getStoryArchDetail();
    }

    @Override // com.ss.android.ugc.aweme.story.IProfileStoryApi
    @E8L("/tiktok/story/view/info/v1")
    public AbstractC73672Svk<StoryViewInfoResponse> getStoryViewInfo(@InterfaceC64986Pew("sec_author_id") String str, @InterfaceC64986Pew("author_id") String str2) {
        return this.LIZ.getStoryViewInfo(str, str2);
    }

    public ProfileStoryApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IProfileStoryApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IProfileStoryApi.class);
    }
}
