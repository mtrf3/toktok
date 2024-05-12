package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;

/* loaded from: classes11.dex */
public final class OMX extends AbstractC65781Prl implements InterfaceC88472Yns<FeedSurveyConfig, String> {
    public static final OMX LJLIL = new OMX();

    public OMX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(FeedSurveyConfig feedSurveyConfig) {
        FeedSurvey fixedSurvey;
        FeedSurveyConfig feedSurveyConfig2 = feedSurveyConfig;
        if (feedSurveyConfig2 != null && (fixedSurvey = feedSurveyConfig2.getFixedSurvey()) != null) {
            return fixedSurvey.getSurveyKey();
        }
        return null;
    }
}
