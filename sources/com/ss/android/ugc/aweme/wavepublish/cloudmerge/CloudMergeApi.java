package com.ss.android.ugc.aweme.wavepublish.cloudmerge;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes8.dex */
public interface CloudMergeApi {
    @E8L("/tiktok/v1/publish/config/")
    AbstractC73672Svk<PublishConfigModel> getConfigAuth(@InterfaceC64986Pew("publish_video_id") String str, @InterfaceC64986Pew("video_id_reuse_scene") int i);
}
