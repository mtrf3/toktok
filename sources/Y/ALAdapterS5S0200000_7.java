package Y;

import X.C29701Eo;
import X.C45765Hxh;
import X.EnumC45766Hxi;
import X.I55;
import X.InterfaceC45767Hxj;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ALAdapterS5S0200000_7 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                return;
            case 2:
                onAnimationCancel$1(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            case 3:
                onAnimationStart$1(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS5S0200000_7(DraftFragment draftFragment, int i) {
        this.$t = i;
        this.l0 = draftFragment;
        this.l1 = null;
    }

    public static final void onAnimationCancel$0(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C45765Hxh) aLAdapterS5S0200000_7.l0).LJLJJL = EnumC45766Hxi.NONE;
        ((C29701Eo) aLAdapterS5S0200000_7.l1).removeAllAnimatorListeners();
    }

    public static final void onAnimationCancel$1(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((View) aLAdapterS5S0200000_7.l0).setEnabled(true);
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        FrameLayout frameLayout = ((DraftFragment) aLAdapterS5S0200000_7.l0).LJLLJ;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = (View) aLAdapterS5S0200000_7.l1;
            if (view == null) {
                return;
            }
            view.setEnabled(true);
            return;
        }
        o.LJIJI("mLayoutDelete");
        throw null;
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45765Hxh c45765Hxh = (C45765Hxh) aLAdapterS5S0200000_7.l0;
        c45765Hxh.LJLJJL = EnumC45766Hxi.NONE;
        InterfaceC45767Hxj interfaceC45767Hxj = c45765Hxh.LJLJJI;
        if (interfaceC45767Hxj != null) {
            interfaceC45767Hxj.LIZ(true);
        }
        ((C29701Eo) aLAdapterS5S0200000_7.l1).removeAllAnimatorListeners();
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((View) aLAdapterS5S0200000_7.l0).setEnabled(true);
        CutMultiVideoViewModel cutMultiVideoViewModel = ((I55) aLAdapterS5S0200000_7.l1).LJLLILLLL;
        if (cutMultiVideoViewModel != null) {
            cutMultiVideoViewModel.LJLJJLL.setValue(null);
        } else {
            o.LJIJI("cutMultiVideoViewModel");
            throw null;
        }
    }

    public static final void onAnimationStart$0(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((View) aLAdapterS5S0200000_7.l0).setEnabled(false);
    }

    public static final void onAnimationStart$1(ALAdapterS5S0200000_7 aLAdapterS5S0200000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        FrameLayout frameLayout = ((DraftFragment) aLAdapterS5S0200000_7.l0).LJLLJ;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            View view = (View) aLAdapterS5S0200000_7.l1;
            if (view == null) {
                return;
            }
            view.setEnabled(true);
            return;
        }
        o.LJIJI("mLayoutDelete");
        throw null;
    }

    public ALAdapterS5S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
