package com.ss.android.ugc.aweme.feed.survey.api;

import X.AbstractC73638SvC;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.ONI;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes11.dex */
public interface FeedSurveyApi {
    public static final ONI LIZ = ONI.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/survey/set/")
    AbstractC73638SvC<BaseResponse> submitFeedSurvey(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("source") int i, @InterfaceC64987Pex("operation") int i2, @InterfaceC64987Pex("feed_survey") String str2, @InterfaceC64987Pex("survey_biz_type") int i3);
}
