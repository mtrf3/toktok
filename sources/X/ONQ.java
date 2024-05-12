package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONQ extends OOS {
    public final FeedSurvey LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final Aweme LJLLILLLL;
    public View LJLLJ;
    public TuxIconView LJLLL;
    public TuxTextView LJLLLL;
    public RecyclerView LJLLLLLL;
    public TuxTextView LJLZ;
    public TuxTextView LJZ;
    public Option LJZI;
    public int LJZL;
    public BottomSheetBehavior<View> LL;
    public OML LLD;
    public final ACListenerS45S0200000_10 LLF;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-4457337002212751434")).LIZ) {
            super.show();
        }
        Aweme aweme = this.LJLLILLLL;
        String id = this.LJLJLLL.getId();
        OML surveyType = this.LLD;
        o.LJIIIZ(surveyType, "surveyType");
        int i = OMM.LIZ[surveyType.ordinal()];
        if (i != 1 && i != 2) {
            C61780OMm.LJFF(id, 0L, aweme, "single_choice");
        } else {
            C61776OMi.LIZLLL(aweme, id, "single_choice");
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        C61779OMl.LIZJ(EnumC61773OMf.CANCEL, null, null, this.LLD);
    }

    @Override // X.OOS, android.app.Dialog
    public final void onStart() {
        super.onStart();
        View findViewById = findViewById(R.id.c8m);
        if (findViewById != null) {
            findViewById.setBackground(null);
        }
        setOnShowListener(new ONU(this, findViewById));
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Question question;
        View findViewById;
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.aet);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        View findViewById2 = findViewById(R.id.bv5);
        if (findViewById2 != null && (findViewById = findViewById2.findViewById(R.id.liz)) != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 117), findViewById);
        }
        this.LJLLJ = findViewById(R.id.hht);
        this.LJLLL = (TuxIconView) findViewById(R.id.eb1);
        this.LJLLLL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLLLLLL = (RecyclerView) findViewById(R.id.gax);
        this.LJLZ = (TuxTextView) findViewById(R.id.met);
        this.LJZ = (TuxTextView) findViewById(R.id.azi);
        Question[] questions = this.LJLJLLL.getQuestions();
        ViewGroup.LayoutParams layoutParams = null;
        if (questions != null && (question = questions[0]) != null) {
            TuxTextView tuxTextView = this.LJLLLL;
            if (tuxTextView != null) {
                tuxTextView.setText(question.getTitle());
            }
            TuxIconView tuxIconView = this.LJLLL;
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, this.LLF);
            }
            TuxTextView tuxTextView2 = this.LJZ;
            if (tuxTextView2 != null) {
                C16880lQ.LJJJJI(tuxTextView2, this.LLF);
            }
            TuxTextView tuxTextView3 = this.LJZ;
            if (tuxTextView3 != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cg);
                c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                tuxTextView3.setBackground(c110614Vt.LIZ(context));
            }
            TuxTextView tuxTextView4 = this.LJZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(this.LJLJLLL.getSubmitText());
            }
            Context context2 = getContext();
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            SpannableStringBuilder LIZJ = ONM.LIZJ(context2, this.LJLL, AnonymousClass636.LJIIIIZZ(R.attr.do, context3), this.LJLLI);
            if (LIZJ != null) {
                TuxTextView tuxTextView5 = this.LJLZ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(LIZJ);
                }
                TuxTextView tuxTextView6 = this.LJLZ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setVisibility(0);
                }
            } else {
                TuxTextView tuxTextView7 = this.LJLZ;
                if (tuxTextView7 != null) {
                    tuxTextView7.setVisibility(8);
                }
            }
            TuxTextView tuxTextView8 = this.LJLZ;
            if (tuxTextView8 != null) {
                tuxTextView8.setHighlightColor(0);
            }
            TuxTextView tuxTextView9 = this.LJLZ;
            if (tuxTextView9 != null) {
                tuxTextView9.setMovementMethod(LinkMovementMethod.getInstance());
            }
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.survey.FeedSurveyBottomDialog$bindView$linearLayoutManager$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIL() {
                    return false;
                }
            };
            RecyclerView recyclerView = this.LJLLLLLL;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            Option[] options = question.getOptions();
            if (options != null) {
                ArrayList arrayList = new ArrayList(options.length);
                ORS.LJJLIIIJJIZ(arrayList, options);
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                ONS ons = new ONS(context4, arrayList);
                ons.LJLJJI = new ONR(this, arrayList, ons);
                RecyclerView recyclerView2 = this.LJLLLLLL;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(ons);
                }
            }
        }
        View view = this.LJLLJ;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            layoutParams = layoutParams2;
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C61779OMl.LJII(this.LLD);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ONQ(Context context, FeedSurvey feedSurvey, Aweme aweme) {
        super(context, R.style.a6_);
        o.LJIIIZ(context, "context");
        this.LJLJLLL = feedSurvey;
        this.LJLL = "";
        this.LJLLI = "";
        this.LJLLILLLL = aweme;
        this.LJZL = -1;
        this.LLD = OML.FEED_TYPE;
        this.LLF = new ACListenerS45S0200000_10(this, context, 13);
    }
}
