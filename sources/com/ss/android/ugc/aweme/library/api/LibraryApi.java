package com.ss.android.ugc.aweme.library.api;

import X.C10K;
import X.C77800Ug8;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import com.ss.android.ugc.aweme.model.library.LibraryVideosResponse;

/* loaded from: classes10.dex */
public final class LibraryApi {
    public static final RealApi LIZ;

    /* loaded from: classes10.dex */
    public interface RealApi {
        @E4Q("/tiktok/material/details/v1/")
        C10K<LibraryDetailResponse> queryLibraryDetail(@InterfaceC64989Pez("library_material_id") String str);

        @E4Q("/tiktok/material/videos/v1/")
        C10K<LibraryVideosResponse> queryLibraryVideos(@InterfaceC64989Pez("material_id") String str, @InterfaceC64989Pez("offset") int i, @InterfaceC64989Pez("count") int i2);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = Api.LIZ;
        LIZ = (RealApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, RealApi.class);
    }
}
