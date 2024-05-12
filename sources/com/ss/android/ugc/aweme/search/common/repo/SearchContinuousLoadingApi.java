package com.ss.android.ugc.aweme.search.common.repo;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;

/* loaded from: classes9.dex */
public interface SearchContinuousLoadingApi {
    @InterfaceC195757mF
    @E4T("/aweme/v1/search/loadmore/")
    AbstractC73672Svk<ContinuousLoadingAwemeList> getAwemeList(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("type") int i, @InterfaceC64987Pex("id") String str2, @InterfaceC64987Pex("cursor") int i2, @InterfaceC64987Pex("count") int i3, @InterfaceC64987Pex("last_create_time") long j);
}
