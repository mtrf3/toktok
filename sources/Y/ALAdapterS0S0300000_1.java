package Y;

import X.AnonymousClass357;
import X.C107794Kx;
import X.C107834Lb;
import X.C115674gN;
import X.C115684gO;
import X.C16880lQ;
import X.C17N;
import X.C29701Eo;
import X.C34B;
import X.C76800UCe;
import X.EnumC95013o9;
import X.InterfaceC65784Pro;
import X.ViewOnClickListenerC85343Wo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ALAdapterS0S0300000_1 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
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

    public static final void onAnimationCancel$0(ALAdapterS0S0300000_1 aLAdapterS0S0300000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C34B.LIZIZ("SwipeForReplyIntroductionHelper", "on animation cancel");
        C107834Lb c107834Lb = (C107834Lb) aLAdapterS0S0300000_1.l0;
        C29701Eo c29701Eo = (C29701Eo) aLAdapterS0S0300000_1.l1;
        ConstraintLayout constraintLayout = (ConstraintLayout) aLAdapterS0S0300000_1.l2;
        c107834Lb.getClass();
        c29701Eo.removeAllAnimatorListeners();
        if (constraintLayout != null) {
            C17N.LJJIIJZLJL(constraintLayout);
        }
        c107834Lb.LIZIZ.kv0(EnumC95013o9.FULL);
        c107834Lb.LJII = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0300000_1 aLAdapterS0S0300000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C115674gN c115674gN = C115674gN.LIZ;
        C107794Kx c107794Kx = (C107794Kx) aLAdapterS0S0300000_1.l0;
        Aweme aweme = (Aweme) aLAdapterS0S0300000_1.l1;
        C115684gO c115684gO = (C115684gO) aLAdapterS0S0300000_1.l2;
        c115674gN.getClass();
        if (c115684gO == null) {
            return;
        }
        View view = c115684gO.LIZIZ;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS27S0300000_1(c107794Kx, c115684gO, aweme, 0), view);
        }
        C115674gN.LIZLLL(c107794Kx, c115684gO);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0300000_1 aLAdapterS0S0300000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass357) aLAdapterS0S0300000_1.l0).LIZ.setScaleX(1.0f);
        ((AnonymousClass357) aLAdapterS0S0300000_1.l0).LIZ.setScaleY(1.0f);
        ViewOnClickListenerC85343Wo viewOnClickListenerC85343Wo = (ViewOnClickListenerC85343Wo) aLAdapterS0S0300000_1.l1;
        AnonymousClass357 anonymousClass357 = (AnonymousClass357) aLAdapterS0S0300000_1.l0;
        viewOnClickListenerC85343Wo.getClass();
        anonymousClass357.LIZ.setVisibility(8);
        viewOnClickListenerC85343Wo.o0();
        ((InterfaceC65784Pro) aLAdapterS0S0300000_1.l2).invoke();
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0300000_1 aLAdapterS0S0300000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C34B.LIZIZ("SwipeForReplyIntroductionHelper", "on animation end");
        C107834Lb c107834Lb = (C107834Lb) aLAdapterS0S0300000_1.l0;
        C29701Eo c29701Eo = (C29701Eo) aLAdapterS0S0300000_1.l1;
        ConstraintLayout constraintLayout = (ConstraintLayout) aLAdapterS0S0300000_1.l2;
        c107834Lb.getClass();
        c29701Eo.removeAllAnimatorListeners();
        if (constraintLayout != null) {
            C17N.LJJIIJZLJL(constraintLayout);
        }
        c107834Lb.LIZIZ.kv0(EnumC95013o9.FULL);
        c107834Lb.LJII = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS0S0300000_1(Object obj, AnonymousClass357 anonymousClass357, ViewOnClickListenerC85343Wo viewOnClickListenerC85343Wo, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = anonymousClass357;
        this.l2 = viewOnClickListenerC85343Wo;
    }
}
