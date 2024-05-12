package Y;

import X.C111734a1;
import X.C17N;
import X.C4RD;
import X.C4RF;
import X.C78996UzQ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ALAdapterS0S0110000_1 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0110000_1 aLAdapterS0S0110000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0110000_1.z1) {
            C17N.LJJLIIIJJI(((C111734a1) aLAdapterS0S0110000_1.l0).LIZ(R.id.cue));
            C111734a1 c111734a1 = (C111734a1) aLAdapterS0S0110000_1.l0;
            TuxTextView tuxTextView = c111734a1.LJLJI;
            if (C78996UzQ.LJJIIJZLJL(tuxTextView)) {
                C78996UzQ.LJI();
            }
            c111734a1.removeView(tuxTextView);
            ((C111734a1) aLAdapterS0S0110000_1.l0).LJLJI = null;
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0110000_1 aLAdapterS0S0110000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0110000_1.z1) {
            C17N.LJJLIIIJJI(((C111734a1) aLAdapterS0S0110000_1.l0).LIZ(R.id.iot));
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0110000_1 aLAdapterS0S0110000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0110000_1.z1) {
            C4RF c4rf = ((C4RD) aLAdapterS0S0110000_1.l0).LIZIZ;
            if (c4rf != null) {
                View LJII = c4rf.LJII();
                if (LJII != null) {
                    LJII.setVisibility(8);
                }
            } else {
                o.LJIJI("realImChannel");
                throw null;
            }
        } else {
            ((C4RD) aLAdapterS0S0110000_1.l0).LIZ.LIZLLL.setVisibility(8);
        }
        C4RF c4rf2 = ((C4RD) aLAdapterS0S0110000_1.l0).LIZIZ;
        if (c4rf2 != null) {
            c4rf2.p6(aLAdapterS0S0110000_1.z1);
        } else {
            o.LJIJI("realImChannel");
            throw null;
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0110000_1 aLAdapterS0S0110000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0110000_1.z1) {
            ((C111734a1) aLAdapterS0S0110000_1.l0).LIZ(R.id.cue).setVisibility(4);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0110000_1 aLAdapterS0S0110000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0110000_1.z1) {
            ((C111734a1) aLAdapterS0S0110000_1.l0).LIZ(R.id.iot).setVisibility(4);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS0S0110000_1 aLAdapterS0S0110000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS0S0110000_1.z1) {
            ((C4RD) aLAdapterS0S0110000_1.l0).LIZ.LIZLLL.setVisibility(0);
        }
    }

    public ALAdapterS0S0110000_1(boolean z, Object obj, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
