package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONZ implements OO2, C90T {
    public Context LJLIL;
    public Aweme LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public SmartImageView LJLJLJ;
    public TuxTextView LJLJLLL;
    public RecyclerView LJLL;
    public SY4 LJLLI;
    public TuxTextView LJLLILLLL;
    public ViewStub LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public C61799ONf<Option> LJZ;
    public Option LJZL;
    public FeedSurvey LLD;
    public boolean LLFII;
    public long LLFZ;
    public boolean LLI;
    public C61800ONg LLIFFJFJJ;
    public int LJZI = -1;
    public OML LL = OML.FEED_TYPE;
    public String LLF = "";
    public String LLFF = "";
    public EnumC61784OMq LLFFF = EnumC61784OMq.DEFAULT;
    public final ACListenerS30S0100000_10 LLII = new ACListenerS30S0100000_10(this, 189);

    @Override // X.C90T
    public final void LIZIZ() {
    }

    @Override // X.C90T
    public final void LIZJ() {
        this.LJZI = -1;
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLLLLLL;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJLZ;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJLJJLL;
        if (view5 != null) {
            view5.setVisibility(8);
            view5.setAlpha(0.0f);
        }
        View view6 = this.LJLJJL;
        if (view6 != null) {
            view6.setVisibility(0);
            view6.setAlpha(1.0f);
        }
        this.LJZL = null;
        C61799ONf<Option> c61799ONf = this.LJZ;
        if (c61799ONf != null) {
            c61799ONf.LJLIL = -1;
            c61799ONf.notifyDataSetChanged();
        }
        LJIIIIZZ(true);
        C61800ONg LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LJI();
        }
        this.LLFFF = EnumC61784OMq.DEFAULT;
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
        View view;
        if (C61779OMl.LJFF(this.LLFFF)) {
            view = this.LJLJJL;
        } else {
            view = this.LJLJJLL;
        }
        if (view != null) {
            C61799ONf<Option> c61799ONf = this.LJZ;
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
        View view = this.LJLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLLLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJLZ;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
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
        if (C79081V1x.LJIL(this.LJLILLLLZI) && this.LLFFF == EnumC61784OMq.GREY_CARD && isShowing()) {
            C61779OMl.LJII(this.LL);
        }
    }

    public final C61800ONg LJIILJJIL() {
        if (this.LLIFFJFJJ == null && this.LLFII) {
            this.LLIFFJFJJ = new C61800ONg();
        }
        return this.LLIFFJFJJ;
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
        C61779OMl.LJIIIIZZ(this.LL);
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
        FeedSurvey feedSurvey = this.LLD;
        if (feedSurvey != null) {
            str3 = feedSurvey.getId();
        }
        C61779OMl.LJI(this.LJLILLLLZI, this.LL, str3);
    }

    public final void LJIIIIZZ(boolean z) {
        SY4 sy4 = this.LJLLI;
        if (sy4 != null) {
            sy4.setEnabled(false);
            sy4.setClickable(false);
            sy4.setButtonVariant(2);
            sy4.setText(R.string.rx2);
            if (this.LLFFF == EnumC61784OMq.FORCE_VIDEO_NO_COVER) {
                sy4.setAlpha(0.4f);
            }
        }
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
        View view;
        if (aweme == null) {
            return;
        }
        C61811ONr LIZ = C55016LiW.LIZ().LIZ(aweme.getAid());
        if (LIZ == null) {
            LIZ = new C61811ONr();
            C55016LiW.LIZ().LIZLLL(aweme.getAid(), LIZ);
        }
        if (C61779OMl.LJFF(this.LLFFF)) {
            view = this.LJLJJL;
        } else {
            view = this.LJLJJLL;
        }
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLFII) {
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
        View view;
        Option[] optionArr;
        o.LJIIIZ(operation, "operation");
        if (aweme == null || (LIZ = C55016LiW.LIZ().LIZ(aweme.getAid())) == null || LIZ.LJI) {
            return;
        }
        if (C61779OMl.LJFF(this.LLFFF)) {
            view = this.LJLJJL;
        } else {
            view = this.LJLJJLL;
        }
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLFII && LIZ.LIZIZ) {
                C61800ONg LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    LJIILJJIL.LIZLLL(operation, !LIZ.LJ);
                }
                LIZ.LJ = true;
            } else if (LIZ.LIZ) {
                Option option = this.LJZL;
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
        Question question;
        boolean z;
        Question[] questions;
        UrlModel urlModel;
        RecyclerView recyclerView;
        int i;
        boolean z2;
        C61815ONv LJIIIZ;
        int i2;
        FeedSurvey feedSurvey;
        Question[] questions2;
        Question question2;
        Option[] options;
        FeedSurvey feedSurvey2;
        Question[] questions3;
        Question question3;
        Option[] options2;
        Option option;
        Question[] questions4;
        Question question4;
        ViewStub viewStub2;
        String str;
        int i3;
        boolean z3;
        String str2;
        int LJIIIIZZ;
        View view5;
        View view6;
        View view7;
        View view8;
        SmartImageView smartImageView;
        TuxTextView tuxTextView;
        RecyclerView recyclerView2;
        SY4 sy4;
        TuxTextView tuxTextView2;
        ViewStub viewStub3;
        Question[] questions5;
        if (context == null || aweme == null) {
            return;
        }
        this.LL = C79081V1x.LJIILLIIL(aweme);
        this.LLD = OMU.LIZJ(aweme);
        OML surveyType = this.LL;
        o.LJIIIZ(surveyType, "surveyType");
        int[] iArr = OMM.LIZ;
        int i4 = iArr[surveyType.ordinal()];
        if (i4 == 1 || i4 != 2) {
        }
        this.LLF = "";
        OML surveyType2 = this.LL;
        o.LJIIIZ(surveyType2, "surveyType");
        int i5 = iArr[surveyType2.ordinal()];
        if (i5 == 1 || i5 != 2) {
        }
        this.LLFF = "";
        FeedSurvey feedSurvey3 = this.LLD;
        if (feedSurvey3 == null || feedSurvey3.getQuestions() == null || C224868s6.LIZLLL(aweme)) {
            return;
        }
        FeedSurvey feedSurvey4 = this.LLD;
        String str3 = null;
        if (feedSurvey4 != null && (questions5 = feedSurvey4.getQuestions()) != null) {
            question = questions5[0];
        } else {
            question = null;
        }
        this.LLFII = ONM.LJ(question);
        LIZJ();
        this.LJLIL = context;
        this.LJLILLLLZI = aweme;
        this.LJLLL = view;
        this.LJLLLL = view2;
        this.LJLLLLLL = view3;
        this.LJLZ = view4;
        if (aweme.getIsSubAweme()) {
            this.LLFFF = EnumC61784OMq.FORCE_VIDEO;
            if (OMU.LIZIZ(aweme) == OBQ.FORCE_VIDEO_NO_COVER.getType()) {
                this.LLFFF = EnumC61784OMq.FORCE_VIDEO_NO_COVER;
            }
        } else {
            View view9 = this.LJLJI;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.LLFFF == EnumC61784OMq.DEFAULT) {
            return;
        }
        OMW LIZLLL = OMU.LIZLLL(aweme);
        if (LIZLLL != null && LIZLLL.LJ == 1 && C61779OMl.LJFF(this.LLFFF)) {
            z = true;
        } else {
            z = false;
        }
        this.LLI = z;
        View view10 = this.LJLJI;
        if (view10 == null) {
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                this.LJLJI = inflate;
                if (inflate != null) {
                    view5 = inflate.findViewById(R.id.bul);
                } else {
                    view5 = null;
                }
                this.LJLJJI = view5;
                View view11 = this.LJLJI;
                if (view11 != null) {
                    view6 = view11.findViewById(R.id.kv_);
                } else {
                    view6 = null;
                }
                this.LJLJJL = view6;
                View view12 = this.LJLJI;
                if (view12 != null) {
                    view7 = view12.findViewById(R.id.b68);
                } else {
                    view7 = null;
                }
                this.LJLJJLL = view7;
                View view13 = this.LJLJI;
                if (view13 != null) {
                    view8 = view13.findViewById(R.id.n8o);
                } else {
                    view8 = null;
                }
                this.LJLJL = view8;
                View view14 = this.LJLJI;
                if (view14 != null) {
                    view14.findViewById(R.id.eb1);
                }
                View view15 = this.LJLJI;
                if (view15 != null) {
                    smartImageView = (SmartImageView) view15.findViewById(R.id.n4v);
                } else {
                    smartImageView = null;
                }
                this.LJLJLJ = smartImageView;
                View view16 = this.LJLJI;
                if (view16 != null) {
                    tuxTextView = (TuxTextView) view16.findViewById(R.id.mo6);
                } else {
                    tuxTextView = null;
                }
                this.LJLJLLL = tuxTextView;
                View view17 = this.LJLJI;
                if (view17 != null) {
                    recyclerView2 = (RecyclerView) view17.findViewById(R.id.gax);
                } else {
                    recyclerView2 = null;
                }
                this.LJLL = recyclerView2;
                View view18 = this.LJLJI;
                if (view18 != null) {
                    sy4 = (SY4) view18.findViewById(R.id.azi);
                } else {
                    sy4 = null;
                }
                this.LJLLI = sy4;
                View view19 = this.LJLJI;
                if (view19 != null) {
                    tuxTextView2 = (TuxTextView) view19.findViewById(R.id.met);
                } else {
                    tuxTextView2 = null;
                }
                this.LJLLILLLL = tuxTextView2;
                View view20 = this.LJLJI;
                if (view20 != null) {
                    view20.findViewById(R.id.a88);
                }
                View view21 = this.LJLJI;
                if (view21 != null) {
                    viewStub3 = (ViewStub) view21.findViewById(R.id.jjq);
                } else {
                    viewStub3 = null;
                }
                this.LJLLJ = viewStub3;
            }
        } else {
            view10.setVisibility(0);
        }
        FeedSurvey feedSurvey5 = this.LLD;
        if (feedSurvey5 == null || (questions = feedSurvey5.getQuestions()) == null) {
            return;
        }
        Question question5 = questions[0];
        TuxTextView tuxTextView3 = this.LJLJLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(question5.getTitle());
            if ((this.LLFII || this.LLI) && C61779OMl.LJFF(this.LLFFF)) {
                tuxTextView3.setTuxFont(23);
            }
        }
        TuxTextView tuxTextView4 = this.LJLLILLLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setHighlightColor(0);
        }
        TuxTextView tuxTextView5 = this.LJLLILLLL;
        if (tuxTextView5 != null) {
            tuxTextView5.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context2 = this.LJLIL;
        if (context2 != null) {
            if (this.LLFFF == EnumC61784OMq.FORCE_VIDEO) {
                LJIIIIZZ = C04330Ez.LIZIZ(context2, R.color.be);
            } else {
                LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dl, context2);
            }
            SpannableStringBuilder LIZJ = ONM.LIZJ(context2, this.LLF, LJIIIIZZ, this.LLFF);
            if (LIZJ != null) {
                TuxTextView tuxTextView6 = this.LJLLILLLL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(LIZJ);
                }
                TuxTextView tuxTextView7 = this.LJLLILLLL;
                if (tuxTextView7 != null) {
                    tuxTextView7.setVisibility(0);
                }
            } else {
                TuxTextView tuxTextView8 = this.LJLLILLLL;
                if (tuxTextView8 != null) {
                    tuxTextView8.setVisibility(8);
                }
            }
        }
        SY4 sy42 = this.LJLLI;
        if (sy42 != null) {
            FeedSurvey feedSurvey6 = this.LLD;
            if (feedSurvey6 != null) {
                str2 = feedSurvey6.getSubmitText();
            } else {
                str2 = null;
            }
            sy42.setText(str2);
            C16880lQ.LJJIZ(sy42, this.LLII);
            if (sy42.getVisibility() == 0 && this.LLFII) {
                sy42.setVisibility(8);
            } else if (sy42.getVisibility() == 8 && !this.LLFII && this.LLFFF != EnumC61784OMq.GREY_CARD) {
                sy42.setVisibility(0);
            }
            if (this.LLI) {
                C26338AVi.LJI(sy42, null, AnonymousClass391.LIZJ(18), null, null, false, 29);
            }
        }
        int i6 = ON4.LIZ[this.LLFFF.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                View view22 = this.LJLLL;
                if (view22 != null) {
                    view22.setVisibility(8);
                }
                View view23 = this.LJLLLLLL;
                if (view23 != null) {
                    view23.setVisibility(8);
                }
                View view24 = this.LJLZ;
                if (view24 != null) {
                    view24.setVisibility(8);
                }
                Float valueOf = Float.valueOf(20.0f);
                Float valueOf2 = Float.valueOf(32.0f);
                SmartImageView smartImageView2 = this.LJLJLJ;
                if (smartImageView2 != null) {
                    smartImageView2.setVisibility(8);
                }
                if (!this.LLFII && !this.LLI) {
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                    TuxTextView tuxTextView9 = this.LJLJLLL;
                    if (tuxTextView9 != null) {
                        tuxTextView9.setTuxFont(23);
                    }
                    TuxTextView tuxTextView10 = this.LJLJLLL;
                    if (tuxTextView10 != null) {
                        C26338AVi.LJI(tuxTextView10, Integer.valueOf(LJJIIZ), C65429Pm5.LIZIZ(24.0f), Integer.valueOf(LJJIIZ), C65429Pm5.LIZIZ(12.0f), false, 16);
                    }
                    int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf2));
                    View view25 = this.LJLJL;
                    if (view25 != null) {
                        Context context3 = this.LJLIL;
                        if (context3 != null) {
                            view25.setBackground(C04270Et.LIZIZ(context3, R.drawable.ai4));
                        }
                        C26338AVi.LJI(view25, Integer.valueOf(LJJIIZ2), 0, Integer.valueOf(LJJIIZ2), 0, false, 16);
                    }
                    RecyclerView recyclerView3 = this.LJLL;
                    if (recyclerView3 != null) {
                        C26338AVi.LJI(recyclerView3, 0, 0, 0, 0, false, 16);
                    }
                    SY4 sy43 = this.LJLLI;
                    if (sy43 != null) {
                        C26338AVi.LJI(sy43, 0, AnonymousClass391.LIZJ(12), 0, Integer.valueOf(LJJIIZ), false, 16);
                    }
                }
            }
        } else {
            View view26 = this.LJLLL;
            if (view26 != null) {
                view26.setVisibility(8);
            }
            View view27 = this.LJLLLLLL;
            if (view27 != null) {
                view27.setVisibility(8);
            }
            View view28 = this.LJLZ;
            if (view28 != null) {
                view28.setVisibility(8);
            }
            SmartImageView smartImageView3 = this.LJLJLJ;
            if (smartImageView3 != null) {
                smartImageView3.setVisibility(0);
            }
            Context context4 = this.LJLIL;
            if (context4 != null) {
                if (this.LLI) {
                    SmartImageView smartImageView4 = this.LJLJLJ;
                    if (smartImageView4 != null) {
                        S3I s3i = new S3I();
                        s3i.LIZIZ = C32151Nz.LJIIZILJ(1);
                        s3i.LIZJ = C04330Ez.LIZIZ(context4, R.color.bb);
                        s3i.LIZLLL = C32151Nz.LJIIZILJ(2);
                        smartImageView4.setCircleOptions(new S3L(s3i));
                        smartImageView4.getLayoutParams().height = C7MY.LIZIZ(108);
                        smartImageView4.getLayoutParams().width = C7MY.LIZIZ(81);
                    }
                } else {
                    SmartImageView smartImageView5 = this.LJLJLJ;
                    if (smartImageView5 != null) {
                        S3I s3i2 = new S3I();
                        s3i2.LIZLLL = C32151Nz.LJIIZILJ(2);
                        smartImageView5.setCircleOptions(new S3L(s3i2));
                        smartImageView5.getLayoutParams().height = C7MY.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT);
                        smartImageView5.getLayoutParams().width = C7MY.LIZIZ(90);
                    }
                }
            }
            SmartImageView smartImageView6 = this.LJLJLJ;
            if (smartImageView6 != null) {
                Aweme aweme2 = this.LJLILLLLZI;
                if (aweme2 != null) {
                    urlModel = aweme2.getSubAwemeCover();
                } else {
                    urlModel = null;
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                LJII.LIZJ = this.LJLIL;
                LJII.LIZIZ("FeedSurveyViewManager");
                LJII.LJJIIJ = smartImageView6;
                LJII.LIZLLL(null);
            }
        }
        Context context5 = this.LJLIL;
        if (context5 == null || (recyclerView = this.LJLL) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.survey.viewhelper.FeedSurveyViewHelper$bindOptionView$1$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return false;
            }
        });
        Option[] options3 = question5.getOptions();
        if (options3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(options3.length);
        ORS.LJJLIIIJJIZ(arrayList, options3);
        if (this.LLFII || this.LLI) {
            this.LJZ = new C61803ONj(context5, arrayList);
            if (this.LLFFF == EnumC61784OMq.GREY_CARD) {
                i = C7MY.LIZIZ(4);
            } else {
                i = 0;
            }
            C26338AVi.LJI(recyclerView, 0, Integer.valueOf(i), 0, 0, false, 16);
            C61799ONf<Option> c61799ONf = this.LJZ;
            if (c61799ONf != null) {
                C61815ONv LJIIIZ2 = LJIIIZ();
                if (LJIIIZ2 != null) {
                    z2 = LJIIIZ2.LIZIZ;
                } else {
                    z2 = false;
                }
                c61799ONf.LJLILLLLZI = !z2;
            }
        } else {
            this.LJZ = new C61805ONl(context5, arrayList);
            if (C61779OMl.LJFF(this.LLFFF)) {
                i3 = C7MY.LIZIZ(20);
            } else {
                i3 = 0;
            }
            C26338AVi.LJI(recyclerView, Integer.valueOf(i3), 0, 0, 0, false, 16);
            C61799ONf<Option> c61799ONf2 = this.LJZ;
            if (c61799ONf2 != null) {
                C61815ONv LJIIIZ3 = LJIIIZ();
                if (LJIIIZ3 != null) {
                    z3 = LJIIIZ3.LIZIZ;
                } else {
                    z3 = false;
                }
                c61799ONf2.LJLILLLLZI = !z3;
            }
        }
        C61799ONf<Option> c61799ONf3 = this.LJZ;
        if (c61799ONf3 != null) {
            EnumC61784OMq enumC61784OMq = this.LLFFF;
            o.LJIIIZ(enumC61784OMq, "<set-?>");
            c61799ONf3.LJLJI = enumC61784OMq;
        }
        C61799ONf<Option> c61799ONf4 = this.LJZ;
        if (c61799ONf4 != null) {
            c61799ONf4.LJLJJI = new C61795ONb(this, arrayList);
        }
        recyclerView.setAdapter(c61799ONf4);
        int i7 = -1;
        if (this.LLFII && (LJIIIZ = LJIIIZ()) != null && (!C61779OMl.LJ(this.LLFFF) ? !(LJIIIZ.LIZ < 0 || LJIIIZ.LIZJ.size() <= 0) : LJIIIZ.LIZ >= 0)) {
            C61815ONv LJIIIZ4 = LJIIIZ();
            if (LJIIIZ4 == null || (i2 = LJIIIZ4.LIZ) < 0 || (feedSurvey = this.LLD) == null || (questions2 = feedSurvey.getQuestions()) == null || (question2 = questions2[0]) == null || (options = question2.getOptions()) == null || i2 >= options.length || (feedSurvey2 = this.LLD) == null || (questions3 = feedSurvey2.getQuestions()) == null || (question3 = questions3[0]) == null || (options2 = question3.getOptions()) == null || (option = options2[i2]) == null || (questions4 = option.getQuestions()) == null || (question4 = questions4[0]) == null || (viewStub2 = this.LJLLJ) == null) {
                return;
            }
            View view29 = this.LJLJJL;
            if (view29 != null) {
                view29.setVisibility(4);
            }
            C61800ONg LJIILJJIL = LJIILJJIL();
            if (LJIILJJIL == null) {
                return;
            }
            Context context6 = this.LJLIL;
            EnumC61784OMq enumC61784OMq2 = this.LLFFF;
            FeedSurvey feedSurvey7 = this.LLD;
            if (feedSurvey7 != null) {
                str = feedSurvey7.getSubmitText();
            } else {
                str = null;
            }
            FeedSurvey feedSurvey8 = this.LLD;
            if (feedSurvey8 != null) {
                str3 = feedSurvey8.getId();
            }
            LJIILJJIL.LJII(viewStub2, context6, enumC61784OMq2, str, this, str3, option, i2, question4, this.LJLILLLLZI, this.LL, true, null);
            return;
        }
        C61815ONv LJIIIZ5 = LJIIIZ();
        if (LJIIIZ5 != null) {
            i7 = LJIIIZ5.LIZ;
        }
        if (i7 != this.LJZI) {
            C61815ONv LJIIIZ6 = LJIIIZ();
            if (LJIIIZ6 != null && LJIIIZ6.LIZIZ) {
                LJIIIIZZ(true);
            } else {
                SY4 sy44 = this.LJLLI;
                if (sy44 != null) {
                    sy44.setEnabled(true);
                    sy44.setClickable(true);
                    sy44.setButtonVariant(0);
                }
            }
            this.LJZI = i7;
            C61799ONf<Option> c61799ONf5 = this.LJZ;
            if (c61799ONf5 != null) {
                c61799ONf5.LJLIL = i7;
                c61799ONf5.notifyDataSetChanged();
            }
        }
        if (!C61779OMl.LJ(this.LLFFF)) {
            return;
        }
        C61815ONv c61815ONv = new C61815ONv();
        c61815ONv.LIZ = i7;
        c61815ONv.LIZIZ = false;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 != null) {
            str3 = aweme3.getAid();
        }
        LIZ.LJ(str3, c61815ONv);
    }
}
