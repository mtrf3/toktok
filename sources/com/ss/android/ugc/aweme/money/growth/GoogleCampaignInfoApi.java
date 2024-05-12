package com.ss.android.ugc.aweme.money.growth;

import X.C10K;
import X.E4Q;
import X.EFJ;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes8.dex */
public final class GoogleCampaignInfoApi {
    public static final GoogleCampaignApi LIZ = (GoogleCampaignApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(GoogleCampaignApi.class);

    /* loaded from: classes8.dex */
    public interface GoogleCampaignApi {
        @E4Q("/aweme/v1/activity/campaign/")
        C10K<GoogleCampaignInfo> querySettings(@InterfaceC64989Pez("google_aid") String str);
    }
}
