package com.ss.android.ugc.aweme.following.repository;

import X.AbstractC73672Svk;
import X.C35990EAo;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;

/* loaded from: classes7.dex */
public interface RelationSearchApi {
    public static final C35990EAo LIZ = C35990EAo.LIZ;

    @E4Q("tiktok/user/relation/search/v1")
    AbstractC73672Svk<RelationSearchResponse> queryRelationSearchList(@InterfaceC64989Pez("search_scene") int i, @InterfaceC64989Pez("to_uid") String str, @InterfaceC64989Pez("search_string") String str2);
}
