package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.usefulness.core.ui.SearchSatisfactionSurveyAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jsx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50567Jsx implements InterfaceC207738Dh {
    public final /* synthetic */ SearchSatisfactionSurveyAssem LIZ;

    public C50567Jsx(SearchSatisfactionSurveyAssem searchSatisfactionSurveyAssem) {
        this.LIZ = searchSatisfactionSurveyAssem;
    }

    @Override // X.InterfaceC207738Dh
    public final void LIZ(C207728Dg ratingInput, int i) {
        FeelgoodSurveyModel feelgoodSurveyModel;
        FeelgoodSurveyQuestionnaire questionnaire;
        FeelgoodOptionData feelgoodOptionData;
        o.LJIIIZ(ratingInput, "ratingInput");
        SearchSatisfactionSurveyAssem searchSatisfactionSurveyAssem = this.LIZ;
        C50352JpU c50352JpU = searchSatisfactionSurveyAssem.LLIIII;
        if (c50352JpU != null) {
            c50352JpU.LJLJL = i;
        }
        TuxTextView tuxTextView = searchSatisfactionSurveyAssem.LLFII;
        if (tuxTextView != null && tuxTextView.getVisibility() == 8) {
            TuxTextView tuxTextView2 = this.LIZ.LLFII;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            C207728Dg c207728Dg = this.LIZ.LLFFF;
            if (c207728Dg != null) {
                V1B.LJLJJLL((int) C32151Nz.LJIIZILJ(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)), c207728Dg);
            }
        }
        TuxTextView tuxTextView3 = this.LIZ.LLFZ;
        if (tuxTextView3 != null && tuxTextView3.getVisibility() == 8) {
            TuxTextView tuxTextView4 = this.LIZ.LLFZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            SearchSatisfactionSurveyAssem searchSatisfactionSurveyAssem2 = this.LIZ;
            TuxTextView tuxTextView5 = searchSatisfactionSurveyAssem2.LLFZ;
            if (tuxTextView5 != null) {
                C16880lQ.LJJJJI(tuxTextView5, searchSatisfactionSurveyAssem2.LLIIIL);
            }
        }
        SearchSatisfactionSurveyAssem searchSatisfactionSurveyAssem3 = this.LIZ;
        TuxTextView tuxTextView6 = searchSatisfactionSurveyAssem3.LLFII;
        if (tuxTextView6 == null) {
            return;
        }
        C50352JpU c50352JpU2 = searchSatisfactionSurveyAssem3.LLIIII;
        String str = null;
        if (c50352JpU2 != null && (feelgoodSurveyModel = c50352JpU2.LJLIL) != null && (questionnaire = feelgoodSurveyModel.getQuestionnaire()) != null) {
            int i2 = i - 1;
            List LJJLIL = C44384HbQ.LJJLIL(questionnaire);
            if (LJJLIL != null && (feelgoodOptionData = (FeelgoodOptionData) ORZ.LJLLLLLL(i2, LJJLIL)) != null) {
                str = feelgoodOptionData.getText();
            }
        }
        tuxTextView6.setText(str);
    }
}
