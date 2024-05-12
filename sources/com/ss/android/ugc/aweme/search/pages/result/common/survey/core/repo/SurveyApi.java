package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo;

import X.C10K;
import X.C221108m2;
import X.C62822Ol8;
import X.E4T;
import X.EO1;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public final class SurveyApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EO1.LJLIL);

    /* loaded from: classes7.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("/aweme/v1/search/survey/detail/")
        C10K<SurveyDetailResponse> fetch(@InterfaceC64987Pex("survey_id") String str);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/survey/submit/")
        C10K<BaseResponse> submit(@InterfaceC64987Pex("survey_id") String str, @InterfaceC64987Pex("search_id") String str2, @InterfaceC64987Pex("survey_answer_rating") int i, @InterfaceC64987Pex("keyword") String str3);
    }
}
