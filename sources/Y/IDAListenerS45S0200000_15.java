package Y;

import X.C89953fz;
import X.YKA;
import X.YKB;
import X.YKD;
import X.YKE;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDAListenerS45S0200000_15 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationRepeat$0(IDAListenerS45S0200000_15 iDAListenerS45S0200000_15, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS45S0200000_15 iDAListenerS45S0200000_15, Animator animator) {
        Context context = ((I18nSettingNewVersionFragment) iDAListenerS45S0200000_15.l1).getContext();
        if (context != null) {
            ((I18nSettingNewVersionFragment) iDAListenerS45S0200000_15.l1).mCommonProtocolItem.LJIIJJI(C89953fz.LIZ(context));
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS45S0200000_15 iDAListenerS45S0200000_15, Animator animator) {
        Context context = ((I18nSettingNewVersionFragment) iDAListenerS45S0200000_15.l1).getContext();
        if (context != null) {
            ((I18nSettingNewVersionFragment) iDAListenerS45S0200000_15.l1).mCommonProtocolItem.LJIIJJI(C89953fz.LIZ(context));
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS45S0200000_15 iDAListenerS45S0200000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (((YKA) iDAListenerS45S0200000_15.l0).LLF.contains((YKB) iDAListenerS45S0200000_15.l1)) {
            ((YKA) iDAListenerS45S0200000_15.l0).LLF.remove((YKB) iDAListenerS45S0200000_15.l1);
        }
        if (((YKA) iDAListenerS45S0200000_15.l0).LLF.size() <= 0) {
            YKA yka = (YKA) iDAListenerS45S0200000_15.l0;
            if (!yka.LLFZ) {
                yka.setVisibility(8);
            }
            ((YKA) iDAListenerS45S0200000_15.l0).LLIFFJFJJ = false;
        }
        YKB ykb = (YKB) iDAListenerS45S0200000_15.l1;
        if (ykb.LJIIJ) {
            YKD ykd = ykb.LJIIL;
            if (ykd != null) {
                ((YKA) iDAListenerS45S0200000_15.l0).LLFF.LIZ(ykd);
            }
        } else {
            YKE yke = ykb.LJIILIIL;
            if (yke != null) {
                ((YKA) iDAListenerS45S0200000_15.l0).LLFFF.LIZ(yke);
            }
        }
        YKB ykb2 = (YKB) iDAListenerS45S0200000_15.l1;
        ykb2.LJIIIIZZ = -1;
        ykb2.LJIIIZ = true;
    }

    public static final void onAnimationEnd$2(IDAListenerS45S0200000_15 iDAListenerS45S0200000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (((YKA) iDAListenerS45S0200000_15.l0).LLF.contains((YKB) iDAListenerS45S0200000_15.l1)) {
            ((YKA) iDAListenerS45S0200000_15.l0).LLF.remove((YKB) iDAListenerS45S0200000_15.l1);
        }
        if (((YKA) iDAListenerS45S0200000_15.l0).LLF.size() <= 0) {
            YKA yka = (YKA) iDAListenerS45S0200000_15.l0;
            if (!yka.LLFZ) {
                yka.setVisibility(8);
            }
            ((YKA) iDAListenerS45S0200000_15.l0).LLIFFJFJJ = false;
        }
        YKB ykb = (YKB) iDAListenerS45S0200000_15.l1;
        ykb.LJIIIIZZ = -1;
        ykb.LJIIIZ = true;
    }

    public static final void onAnimationStart$0(IDAListenerS45S0200000_15 iDAListenerS45S0200000_15, Animator animator) {
        ((I18nSettingNewVersionFragment) iDAListenerS45S0200000_15.l1).mCurrentAnimator = (ValueAnimator) iDAListenerS45S0200000_15.l0;
    }

    public IDAListenerS45S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
