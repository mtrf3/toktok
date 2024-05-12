package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config.SearchUsefulnessSurveyConfig;

/* renamed from: X.JsN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50531JsN extends AbstractC65781Prl implements InterfaceC65784Pro<SearchUsefulnessSurveyConfig> {
    public static final C50531JsN LJLIL = new C50531JsN();

    public C50531JsN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SearchUsefulnessSurveyConfig invoke() {
        SearchUsefulnessSurveyConfig searchUsefulnessSurveyConfig = null;
        try {
            searchUsefulnessSurveyConfig = (SearchUsefulnessSurveyConfig) SettingsManager.LIZLLL().LJIIIIZZ("search_user_feedback_for_usefulness", SearchUsefulnessSurveyConfig.class, null);
            return searchUsefulnessSurveyConfig;
        } catch (Throwable unused) {
            return searchUsefulnessSurveyConfig;
        }
    }
}
