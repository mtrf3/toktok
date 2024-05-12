package X;

import Y.ARunnableS1S0501000_10;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import java.util.ArrayList;

/* renamed from: X.ONb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61795ONb implements InterfaceC50599JtT {
    public final /* synthetic */ ONZ LJLIL;
    public final /* synthetic */ ArrayList<Option> LJLILLLLZI;

    public C61795ONb(ONZ onz, ArrayList<Option> arrayList) {
        this.LJLIL = onz;
        this.LJLILLLLZI = arrayList;
    }

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        FeedSurvey feedSurvey;
        Question[] questions;
        Question question;
        Option[] options;
        Option option;
        Question[] questions2;
        Question question2;
        ViewStub viewStub;
        View view2;
        Question[] questions3;
        Question question3;
        ViewStub viewStub2;
        View view3;
        Question[] questions4;
        Question question4;
        Option[] options2;
        ONZ onz = this.LJLIL;
        String str = null;
        if (onz.LLFII) {
            long currentTimeMillis = System.currentTimeMillis();
            ONZ onz2 = this.LJLIL;
            if (currentTimeMillis - onz2.LLFZ < 300) {
                return;
            }
            onz2.LLFZ = System.currentTimeMillis();
            ONZ onz3 = this.LJLIL;
            C61799ONf<Option> c61799ONf = onz3.LJZ;
            if (c61799ONf != null) {
                c61799ONf.LJLIL = i;
                c61799ONf.notifyDataSetChanged();
            }
            if (i >= 0 && (feedSurvey = onz3.LLD) != null && (questions = feedSurvey.getQuestions()) != null && (question = questions[0]) != null && (options = question.getOptions()) != null && i < options.length) {
                FeedSurvey feedSurvey2 = onz3.LLD;
                if (feedSurvey2 != null && (questions4 = feedSurvey2.getQuestions()) != null && (question4 = questions4[0]) != null && (options2 = question4.getOptions()) != null) {
                    option = options2[i];
                } else {
                    option = null;
                }
                if (C61779OMl.LJFF(onz3.LLFFF)) {
                    if (option != null && (questions3 = option.getQuestions()) != null && (question3 = questions3[0]) != null && (viewStub2 = onz3.LJLLJ) != null && (view3 = onz3.LJLJJL) != null) {
                        C09K.LIZ(view3, 0.0f, 200L).withEndAction(new ARunnableS1S0501000_10(i, view3, viewStub2, option, onz3, question3, 4)).setStartDelay(200L).start();
                    }
                } else if (option != null && (questions2 = option.getQuestions()) != null && (question2 = questions2[0]) != null && (viewStub = onz3.LJLLJ) != null && (view2 = onz3.LJLJJLL) != null) {
                    C09K.LIZ(view2, 0.0f, 200L).withEndAction(new ARunnableS1S0501000_10(i, view2, viewStub, option, onz3, question2, 5)).setStartDelay(200L).start();
                }
            }
            if (C61779OMl.LJFF(this.LJLIL.LLFFF)) {
                C61815ONv c61815ONv = new C61815ONv();
                c61815ONv.LIZ = i;
                c61815ONv.LIZIZ = false;
                C61798ONe LIZ = C55016LiW.LIZ();
                Aweme aweme = this.LJLIL.LJLILLLLZI;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                LIZ.LJ(str, c61815ONv);
                return;
            }
            return;
        }
        C61815ONv LJIIIZ = onz.LJIIIZ();
        if (LJIIIZ == null || !LJIIIZ.LIZIZ) {
            ONZ onz4 = this.LJLIL;
            if (onz4.LJZI == i) {
                return;
            }
            SY4 sy4 = onz4.LJLLI;
            if (sy4 != null) {
                sy4.setEnabled(true);
                sy4.setClickable(true);
                sy4.setButtonVariant(0);
            }
            ONZ onz5 = this.LJLIL;
            onz5.LJZI = i;
            C61799ONf<Option> c61799ONf2 = onz5.LJZ;
            if (c61799ONf2 != null) {
                c61799ONf2.LJLIL = i;
                c61799ONf2.notifyDataSetChanged();
            }
            this.LJLIL.LJZL = (Option) ListProtector.get(this.LJLILLLLZI, i);
            if (!C61779OMl.LJFF(this.LJLIL.LLFFF)) {
                return;
            }
            C61815ONv c61815ONv2 = new C61815ONv();
            c61815ONv2.LIZ = this.LJLIL.LJZI;
            c61815ONv2.LIZIZ = false;
            C61798ONe LIZ2 = C55016LiW.LIZ();
            Aweme aweme2 = this.LJLIL.LJLILLLLZI;
            if (aweme2 != null) {
                str = aweme2.getAid();
            }
            LIZ2.LJ(str, c61815ONv2);
        }
    }
}
