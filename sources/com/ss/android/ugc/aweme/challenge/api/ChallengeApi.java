package com.ss.android.ugc.aweme.challenge.api;

import X.AV1;
import X.C10K;
import X.C116484hg;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC195797mJ;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC64992Pf2;
import X.InterfaceC64997Pf7;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.ChallengeCreateResponse;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.challenge.model.LiveChallengeRecommendResponse;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import defpackage.i0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ChallengeApi {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final RealApi LJII;

    /* loaded from: classes8.dex */
    public interface RealApi {
        @E4Q("/aweme/v1/challenge/create/")
        C76L<ChallengeCreateResponse> createChallenge(@InterfaceC64989Pez("source_type") int i, @InterfaceC64989Pez("challenge_name") String str);

        @E4Q("/aweme/v1/challenge/detail/")
        C10K<ChallengeDetail> fetchChallengeDetail(@InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("hashtag_name") String str2, @InterfaceC64989Pez("query_type") int i, @InterfaceC64989Pez("click_reason") int i2);

        @E4Q("/aweme/v1/commerce/challenge/detail/")
        C10K<ChallengeDetail> fetchCommerceChallengeDetail(@InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("hashtag_name") String str2, @InterfaceC64989Pez("query_type") int i, @InterfaceC64989Pez("click_reason") int i2);

        @E4Q
        C76L<ChallengeAwemeList> getChallengeAwemeList(@InterfaceC195797mJ String str, @InterfaceC64997Pf7 Map<String, String> map);

        @E4Q
        C76L<ChallengeDetail> getChallengeDetail(@InterfaceC195797mJ String str, @InterfaceC64997Pf7 Map<String, String> map);

        @E4Q("/aweme/v1/recommend/challenge/")
        C76L<ChallengeList> getChallengeList(@InterfaceC64997Pf7 Map<String, String> map);

        @E4Q("/aweme/v1/live/challenge/recommend/")
        C76L<LiveChallengeRecommendResponse> getRecommendLiveChallenge(@InterfaceC64989Pez("room_id") String str);

        @E4Q("/aweme/v1/challenge/aweme/single/")
        C10K<Object> loadChallengeMixFeedList(@InterfaceC64989Pez("pull_type") int i, @InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("hashtag_name") String str2, @InterfaceC64989Pez("query_type") int i3);

        @E4Q("/aweme/v1/challenge/fresh/aweme/single/")
        C10K<Object> loadFreshChallengeMixFeedList(@InterfaceC64989Pez("pull_type") int i, @InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("hashtag_name") String str2, @InterfaceC64989Pez("query_type") int i3);

        @InterfaceC195787mI
        @E4T("/aweme/v1/challenge/search/")
        C76L<SearchChallengeList> searchChallenge(@InterfaceC64992Pf2 Map<String, String> map);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/challengesug/")
        C76L<SearchSugChallengeList> searchSugChallenge(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("is_non_personalized_search") Integer num);
    }

    static {
        String str = Api.LIZ;
        LIZ = str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("/aweme/v1/commit/challenge/");
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append("/aweme/v1/challenge/detail/");
        LIZIZ = X1D.LIZIZ(LIZ3);
        LIZJ = i0.LJFF(str, "/aweme/v1/challenge/aweme/");
        LIZLLL = i0.LJFF(str, "/aweme/v1/challenge/fresh/aweme/");
        LJ = i0.LJFF(str, "/aweme/v1/commerce/challenge/detail/");
        LJFF = i0.LJFF(str, "/aweme/v1/commerce/challenge/aweme/");
        LJI = i0.LJFF(str, "/aweme/v1/commerce/challenge/fresh/aweme/");
        LJII = (RealApi) RetrofitFactory.LIZLLL().create(str).create(RealApi.class);
    }

    public static ChallengeDetail LIZ(int i, String str, String str2, boolean z) {
        String str3;
        if (CommerceChallengeServiceImpl.LIZIZ().LJIILIIL(str) && !AV1.LJIIJJI()) {
            str3 = LJ;
        } else {
            str3 = LIZIZ;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            C116484hg.LIZIZ(hashMap, "hashtag_name", str, 1, "query_type");
        } else {
            C116484hg.LIZIZ(hashMap, "ch_id", str, 0, "query_type");
        }
        hashMap.put("click_reason", String.valueOf(i));
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("preview_token", str2);
        }
        return LJII.getChallengeDetail(str3, hashMap).get();
    }
}
