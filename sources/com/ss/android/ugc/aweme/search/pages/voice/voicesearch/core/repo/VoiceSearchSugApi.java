package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.repo;

import X.C10K;
import X.C93594aTO;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;

/* loaded from: classes34.dex */
public interface VoiceSearchSugApi {
    public static final C93594aTO LIZ = C93594aTO.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/suggest/guide/")
    C10K<SuggestWordResponse> getTrendingWords(@InterfaceC64987Pex("data_type") int i, @InterfaceC64987Pex("req_source") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("preferred_language") String str3);
}
