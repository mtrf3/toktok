package Y;

import X.C1300058i;
import X.C58E;
import X.C5BZ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ALAdapterS0S0101001_2 extends AnimatorListenerAdapter {
    public final int $t;
    public float f2;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
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
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0101001_2 aLAdapterS0S0101001_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C58E) aLAdapterS0S0101001_2.l0).LJLIL.setVisibility(aLAdapterS0S0101001_2.i1);
        List<C1300058i> dropList = ((C58E) aLAdapterS0S0101001_2.l0).LJLIL.getDropList();
        float f = aLAdapterS0S0101001_2.f2;
        Iterator<C1300058i> it = dropList.iterator();
        while (it.hasNext()) {
            C5BZ LIZ = it.next().LIZ();
            LIZ.setScaleX(f);
            LIZ.setScaleY(f);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS0S0101001_2 aLAdapterS0S0101001_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C58E) aLAdapterS0S0101001_2.l0).LJLILLLLZI.setVisibility(aLAdapterS0S0101001_2.i1);
        ((C58E) aLAdapterS0S0101001_2.l0).LJLILLLLZI.setAlpha(aLAdapterS0S0101001_2.f2);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0101001_2 aLAdapterS0S0101001_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C58E) aLAdapterS0S0101001_2.l0).LJLIL.setVisibility(aLAdapterS0S0101001_2.i1);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0101001_2 aLAdapterS0S0101001_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C58E) aLAdapterS0S0101001_2.l0).LJLILLLLZI.setVisibility(aLAdapterS0S0101001_2.i1);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0101001_2 aLAdapterS0S0101001_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        int i = aLAdapterS0S0101001_2.i1;
        if (i == 0) {
            ((C58E) aLAdapterS0S0101001_2.l0).LJLIL.setVisibility(i);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0101001_2 aLAdapterS0S0101001_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        int i = aLAdapterS0S0101001_2.i1;
        if (i == 0) {
            ((C58E) aLAdapterS0S0101001_2.l0).LJLILLLLZI.setVisibility(i);
        }
    }

    public ALAdapterS0S0101001_2(int i, C58E c58e, float f, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = c58e;
        this.f2 = f;
    }
}
