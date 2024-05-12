package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C42357Gjp;
import X.C62822Ol8;
import X.E4Q;
import X.E8M;
import X.EKC;
import X.InterfaceC27211Am7;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes8.dex */
public final class SearchAidSurveyAPI {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C42357Gjp.LJLIL);

    /* loaded from: classes8.dex */
    public interface API {
        @E4Q("/tiktok/v1/violation/search_aid_survey/")
        AbstractC73672Svk<SearchAidSurveyResp> getSearchAidSurveyInfo(@InterfaceC64989Pez("search_session_id") String str, @InterfaceC64989Pez("page_type") int i);

        @E8M("/tiktok/v1/user/survey_collection/upload/")
        @EKC({"Content-Type: application/json"})
        AbstractC73672Svk<BaseResponse> uploadSurveyData(@InterfaceC27211Am7 SearchAidSurveyUploadRequest searchAidSurveyUploadRequest);
    }
}
