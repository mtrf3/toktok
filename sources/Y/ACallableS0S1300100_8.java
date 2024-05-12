package Y;

import X.C47261Igj;
import X.C76800UCe;
import X.E7N;
import X.J4A;
import X.J4G;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyReportParam;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveySubmitRequestBody;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.SearchFeelgoodSurveyApi;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes9.dex */
public class ACallableS0S1300100_8 implements Callable {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object call$0(ACallableS0S1300100_8 aCallableS0S1300100_8) {
        J4A j4a = new J4A((Aweme) aCallableS0S1300100_8.l1, aCallableS0S1300100_8.s0);
        j4a.LIZJ = aCallableS0S1300100_8.j4;
        MLCommonServiceImpl mLCommonServiceImpl = (MLCommonServiceImpl) aCallableS0S1300100_8.l2;
        ArrayList arrayList = (ArrayList) aCallableS0S1300100_8.l3;
        mLCommonServiceImpl.getClass();
        MLCommonServiceImpl.LIZJ("play_call_playtime", j4a, arrayList);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS0S1300100_8 aCallableS0S1300100_8) {
        String authorization = aCallableS0S1300100_8.s0;
        String questionnaireID = ((FeelgoodSurveyQuestionnaire) aCallableS0S1300100_8.l1).getQuestionnaireID();
        String str = "";
        if (questionnaireID == null) {
            questionnaireID = "";
        }
        String submitID = ((FeelgoodSurveyQuestionnaire) aCallableS0S1300100_8.l1).getSubmitID();
        if (submitID != null) {
            str = submitID;
        }
        FeelgoodSurveySubmitRequestBody feelgoodSurveySubmitRequestBody = new FeelgoodSurveySubmitRequestBody("7140153608942780417", questionnaireID, str, aCallableS0S1300100_8.j4, new FeelgoodSurveyReportParam((Map) aCallableS0S1300100_8.l2, "search.survey.tiktok.com", SettingServiceImpl.LIZ().getAppLanguage(), 3, E7N.LIZ()), C47261Igj.LJJIJ((AnswerData) aCallableS0S1300100_8.l3));
        o.LJIIIZ(authorization, "authorization");
        try {
            return SearchFeelgoodSurveyApi.LIZ.submitSurveyAnswers("application/json", authorization, feelgoodSurveySubmitRequestBody);
        } catch (ExecutionException e) {
            n nVar = new n();
            nVar.LIZIZ(e);
            Object obj = nVar.LIZ;
            o.LJIIIIZZ(obj, "{\n            TaskComple…         }.task\n        }");
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:java.lang.Object), (r0 I:Y.ACallableS0S1300100_8) (LINE:100663305) Y.ACallableS0S1300100_8.l2 java.lang.Object, block:B:1:0x0000 */
    public ACallableS0S1300100_8(Object obj, Aweme aweme, String str, long j, MLCommonServiceImpl mLCommonServiceImpl, ArrayList<J4G> arrayList) {
        Object obj2;
        this.$t = arrayList;
        this.l1 = obj;
        this.s0 = aweme;
        this.j4 = str;
        this.l2 = obj2;
        this.l3 = mLCommonServiceImpl;
    }
}
