package X;

import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config.SearchUsefulnessSurveyConfig;
import java.util.List;

/* renamed from: X.JpV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50353JpV extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C50353JpV LJLIL = new C50353JpV();

    public C50353JpV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<String> surveyId;
        SearchUsefulnessSurveyConfig searchUsefulnessSurveyConfig = (SearchUsefulnessSurveyConfig) C50532JsO.LIZ.getValue();
        if (searchUsefulnessSurveyConfig == null || (surveyId = searchUsefulnessSurveyConfig.getSurveyId()) == null) {
            return C61878OQg.INSTANCE;
        }
        return surveyId;
    }
}
