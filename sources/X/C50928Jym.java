package X;

import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.npssurvey.core.config.NPSSurveyIdConfig;
import java.util.List;

/* renamed from: X.Jym, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50928Jym extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C50928Jym LJLIL = new C50928Jym();

    public C50928Jym() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        try {
            FHD.LIZLLL().getClass();
            NPSSurveyIdConfig nPSSurveyIdConfig = (NPSSurveyIdConfig) FHD.LJIIJJI(NPSSurveyIdConfig.class, null, "search_valid_nps_survey_id", true);
            if (nPSSurveyIdConfig != null) {
                return nPSSurveyIdConfig.surveyId;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
