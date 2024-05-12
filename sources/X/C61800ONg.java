package X;

import Y.ARunnableS46S0100000_10;
import Y.AUListenerS36S0201000_10;
import Y.AUListenerS6S0202000_10;
import Y.IDAListenerS78S0100000_10;
import Y.IDComparatorS38S0000000_10;
import Y.IDLListenerS61S0200000_10;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.survey.layoutmanager.SurveyFlexLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ONg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61800ONg implements OOK {
    public Context LIZIZ;
    public OO2 LIZJ;
    public Option LJI;
    public Question LJIIIIZZ;
    public Aweme LJIIIZ;
    public View LJIIJJI;
    public View LJIIL;
    public TuxIconView LJIILIIL;
    public TuxTextView LJIILJJIL;
    public TuxTextView LJIILL;
    public RecyclerView LJIILLIIL;
    public View LJIIZILJ;
    public TuxTextView LJIJ;
    public TuxIconView LJIJI;
    public SY4 LJIJJ;
    public TuxTextView LJIJJLI;
    public View LJIL;
    public View LJJ;
    public OO3 LJJI;
    public C61804ONk LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public final java.util.Map<Integer, Option> LIZ = new LinkedHashMap();
    public EnumC61784OMq LIZLLL = EnumC61784OMq.DEFAULT;
    public String LJ = "";
    public String LJFF = "";
    public int LJII = -1;
    public OML LJIIJ = OML.FEED_TYPE;
    public final ViewOnClickListenerC61801ONh LJJIIJ = new ViewOnClickListenerC61801ONh(this);

    public final Option[] LIZIZ() {
        Question question;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            ((Number) entry.getKey()).intValue();
            arrayList.add(entry.getValue());
        }
        List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS38S0000000_10(19), arrayList));
        Option option = this.LJI;
        if (option != null) {
            Question[] questions = option.getQuestions();
            if (questions != null && (question = questions[0]) != null) {
                question.setOptions((Option[]) LLJILJILJ.toArray(new Option[0]));
            }
            return new Option[]{option};
        }
        return null;
    }

    public final void LJI() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view2 = this.LJIIJJI;
        if (view2 != null) {
            view2.setVisibility(8);
            view2.setAlpha(0.0f);
        }
        C61804ONk c61804ONk = this.LJJIFFI;
        if (c61804ONk != null) {
            ((LinkedHashMap) this.LIZ).clear();
            Iterator<Option> it = c61804ONk.LJLJJLL.iterator();
            while (it.hasNext()) {
                it.next().setSelected(false);
            }
            c61804ONk.notifyDataSetChanged();
        }
        View view3 = this.LJIIZILJ;
        if (view3 != null && view3.getVisibility() == 0 && C61779OMl.LJFF(this.LIZLLL) && (view = this.LJIL) != null && (layoutParams = view.getLayoutParams()) != null && (i = layoutParams.height) > 100) {
            layoutParams.height = i - C17N.LJIILL(60.0d);
        }
        View view4 = this.LJIIZILJ;
        if (view4 != null) {
            view4.setVisibility(8);
            view4.setAlpha(0.0f);
        }
        TuxTextView tuxTextView = this.LJIJ;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        LIZJ(false);
        View view5 = this.LJIL;
        if (view5 != null) {
            g0.LJJIJIIJI(-1, -2, view5);
            view5.requestLayout();
        }
    }

    @Override // X.OOK
    public final void LIZ(String str) {
        TuxTextView tuxTextView = this.LJIJ;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(str);
    }

    public final void LIZJ(boolean z) {
        SY4 sy4 = this.LJIJJ;
        if (sy4 != null) {
            sy4.setEnabled(false);
            sy4.setClickable(false);
            sy4.setButtonVariant(2);
            if (z) {
                sy4.setText(R.string.rx2);
                View view = this.LJIIZILJ;
                if (view != null) {
                    view.setEnabled(false);
                }
                TuxIconView tuxIconView = this.LJIJI;
                if (tuxIconView != null) {
                    tuxIconView.setEnabled(false);
                }
                TuxTextView tuxTextView = this.LJIJJLI;
                if (tuxTextView == null) {
                    return;
                }
                tuxTextView.setEnabled(false);
                return;
            }
            View view2 = this.LJIIZILJ;
            if (view2 != null) {
                view2.setEnabled(true);
            }
            TuxIconView tuxIconView2 = this.LJIJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setEnabled(true);
            }
            TuxTextView tuxTextView2 = this.LJIJJLI;
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setEnabled(true);
        }
    }

    public final void LJ(boolean z) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        if (!z) {
            String str5 = this.LJFF;
            Aweme aweme = this.LJIIIZ;
            Option option = this.LJI;
            String str6 = null;
            if (option != null) {
                num = Integer.valueOf(option.getId());
            } else {
                num = null;
            }
            String str7 = this.LJJII;
            OML surveyType = this.LJIIJ;
            o.LJIIIZ(surveyType, "surveyType");
            int i = OMM.LIZ[surveyType.ordinal()];
            if (i != 1 && i != 2) {
                if (aweme != null) {
                    str3 = aweme.getAid();
                    str4 = aweme.getAuthorUid();
                } else {
                    str3 = null;
                    str4 = null;
                }
                Locale locale = Locale.ENGLISH;
                String LIZIZ = C141415gn.LIZIZ(locale, "ENGLISH", "MULTIPLE_CHOICE_INPUT", locale, "this as java.lang.String).toLowerCase(locale)");
                if (aweme != null) {
                    str6 = aweme.getRequestId();
                }
                C61769OMb.LJFF(aweme, num, "", str5, str3, str4, LIZIZ, surveyType, str6);
                return;
            }
            if (aweme != null) {
                str = aweme.getAid();
                str2 = aweme.getAuthorUid();
            } else {
                str = null;
                str2 = null;
            }
            Locale locale2 = Locale.ENGLISH;
            String LIZIZ2 = C141415gn.LIZIZ(locale2, "ENGLISH", "MULTIPLE_CHOICE_INPUT", locale2, "this as java.lang.String).toLowerCase(locale)");
            if (aweme != null) {
                str6 = aweme.getRequestId();
            }
            C61769OMb.LJFF(aweme, num, str7, str5, str, str2, LIZIZ2, surveyType, str6);
        }
    }

    public final void LJFF(boolean z) {
        double d;
        if (z) {
            View view = this.LJIIZILJ;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
        } else {
            View view2 = this.LJIIZILJ;
            if (view2 != null && view2.getVisibility() == 8) {
                return;
            }
        }
        View view3 = this.LJIIZILJ;
        if (view3 != null) {
            if (z) {
                view3.setVisibility(0);
                view3.animate().alpha(1.0f).setDuration(200L).setStartDelay(100L).start();
            } else {
                C09K.LIZ(view3, 0.0f, 200L).withEndAction(new ARunnableS46S0100000_10(view3, 213)).start();
            }
        }
        View view4 = this.LJIL;
        if (view4 != null) {
            int height = view4.getHeight();
            if (C61779OMl.LJFF(this.LIZLLL)) {
                d = 60.0d;
            } else {
                d = 41.0d;
            }
            int LJIILL = C17N.LJIILL(d);
            if (z) {
                ValueAnimator ofInt = ValueAnimator.ofInt(height, LJIILL + height);
                ofInt.addUpdateListener(new AUListenerS36S0201000_10(view4, this, height, 0));
                ofInt.setDuration(300L);
                ofInt.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                ofInt.addListener(new IDAListenerS78S0100000_10(this, 7));
                ofInt.start();
                return;
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt(height, height - LJIILL);
            ofInt2.addUpdateListener(new AUListenerS6S0202000_10(view4, this, height, LJIILL, 2));
            ofInt2.setDuration(250L);
            ofInt2.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            ofInt2.setStartDelay(100L);
            ofInt2.addListener(new IDAListenerS78S0100000_10(this, 8));
            ofInt2.start();
        }
    }

    public final void LIZLLL(EnumC61773OMf operation, boolean z) {
        Integer num;
        o.LJIIIZ(operation, "operation");
        String str = this.LJFF;
        Aweme aweme = this.LJIIIZ;
        Option option = this.LJI;
        if (option != null) {
            num = Integer.valueOf(option.getId());
        } else {
            num = null;
        }
        Option[] LIZIZ = LIZIZ();
        String str2 = this.LJJII;
        C61779OMl.LIZLLL(this.LJII, aweme, operation, this.LJIIJ, num, str, str2, z, LIZIZ);
    }

    public final void LJII(ViewStub viewStub, Context context, EnumC61784OMq viewType, String str, OO2 oo2, String str2, Option primaryOption, int i, Question question, Aweme aweme, OML surveyType, boolean z, OO3 oo3) {
        Object obj;
        Object obj2;
        Option[] options;
        String str3;
        String aid;
        C61815ONv LIZIZ;
        List<Option> list;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num;
        String str9;
        String str10;
        String str11;
        SY4 sy4;
        Option[] options2;
        View view;
        View view2;
        ViewTreeObserver viewTreeObserver;
        String aid2;
        C61815ONv LIZIZ2;
        Option[] options3;
        TuxIconView tuxIconView;
        View view3;
        TuxIconView tuxIconView2;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        RecyclerView recyclerView;
        View view4;
        TuxTextView tuxTextView3;
        TuxIconView tuxIconView3;
        SY4 sy42;
        TuxTextView tuxTextView4;
        View view5;
        View view6;
        o.LJIIIZ(viewStub, "viewStub");
        o.LJIIIZ(viewType, "viewType");
        o.LJIIIZ(primaryOption, "primaryOption");
        o.LJIIIZ(question, "question");
        o.LJIIIZ(surveyType, "surveyType");
        LJI();
        this.LIZIZ = context;
        this.LIZJ = oo2;
        this.LIZLLL = viewType;
        this.LJ = str;
        this.LJFF = str2;
        String str12 = null;
        try {
            obj = new Gson().LJI(new Gson().LJIILL(primaryOption), Option.class);
        } catch (Exception unused) {
            obj = null;
        }
        this.LJI = (Option) obj;
        this.LJII = i;
        try {
            obj2 = new Gson().LJI(new Gson().LJIILL(question), Question.class);
        } catch (Exception unused2) {
            obj2 = null;
        }
        this.LJIIIIZZ = (Question) obj2;
        this.LJIIIZ = aweme;
        this.LJIIJ = surveyType;
        this.LJJI = oo3;
        if (z) {
            if (aweme != null && (aid = aweme.getAid()) != null && (LIZIZ = C55016LiW.LIZ().LIZIZ(aid)) != null && (list = LIZIZ.LIZJ) != null && list.size() > 0 && list != null) {
                for (Option option : list) {
                    this.LIZ.put(Integer.valueOf(option.getId()), option);
                }
            }
            Question question2 = this.LJIIIIZZ;
            if (question2 != null && (options = question2.getOptions()) != null) {
                for (Option option2 : options) {
                    if (this.LIZ.containsKey(Integer.valueOf(option2.getId()))) {
                        option2.setSelected(true);
                        if (option2.getType() == EnumC46455ILb.WITH_INPUT.getType()) {
                            Option option3 = (Option) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(option2.getId()));
                            if (option3 == null || (str3 = option3.getAdditional_content()) == null) {
                                str3 = "";
                            }
                            option2.setAdditional_content(str3);
                        }
                    } else {
                        option2.setSelected(false);
                    }
                }
            }
        }
        if (this.LJIIJJI == null) {
            View inflate = viewStub.inflate();
            this.LJIIJJI = inflate;
            if (inflate != null) {
                inflate.setVisibility(8);
            }
            View view7 = this.LJIIJJI;
            if (view7 != null) {
                view3 = view7.findViewById(R.id.bul);
            } else {
                view3 = null;
            }
            this.LJIIL = view3;
            View view8 = this.LJIIJJI;
            if (view8 != null) {
                tuxIconView2 = (TuxIconView) view8.findViewById(R.id.eb1);
            } else {
                tuxIconView2 = null;
            }
            this.LJIILIIL = tuxIconView2;
            View view9 = this.LJIIJJI;
            if (view9 != null) {
                tuxTextView = (TuxTextView) view9.findViewById(R.id.mo6);
            } else {
                tuxTextView = null;
            }
            this.LJIILJJIL = tuxTextView;
            View view10 = this.LJIIJJI;
            if (view10 != null) {
                tuxTextView2 = (TuxTextView) view10.findViewById(R.id.mlr);
            } else {
                tuxTextView2 = null;
            }
            this.LJIILL = tuxTextView2;
            View view11 = this.LJIIJJI;
            if (view11 != null) {
                recyclerView = (RecyclerView) view11.findViewById(R.id.gax);
            } else {
                recyclerView = null;
            }
            this.LJIILLIIL = recyclerView;
            View view12 = this.LJIIJJI;
            if (view12 != null) {
                view4 = view12.findViewById(R.id.eor);
            } else {
                view4 = null;
            }
            this.LJIIZILJ = view4;
            View view13 = this.LJIIJJI;
            if (view13 != null) {
                tuxTextView3 = (TuxTextView) view13.findViewById(R.id.ep4);
            } else {
                tuxTextView3 = null;
            }
            this.LJIJ = tuxTextView3;
            View view14 = this.LJIIJJI;
            if (view14 != null) {
                tuxIconView3 = (TuxIconView) view14.findViewById(R.id.beq);
            } else {
                tuxIconView3 = null;
            }
            this.LJIJI = tuxIconView3;
            View view15 = this.LJIIJJI;
            if (view15 != null) {
                sy42 = (SY4) view15.findViewById(R.id.azi);
            } else {
                sy42 = null;
            }
            this.LJIJJ = sy42;
            View view16 = this.LJIIJJI;
            if (view16 != null) {
                tuxTextView4 = (TuxTextView) view16.findViewById(R.id.dxa);
            } else {
                tuxTextView4 = null;
            }
            this.LJIJJLI = tuxTextView4;
            View view17 = this.LJIIJJI;
            if (view17 != null) {
                view5 = view17.findViewById(R.id.b68);
            } else {
                view5 = null;
            }
            this.LJIL = view5;
            View view18 = this.LJIIJJI;
            if (view18 != null) {
                view6 = view18.findViewById(R.id.d33);
            } else {
                view6 = null;
            }
            this.LJJ = view6;
        }
        View view19 = this.LJIIJJI;
        if (view19 != null) {
            view19.setVisibility(0);
            if (z) {
                view19.setAlpha(1.0f);
            } else {
                view19.animate().alpha(1.0f).setDuration(200L).start();
            }
        }
        if (context != null) {
            if (this.LIZLLL == EnumC61784OMq.GREY_CARD && (tuxIconView = this.LJIILIIL) != null) {
                C16880lQ.LJJJ(tuxIconView, this.LJJIIJ);
            }
            TuxTextView tuxTextView5 = this.LJIILJJIL;
            if (tuxTextView5 != null) {
                Question question3 = this.LJIIIIZZ;
                if (question3 != null) {
                    str4 = question3.getTitle();
                } else {
                    str4 = null;
                }
                tuxTextView5.setText(str4);
            }
            TuxTextView tuxTextView6 = this.LJIILJJIL;
            if (tuxTextView6 != null) {
                C26338AVi.LJIIIZ(tuxTextView6, null, null, null, 0, 23);
            }
            TuxTextView tuxTextView7 = this.LJIILL;
            if (tuxTextView7 != null) {
                tuxTextView7.setVisibility(0);
            }
            Question question4 = this.LJIIIIZZ;
            if (question4 != null) {
                str5 = question4.getSubtitle();
            } else {
                str5 = null;
            }
            if (TextUtils.isEmpty(str5)) {
                TuxTextView tuxTextView8 = this.LJIILL;
                if (tuxTextView8 != null) {
                    tuxTextView8.setText(context.getResources().getString(R.string.hg2));
                }
            } else {
                TuxTextView tuxTextView9 = this.LJIILL;
                if (tuxTextView9 != null) {
                    Question question5 = this.LJIIIIZZ;
                    if (question5 != null) {
                        str6 = question5.getSubtitle();
                    } else {
                        str6 = null;
                    }
                    tuxTextView9.setText(str6);
                }
            }
            TuxTextView tuxTextView10 = this.LJIJ;
            if (tuxTextView10 != null) {
                tuxTextView10.addTextChangedListener(new C61806ONm(this));
            }
            TuxIconView tuxIconView4 = this.LJIJI;
            if (tuxIconView4 != null) {
                C16880lQ.LJJJ(tuxIconView4, this.LJJIIJ);
            }
            View view20 = this.LJIIZILJ;
            if (view20 != null) {
                C16880lQ.LJIIJ(this.LJJIIJ, view20);
            }
            SY4 sy43 = this.LJIJJ;
            if (sy43 != null) {
                sy43.setText(this.LJ);
                C16880lQ.LJJIZ(sy43, this.LJJIIJ);
            }
            TuxTextView tuxTextView11 = this.LJIJJLI;
            if (tuxTextView11 != null) {
                tuxTextView11.setText(R.string.hg1);
                C16880lQ.LJJJJI(tuxTextView11, this.LJJIIJ);
            }
            if (C61812ONs.LIZ[this.LIZLLL.ordinal()] == 1) {
                if (C8D3.LIZJ()) {
                    View view21 = this.LJJ;
                    if (view21 != null) {
                        view21.getLayoutParams().height = C7MY.LIZIZ(108);
                        view21.getLayoutParams().width = C7MY.LIZIZ(80);
                    }
                    SY4 sy44 = this.LJIJJ;
                    if (sy44 != null) {
                        sy44.setTuxFont(42);
                        sy44.getLayoutParams().height = C7MY.LIZIZ(36);
                    }
                } else {
                    View view22 = this.LJJ;
                    if (view22 != null) {
                        view22.getLayoutParams().height = C7MY.LIZIZ(160);
                        view22.getLayoutParams().width = C7MY.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT);
                    }
                    SY4 sy45 = this.LJIJJ;
                    if (sy45 != null) {
                        sy45.setTuxFont(42);
                    }
                }
                OO3 oo32 = this.LJJI;
                if (oo32 != null) {
                    oo32.LJJJJ = false;
                }
                View view23 = this.LJIIL;
                if (view23 != null) {
                    ViewGroup.LayoutParams layoutParams = view23.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                    view23.setLayoutParams(layoutParams);
                }
                View view24 = this.LJJ;
                if (view24 != null) {
                    C16880lQ.LJIIJ(this.LJJIIJ, view24);
                }
            }
            RecyclerView recyclerView2 = this.LJIILLIIL;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new SurveyFlexLayoutManager());
                Question question6 = this.LJIIIIZZ;
                if (question6 != null && (options3 = question6.getOptions()) != null) {
                    ArrayList arrayList = new ArrayList(options3.length);
                    ORS.LJJLIIIJJIZ(arrayList, options3);
                    C61804ONk c61804ONk = new C61804ONk(context, arrayList);
                    this.LJJIFFI = c61804ONk;
                    EnumC61784OMq enumC61784OMq = this.LIZLLL;
                    o.LJIIIZ(enumC61784OMq, "<set-?>");
                    c61804ONk.LJLJI = enumC61784OMq;
                    C61804ONk c61804ONk2 = this.LJJIFFI;
                    if (c61804ONk2 != null) {
                        c61804ONk2.LJLJJI = new C61802ONi(this, arrayList, c61804ONk2);
                        recyclerView2.setAdapter(c61804ONk2);
                    }
                }
            }
            if (z) {
                Aweme aweme2 = this.LJIIIZ;
                if (aweme2 != null && (aid2 = aweme2.getAid()) != null && (LIZIZ2 = C55016LiW.LIZ().LIZIZ(aid2)) != null && LIZIZ2.LIZIZ) {
                    LIZJ(true);
                    C61804ONk c61804ONk3 = this.LJJIFFI;
                    if (c61804ONk3 != null) {
                        c61804ONk3.LJLILLLLZI = false;
                        c61804ONk3.notifyDataSetChanged();
                    }
                } else if ((!this.LIZ.isEmpty()) && (sy4 = this.LJIJJ) != null) {
                    sy4.setEnabled(true);
                    sy4.setClickable(true);
                    sy4.setButtonVariant(0);
                }
                Question question7 = this.LJIIIIZZ;
                if (question7 != null && (options2 = question7.getOptions()) != null) {
                    for (Option option4 : options2) {
                        if (option4.isSelected() && option4.getType() == EnumC46455ILb.WITH_INPUT.getType() && (view = this.LJIIZILJ) != null && view.getVisibility() == 8 && (view2 = this.LJIL) != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS61S0200000_10(this, option4, 4));
                        }
                    }
                }
            }
            C61798ONe LIZ = C55016LiW.LIZ();
            Aweme aweme3 = this.LJIIIZ;
            if (aweme3 != null) {
                str7 = aweme3.getAid();
            } else {
                str7 = null;
            }
            C61811ONr LIZ2 = LIZ.LIZ(str7);
            if (LIZ2 != null) {
                if (LIZ2.LIZIZ) {
                    return;
                }
            } else {
                LIZ2 = new C61811ONr();
            }
            LIZ2.LIZIZ = true;
            C61798ONe LIZ3 = C55016LiW.LIZ();
            Aweme aweme4 = this.LJIIIZ;
            if (aweme4 != null) {
                str8 = aweme4.getAid();
            } else {
                str8 = null;
            }
            LIZ3.LIZLLL(str8, LIZ2);
            Aweme aweme5 = this.LJIIIZ;
            String str13 = this.LJFF;
            Option option5 = this.LJI;
            if (option5 != null) {
                num = Integer.valueOf(option5.getId());
            } else {
                num = null;
            }
            OML surveyType2 = this.LJIIJ;
            o.LJIIIZ(surveyType2, "surveyType");
            if (aweme5 != null) {
                str9 = aweme5.getAid();
                str10 = aweme5.getAuthorUid();
                str11 = aweme5.getRequestId();
            } else {
                str9 = null;
                str10 = null;
                str11 = null;
            }
            C61769OMb.LIZIZ = System.currentTimeMillis();
            String LIZJ = C61769OMb.LIZJ(aweme5, str9);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", LIZJ);
            c188727au.LJIIIZ("survey_id", str13);
            c188727au.LJIIIZ("author_id", str10);
            c188727au.LJFF(num, "enter_method");
            c188727au.LIZLLL(surveyType2.getType(), "survey_biz_type");
            c188727au.LJIIIZ("request_id", str11);
            if (aweme5 != null) {
                str12 = OMU.LIZ(aweme5);
            }
            c188727au.LJIIIZ("content_scope", str12);
            C61769OMb.LIZ(c188727au, aweme5);
            C61769OMb.LIZIZ(c188727au, aweme5);
            FMX.LJIIL("secondary_survey_notify", c188727au.LIZ);
        }
    }
}
