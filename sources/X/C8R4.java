package X;

import android.os.Bundle;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;

/* renamed from: X.8R4, reason: invalid class name */
/* loaded from: classes4.dex */
public interface C8R4 {
    String getLatestPublishedAwemeId();

    DistributeAuthorSurveyInfoModel getSurveyConfiguration();

    boolean isCurrentTheLastTimeSurveyBannerShown();

    boolean isPositiveQuestionSet();

    void onSurveyBannerClosedManually(String str);

    void onSurveyClosedManually();

    void onSurveySubmit(String str);

    boolean shouldShowAuthorSurveyInProfile();

    boolean shouldShowAuthorSurveyInVideoPlayer(String str);

    void showAuthorSurvey(Bundle bundle, ActivityC45651qj activityC45651qj);

    void showSurveyBannerInProfilePage(InterfaceC55643Lsd interfaceC55643Lsd, ViewStub viewStub, int i, ActivityC45651qj activityC45651qj);
}
