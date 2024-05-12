package X;

import Y.ARunnableS1S0501000_10;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import java.util.ArrayList;

/* renamed from: X.ONd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61797ONd implements InterfaceC50599JtT {
    public final /* synthetic */ C61794ONa LJLIL;
    public final /* synthetic */ ArrayList<Option> LJLILLLLZI;

    public C61797ONd(C61794ONa c61794ONa, ArrayList<Option> arrayList) {
        this.LJLIL = c61794ONa;
        this.LJLILLLLZI = arrayList;
    }

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        FeedSurvey feedSurvey;
        Question[] questions;
        Question question;
        Option[] options;
        FeedSurvey feedSurvey2;
        Question[] questions2;
        Question question2;
        Option[] options2;
        Option option;
        Question[] questions3;
        Question question3;
        ViewStub viewStub;
        View view2;
        C61794ONa c61794ONa = this.LJLIL;
        if (c61794ONa.LLD) {
            long currentTimeMillis = System.currentTimeMillis();
            C61794ONa c61794ONa2 = this.LJLIL;
            if (currentTimeMillis - c61794ONa2.LLF < 300) {
                return;
            }
            c61794ONa2.LLF = System.currentTimeMillis();
            C61794ONa c61794ONa3 = this.LJLIL;
            C61799ONf<Option> c61799ONf = c61794ONa3.LJLLLL;
            if (c61799ONf != null) {
                c61799ONf.LJLIL = i;
                c61799ONf.notifyDataSetChanged();
            }
            if (i < 0 || (feedSurvey = c61794ONa3.LJZL) == null || (questions = feedSurvey.getQuestions()) == null || (question = questions[0]) == null || (options = question.getOptions()) == null || i >= options.length || (feedSurvey2 = c61794ONa3.LJZL) == null || (questions2 = feedSurvey2.getQuestions()) == null || (question2 = questions2[0]) == null || (options2 = question2.getOptions()) == null || (option = options2[i]) == null || (questions3 = option.getQuestions()) == null || (question3 = questions3[0]) == null || (viewStub = c61794ONa3.LJLL) == null || (view2 = c61794ONa3.LJLJJL) == null) {
                return;
            }
            C09K.LIZ(view2, 0.0f, 200L).withEndAction(new ARunnableS1S0501000_10(i, view2, viewStub, option, c61794ONa3, question3, 3)).setStartDelay(200L).start();
            return;
        }
        C61815ONv LJIIIZ = c61794ONa.LJIIIZ();
        if (LJIIIZ == null || !LJIIIZ.LIZIZ) {
            C61794ONa c61794ONa4 = this.LJLIL;
            if (c61794ONa4.LJLLLLLL == i) {
                return;
            }
            c61794ONa4.LJIIIIZZ();
            C61794ONa c61794ONa5 = this.LJLIL;
            c61794ONa5.LJLLLLLL = i;
            C61799ONf<Option> c61799ONf2 = c61794ONa5.LJLLLL;
            if (c61799ONf2 != null) {
                c61799ONf2.LJLIL = i;
                c61799ONf2.notifyDataSetChanged();
            }
            this.LJLIL.LJLZ = (Option) ListProtector.get(this.LJLILLLLZI, i);
        }
    }
}
