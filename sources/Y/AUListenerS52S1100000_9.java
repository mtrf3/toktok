package Y;

import X.C264612c;
import X.C57465Mgv;
import X.C57469Mgz;
import X.C7MY;
import X.C9IF;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility;

/* loaded from: classes10.dex */
public class AUListenerS52S1100000_9 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS52S1100000_9 aUListenerS52S1100000_9, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ProfileCTAAbility profileCTAAbility;
        int LIZIZ;
        Integer TE;
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZ;
        if (view != null) {
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = intValue;
            }
        } else {
            layoutParams = null;
        }
        View view2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        ProfileCTAAbility profileCTAAbility2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility2 != null && (TE = profileCTAAbility2.TE(aUListenerS52S1100000_9.s0)) != null) {
            i = TE.intValue();
        } else {
            i = 0;
        }
        if (intValue > (i / 3) * 2 && C57469Mgz.LJ() && (profileCTAAbility = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ) != null) {
            C9IF c9if = C9IF.FOLLOW;
            Integer TE2 = profileCTAAbility.TE(aUListenerS52S1100000_9.s0);
            if (TE2 != null) {
                LIZIZ = TE2.intValue();
            } else {
                LIZIZ = C7MY.LIZIZ(116);
            }
            profileCTAAbility.LT(c9if, LIZIZ);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS52S1100000_9 aUListenerS52S1100000_9, ValueAnimator valueAnimator) {
        int i;
        TuxTextView tY;
        TuxTextView tY2;
        Integer TE;
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZIZ;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = intValue;
        }
        View view2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZIZ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        ProfileCTAAbility profileCTAAbility = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility != null) {
            profileCTAAbility.LT(C9IF.MESSAGE, intValue);
        }
        ProfileCTAAbility profileCTAAbility2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility2 != null && (TE = profileCTAAbility2.TE(aUListenerS52S1100000_9.s0)) != null) {
            i = TE.intValue();
        } else {
            i = 0;
        }
        if (intValue > (i / 3) * 2) {
            ProfileCTAAbility profileCTAAbility3 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
            if (profileCTAAbility3 == null || (tY2 = profileCTAAbility3.tY(C9IF.MESSAGE)) == null) {
                return;
            }
            tY2.setAlpha(1.0f);
            return;
        }
        ProfileCTAAbility profileCTAAbility4 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility4 == null || (tY = profileCTAAbility4.tY(C9IF.MESSAGE)) == null) {
            return;
        }
        tY.setAlpha(0.0f);
    }

    public static final void onAnimationUpdate$2(AUListenerS52S1100000_9 aUListenerS52S1100000_9, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ProfileCTAAbility profileCTAAbility;
        Integer TE;
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZ;
        if (view != null) {
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = intValue;
            }
        } else {
            layoutParams = null;
        }
        View view2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        ProfileCTAAbility profileCTAAbility2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility2 != null) {
            profileCTAAbility2.LT(C9IF.FOLLOW, intValue);
        }
        ProfileCTAAbility profileCTAAbility3 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility3 != null && (TE = profileCTAAbility3.TE(aUListenerS52S1100000_9.s0)) != null) {
            i = TE.intValue();
        } else {
            i = 0;
        }
        if (intValue > (i / 3) * 2 && (profileCTAAbility = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ) != null) {
            profileCTAAbility.EY(C9IF.FOLLOW, aUListenerS52S1100000_9.s0);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS52S1100000_9 aUListenerS52S1100000_9, ValueAnimator valueAnimator) {
        int i;
        TuxTextView tY;
        TuxTextView tY2;
        Integer TE;
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZIZ;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = intValue;
        }
        ProfileCTAAbility profileCTAAbility = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility != null) {
            profileCTAAbility.LT(C9IF.MESSAGE, intValue);
        }
        View view2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZIZ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        ProfileCTAAbility profileCTAAbility2 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility2 != null && (TE = profileCTAAbility2.TE(aUListenerS52S1100000_9.s0)) != null) {
            i = TE.intValue();
        } else {
            i = 0;
        }
        if (intValue > (i / 3) * 2) {
            ProfileCTAAbility profileCTAAbility3 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
            if (profileCTAAbility3 == null || (tY2 = profileCTAAbility3.tY(C9IF.MESSAGE)) == null) {
                return;
            }
            tY2.setAlpha(1.0f);
            return;
        }
        ProfileCTAAbility profileCTAAbility4 = ((C57465Mgv) aUListenerS52S1100000_9.l1).LIZJ;
        if (profileCTAAbility4 == null || (tY = profileCTAAbility4.tY(C9IF.MESSAGE)) == null) {
            return;
        }
        tY.setAlpha(0.0f);
    }

    public AUListenerS52S1100000_9(C57465Mgv c57465Mgv, String str, int i) {
        this.$t = i;
        this.l1 = c57465Mgv;
        this.s0 = str;
    }
}
