package com.bytedance.android.live.broadcast.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.broadcast.model.SurveyResponse;
import java.util.Map;

/* loaded from: classes.dex */
public interface AcademySurveyApi {
    @E8L("/webcast/live_center/academy/course_theme/")
    AbstractC73672Svk<C28467BFf<SurveyResponse>> fetchAcademySurvey(@InterfaceC64986Pew("course_theme_id") long j);

    @E8M("/feedback/2/post_message/")
    @InterfaceC195757mF
    AbstractC73672Svk<FeedbackResponse> postFeedBack(@InterfaceC36229EJt Map<String, String> map);

    @E8M("/webcast/anchor/survey/submit/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<Object>> postSurveyAnswer(@InterfaceC195727mC SubmitSurveyAnswerRequest submitSurveyAnswerRequest);
}
