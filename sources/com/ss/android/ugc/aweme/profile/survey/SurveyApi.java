package com.ss.android.ugc.aweme.profile.survey;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.survey.SurveyData;

/* loaded from: classes5.dex */
public final class SurveyApi {
    public static final SurveyRetrofit LIZ = (SurveyRetrofit) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(SurveyRetrofit.class);

    /* loaded from: classes5.dex */
    public interface SurveyRetrofit {
        @E4Q("/aweme/v1/survey/get/")
        C10K<SurveyData> getSurveyData();

        @E4Q("/aweme/v1/survey/record/")
        C10K<Object> recordAnswer(@InterfaceC64989Pez("action_type") int i, @InterfaceC64989Pez("dialog_id") int i2, @InterfaceC64989Pez("original_id") int i3);
    }
}
