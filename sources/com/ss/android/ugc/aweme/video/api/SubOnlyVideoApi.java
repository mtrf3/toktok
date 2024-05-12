package com.ss.android.ugc.aweme.video.api;

import X.AbstractC73672Svk;
import X.C7UG;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoResponse;

/* loaded from: classes4.dex */
public interface SubOnlyVideoApi {
    public static final C7UG LIZ = C7UG.LIZ;

    @E8L("/aweme/v1/subscription/aweme/")
    AbstractC73672Svk<SubOnlyVideoResponse> getSubOnlyVideoList(@InterfaceC64986Pew("user_id") Long l, @InterfaceC64986Pew("sec_user_id") String str, @InterfaceC64986Pew("min_time") long j, @InterfaceC64986Pew("max_time") long j2, @InterfaceC64986Pew("count") int i);
}
