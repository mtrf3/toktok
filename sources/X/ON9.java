package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.survey.api.FeedSurveyApi;

/* loaded from: classes11.dex */
public final class ON9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, Aweme aweme) {
        String str;
        String aid;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZIZ(i, C79081V1x.LJIILLIIL(aweme).getType(), str, null);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        OMS.LJFF(str2);
    }

    public static void LIZJ(int i, Aweme aweme, Option[] optionArr) {
        String str;
        int i2;
        String str2;
        String str3;
        String aid;
        Question question;
        Question question2;
        Question question3;
        FeedSurvey LIZJ = OMU.LIZJ(aweme);
        if (LIZJ == null) {
            return;
        }
        Question[] questions = LIZJ.getQuestions();
        String str4 = "";
        if (questions == null || (question3 = questions[0]) == null || (str = question3.getId()) == null) {
            str = "";
        }
        Question[] questions2 = LIZJ.getQuestions();
        if (questions2 != null && (question2 = questions2[0]) != null) {
            i2 = question2.getType();
        } else {
            i2 = 0;
        }
        Question[] questions3 = LIZJ.getQuestions();
        if (questions3 == null || (question = questions3[0]) == null || (str2 = question.getTitle()) == null) {
            str2 = "";
        }
        FeedSurvey copy$default = FeedSurvey.copy$default(LIZJ, null, null, null, null, null, null, null, new Question[]{new Question(str, i2, str2, "", optionArr)}, null, null, 895, null);
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = "";
        }
        LIZIZ(i, C79081V1x.LJIILLIIL(aweme).getType(), str3, C75792yF.LIZJ(copy$default));
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str4 = aid;
        }
        OMS.LJFF(str4);
    }

    public static void LIZIZ(int i, int i2, String str, String str2) {
        FeedSurveyApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str3 = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        ((FeedSurveyApi) C770830u.LIZJ(str3, "API_URL_PREFIX_SI", LIZLLL, str3).LIZ.LIZ(FeedSurveyApi.class)).submitFeedSurvey(str, 1, i, str2, i2).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LJJII(new InterfaceC64592gB() { // from class: X.9Eq
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9Xf
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.printStackTrace();
                }
            }
        });
    }
}
