package X;

import Y.ACallableS0S1300100_8;
import Y.ACallableS8S2200000_8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import java.util.LinkedHashMap;

/* renamed from: X.Jss, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50562Jss {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, Aweme aweme) {
        AnswerData answerData;
        C50351JpT c50351JpT;
        String str;
        FeelgoodSurveyModel LIZJ;
        FeelgoodSurveyQuestionnaire questionnaire;
        java.util.Map linkedHashMap;
        String str2;
        String aid;
        C50577Jt7 value = C50577Jt7.LIZIZ.getValue();
        String str3 = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            value.getClass();
        } else {
            C50568Jsy LIZIZ = value.LIZ.LIZIZ(aid);
            if (LIZIZ != null) {
                answerData = LIZIZ.LIZ;
                c50351JpT = ((C50322Jp0) KNV.LIZ()).LJLLLL;
                String str4 = "";
                if (c50351JpT != null || (str = c50351JpT.LIZIZ) == null) {
                    str = "";
                }
                LIZJ = C50350JpS.LIZJ();
                if (LIZJ != null || (questionnaire = LIZJ.getQuestionnaire()) == null) {
                }
                C50351JpT c50351JpT2 = ((C50322Jp0) KNV.LIZ()).LJLLLL;
                if (c50351JpT2 == null || (linkedHashMap = c50351JpT2.LIZJ) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                if (aweme == null || (str2 = Integer.valueOf(aweme.getRank()).toString()) == null) {
                    str2 = "";
                }
                linkedHashMap.put("rank", str2);
                if (aweme != null) {
                    str3 = aweme.getAid();
                }
                String LIZIZ2 = C50350JpS.LIZIZ(str3);
                if (LIZIZ2 != null) {
                    str4 = LIZIZ2;
                }
                linkedHashMap.put("doc_id", str4);
                linkedHashMap.put("position", "inflow");
                C10K.LIZJ(new ACallableS0S1300100_8(questionnaire, str, j, linkedHashMap, answerData, 1));
                return;
            }
        }
        answerData = null;
        c50351JpT = ((C50322Jp0) KNV.LIZ()).LJLLLL;
        String str42 = "";
        if (c50351JpT != null) {
        }
        str = "";
        LIZJ = C50350JpS.LIZJ();
        if (LIZJ != null) {
        }
    }

    public static void LIZIZ(Aweme aweme, String str) {
        FeelgoodSurveyQuestionnaire questionnaire;
        String str2;
        java.util.Map linkedHashMap;
        String str3;
        String str4;
        FeelgoodSurveyModel LIZJ = C50350JpS.LIZJ();
        if (LIZJ == null || (questionnaire = LIZJ.getQuestionnaire()) == null) {
            return;
        }
        C50351JpT c50351JpT = ((C50322Jp0) KNV.LIZ()).LJLLLL;
        String str5 = "";
        if (c50351JpT == null || (str2 = c50351JpT.LIZIZ) == null) {
            str2 = "";
        }
        C50351JpT c50351JpT2 = ((C50322Jp0) KNV.LIZ()).LJLLLL;
        if (c50351JpT2 == null || (linkedHashMap = c50351JpT2.LIZJ) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (aweme == null || (str3 = Integer.valueOf(aweme.getRank()).toString()) == null) {
            str3 = "";
        }
        linkedHashMap.put("rank", str3);
        if (aweme != null) {
            str4 = aweme.getAid();
        } else {
            str4 = null;
        }
        String LIZIZ = C50350JpS.LIZIZ(str4);
        if (LIZIZ != null) {
            str5 = LIZIZ;
        }
        linkedHashMap.put("doc_id", str5);
        linkedHashMap.put("position", "inflow");
        C10K.LIZJ(new ACallableS8S2200000_8(str2, str, linkedHashMap, questionnaire, 1));
    }
}
