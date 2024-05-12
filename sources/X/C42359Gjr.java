package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.QuestionData;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidFeedbackFragment;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SurveyConfig;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.UserSurveyConfigDetail;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42359Gjr extends AbstractC65781Prl implements InterfaceC88472Yns<UserSurveyConfigDetail, C76800UCe> {
    public final /* synthetic */ DialogC25756A8y LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42359Gjr(DialogC25756A8y dialogC25756A8y, ActivityC45651qj activityC45651qj, String str, String str2, String str3, int i) {
        super(1);
        this.LJLIL = dialogC25756A8y;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(UserSurveyConfigDetail userSurveyConfigDetail) {
        String str;
        UserSurveyConfigDetail surveyData = userSurveyConfigDetail;
        o.LJIIIZ(surveyData, "surveyData");
        this.LJLIL.dismiss();
        if (surveyData.getSurveyConfig().isEmpty() || ((SurveyConfig) ListProtector.get(surveyData.getSurveyConfig(), 0)).getQuestionData().isEmpty()) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
            c26045AKb.LJIIIIZZ(R.string.gqr);
            c26045AKb.LJIIJ();
        } else {
            String searchId = this.LJLJI;
            o.LJIIIIZZ(searchId, "searchId");
            int sceneType = surveyData.getSceneType();
            String surveyConfigId = ((SurveyConfig) ListProtector.get(surveyData.getSurveyConfig(), 0)).getSurveyConfigId();
            String channel = this.LJLJJI;
            o.LJIIIIZZ(channel, "channel");
            String issueName = this.LJLJJL;
            o.LJIIIIZZ(issueName, "issueName");
            int i = this.LJLJJLL;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "unknown";
                    } else {
                        str = "search_guide_detail_page";
                    }
                } else {
                    str = "search_guide";
                }
            } else {
                str = "search_aid";
            }
            QuestionData questionData = (QuestionData) ListProtector.get(((SurveyConfig) ListProtector.get(surveyData.getSurveyConfig(), 0)).getQuestionData(), 0);
            o.LJIIIZ(surveyConfigId, "surveyConfigId");
            o.LJIIIZ(questionData, "questionData");
            SearchAidFeedbackFragment searchAidFeedbackFragment = new SearchAidFeedbackFragment();
            Bundle bundle = new Bundle();
            bundle.putString("search_id", searchId);
            bundle.putInt("scene_type", sceneType);
            bundle.putString("survey_config_id", surveyConfigId);
            bundle.putSerializable("question_data", questionData);
            bundle.putString("channel", channel);
            bundle.putString("search_aid_issue_name", issueName);
            bundle.putString("survey_source_page", str);
            searchAidFeedbackFragment.setArguments(bundle);
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = searchAidFeedbackFragment;
            asl.LJI(0);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LLD = false;
            C1DG.LJII(this.LJLILLLLZI, "it.supportFragmentManager", tuxSheet, "search_aid_feedback");
        }
        return C76800UCe.LIZ;
    }
}
