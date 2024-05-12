package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jsv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50565Jsv implements C90T {
    public Context LJLIL;
    public Aweme LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public SmartImageView LJLJL;
    public TuxTextView LJLJLJ;
    public RecyclerView LJLJLLL;
    public TuxTextView LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public C50597JtR LJLLLL;
    public FeelgoodSurveyModel LJLZ;
    public CustomText LJZ;
    public IDetailBaseAbility LJZL;
    public int LJLLLLLL = -1;
    public long LJZI = -1;
    public final ACListenerS28S0100000_8 LL = new ACListenerS28S0100000_8(this, 90);

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
            view5.setVisibility(0);
            view5.setAlpha(1.0f);
        }
        C50597JtR c50597JtR = this.LJLLLL;
        if (c50597JtR != null) {
            c50597JtR.LJLIL = -1;
            c50597JtR.notifyDataSetChanged();
        }
        if (this.LJLL != null) {
            LJIIIIZZ(false);
        }
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

    @Override // X.C90T
    public final void LJIIL() {
    }

    @Override // X.OO8
    public final void LJIILIIL() {
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
        if (!isShowing()) {
            return;
        }
        C50562Jss.LIZIZ(this.LJLILLLLZI, "@show");
        this.LJZI = System.currentTimeMillis();
    }

    public final void LIZ(C50573Jt3 c50573Jt3) {
        String str;
        String str2;
        FeelgoodSurveyQuestionnaire questionnaire;
        C50322Jp0 c50322Jp0 = (C50322Jp0) KNV.LIZ();
        c50573Jt3.LJIIZILJ("search_id", c50322Jp0.LJLJI);
        c50573Jt3.LJIIZILJ("search_type", C50676Jui.LIZ(c50322Jp0.LJLIL));
        c50573Jt3.LJIIZILJ("search_keyword", c50322Jp0.LJLJJI);
        if (c50322Jp0.LJLIL == 0) {
            str = "general_search";
        } else {
            str = "search_result";
        }
        c50573Jt3.LJIJI(str);
        FeelgoodSurveyModel feelgoodSurveyModel = this.LJLZ;
        if (feelgoodSurveyModel != null && (questionnaire = feelgoodSurveyModel.getQuestionnaire()) != null) {
            str2 = questionnaire.getSurveyID();
        } else {
            str2 = null;
        }
        c50573Jt3.LJIIZILJ("feedback_id", str2);
        c50573Jt3.LIZLLL("card_position", "video_inflow");
        c50573Jt3.LJJI(Integer.valueOf(((Number) C50399JqF.LIZ.getValue()).intValue()));
    }

    public final void LJIIIIZZ(boolean z) {
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setEnabled(false);
            tuxTextView.setBackground(C04270Et.LIZIZ(tuxTextView.getContext(), R.drawable.c1x));
            if (z) {
                tuxTextView.setText(R.string.rx2);
            }
        }
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        String aid;
        C50568Jsy LIZIZ;
        o.LJIIIZ(operation, "operation");
        if (aweme == null) {
            return;
        }
        Aweme aweme2 = this.LJLILLLLZI;
        if ((aweme2 == null || (aid = aweme2.getAid()) == null || (LIZIZ = C50577Jt7.LIZIZ.getValue().LIZ.LIZIZ(aid)) == null || !LIZIZ.LIZIZ) && this.LJLJJL != null) {
            C50562Jss.LIZIZ(this.LJLILLLLZI, "@reject");
            if (this.LJLLLLLL > -1) {
                C50562Jss.LIZIZ(this.LJLILLLLZI, "@answer");
            }
        }
    }

    @Override // X.C90T
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, OO3 oo3) {
        CustomText customText;
        FeelgoodSurveyQuestionnaire questionnaire;
        boolean z;
        int i;
        String aid;
        C50568Jsy LIZIZ;
        String aid2;
        C50568Jsy LIZIZ2;
        AnswerData answerData;
        String aid3;
        C50568Jsy LIZIZ3;
        UrlModel urlModel;
        SmartImageView smartImageView;
        int i2;
        CharSequence charSequence;
        View view5;
        View view6;
        View view7;
        SmartImageView smartImageView2;
        TuxTextView tuxTextView;
        RecyclerView recyclerView;
        TuxTextView tuxTextView2;
        if (aweme != null && !aweme.getIsSubAweme()) {
            return;
        }
        LIZJ();
        if (context == null || aweme == null) {
            return;
        }
        this.LJLZ = C50350JpS.LIZJ();
        C50351JpT c50351JpT = ((C50322Jp0) KNV.LIZ()).LJLLLL;
        if (c50351JpT != null) {
            customText = c50351JpT.LIZLLL;
        } else {
            customText = null;
        }
        this.LJZ = customText;
        FeelgoodSurveyModel feelgoodSurveyModel = this.LJLZ;
        if (feelgoodSurveyModel == null || (questionnaire = feelgoodSurveyModel.getQuestionnaire()) == null || C44384HbQ.LJJLL(questionnaire) == null || C224868s6.LIZLLL(aweme)) {
            return;
        }
        this.LJLIL = context;
        this.LJLILLLLZI = aweme;
        this.LJLLI = view;
        this.LJLLILLLL = view2;
        this.LJLLJ = view3;
        this.LJLLL = view4;
        View view8 = this.LJLJI;
        if (view8 == null) {
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.cgg);
                View inflate = viewStub.inflate();
                this.LJLJI = inflate;
                if (inflate != null) {
                    view5 = inflate.findViewById(R.id.bul);
                } else {
                    view5 = null;
                }
                this.LJLJJI = view5;
                View view9 = this.LJLJI;
                if (view9 != null) {
                    view6 = view9.findViewById(R.id.kv_);
                } else {
                    view6 = null;
                }
                this.LJLJJL = view6;
                View view10 = this.LJLJI;
                if (view10 != null) {
                    view7 = view10.findViewById(R.id.n8o);
                } else {
                    view7 = null;
                }
                this.LJLJJLL = view7;
                View view11 = this.LJLJI;
                if (view11 != null) {
                    smartImageView2 = (SmartImageView) view11.findViewById(R.id.n4v);
                } else {
                    smartImageView2 = null;
                }
                this.LJLJL = smartImageView2;
                View view12 = this.LJLJI;
                if (view12 != null) {
                    tuxTextView = (TuxTextView) view12.findViewById(R.id.mo6);
                } else {
                    tuxTextView = null;
                }
                this.LJLJLJ = tuxTextView;
                View view13 = this.LJLJI;
                if (view13 != null) {
                    recyclerView = (RecyclerView) view13.findViewById(R.id.gax);
                } else {
                    recyclerView = null;
                }
                this.LJLJLLL = recyclerView;
                View view14 = this.LJLJI;
                if (view14 != null) {
                    tuxTextView2 = (TuxTextView) view14.findViewById(R.id.mls);
                } else {
                    tuxTextView2 = null;
                }
                this.LJLL = tuxTextView2;
            }
        } else {
            view8.setVisibility(0);
        }
        TuxTextView tuxTextView3 = this.LJLJLJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C44384HbQ.LJJZZIII(questionnaire));
        }
        TuxTextView tuxTextView4 = this.LJLL;
        if (tuxTextView4 != null) {
            Context context2 = this.LJLIL;
            if (context2 != null) {
                charSequence = context2.getText(R.string.rur);
            } else {
                charSequence = null;
            }
            tuxTextView4.setText(charSequence);
            C16880lQ.LJJJJI(tuxTextView4, this.LL);
            if (tuxTextView4.getVisibility() == 8) {
                tuxTextView4.setVisibility(0);
            }
        }
        View view15 = this.LJLLI;
        if (view15 != null) {
            view15.setVisibility(8);
        }
        View view16 = this.LJLLJ;
        if (view16 != null) {
            view16.setVisibility(8);
        }
        View view17 = this.LJLLL;
        if (view17 != null) {
            view17.setVisibility(8);
        }
        Context context3 = this.LJLIL;
        if (context3 != null && (smartImageView = this.LJLJL) != null) {
            S3I s3i = new S3I();
            s3i.LIZIZ = C32151Nz.LJIIZILJ(1);
            Integer LJI = C79045V0n.LJI(R.attr.dh, context3);
            if (LJI != null) {
                i2 = LJI.intValue();
            } else {
                i2 = 0;
            }
            s3i.LIZJ = i2;
            s3i.LIZLLL = C32151Nz.LJIIZILJ(2);
            smartImageView.setCircleOptions(new S3L(s3i));
            smartImageView.getLayoutParams().height = C7MY.LIZIZ(108);
            smartImageView.getLayoutParams().width = C7MY.LIZIZ(81);
        }
        SmartImageView smartImageView3 = this.LJLJL;
        if (smartImageView3 != null) {
            Aweme aweme2 = this.LJLILLLLZI;
            if (aweme2 != null) {
                urlModel = aweme2.getSubAwemeCover();
            } else {
                urlModel = null;
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LIZJ = this.LJLIL;
            LJII.LIZIZ("SearchInnerFlowSurveyView");
            LJII.LJJIIJ = smartImageView3;
            LJII.LIZLLL(null);
        }
        Context context4 = this.LJLIL;
        if (context4 != null) {
            List LJJLL = C44384HbQ.LJJLL(questionnaire);
            RecyclerView recyclerView2 = this.LJLJLLL;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.ui.SearchInnerFlowSurveyView$bindOptionView$1$linearLayoutManager$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                    public final boolean LJIL() {
                        return false;
                    }
                });
                if (LJJLL != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(ORZ.LLILLL(LJJLL, 5));
                    C50597JtR c50597JtR = new C50597JtR(context4, arrayList);
                    this.LJLLLL = c50597JtR;
                    Aweme aweme3 = this.LJLILLLLZI;
                    if (aweme3 != null && (aid3 = aweme3.getAid()) != null && (LIZIZ3 = C50577Jt7.LIZIZ.getValue().LIZ.LIZIZ(aid3)) != null) {
                        z = LIZIZ3.LIZIZ;
                    } else {
                        z = false;
                    }
                    c50597JtR.LJLILLLLZI = !z;
                    C50597JtR c50597JtR2 = this.LJLLLL;
                    if (c50597JtR2 != null) {
                        c50597JtR2.LJLJJI = new C50566Jsw(this, arrayList);
                    }
                    recyclerView2.setAdapter(c50597JtR2);
                    Aweme aweme4 = this.LJLILLLLZI;
                    if (aweme4 != null && (aid2 = aweme4.getAid()) != null && (LIZIZ2 = C50577Jt7.LIZIZ.getValue().LIZ.LIZIZ(aid2)) != null && (answerData = LIZIZ2.LIZ) != null) {
                        i = answerData.getShowIndex();
                    } else {
                        i = -1;
                    }
                    if (i != this.LJLLLLLL) {
                        Aweme aweme5 = this.LJLILLLLZI;
                        if (aweme5 != null && (aid = aweme5.getAid()) != null && (LIZIZ = C50577Jt7.LIZIZ.getValue().LIZ.LIZIZ(aid)) != null && LIZIZ.LIZIZ) {
                            LJIIIIZZ(true);
                        } else {
                            TuxTextView tuxTextView5 = this.LJLL;
                            if (tuxTextView5 != null) {
                                tuxTextView5.setEnabled(true);
                                tuxTextView5.setBackground(C04270Et.LIZIZ(tuxTextView5.getContext(), R.drawable.c1w));
                            }
                        }
                        this.LJLLLLLL = i;
                        C50597JtR c50597JtR3 = this.LJLLLL;
                        if (c50597JtR3 != null) {
                            c50597JtR3.LJLIL = i;
                            c50597JtR3.notifyDataSetChanged();
                        }
                    }
                }
            }
        }
        C50572Jt2 c50572Jt2 = new C50572Jt2();
        LIZ(c50572Jt2);
        c50572Jt2.LJIILIIL();
    }
}
