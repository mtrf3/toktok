package com.ss.android.ugc.aweme.comment.api;

import X.AbstractC73672Svk;
import X.C790638k;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoViewerHistoryApiService implements IVideoViewerHistoryApi {
    public static final VideoViewerHistoryApiService LIZIZ = new VideoViewerHistoryApiService();
    public final /* synthetic */ IVideoViewerHistoryApi LIZ = (IVideoViewerHistoryApi) C790638k.LIZIZ.create(IVideoViewerHistoryApi.class);

    @Override // com.ss.android.ugc.aweme.comment.api.IVideoViewerHistoryApi
    @InterfaceC195787mI
    @E4T("/tiktok/video/view/v1")
    public AbstractC73672Svk<ViewerListResponse> fetchVideoViewerHistory(@InterfaceC64987Pex("item_id") String aid, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("offset") long j2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("scene") int i2) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.fetchVideoViewerHistory(aid, j, j2, i, i2);
    }
}
