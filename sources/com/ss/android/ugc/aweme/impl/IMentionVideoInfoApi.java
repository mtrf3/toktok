package com.ss.android.ugc.aweme.impl;

import X.AbstractC73638SvC;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;

/* loaded from: classes8.dex */
public interface IMentionVideoInfoApi {
    @E4Q("/tiktok/v1/video/query_url/v2")
    AbstractC73638SvC<VideoInfoFromURLResponse> getVideoInfoByURLV2(@InterfaceC64989Pez("video_url") String str, @InterfaceC64989Pez("video_id") long j);
}
