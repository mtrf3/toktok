package com.ss.android.ugc.aweme.comment.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;

/* loaded from: classes4.dex */
public interface IVideoViewerHistoryApi {
    @InterfaceC195787mI
    @E4T("/tiktok/video/view/v1")
    AbstractC73672Svk<ViewerListResponse> fetchVideoViewerHistory(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("offset") long j2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("scene") int i2);
}
