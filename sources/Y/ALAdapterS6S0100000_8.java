package Y;

import X.AbstractC50059Jkl;
import X.AbstractC51310KBu;
import X.AbstractC51311KBv;
import X.ActivityC45651qj;
import X.C17N;
import X.C29701Eo;
import X.C50321Joz;
import X.C50322Jp0;
import X.C50605JtZ;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51312KBw;
import X.C51313KBx;
import X.C51452KHg;
import X.C51606KNe;
import X.C51607KNf;
import X.EnumC49652JeC;
import X.JE9;
import X.JEG;
import X.K30;
import X.K32;
import X.KLD;
import X.TMC;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ALAdapterS6S0100000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationCancel$0(this, animator);
                return;
            case 10:
                onAnimationCancel$1(this, animator);
                return;
            case 15:
                onAnimationCancel$2(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            case 14:
                onAnimationEnd$14(this, animator);
                return;
            case 15:
                onAnimationEnd$15(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                onAnimationStart$1(this, animator);
                return;
            case 6:
                onAnimationStart$2(this, animator);
                return;
            case 7:
                onAnimationStart$3(this, animator);
                return;
            case 8:
                onAnimationStart$4(this, animator);
                return;
            case 9:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            default:
                super.onAnimationStart(animator);
                return;
            case 10:
                onAnimationStart$5(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationStart$6(this, animator);
                return;
            case 14:
                onAnimationStart$7(this, animator);
                return;
            case 15:
                o.LJIIIZ(animator, "animation");
                return;
        }
    }

    public ALAdapterS6S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aLAdapterS6S0100000_8.l0;
        searchContainerHeaderVM.LJZ = null;
        searchContainerHeaderVM.LJLJLJ.setValue(0);
        ((SearchContainerHeaderVM) aLAdapterS6S0100000_8.l0).LJLJJLL.setValue(0);
    }

    public static final void onAnimationCancel$1(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((KLD) aLAdapterS6S0100000_8.l0).LJLJJLL.setColor(C51452KHg.LIZ);
    }

    public static final void onAnimationCancel$2(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aLAdapterS6S0100000_8.l0;
        searchContainerHeaderVM.LJLLLL = EnumC49652JeC.END;
        searchContainerHeaderVM.LJLZ = null;
        searchContainerHeaderVM.LJLJLJ.setValue(0);
        ((SearchContainerHeaderVM) aLAdapterS6S0100000_8.l0).LJLJJLL.setValue(0);
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((JEG) aLAdapterS6S0100000_8.l0).LIZLLL("move");
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!((FashionMallFragment) aLAdapterS6S0100000_8.l0).LJLLILLLL) {
            View _$_findCachedViewById = ((FashionMallFragment) aLAdapterS6S0100000_8.l0)._$_findCachedViewById(R.id.d2t);
            if (_$_findCachedViewById == null) {
                return;
            }
            _$_findCachedViewById.setVisibility(4);
            return;
        }
        View _$_findCachedViewById2 = ((FashionMallFragment) aLAdapterS6S0100000_8.l0)._$_findCachedViewById(R.id.d2t);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$10(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((KLD) aLAdapterS6S0100000_8.l0).LJLJJLL.setColor(C51452KHg.LIZ);
    }

    public static final void onAnimationEnd$11(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C51606KNe c51606KNe = (C51606KNe) aLAdapterS6S0100000_8.l0;
        c51606KNe.removeCallbacks(c51606KNe.LJZL);
        C51607KNf c51607KNf = c51606KNe.LJLLLL;
        if (c51607KNf != null && !c51607KNf.LJII) {
            c51607KNf.LJII = true;
        }
        if (c51606KNe.LJJJIL()) {
            c51606KNe.setTextDirection(4);
            c51606KNe.setLayoutDirection(1);
            c51606KNe.invalidate();
            c51606KNe.requestLayout();
        }
        c51606KNe.postDelayed(c51606KNe.LJZL, 1500L);
    }

    public static final void onAnimationEnd$12(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        String str;
        int i;
        SearchSurveyConfig searchSurveyConfig;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        o.LJIIIZ(animation, "animation");
        ActivityC45651qj activityC45651qj = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLILLLLZI;
        String str2 = null;
        if (activityC45651qj != null) {
            String LIZIZ = C50605JtZ.LIZIZ(activityC45651qj);
            ActivityC45651qj activityC45651qj2 = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLILLLLZI;
            if (activityC45651qj2 != null) {
                ISearchContextAbility LJJJJJL = C17N.LJJJJJL(activityC45651qj2);
                if (LJJJJJL != null && (If = LJJJJJL.If()) != null && (LIZJ = If.LIZJ()) != null) {
                    C50652JuK.Companion.getClass();
                    TMC.LJIIJ(C50651JuJ.LJIIJ(activityC45651qj2), LIZJ, "SurveyExtension 46");
                }
                C50652JuK.Companion.getClass();
                C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(activityC45651qj2);
                K32 k32 = new K32();
                if (LJIIJJI != null) {
                    str = LJIIJJI.getSearchId();
                } else {
                    str = null;
                }
                k32.LJIIZILJ("search_id", str);
                if (LJIIJJI != null) {
                    i = LJIIJJI.getTabIndex();
                } else {
                    i = -1;
                }
                k32.LJIIZILJ("search_type", C50605JtZ.LJFF(i));
                if (LJIIJJI != null) {
                    str2 = LJIIJJI.getSearchKeyword();
                }
                k32.LJIIZILJ("search_keyword", str2);
                k32.LJIJI(LIZIZ);
                k32.LJIILIIL();
                K30 LIZ = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LIZ();
                SurveyViewController surveyViewController = LIZ.LIZ.get();
                if (surveyViewController != null && (searchSurveyConfig = surveyViewController.LJLLI) != null) {
                    long showDuration = searchSurveyConfig.getShowDuration();
                    LIZ.removeMessages(2);
                    LIZ.sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis(showDuration));
                    return;
                }
                return;
            }
            o.LJIJI("activity");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    public static final void onAnimationEnd$13(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((SurveyViewController) aLAdapterS6S0100000_8.l0).LIZJ(1000L);
    }

    public static final void onAnimationEnd$14(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SurveyViewController surveyViewController = (SurveyViewController) aLAdapterS6S0100000_8.l0;
        C29701Eo c29701Eo = surveyViewController.LJLL;
        if (c29701Eo != null) {
            c29701Eo.addAnimatorListener(new ALAdapterS6S0100000_8(surveyViewController, 13));
            C29701Eo c29701Eo2 = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLL;
            if (c29701Eo2 != null) {
                c29701Eo2.playAnimation();
                return;
            } else {
                o.LJIJI("lottieView");
                throw null;
            }
        }
        o.LJIJI("lottieView");
        throw null;
    }

    public static final void onAnimationEnd$15(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aLAdapterS6S0100000_8.l0;
        searchContainerHeaderVM.LJLLLL = EnumC49652JeC.END;
        searchContainerHeaderVM.LJLZ = null;
        if (searchContainerHeaderVM.LJLLL) {
            searchContainerHeaderVM.hv0();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ImageView) aLAdapterS6S0100000_8.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$3(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((SurveyViewController) aLAdapterS6S0100000_8.l0).LIZLLL();
    }

    public static final void onAnimationEnd$4(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aLAdapterS6S0100000_8.l0;
        searchContainerHeaderVM.LJZ = null;
        searchContainerHeaderVM.LJLLLLLL = EnumC49652JeC.END;
        searchContainerHeaderVM.LLFF = true;
    }

    public static final void onAnimationEnd$5(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C51312KBw c51312KBw = (C51312KBw) ((AbstractC51310KBu) aLAdapterS6S0100000_8.l0);
        c51312KBw.LJ.setVisibility(8);
        c51312KBw.LIZJ = 160;
        c51312KBw.LJFF = C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        ((AbstractC51310KBu) aLAdapterS6S0100000_8.l0).LIZLLL = 1;
    }

    public static final void onAnimationEnd$6(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C51312KBw c51312KBw = (C51312KBw) ((AbstractC51310KBu) aLAdapterS6S0100000_8.l0);
        c51312KBw.LIZJ = 160;
        c51312KBw.LJFF = C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        ((AbstractC51310KBu) aLAdapterS6S0100000_8.l0).LIZLLL = 0;
    }

    public static final void onAnimationEnd$7(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C51313KBx c51313KBx = (C51313KBx) ((AbstractC51311KBv) aLAdapterS6S0100000_8.l0);
        c51313KBx.LJ.setVisibility(8);
        c51313KBx.LIZJ = 160;
        c51313KBx.LJFF = C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        ((AbstractC51311KBv) aLAdapterS6S0100000_8.l0).LIZLLL = 1;
    }

    public static final void onAnimationEnd$8(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C51313KBx c51313KBx = (C51313KBx) ((AbstractC51311KBv) aLAdapterS6S0100000_8.l0);
        c51313KBx.LIZJ = 160;
        c51313KBx.LJFF = C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        ((AbstractC51311KBv) aLAdapterS6S0100000_8.l0).LIZLLL = 0;
    }

    public static final void onAnimationEnd$9(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((JE9) aLAdapterS6S0100000_8.l0).LJLL;
        if (view != null) {
            view.setVisibility(4);
        } else {
            o.LJIJI("transitionLayer");
            throw null;
        }
    }

    public static final void onAnimationStart$1(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationStart(animator);
        C51312KBw c51312KBw = (C51312KBw) ((AbstractC51310KBu) aLAdapterS6S0100000_8.l0);
        c51312KBw.LJ.setTranslationY(0.0f);
        c51312KBw.LJ.setAlpha(1.0f);
    }

    public static final void onAnimationStart$2(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationStart(animator);
        C51312KBw c51312KBw = (C51312KBw) ((AbstractC51310KBu) aLAdapterS6S0100000_8.l0);
        c51312KBw.LJ.setVisibility(0);
        c51312KBw.LJ.setTranslationY(c51312KBw.LJFF);
        c51312KBw.LJ.setAlpha(0.0f);
    }

    public static final void onAnimationStart$3(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationStart(animator);
        C51313KBx c51313KBx = (C51313KBx) ((AbstractC51311KBv) aLAdapterS6S0100000_8.l0);
        c51313KBx.LJ.setTranslationY(0.0f);
        c51313KBx.LJ.setAlpha(1.0f);
    }

    public static final void onAnimationStart$4(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animator) {
        super.onAnimationStart(animator);
        C51313KBx c51313KBx = (C51313KBx) ((AbstractC51311KBv) aLAdapterS6S0100000_8.l0);
        c51313KBx.LJ.setVisibility(0);
        c51313KBx.LJ.setTranslationY(c51313KBx.LJFF);
        c51313KBx.LJ.setAlpha(0.0f);
    }

    public static final void onAnimationStart$5(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((KLD) aLAdapterS6S0100000_8.l0).LJLJJLL.setColor(0);
    }

    public static final void onAnimationStart$6(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLL;
        if (c29701Eo != null) {
            c29701Eo.setAlpha(1.0f);
        } else {
            o.LJIJI("lottieView");
            throw null;
        }
    }

    public static final void onAnimationStart$7(ALAdapterS6S0100000_8 aLAdapterS6S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLJLLL;
        if (view != null) {
            view.setVisibility(0);
            C29701Eo c29701Eo = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLL;
            if (c29701Eo != null) {
                c29701Eo.setAlpha(0.0f);
                ViewGroup viewGroup = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLJJLL;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                    TextView textView = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLJLJ;
                    if (textView != null) {
                        textView.setVisibility(8);
                        TextView textView2 = ((SurveyViewController) aLAdapterS6S0100000_8.l0).LJLJJL;
                        if (textView2 != null) {
                            textView2.setText(R.string.psq);
                            return;
                        } else {
                            o.LJIJI("titleText");
                            throw null;
                        }
                    }
                    o.LJIJI("starDesc");
                    throw null;
                }
                o.LJIJI("starGroupLayout");
                throw null;
            }
            o.LJIJI("lottieView");
            throw null;
        }
        o.LJIJI("lottieGroup");
        throw null;
    }
}
