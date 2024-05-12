package Y;

import X.C46249IDd;
import X.C76800UCe;
import X.E7N;
import X.J4A;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyReportParam;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyRequestBody;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.SearchFeelgoodSurveyApi;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public class ACallableS8S2200000_8 implements Callable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S2200000_8 aCallableS8S2200000_8) {
        Aweme aweme;
        if (((MLCommonServiceImpl) aCallableS8S2200000_8.l2).LIZ != null) {
            aweme = C46249IDd.LIZ(aCallableS8S2200000_8.s0);
        } else {
            aweme = null;
        }
        J4A j4a = new J4A(aweme, aCallableS8S2200000_8.s1);
        MLCommonServiceImpl mLCommonServiceImpl = (MLCommonServiceImpl) aCallableS8S2200000_8.l2;
        ArrayList arrayList = (ArrayList) aCallableS8S2200000_8.l3;
        mLCommonServiceImpl.getClass();
        MLCommonServiceImpl.LIZJ("play_stop", j4a, arrayList);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS8S2200000_8 aCallableS8S2200000_8) {
        String str = aCallableS8S2200000_8.s0;
        String str2 = aCallableS8S2200000_8.s1;
        FeelgoodSurveyReportParam feelgoodSurveyReportParam = new FeelgoodSurveyReportParam((Map) aCallableS8S2200000_8.l2, "search.survey.tiktok.com", SettingServiceImpl.LIZ().getAppLanguage(), 3, E7N.LIZ());
        String questionnaireID = ((FeelgoodSurveyQuestionnaire) aCallableS8S2200000_8.l3).getQuestionnaireID();
        String str3 = "";
        if (questionnaireID == null) {
            questionnaireID = "";
        }
        String submitID = ((FeelgoodSurveyQuestionnaire) aCallableS8S2200000_8.l3).getSubmitID();
        if (submitID != null) {
            str3 = submitID;
        }
        return SearchFeelgoodSurveyApi.LIZ(str, new FeelgoodSurveyRequestBody("7140153608942780417", str2, feelgoodSurveyReportParam, questionnaireID, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS8S2200000_8(String str, String str2, String str3, Map<String, String> map, FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        this.$t = feelgoodSurveyQuestionnaire;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = map;
    }

    public ACallableS8S2200000_8(Aweme aweme, MLCommonServiceImpl mLCommonServiceImpl, String str, String str2, ArrayList arrayList, int i) {
        this.$t = i;
        this.l2 = mLCommonServiceImpl;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = arrayList;
    }
}
