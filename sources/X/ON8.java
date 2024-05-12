package X;

import Y.ACListenerS24S0100000_4;
import Y.ACListenerS30S0100000_10;
import Y.ARunnableS40S0100000_4;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import Y.AfS59S0200000_10;
import Y.AfS62S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.ForceVideo;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.model.survey.ReplaceInfo;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi;
import com.ss.android.ugc.aweme.feed.prompt.api.PromptTransformResp;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptTextEditFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ON8 extends AbstractC61774OMg implements InterfaceC50599JtT {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public Context LJLJL;
    public View LJLJLJ;
    public OIN LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public SmartImageView LJLLILLLL;
    public TuxTextView LJLLJ;
    public RecyclerView LJLLL;
    public ViewGroup LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public OO3 LJZL;
    public ONW LL;
    public boolean LLF;
    public FeedPromptViewModel LLFF;
    public boolean LLFZ;
    public final java.util.Map<Integer, Option> LLD = new LinkedHashMap();
    public final C73318Sq2 LLFFF = new C73318Sq2();
    public final ONJ LLFII = new ONJ("prompt");
    public final ACListenerS30S0100000_10 LLI = new ACListenerS30S0100000_10(this, 190);

    @Override // X.OO8
    public final void LJ() {
        String str;
        String str2;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (LIZ.LIZJ(this.LJLJJI, str)) {
            C61798ONe LIZ2 = C55016LiW.LIZ();
            Aweme aweme2 = this.LJLIL;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            C61811ONr LIZ3 = LIZ2.LIZ(str2);
            if (LIZ3 == null) {
                LIZ3 = new C61811ONr();
            }
            LJIIIZ(LIZ3, EnumC61773OMf.SWIPE, null);
        }
    }

    @Override // X.C90F
    public final void LJIIJJI() {
        String str;
        String str2;
        FeedSurvey feedSurvey;
        Integer num;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLIL;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C61811ONr LIZ2 = LIZ.LIZ(str);
        if (LIZ2 == null) {
            LIZ2 = new C61811ONr();
        }
        if (!LIZ2.LIZ) {
            LIZ2.LIZ = true;
            C61798ONe LIZ3 = C55016LiW.LIZ();
            Aweme aweme2 = this.LJLIL;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            LIZ3.LIZLLL(str2, LIZ2);
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null && (feedSurvey = this.LJLILLLLZI) != null) {
                String id = feedSurvey.getId();
                C61778OMk c61778OMk = EnumC61777OMj.Companion;
                Question question = this.LJLJJL;
                if (question != null) {
                    num = Integer.valueOf(question.getType());
                } else {
                    num = null;
                }
                c61778OMk.getClass();
                C61769OMb.LJI(id, aweme3, C61778OMk.LIZ(num));
                OMS.LJII(this.LJLIL);
            }
        }
        C61798ONe LIZ4 = C55016LiW.LIZ();
        Aweme aweme4 = this.LJLIL;
        if (aweme4 != null) {
            str3 = aweme4.getAid();
        }
        LIZ4.LJFF(str3, new OMH(this.LJLJJI, true));
        C26244ARs.LIZIZ("homepage_hot", "infeed_survey");
    }

    @Override // X.C90T
    public final void LJIIL() {
    }

    @Override // X.C90T
    public final void LIZIZ() {
        this.LLFFF.LIZLLL();
    }

    @Override // X.C90T
    public final void LIZJ() {
        View view = this.LJLJLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLLLLL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJZ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJZI;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJLL;
        if (view5 != null) {
            view5.setVisibility(0);
            view5.setAlpha(1.0f);
        }
    }

    @Override // X.OO8
    public final boolean LJFF() {
        String str;
        SurveyInfo surveyInfo;
        SurveyInfo surveyInfo2;
        SurveyInfo surveyInfo3;
        SurveyInfo surveyInfo4;
        ReplaceInfo replacement;
        Question question;
        Option[] options;
        Question[] questions;
        String title;
        boolean z = true;
        boolean z2 = !OMS.LJ(this.LJLIL);
        HashSet<String> hashSet = OMS.LJFF;
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        boolean LJLJJI = ORZ.LJLJJI(str, hashSet);
        if (!z2 && !LJLJJI) {
            return false;
        }
        if (!this.LLF) {
            String key = ONN.LIZ(this.LJLIL);
            this.LLFII.LJIIJ(new AqS39S1000000_1(key, 7));
            if (key != null && key.length() != 0) {
                Aweme aweme2 = this.LJLIL;
                o.LJIIIZ(key, "key");
                if (aweme2 != null) {
                    List<SurveyInfo> surveyInfos = aweme2.getSurveyInfos();
                    if (surveyInfos != null) {
                        Iterator<SurveyInfo> it = surveyInfos.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                surveyInfo2 = it.next();
                                if (o.LJ(surveyInfo2.getSurveyKey(), key)) {
                                    break;
                                }
                            } else {
                                surveyInfo2 = null;
                                break;
                            }
                        }
                        surveyInfo = surveyInfo2;
                    } else {
                        surveyInfo = null;
                    }
                    aweme2.setSurveyInfo(surveyInfo);
                }
                ONN.LIZ.LJIIJ(new AqS160S0100000_10(aweme2, 507));
                LJIIIIZZ(this.LJLIL);
                Aweme aweme3 = this.LJLIL;
                ONH.LIZ.LJIIJ(new AqS160S0100000_10(aweme3, 562));
                if (aweme3 != null && (surveyInfo3 = aweme3.getSurveyInfo()) != null && surveyInfo3.getReplacement() != null) {
                    this.LLFII.LJIIJ(new AqS160S0100000_10(this, 587));
                    Aweme aweme4 = this.LJLIL;
                    if (aweme4 != null && (surveyInfo4 = aweme4.getSurveyInfo()) != null && (replacement = surveyInfo4.getReplacement()) != null && (question = replacement.getQuestion()) != null && (options = question.getOptions()) != null && this.LJLJL != null) {
                        Question question2 = this.LJLJJL;
                        if (question2 != null && (title = question2.getTitle()) != null && C78685UuP.LJJJZ(title)) {
                            this.LLFII.LJIIJ(new AqS160S0100000_10(this, 588));
                            Question question3 = this.LJLJJL;
                            if (question3 != null) {
                                question3.setOptions(options);
                            }
                            this.LLFII.LJIIJ(new AqS160S0100000_10(this, 589));
                        } else {
                            FeedSurvey feedSurvey = this.LJLILLLLZI;
                            if (feedSurvey != null && (questions = feedSurvey.getQuestions()) != null) {
                                questions[0] = question;
                            }
                            this.LJLJJL = question;
                        }
                    }
                    LJIILL();
                    this.LLF = true;
                }
            }
            z = false;
        }
        this.LLFII.LJIIJ(new C93B(z, z2, LJLJJI));
        return z;
    }

    @Override // X.C90T
    public final void LJII() {
        View view = this.LJLLLLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJZ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJZI;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    @Override // X.OO8
    public final void LJIILIIL() {
        String aid;
        FeedPromptApi.LIZ.getClass();
        this.LLFFF.LIZ(C237639Uh.LIZ().instructionsAll(C9UY.LITE.getValue()).LJJJJJ(1L).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 156), new AfS62S0100000_10(this, 44)));
        Aweme aweme = this.LJLIL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            OMS.LJFF.add(aid);
        }
        LJIIJJI();
    }

    public final void LJIILL() {
        Question question;
        Option[] options;
        String str;
        ForceVideo videoCover;
        String[] urlList;
        String str2;
        Context context = this.LJLJL;
        if (context == null) {
            return;
        }
        SmartImageView smartImageView = this.LJLLILLLL;
        if (smartImageView != null) {
            if (C8D3.LIZJ()) {
                smartImageView.getLayoutParams().height = C7MY.LIZIZ(80);
                smartImageView.getLayoutParams().width = C7MY.LIZIZ(60);
            } else {
                smartImageView.getLayoutParams().height = C7MY.LIZIZ(160);
                smartImageView.getLayoutParams().width = C7MY.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT);
            }
        }
        SmartImageView smartImageView2 = this.LJLLILLLL;
        if (smartImageView2 != null) {
            C16880lQ.LJJIJLIJ(smartImageView2, this.LLI);
        }
        FeedSurvey feedSurvey = this.LJLILLLLZI;
        if (feedSurvey != null && (videoCover = feedSurvey.getVideoCover()) != null && (urlList = videoCover.getUrlList()) != null && (str2 = urlList[0]) != null && C78685UuP.LJJJZ(str2)) {
            View view = this.LJLLI;
            if (view != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.d4);
                c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                view.setBackground(c110614Vt.LIZ(context));
            }
        } else {
            View view2 = this.LJLLI;
            if (view2 != null) {
                view2.setBackground(C04270Et.LIZIZ(context, R.drawable.ai4));
            }
        }
        Context context2 = this.LJLJL;
        if (context2 == null) {
            return;
        }
        TuxTextView tuxTextView = this.LJLLJ;
        if (tuxTextView != null) {
            Question question2 = this.LJLJJL;
            if (question2 != null) {
                str = question2.getTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(23);
        }
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView == null || (question = this.LJLJJL) == null || (options = question.getOptions()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(options.length);
        ORS.LJJLIIIJJIZ(arrayList, options);
        this.LL = new ONW(context2, arrayList);
        C26338AVi.LJI(recyclerView, 0, 0, 0, 0, false, 16);
        ONW onw = this.LL;
        if (onw != null) {
            onw.LJLJJI = this;
        }
        recyclerView.setAdapter(onw);
    }

    public final void LJIIZILJ() {
        View view = this.LJLJLJ;
        if (view == null) {
            return;
        }
        AKT akt = new AKT(view);
        akt.LIZ.LJLILLLLZI = 2;
        akt.LJI(view.getContext().getString(R.string.jhr, 20));
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLJJI = 0;
        c208158Ex.LJLJLJ = new ACListenerS24S0100000_4(view, 311);
        akt.LJ(R.style.vp);
        akt.LIZ.LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(60));
        akt.LIZJ(3000L);
        akt.LJII();
        C26244ARs.LJIIIZ("survey", "reach_limit");
        C26244ARs.LJFF("survey", "reach_limit");
    }

    public final int LJIJ() {
        Integer num;
        MutableLiveData<Integer> gv0;
        FeedPromptViewModel feedPromptViewModel;
        ActivityC45651qj LJJIFFI;
        if (this.LLFF == null) {
            Context context = this.LJLJL;
            if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                feedPromptViewModel = C238299Wv.LIZ(LJJIFFI);
            } else {
                feedPromptViewModel = null;
            }
            this.LLFF = feedPromptViewModel;
        }
        FeedPromptViewModel feedPromptViewModel2 = this.LLFF;
        if (feedPromptViewModel2 == null || (gv0 = feedPromptViewModel2.gv0()) == null || (num = gv0.getValue()) == null) {
            num = 0;
        }
        int intValue = num.intValue();
        int size = ((LinkedHashMap) this.LLD).values().size();
        this.LLFII.LJIIJ(new C93A(intValue, size));
        return intValue + size;
    }

    @Override // X.C90T
    public final boolean isShowing() {
        View view = this.LJLJLJ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void LJIILLIIL(Option option) {
        String str;
        if (this.LLD.containsKey(Integer.valueOf(option.getId()))) {
            this.LLD.remove(Integer.valueOf(option.getId()));
            FeedSurvey feedSurvey = this.LJLILLLLZI;
            if (feedSurvey != null) {
                str = feedSurvey.getId();
            } else {
                str = null;
            }
            C26244ARs.LJIIIIZZ(str, option, false);
        }
        option.setSelected(false);
    }

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        Option[] options;
        String str;
        FragmentManager supportFragmentManager;
        Question question = this.LJLJJL;
        if (question == null || (options = question.getOptions()) == null) {
            return;
        }
        Option option = options[i];
        int i2 = 0;
        if (option.getType() == 2) {
            Context context = this.LJLJL;
            if (context == null) {
                return;
            }
            if (LJIJ() >= 20) {
                LJIIZILJ();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("instructionIds", ORZ.LLD(((LinkedHashMap) this.LLD).values(), ",", null, null, ONF.LJLIL, 30));
            bundle.putString("contents", ORZ.LLD(((LinkedHashMap) this.LLD).values(), ",", null, null, ONG.LJLIL, 30));
            bundle.putString("source_page", "survey");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
                return;
            }
            PromptTextEditFragment promptTextEditFragment = new PromptTextEditFragment();
            promptTextEditFragment.setArguments(bundle);
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = promptTextEditFragment;
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZI = false;
            tuxSheet.LJLJI = true;
            asl.LJFF(32);
            Integer LJI = C79045V0n.LJI(R.attr.c9, context);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLJL = LJI;
            tuxSheet2.show(supportFragmentManager, "PromptTextEditFragment");
            return;
        }
        if (!option.isSelected()) {
            if (LJIJ() >= 20) {
                LJIIZILJ();
            } else {
                option.setSelected(true);
                this.LLD.put(Integer.valueOf(option.getId()), option);
                ONW onw = this.LL;
                if (onw != null) {
                    onw.LJLILLLLZI = false;
                }
                FeedSurvey feedSurvey = this.LJLILLLLZI;
                String str2 = null;
                if (feedSurvey != null) {
                    str = feedSurvey.getId();
                } else {
                    str = null;
                }
                C26244ARs.LJIIIIZZ(str, option, true);
                if (!this.LLFZ) {
                    View view2 = this.LJLJLJ;
                    if (view2 != null) {
                        AnonymousClass030.LJ(view2, R.string.jih);
                    }
                    this.LLFZ = true;
                }
                if (option.getAdditional_content().length() == 0) {
                    FeedPromptApi.LIZ.getClass();
                    FeedPromptApi LIZ = C237639Uh.LIZ();
                    String name = option.getName();
                    this.LLFII.LJIIJ(new AqS160S0100000_10(option, 590));
                    int id = option.getId();
                    if (id != 1) {
                        if (id == 2 || id == 3) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 1;
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    Aweme aweme = this.LJLIL;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    }
                    AbstractC73638SvC<PromptTransformResp> promptTransform = LIZ.promptTransform(name, valueOf, str2, Boolean.FALSE);
                    if (promptTransform != null) {
                        this.LLFFF.LIZ(new C73469SsT(promptTransform.LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()), new ONA(this)).LJJII(new AfS53S0200000_4(option, this, 33), new AfS59S0200000_10(this, option, 9)));
                    }
                }
            }
        } else {
            LJIILLIIL(option);
        }
        ONW onw2 = this.LL;
        if (onw2 == null) {
            return;
        }
        onw2.notifyDataSetChanged();
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(operation, "operation");
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme2 = this.LJLIL;
        String str4 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (LIZ.LIZJ(this.LJLJJI, str)) {
            C61798ONe LIZ2 = C55016LiW.LIZ();
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null) {
                str3 = aweme3.getAid();
            } else {
                str3 = null;
            }
            C61811ONr LIZ3 = LIZ2.LIZ(str3);
            if (LIZ3 == null) {
                LIZ3 = new C61811ONr();
            }
            LJIIIZ(LIZ3, EnumC61773OMf.SWIPE, null);
        }
        if (!this.LLD.isEmpty()) {
            Option[] options = (Option[]) ((LinkedHashMap) this.LLD).values().toArray(new Option[0]);
            o.LJIIIZ(options, "options");
            Aweme aweme4 = this.LJLIL;
            EnumC61773OMf enumC61773OMf = EnumC61773OMf.SUBMIT;
            ON9.LIZJ(enumC61773OMf.getType(), aweme4, options);
            C61798ONe LIZ4 = C55016LiW.LIZ();
            Aweme aweme5 = this.LJLIL;
            if (aweme5 != null) {
                str2 = aweme5.getAid();
            } else {
                str2 = null;
            }
            C61811ONr LIZ5 = LIZ4.LIZ(str2);
            if (LIZ5 == null) {
                LIZ5 = new C61811ONr();
            }
            LJIIIZ(LIZ5, enumC61773OMf, options);
            C61798ONe LIZ6 = C55016LiW.LIZ();
            Aweme aweme6 = this.LJLIL;
            if (aweme6 != null) {
                str4 = aweme6.getAid();
            }
            LIZ6.LJFF(str4, new OMH(this.LJLJJI, false));
            OO3 oo3 = this.LJZL;
            if (oo3 != null) {
                oo3.LJIILL();
            }
            String LLD = ORZ.LLD(((LinkedHashMap) this.LLD).values(), ",", null, null, ONE.LJLIL, 30);
            this.LLFII.LJIIJ(new AqS39S1000000_1(LLD, 6));
            C2U8.LIZ(new C54984Li0(LLD, 20, Boolean.FALSE, 3, ORY.LJJJJLL(options, ",", null, null, OND.LJLIL, 30)));
            OIN oin = this.LJLJLLL;
            if (oin != null) {
                oin.postDelayed(new ARunnableS40S0100000_4(oin, 162), 200L);
            }
            ((LinkedHashMap) this.LLD).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    @Override // X.C90T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r5, android.content.Context r6, com.ss.android.ugc.aweme.feed.model.Aweme r7, android.view.View r8, android.view.View r9, android.view.View r10, android.view.View r11, X.OO3 r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ON8.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, X.OO3):void");
    }
}
