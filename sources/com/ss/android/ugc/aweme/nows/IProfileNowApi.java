package com.ss.android.ugc.aweme.nows;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;

/* loaded from: classes4.dex */
public interface IProfileNowApi {
    @E8L("/tiktok/v1/now/archive")
    AbstractC73672Svk<NowArchiveResponse> fetchArchiveData(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("load_type") int i);
}
