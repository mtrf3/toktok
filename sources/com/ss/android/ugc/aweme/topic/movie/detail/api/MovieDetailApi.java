package com.ss.android.ugc.aweme.topic.movie.detail.api;

import X.C199427sA;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface MovieDetailApi {
    public static final C199427sA LIZ = C199427sA.LIZ;

    @E8M("tiktok/topic/movie/collect/v1/")
    Object collectMovie(@InterfaceC64986Pew("movie_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/topic/movie/detail/v1/")
    Object getMovieDetail(@InterfaceC64986Pew("movie_id") String str, InterfaceC67352kd<? super MovieDetailResp> interfaceC67352kd);

    @E8L("/tiktok/topic/movie/itemlist/v1/")
    Object getMovieVideos(@InterfaceC64986Pew("movie_id") String str, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("page_extra") String str2, InterfaceC67352kd<? super MovieVideosResp> interfaceC67352kd);

    @E8M("tiktok/topic/movie/uncollect/v1/")
    Object unCollectMovie(@InterfaceC64986Pew("movie_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
