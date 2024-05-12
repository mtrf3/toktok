package com.ss.android.ugc.aweme.service;

import X.AbstractC73638SvC;
import X.C39288FbQ;
import X.C58096Mr6;
import X.C770830u;
import X.E4T;
import X.EFJ;
import X.EU3;
import X.InterfaceC64989Pez;
import X.T16;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.UgCommonResponse;
import com.ss.android.ugc.aweme.UgCommonResponseExtra;

/* loaded from: classes7.dex */
public final class AttributionService implements IAttributionService {

    /* loaded from: classes7.dex */
    public interface AttributionApi {
        @E4T("tiktok/v1/new_user/campaign_info/")
        AbstractC73638SvC<UgCommonResponse> request(@InterfaceC64989Pez("campaign_id") String str, @InterfaceC64989Pez("campaign") String str2, @InterfaceC64989Pez("media_source") String str3, @InterfaceC64989Pez("adset_id") String str4, @InterfaceC64989Pez("adset") String str5, @InterfaceC64989Pez("gid") String str6, @InterfaceC64989Pez("af_dp") String str7, @InterfaceC64989Pez("request_seq") int i, @InterfaceC64989Pez("gaid") String str8);
    }

    public static IAttributionService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAttributionService.class, false);
        if (LIZ != null) {
            return (IAttributionService) LIZ;
        }
        if (C58096Mr6.N4 == null) {
            synchronized (IAttributionService.class) {
                if (C58096Mr6.N4 == null) {
                    C58096Mr6.N4 = new AttributionService();
                }
            }
        }
        return C58096Mr6.N4;
    }

    @Override // com.ss.android.ugc.aweme.service.IAttributionService
    public final AbstractC73638SvC<UgCommonResponse> LIZ(C39288FbQ c39288FbQ, boolean z) {
        if (c39288FbQ != null) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            AttributionApi attributionApi = (AttributionApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AttributionApi.class);
            String str2 = c39288FbQ.LJLJI;
            String str3 = c39288FbQ.LJLILLLLZI;
            String str4 = c39288FbQ.LJLIL;
            String str5 = c39288FbQ.LJLJJL;
            String str6 = c39288FbQ.LJLJJI;
            String str7 = c39288FbQ.LJLJJLL;
            String str8 = c39288FbQ.LJLJL;
            String LIZJ = EU3.LIZJ();
            if (LIZJ == null) {
                LIZJ = "";
            }
            return attributionApi.request(str2, str3, str4, str5, str6, str7, str8, z ? 1 : 0, LIZJ).LJJIIJ(T16.LIZ());
        }
        return AbstractC73638SvC.LJIJ(new UgCommonResponse(-1, new UgCommonResponseExtra("request canceled")));
    }
}
