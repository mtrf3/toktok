package com.ss.android.ugc.aweme.topic.movie.favorite.api;

import X.C7IE;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes4.dex */
public interface MovieCollectionListApi {
    public static final C7IE LIZ = C7IE.LIZ;

    @E8L("/tiktok/topic/movie/collections/v1/")
    Object getMovieCollectionList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, InterfaceC67352kd<? super MovieCollectionListResponse> interfaceC67352kd);
}
