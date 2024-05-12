package com.ss.android.ugc.aweme.nows;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;

/* loaded from: classes4.dex */
public final class ProfileNowApi implements IProfileNowApi {
    public static final ProfileNowApi LIZIZ = new ProfileNowApi();
    public final /* synthetic */ IProfileNowApi LIZ;

    @Override // com.ss.android.ugc.aweme.nows.IProfileNowApi
    @E8L("/tiktok/v1/now/archive")
    public AbstractC73672Svk<NowArchiveResponse> fetchArchiveData(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("load_type") int i) {
        return this.LIZ.fetchArchiveData(j, j2, i);
    }

    public ProfileNowApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IProfileNowApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IProfileNowApi.class);
    }
}
