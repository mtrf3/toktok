package com.ss.android.ugc.aweme.library.api;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import com.ss.android.ugc.aweme.model.library.LibraryVideosResponse;

/* loaded from: classes10.dex */
public interface LibraryApiJAVA$RealApi {
    @E4Q("/tiktok/library/details/v1/")
    C10K<LibraryDetailResponse> queryLibraryDetail(@InterfaceC64989Pez("library_material_id") long j);

    @E4Q("/tiktok/library/videos/v1/")
    C10K<LibraryVideosResponse> queryLibraryVideos(@InterfaceC64989Pez("library_material_id") long j, @InterfaceC64989Pez("offset") int i, @InterfaceC64989Pez("count") int i2);
}
