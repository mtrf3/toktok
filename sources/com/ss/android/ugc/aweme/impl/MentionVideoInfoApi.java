package com.ss.android.ugc.aweme.impl;

import X.AbstractC73638SvC;
import X.C77800Ug8;
import X.E4Q;
import X.EFJ;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MentionVideoInfoApi implements IMentionVideoInfoApi {
    public static final MentionVideoInfoApi LIZIZ = new MentionVideoInfoApi();
    public final /* synthetic */ IMentionVideoInfoApi LIZ;

    @Override // com.ss.android.ugc.aweme.impl.IMentionVideoInfoApi
    @E4Q("/tiktok/v1/video/query_url/v2")
    public AbstractC73638SvC<VideoInfoFromURLResponse> getVideoInfoByURLV2(@InterfaceC64989Pez("video_url") String videoUrl, @InterfaceC64989Pez("video_id") long j) {
        o.LJIIIZ(videoUrl, "videoUrl");
        return this.LIZ.getVideoInfoByURLV2(videoUrl, j);
    }

    public MentionVideoInfoApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZIZ;
        this.LIZ = (IMentionVideoInfoApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_API", LIZLLL, str, IMentionVideoInfoApi.class);
    }
}
