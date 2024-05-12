package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.AcademyCourseTheme;
import com.bytedance.android.live.broadcast.model.AcademySurveyQuestion;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Opf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63103Opf implements InterfaceC63108Opk, C90T {
    public AcademyCourseTheme LJLIL;
    public AcademySurveyQuestion LJLILLLLZI;
    public Context LJLJI;
    public Aweme LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxTextView LJLL;
    public RecyclerView LJLLI;
    public ViewStub LJLLILLLL;
    public C51767KTj LJLLJ;
    public C63104Opg LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public Long LJZI;
    public String LJZ = "";
    public String LJZL = "normal";
    public final ACListenerS30S0100000_10 LL = new ACListenerS30S0100000_10(this, 115);

    @Override // X.C90T
    public final void LIZIZ() {
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
    }

    @Override // X.OO8
    public final void LJ() {
    }

    @Override // X.OO8
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        o.LJIIIZ(operation, "operation");
    }

    @Override // X.C90F
    public final void LJIIJJI() {
    }

    @Override // X.C90T
    public final void LJIIL() {
    }

    @Override // X.OO8
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC63108Opk
    public final void LIZ() {
        View view = this.LJLJLJ;
        if (view != null) {
            C51767KTj c51767KTj = this.LJLLJ;
            if (c51767KTj != null) {
                c51767KTj.LJLIL = -1;
                c51767KTj.notifyDataSetChanged();
            }
            view.setVisibility(0);
            View view2 = this.LJLJL;
            if (view2 != null) {
                C16880lQ.LJIIJ(this.LL, view2);
            }
            this.LJZL = "go_back";
            C63110Opm.LIZ(this.LJZI, "go_back", this.LJZ, this.LJLLLLLL, this.LJLLLL, true);
        }
    }

    @Override // X.C90T
    public final void LIZJ() {
        View view = this.LJLJJLL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        C51767KTj c51767KTj = this.LJLLJ;
        if (c51767KTj != null) {
            c51767KTj.LJLIL = -1;
            c51767KTj.notifyDataSetChanged();
        }
        if (this.LJLLL == null) {
            this.LJLLL = new C63104Opg();
        }
        C63104Opg c63104Opg = this.LJLLL;
        if (c63104Opg != null) {
            c63104Opg.LIZIZ();
        }
    }

    @Override // X.C90T
    public final void LJII() {
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.InterfaceC63108Opk
    public final void LJIIIIZZ() {
        View view = this.LJLJJLL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        C51767KTj c51767KTj = this.LJLLJ;
        if (c51767KTj != null) {
            c51767KTj.LJLIL = -1;
            c51767KTj.notifyDataSetChanged();
        }
    }

    public final boolean LJIILJJIL() {
        View view = this.LJLJJLL;
        if (view == null || view.getVisibility() != 4) {
            return false;
        }
        return true;
    }

    @Override // X.C90T
    public final boolean isShowing() {
        View view = this.LJLJJLL;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(ViewStub viewStub, Context context, Aweme aweme, View view) {
        List<SurveyQuestionOption> list;
        View view2;
        View view3;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        RecyclerView recyclerView;
        ViewStub viewStub2;
        LIZJ();
        if (context == null || aweme == null) {
            return;
        }
        AcademyCourseTheme academyCourseTheme = C63100Opc.LIZ;
        this.LJLIL = academyCourseTheme;
        if (academyCourseTheme == null) {
            return;
        }
        AcademySurveyQuestion academySurveyQuestion = academyCourseTheme.videoSurvey;
        this.LJLILLLLZI = academySurveyQuestion;
        if (academySurveyQuestion == null || (list = academySurveyQuestion.options) == null || list.size() < 2) {
            return;
        }
        this.LJLJI = context;
        this.LJLJJI = aweme;
        this.LJLJJL = view;
        Long l = null;
        if (this.LJLJJLL == null) {
            View inflate = viewStub.inflate();
            this.LJLJJLL = inflate;
            if (inflate != null) {
                view2 = inflate.findViewById(R.id.bul);
            } else {
                view2 = null;
            }
            this.LJLJL = view2;
            View view4 = this.LJLJJLL;
            if (view4 != null) {
                view3 = view4.findViewById(R.id.b68);
            } else {
                view3 = null;
            }
            this.LJLJLJ = view3;
            View view5 = this.LJLJJLL;
            if (view5 != null) {
                tuxIconView = (TuxIconView) view5.findViewById(R.id.eb1);
            } else {
                tuxIconView = null;
            }
            this.LJLJLLL = tuxIconView;
            View view6 = this.LJLJJLL;
            if (view6 != null) {
                tuxTextView = (TuxTextView) view6.findViewById(R.id.mo6);
            } else {
                tuxTextView = null;
            }
            this.LJLL = tuxTextView;
            View view7 = this.LJLJJLL;
            if (view7 != null) {
                recyclerView = (RecyclerView) view7.findViewById(R.id.gax);
            } else {
                recyclerView = null;
            }
            this.LJLLI = recyclerView;
            View view8 = this.LJLJJLL;
            if (view8 != null) {
                viewStub2 = (ViewStub) view8.findViewById(R.id.jjq);
            } else {
                viewStub2 = null;
            }
            this.LJLLILLLL = viewStub2;
        }
        AcademySurveyQuestion academySurveyQuestion2 = this.LJLILLLLZI;
        if (academySurveyQuestion2 == null) {
            return;
        }
        this.LJLLLL = JIK.LIZ;
        this.LJLLLLLL = JIK.LIZIZ;
        this.LJLZ = JIK.LJI;
        this.LJZ = JIK.LJII;
        AcademyCourseTheme academyCourseTheme2 = this.LJLIL;
        if (academyCourseTheme2 != null) {
            l = Long.valueOf(academyCourseTheme2.seriesId);
        }
        this.LJZI = l;
        TuxTextView tuxTextView2 = this.LJLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(academySurveyQuestion2.title);
        }
        RecyclerView recyclerView2 = this.LJLLI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.survey.AcademyFeedSurveyViewHelper$bindView$1$linearLayoutManager$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIL() {
                    return false;
                }
            });
            List<SurveyQuestionOption> list2 = academySurveyQuestion2.options;
            ArrayList arrayList = new ArrayList(list2.size());
            arrayList.addAll(list2);
            C51767KTj c51767KTj = new C51767KTj(context, arrayList);
            this.LJLLJ = c51767KTj;
            c51767KTj.LJLJJI = new C63102Ope(this);
            recyclerView2.setAdapter(c51767KTj);
        }
        TuxIconView tuxIconView2 = this.LJLJLLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, this.LL);
        }
        View view9 = this.LJLJLJ;
        if (view9 != null) {
            C16880lQ.LJIIJ(this.LL, view9);
        }
        View view10 = this.LJLJL;
        if (view10 != null) {
            C16880lQ.LJIIJ(this.LL, view10);
        }
        View view11 = this.LJLJJLL;
        if (view11 != null) {
            view11.setVisibility(4);
        }
        View view12 = this.LJLJL;
        if (view12 != null) {
            view12.setVisibility(4);
        }
        View view13 = this.LJLJLJ;
        if (view13 != null) {
            view13.setVisibility(4);
        }
        TuxIconView tuxIconView3 = this.LJLJLLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(4);
        }
        TuxTextView tuxTextView3 = this.LJLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setVisibility(4);
        }
        RecyclerView recyclerView3 = this.LJLLI;
        if (recyclerView3 == null) {
            return;
        }
        recyclerView3.setVisibility(4);
    }

    @Override // X.C90T
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, OO3 oo3) {
        AcademySurveyQuestion academySurveyQuestion;
        LIZJ();
        if (context == null || aweme == null) {
            return;
        }
        if (this.LJLIL == null) {
            this.LJLIL = C63100Opc.LIZ;
        }
        if (this.LJLIL == null) {
            return;
        }
        if (this.LJLILLLLZI == null) {
            AcademyCourseTheme academyCourseTheme = C63100Opc.LIZ;
            if (academyCourseTheme != null) {
                academySurveyQuestion = academyCourseTheme.videoSurvey;
            } else {
                academySurveyQuestion = null;
            }
            this.LJLILLLLZI = academySurveyQuestion;
        }
        if (this.LJLILLLLZI == null) {
            return;
        }
        this.LJLJI = context;
        this.LJLJJI = aweme;
        this.LJLJJL = view;
        this.LJZL = "normal";
        synchronized (this) {
            View view5 = this.LJLJJLL;
            if (view5 == null || view5.getVisibility() != 0) {
                View view6 = this.LJLJJLL;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
                View view7 = this.LJLJL;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
                View view8 = this.LJLJLJ;
                if (view8 != null) {
                    view8.setVisibility(0);
                }
                TuxIconView tuxIconView = this.LJLJLLL;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                }
                TuxTextView tuxTextView = this.LJLL;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                RecyclerView recyclerView = this.LJLLI;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                C63110Opm.LIZ(this.LJZI, this.LJZL, this.LJZ, this.LJLLLLLL, this.LJLLLL, true);
            }
        }
    }
}
