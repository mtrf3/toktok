package X;

import Y.ACListenerS30S0100000_10;
import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ONa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61794ONa implements OO2, C90T {
    public Context LJLIL;
    public Aweme LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxTextView LJLJL;
    public RecyclerView LJLJLJ;
    public SY4 LJLJLLL;
    public ViewStub LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public C61799ONf<Option> LJLLLL;
    public Option LJLZ;
    public int LJZ;
    public FeedSurvey LJZL;
    public boolean LLD;
    public long LLF;
    public C61800ONg LLFF;
    public int LJLLLLLL = -1;
    public OML LJZI = OML.FEED_TYPE;
    public final EnumC61784OMq LL = EnumC61784OMq.GREY_CARD;
    public final ACListenerS30S0100000_10 LLFFF = new ACListenerS30S0100000_10(this, 188);

    @Override // X.C90T
    public final void LIZIZ() {
    }

    @Override // X.C90T
    public final void LIZJ() {
        this.LJLLLLLL = -1;
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLI;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLLJ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJLLL;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJLJJL;
        if (view5 != null) {
            view5.setVisibility(8);
            view5.setAlpha(0.0f);
            if (this.LJZ > 0) {
                view5.getLayoutParams().height = this.LJZ;
            } else {
                view5.getLayoutParams().height = -2;
            }
        }
        this.LJLZ = null;
        C61799ONf<Option> c61799ONf = this.LJLLLL;
        if (c61799ONf != null) {
            c61799ONf.LJLIL = -1;
            c61799ONf.notifyDataSetChanged();
        }
        SY4 sy4 = this.LJLJLLL;
        if (sy4 != null) {
            sy4.setVisibility(8);
            sy4.setAlpha(0.0f);
            SY4 sy42 = this.LJLJLLL;
            if (sy42 != null) {
                sy42.setEnabled(false);
                sy42.setClickable(false);
                sy42.setButtonVariant(2);
            }
        }
        View view6 = this.LJLLILLLL;
        if (view6 != null) {
            view6.setVisibility(0);
        }
        View view7 = this.LJLLILLLL;
        if (view7 != null) {
            view7.setAlpha(1.0f);
        }
        C61800ONg LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LJI();
        }
    }

    @Override // X.OO8
    public final void LJ() {
    }

    @Override // X.OO8
    public final boolean LJFF() {
        return false;
    }

    @Override // X.OO8
    public final void LJIILIIL() {
    }

    @Override // X.OO2
    public final void LIZ() {
        View view = this.LJLJJL;
        if (view != null) {
            C61799ONf<Option> c61799ONf = this.LJLLLL;
            if (c61799ONf != null) {
                c61799ONf.LJLIL = -1;
                c61799ONf.notifyDataSetChanged();
            }
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    @Override // X.C90T
    public final void LJII() {
        View view = this.LJLLI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJLLL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    public final void LJIIIIZZ() {
        SY4 sy4 = this.LJLJLLL;
        if (sy4 != null) {
            if (sy4.getVisibility() != 0) {
                View view = this.LJLJJL;
                if (view != null) {
                    int height = view.getHeight();
                    this.LJZ = height;
                    ValueAnimator ofInt = ValueAnimator.ofInt(height, C17N.LJIILL(44.0d) + height);
                    ofInt.addUpdateListener(new AUListenerS93S0100000_4(view, 63));
                    ofInt.start();
                }
                sy4.setVisibility(0);
                sy4.animate().alpha(1.0f).setDuration(200L).setStartDelay(150L).start();
            }
            sy4.setEnabled(true);
            sy4.setClickable(true);
            sy4.setButtonVariant(0);
        }
    }

    public final C61815ONv LJIIIZ() {
        String aid;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            return C55016LiW.LIZ().LIZIZ(aid);
        }
        return null;
    }

    @Override // X.C90T
    public final void LJIIL() {
        if (C79081V1x.LJIL(this.LJLILLLLZI) && isShowing()) {
            C61779OMl.LJII(this.LJZI);
        }
    }

    public final C61800ONg LJIILJJIL() {
        if (this.LLFF == null && this.LLD) {
            this.LLFF = new C61800ONg();
        }
        return this.LLFF;
    }

    public final void LJIILL() {
        Option[] optionArr;
        Option option = this.LJLZ;
        if (option != null) {
            optionArr = new Option[]{option};
        } else {
            optionArr = null;
        }
        C61779OMl.LIZJ(EnumC61773OMf.SUBMIT, this.LJLILLLLZI, optionArr, this.LJZI);
    }

    @Override // X.C90T
    public final boolean isShowing() {
        View view = this.LJLJI;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C90F
    public final void LJIIJJI() {
        String str;
        String str2;
        if (!isShowing()) {
            return;
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLILLLLZI;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C61811ONr LIZ2 = LIZ.LIZ(str);
        C61779OMl.LJIIIIZZ(this.LJZI);
        if (LIZ2 != null) {
            if (LIZ2.LIZ) {
                return;
            }
        } else {
            LIZ2 = new C61811ONr();
        }
        LIZ2.LIZ = true;
        C61798ONe LIZ3 = C55016LiW.LIZ();
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        LIZ3.LIZLLL(str2, LIZ2);
        FeedSurvey feedSurvey = this.LJZL;
        if (feedSurvey != null) {
            str3 = feedSurvey.getId();
        }
        C61779OMl.LJI(this.LJLILLLLZI, this.LJZI, str3);
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
        if (aweme == null) {
            return;
        }
        C61811ONr LIZ = C55016LiW.LIZ().LIZ(aweme.getAid());
        if (LIZ == null) {
            LIZ = new C61811ONr();
            C55016LiW.LIZ().LIZLLL(aweme.getAid(), LIZ);
        }
        View view = this.LJLJJL;
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLD) {
                if (LIZ.LJIIIIZZ) {
                    return;
                }
                C61800ONg LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    LJIILJJIL.LJ(z);
                }
                if (!z) {
                    LIZ.LJIIIIZZ = true;
                    return;
                }
                return;
            }
            if (LIZ.LJII) {
                return;
            }
            C61779OMl.LIZ(aweme, z);
            if (!z) {
                LIZ.LJII = true;
                return;
            }
            return;
        }
        if (!C61780OMm.LJI || LIZ.LJII) {
            return;
        }
        C61779OMl.LIZ(aweme, z);
        if (!z) {
            LIZ.LJII = true;
        }
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        C61811ONr LIZ;
        Option[] optionArr;
        o.LJIIIZ(operation, "operation");
        if (aweme == null || (LIZ = C55016LiW.LIZ().LIZ(aweme.getAid())) == null || LIZ.LJI) {
            return;
        }
        View view = this.LJLJJL;
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLD && LIZ.LIZIZ) {
                C61800ONg LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    LJIILJJIL.LIZLLL(operation, !LIZ.LJ);
                }
                LIZ.LJ = true;
            } else if (LIZ.LIZ) {
                Option option = this.LJLZ;
                if (option != null) {
                    optionArr = new Option[]{option};
                } else {
                    optionArr = null;
                }
                aweme.getAid();
                C61779OMl.LIZIZ(operation, optionArr, aweme, !LIZ.LIZLLL);
                LIZ.LIZLLL = true;
            }
        }
        C55016LiW.LIZ().LIZLLL(aweme.getAid(), LIZ);
    }

    @Override // X.C90T
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, OO3 oo3) {
        Question[] questions;
        Question question;
        Question question2;
        RecyclerView recyclerView;
        boolean z;
        C61815ONv LJIIIZ;
        int i;
        FeedSurvey feedSurvey;
        Question[] questions2;
        Question question3;
        Option[] options;
        FeedSurvey feedSurvey2;
        Question[] questions3;
        Question question4;
        Option[] options2;
        Option option;
        Question[] questions4;
        Question question5;
        ViewStub viewStub2;
        C61800ONg LJIILJJIL;
        String str;
        String str2;
        View view5;
        View view6;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        RecyclerView recyclerView2;
        SY4 sy4;
        ViewStub viewStub3;
        Question[] questions5;
        if (context == null || aweme == null || C224868s6.LIZLLL(aweme)) {
            return;
        }
        FeedSurvey LIZJ = OMU.LIZJ(aweme);
        this.LJZL = LIZJ;
        if (LIZJ == null || (questions = LIZJ.getQuestions()) == null || (question = questions[0]) == null) {
            return;
        }
        this.LJZ = 0;
        this.LJZI = C79081V1x.LJIILLIIL(aweme);
        FeedSurvey feedSurvey3 = this.LJZL;
        String str3 = null;
        if (feedSurvey3 != null && (questions5 = feedSurvey3.getQuestions()) != null) {
            question2 = questions5[0];
        } else {
            question2 = null;
        }
        this.LLD = ONM.LJ(question2);
        LIZJ();
        this.LJLIL = context;
        this.LJLILLLLZI = aweme;
        this.LJLLI = view;
        this.LJLLILLLL = view2;
        this.LJLLJ = view3;
        this.LJLLL = view4;
        View view7 = this.LJLJI;
        if (view7 != null) {
            view7.setVisibility(8);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.LJLJI == null && viewStub != null) {
            View inflate = viewStub.inflate();
            this.LJLJI = inflate;
            if (inflate != null) {
                view5 = inflate.findViewById(R.id.bul);
            } else {
                view5 = null;
            }
            this.LJLJJI = view5;
            View view8 = this.LJLJI;
            if (view8 != null) {
                view6 = view8.findViewById(R.id.b68);
            } else {
                view6 = null;
            }
            this.LJLJJL = view6;
            View view9 = this.LJLJI;
            if (view9 != null) {
                tuxIconView = (TuxIconView) view9.findViewById(R.id.eb1);
            } else {
                tuxIconView = null;
            }
            this.LJLJJLL = tuxIconView;
            View view10 = this.LJLJI;
            if (view10 != null) {
                tuxTextView = (TuxTextView) view10.findViewById(R.id.mo6);
            } else {
                tuxTextView = null;
            }
            this.LJLJL = tuxTextView;
            View view11 = this.LJLJI;
            if (view11 != null) {
                recyclerView2 = (RecyclerView) view11.findViewById(R.id.gax);
            } else {
                recyclerView2 = null;
            }
            this.LJLJLJ = recyclerView2;
            View view12 = this.LJLJI;
            if (view12 != null) {
                sy4 = (SY4) view12.findViewById(R.id.azi);
            } else {
                sy4 = null;
            }
            this.LJLJLLL = sy4;
            View view13 = this.LJLJI;
            if (view13 != null) {
                viewStub3 = (ViewStub) view13.findViewById(R.id.jjq);
            } else {
                viewStub3 = null;
            }
            this.LJLL = viewStub3;
        }
        TuxTextView tuxTextView2 = this.LJLJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(question.getTitle());
        }
        SY4 sy42 = this.LJLJLLL;
        if (sy42 != null) {
            FeedSurvey feedSurvey4 = this.LJZL;
            if (feedSurvey4 != null) {
                str2 = feedSurvey4.getSubmitText();
            } else {
                str2 = null;
            }
            sy42.setText(str2);
            sy42.setVisibility(8);
        }
        SY4 sy43 = this.LJLJLLL;
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, this.LLFFF);
        }
        TuxIconView tuxIconView2 = this.LJLJJLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, this.LLFFF);
        }
        View view14 = this.LJLJJL;
        if (view14 != null) {
            C16880lQ.LJIIJ(this.LLFFF, view14);
        }
        View view15 = this.LJLJJI;
        if (view15 != null) {
            C16880lQ.LJIIJ(this.LLFFF, view15);
        }
        View view16 = this.LJLLILLLL;
        if (view16 != null) {
            view16.animate().alpha(0.0f).setDuration(150L).start();
            view16.setVisibility(8);
        }
        View view17 = this.LJLJI;
        if (view17 != null) {
            view17.setVisibility(0);
        }
        View view18 = this.LJLJJL;
        if (view18 != null) {
            view18.setVisibility(0);
            view18.animate().alpha(1.0f).setDuration(200L).setStartDelay(100L).start();
        }
        C61779OMl.LJII(this.LJZI);
        Context context2 = this.LJLIL;
        if (context2 == null || (recyclerView = this.LJLJLJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.survey.viewhelper.CardSurveyViewHelper$bindOptionView$1$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return false;
            }
        });
        Option[] options3 = question.getOptions();
        if (options3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(options3.length);
        ORS.LJJLIIIJJIZ(arrayList, options3);
        if (this.LLD) {
            this.LJLLLL = new C61803ONj(context2, arrayList);
            C26338AVi.LJI(recyclerView, 0, AnonymousClass391.LIZJ(4), 0, 0, false, 16);
        } else {
            this.LJLLLL = new C61805ONl(context2, arrayList);
            C26338AVi.LJI(recyclerView, 0, 0, 0, 0, false, 16);
        }
        C61799ONf<Option> c61799ONf = this.LJLLLL;
        if (c61799ONf != null) {
            C61815ONv LJIIIZ2 = LJIIIZ();
            if (LJIIIZ2 != null) {
                z = LJIIIZ2.LIZIZ;
            } else {
                z = false;
            }
            c61799ONf.LJLILLLLZI = !z;
        }
        C61799ONf<Option> c61799ONf2 = this.LJLLLL;
        if (c61799ONf2 != null) {
            EnumC61784OMq enumC61784OMq = EnumC61784OMq.GREY_CARD;
            o.LJIIIZ(enumC61784OMq, "<set-?>");
            c61799ONf2.LJLJI = enumC61784OMq;
        }
        C61799ONf<Option> c61799ONf3 = this.LJLLLL;
        if (c61799ONf3 != null) {
            c61799ONf3.LJLJJI = new C61797ONd(this, arrayList);
        }
        recyclerView.setAdapter(c61799ONf3);
        int i2 = -1;
        if (this.LLD && (LJIIIZ = LJIIIZ()) != null && LJIIIZ.LIZ >= 0 && LJIIIZ.LIZJ.size() > 0) {
            C61815ONv LJIIIZ3 = LJIIIZ();
            if (LJIIIZ3 == null || (i = LJIIIZ3.LIZ) < 0 || (feedSurvey = this.LJZL) == null || (questions2 = feedSurvey.getQuestions()) == null || (question3 = questions2[0]) == null || (options = question3.getOptions()) == null || i >= options.length || (feedSurvey2 = this.LJZL) == null || (questions3 = feedSurvey2.getQuestions()) == null || (question4 = questions3[0]) == null || (options2 = question4.getOptions()) == null || (option = options2[i]) == null || (questions4 = option.getQuestions()) == null || (question5 = questions4[0]) == null || (viewStub2 = this.LJLL) == null || (LJIILJJIL = LJIILJJIL()) == null) {
                return;
            }
            Context context3 = this.LJLIL;
            EnumC61784OMq enumC61784OMq2 = this.LL;
            FeedSurvey feedSurvey5 = this.LJZL;
            if (feedSurvey5 != null) {
                str = feedSurvey5.getSubmitText();
            } else {
                str = null;
            }
            FeedSurvey feedSurvey6 = this.LJZL;
            if (feedSurvey6 != null) {
                str3 = feedSurvey6.getId();
            }
            LJIILJJIL.LJII(viewStub2, context3, enumC61784OMq2, str, this, str3, option, i, question5, this.LJLILLLLZI, this.LJZI, true, null);
            return;
        }
        C61815ONv LJIIIZ4 = LJIIIZ();
        if (LJIIIZ4 != null) {
            i2 = LJIIIZ4.LIZ;
        }
        if (i2 == this.LJLLLLLL) {
            return;
        }
        C61815ONv LJIIIZ5 = LJIIIZ();
        if (LJIIIZ5 != null && LJIIIZ5.LIZIZ) {
            SY4 sy44 = this.LJLJLLL;
            if (sy44 != null) {
                sy44.setEnabled(false);
                sy44.setClickable(false);
                sy44.setButtonVariant(2);
                sy44.setText(R.string.rx2);
            }
        } else {
            LJIIIIZZ();
        }
        this.LJLLLLLL = i2;
        C61799ONf<Option> c61799ONf4 = this.LJLLLL;
        if (c61799ONf4 == null) {
            return;
        }
        c61799ONf4.LJLIL = i2;
        c61799ONf4.notifyDataSetChanged();
    }
}
