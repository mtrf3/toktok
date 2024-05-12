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

/* renamed from: X.ONc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61796ONc implements InterfaceC50599JtT {
    public final /* synthetic */ ONY LJLIL;
    public final /* synthetic */ ArrayList<Option> LJLILLLLZI;

    public C61796ONc(ONY ony, ArrayList<Option> arrayList) {
        this.LJLIL = ony;
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
        ONY ony = this.LJLIL;
        String str = null;
        if (ony.LLFF) {
            long currentTimeMillis = System.currentTimeMillis();
            ONY ony2 = this.LJLIL;
            if (currentTimeMillis - ony2.LLFFF < 300) {
                return;
            }
            ony2.LLFFF = System.currentTimeMillis();
            ONY ony3 = this.LJLIL;
            C61799ONf<Option> c61799ONf = ony3.LJZ;
            if (c61799ONf != null) {
                c61799ONf.LJLIL = i;
                c61799ONf.notifyDataSetChanged();
            }
            if (i >= 0 && (feedSurvey = ony3.LLD) != null && (questions = feedSurvey.getQuestions()) != null && (question = questions[0]) != null && (options = question.getOptions()) != null && i < options.length && (feedSurvey2 = ony3.LLD) != null && (questions2 = feedSurvey2.getQuestions()) != null && (question2 = questions2[0]) != null && (options2 = question2.getOptions()) != null && (option = options2[i]) != null && (questions3 = option.getQuestions()) != null && (question3 = questions3[0]) != null && (viewStub = ony3.LJLLILLLL) != null && (view2 = ony3.LJLJJL) != null) {
                C09K.LIZ(view2, 0.0f, 200L).withEndAction(new ARunnableS1S0501000_10(i, view2, viewStub, option, ony3, question3, 2)).setStartDelay(200L).start();
            }
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
        C61815ONv LJIIIZ = ony.LJIIIZ();
        if (LJIIIZ == null || !LJIIIZ.LIZIZ) {
            ONY ony4 = this.LJLIL;
            if (ony4.LJZI == i) {
                return;
            }
            SY4 sy4 = ony4.LJLL;
            if (sy4 != null) {
                sy4.setEnabled(true);
                sy4.setClickable(true);
                sy4.setButtonVariant(0);
            }
            ONY ony5 = this.LJLIL;
            ony5.LJZI = i;
            C61799ONf<Option> c61799ONf2 = ony5.LJZ;
            if (c61799ONf2 != null) {
                c61799ONf2.LJLIL = i;
                c61799ONf2.notifyDataSetChanged();
            }
            this.LJLIL.LJZL = (Option) ListProtector.get(this.LJLILLLLZI, i);
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
