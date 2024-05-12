package com.ss.android.ugc.aweme.tag.api;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes5.dex */
public final class VideoTagNetworkApi implements VideoTagApi {
    public static final VideoTagNetworkApi LIZJ = new VideoTagNetworkApi();
    public final /* synthetic */ VideoTagApi LIZIZ;

    @Override // com.ss.android.ugc.aweme.tag.api.VideoTagApi
    @E4Q("/tiktok/interaction/mention/general/aweme/check/v1")
    public AbstractC73672Svk<MentionCheckResponse> mentionAwemeCheck(@InterfaceC64989Pez("aweme_id") long j) {
        return this.LIZIZ.mentionAwemeCheck(j);
    }

    @Override // com.ss.android.ugc.aweme.tag.api.VideoTagApi
    @E4Q("/tiktok/interaction/mention/general/check/v1")
    public AbstractC73672Svk<MentionCheckResponse> mentionCheck(@InterfaceC64989Pez("uids") String str, @InterfaceC64989Pez("mention_type") String str2, @InterfaceC64989Pez("is_check_aweme") boolean z, @InterfaceC64989Pez("aweme_id") long j) {
        return this.LIZIZ.mentionCheck(str, str2, z, j);
    }

    @Override // com.ss.android.ugc.aweme.tag.api.VideoTagApi
    @E4Q("/tiktok/interaction/mention/recent/contact/query/v1")
    public InterfaceC37276Ek4<MentionRecentContactResponse> mentionRecentContactQuery(@InterfaceC64989Pez("mention_type") int i, @InterfaceC64989Pez("aweme_id") long j, @InterfaceC64989Pez("is_check_aweme") boolean z) {
        return this.LIZIZ.mentionRecentContactQuery(i, j, z);
    }

    @Override // com.ss.android.ugc.aweme.tag.api.VideoTagApi
    @InterfaceC195787mI
    @E4T("/tiktok/interaction/mention/tag/update/v1")
    public AbstractC73672Svk<TagUpdateResponse> tagUpdate(@InterfaceC64987Pex("add_uids") String str, @InterfaceC64987Pex("remove_uids") String str2, @InterfaceC64987Pex("aweme_id") long j) {
        return this.LIZIZ.tagUpdate(str, str2, j);
    }

    public VideoTagNetworkApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZIZ = (VideoTagApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, VideoTagApi.class);
    }
}
