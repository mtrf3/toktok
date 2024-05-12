package com.ss.android.ugc.aweme.api;

import X.A60;
import X.AbstractC73638SvC;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;

/* loaded from: classes5.dex */
public interface PaidSeriesLiveApi {
    @E8M("/tiktok/v1/paid_content/live/add")
    AbstractC73638SvC<BaseResponse> addSeriesToLive(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("room_id") long j2);

    @E8M("/tiktok/v1/paid_content/live/del")
    AbstractC73638SvC<BaseResponse> deleteSeries(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("delete_mode") int i);

    @E8L("/tiktok/v1/paid_content/live/list")
    AbstractC73638SvC<PaidSeriesLiveListResponse> getLivePaidSeriesList(@InterfaceC64986Pew("room_id") long j);

    @E8L("/tiktok/v1/paid_content/live/num ")
    AbstractC73638SvC<PaidSeriesLiveNumResponse> getSeriesNum(@InterfaceC64986Pew("room_id") long j);

    @E8M("/tiktok/v1/paid_content/live/introduce")
    AbstractC73638SvC<BaseResponse> introduceSeries(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("cancel_pin") boolean z, @InterfaceC64986Pew("operation_time") A60 a60);

    @E8M("/tiktok/v1/paid_content/live/top")
    AbstractC73638SvC<BaseResponse> moveSeriesToTop(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("room_id") long j2);

    @E8L("/tiktok/v1/paid_content/live/pop")
    AbstractC73638SvC<PaidCollectionDetailResponse> popSeries(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("collection_id") long j2);

    @E8M("/tiktok/v1/paid_content/live/del")
    AbstractC73638SvC<BaseResponse> removeSeriesFromLive(@InterfaceC64986Pew("collection_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("delete_mode") int i);
}
