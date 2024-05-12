package com.ss.android.ugc.aweme.shortvideo.sticker;

import X.AV1;
import X.C76L;
import X.E4Q;
import X.ExecutorC142245i8;
import X.HBN;
import X.HDK;
import X.InterfaceC64989Pez;
import X.RunnableC65751PrH;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes8.dex */
public final class ChallengeModule {
    public final ChallengeDetailApi LIZ = (ChallengeDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(ChallengeDetailApi.class);

    /* loaded from: classes8.dex */
    public interface ChallengeDetailApi {
        @E4Q("/aweme/v1/challenge/detail/")
        C76L<ChallengeDetail> fetchChallengeDetail(@InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("hashtag_name") String str2, @InterfaceC64989Pez("query_type") int i, @InterfaceC64989Pez("click_reason") int i2);

        @E4Q("/aweme/v1/commerce/challenge/detail/")
        C76L<ChallengeDetail> fetchCommerceChallengeDetail(@InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("hashtag_name") String str2, @InterfaceC64989Pez("query_type") int i, @InterfaceC64989Pez("click_reason") int i2);
    }

    public final void LIZ(String str, HBN hbn) {
        HDK hdk = new HDK(hbn);
        if (CommerceChallengeServiceImpl.LIZIZ().LJIILIIL(str) || CommerceChallengeServiceImpl.LIZIZ().LJIILIIL(null)) {
            if (!AV1.LJIIJJI()) {
                C76L<ChallengeDetail> fetchCommerceChallengeDetail = this.LIZ.fetchCommerceChallengeDetail(str, null, 0, 0);
                fetchCommerceChallengeDetail.LJFF(new RunnableC65751PrH(fetchCommerceChallengeDetail, hdk), ExecutorC142245i8.LJLILLLLZI);
                return;
            }
            return;
        }
        C76L<ChallengeDetail> fetchChallengeDetail = this.LIZ.fetchChallengeDetail(str, null, 0, 0);
        fetchChallengeDetail.LJFF(new RunnableC65751PrH(fetchChallengeDetail, hdk), ExecutorC142245i8.LJLILLLLZI);
    }
}
