package com.ss.android.ugc.aweme.paidcontent.manageseries.api;

import X.AbstractC73638SvC;
import X.C250949t4;
import X.E4T;
import X.InterfaceC27211Am7;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.EditVideoRequest;
import com.ss.android.ugc.aweme.model.RemoveVideoRequest;
import com.ss.android.ugc.aweme.model.ReorderVideosRequest;
import com.ss.android.ugc.aweme.model.SetTrailerRequest;
import com.ss.android.ugc.aweme.model.SubmitSeriesRequest;
import com.ss.android.ugc.aweme.model.UpdatedVideosResponse;

/* loaded from: classes5.dex */
public interface ManageSeriesApi {
    public static final C250949t4 LIZ = C250949t4.LIZ;

    @E4T("/tiktok/v1/paid_content/collection/manage/video/delete")
    AbstractC73638SvC<UpdatedVideosResponse> deleteVideo(@InterfaceC27211Am7 RemoveVideoRequest removeVideoRequest);

    @E4T("/tiktok/v1/paid_content/collection/manage/video/edit")
    AbstractC73638SvC<UpdatedVideosResponse> editVideo(@InterfaceC27211Am7 EditVideoRequest editVideoRequest);

    @E4T("/tiktok/v1/paid_content/collection/manage/video/reorder")
    AbstractC73638SvC<UpdatedVideosResponse> reorderVideo(@InterfaceC27211Am7 ReorderVideosRequest reorderVideosRequest);

    @E4T("/tiktok/v1/paid_content/collection/manage/video/trailer/set")
    AbstractC73638SvC<UpdatedVideosResponse> setTrailer(@InterfaceC27211Am7 SetTrailerRequest setTrailerRequest);

    @E4T("/tiktok/v1/paid_content/collection/manage/submit")
    AbstractC73638SvC<CreatorCollectionDetailResponse> submitSeries(@InterfaceC27211Am7 SubmitSeriesRequest submitSeriesRequest);

    @E4T("/tiktok/v1/paid_content/collection/manage/video/trailer/unset")
    AbstractC73638SvC<UpdatedVideosResponse> unsetTrailer(@InterfaceC27211Am7 SetTrailerRequest setTrailerRequest);
}
