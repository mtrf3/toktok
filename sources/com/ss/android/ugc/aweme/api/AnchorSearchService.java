package com.ss.android.ugc.aweme.api;

import X.C10K;
import X.C768930b;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes2.dex */
public interface AnchorSearchService {
    public static final C768930b LIZ = C768930b.LIZ;

    @E4Q("/tiktok/v1/anchor/search/")
    C10K<AnchorSearchResponse> getAnchorSearchResponse(@InterfaceC64989Pez("search_query") String str);
}
