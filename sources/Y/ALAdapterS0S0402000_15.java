package Y;

import X.C86991YCd;
import X.C87000YCm;
import X.C87005YCr;
import X.C87009YCv;
import X.C87010YCw;
import X.C87013YCz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ALAdapterS0S0402000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
                onAnimationCancel$3(this, animator);
                return;
            case 4:
                onAnimationCancel$4(this, animator);
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
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                onAnimationStart$4(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (aLAdapterS0S0402000_15.i4 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationX(0.0f);
        }
        if (aLAdapterS0S0402000_15.i5 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationY(0.0f);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (aLAdapterS0S0402000_15.i4 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationX(0.0f);
        }
        if (aLAdapterS0S0402000_15.i5 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationY(0.0f);
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (aLAdapterS0S0402000_15.i4 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationX(0.0f);
        }
        if (aLAdapterS0S0402000_15.i5 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationY(0.0f);
        }
    }

    public static final void onAnimationCancel$3(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (aLAdapterS0S0402000_15.i4 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationX(0.0f);
        }
        if (aLAdapterS0S0402000_15.i5 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationY(0.0f);
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (aLAdapterS0S0402000_15.i4 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationX(0.0f);
        }
        if (aLAdapterS0S0402000_15.i5 != 0) {
            ((View) aLAdapterS0S0402000_15.l2).setTranslationY(0.0f);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS0S0402000_15.l3).setListener(null);
        ((C86991YCd) aLAdapterS0S0402000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C86991YCd) aLAdapterS0S0402000_15.l0).LJIILLIIL.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C86991YCd) aLAdapterS0S0402000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS0S0402000_15.l3).LIZ(null);
        ((C87009YCv) aLAdapterS0S0402000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87009YCv) aLAdapterS0S0402000_15.l0).LJIJ.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87009YCv) aLAdapterS0S0402000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS0S0402000_15.l3).LIZ(null);
        ((C87010YCw) aLAdapterS0S0402000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87010YCw) aLAdapterS0S0402000_15.l0).LJIILL.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87010YCw) aLAdapterS0S0402000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS0S0402000_15.l3).setListener(null);
        ((C87000YCm) aLAdapterS0S0402000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87000YCm) aLAdapterS0S0402000_15.l0).LJIIZILJ.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87000YCm) aLAdapterS0S0402000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$4(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS0S0402000_15.l3).setListener(null);
        ((C87005YCr) aLAdapterS0S0402000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87005YCr) aLAdapterS0S0402000_15.l0).LJIIZILJ.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_15.l1);
        ((C87005YCr) aLAdapterS0S0402000_15.l0).LJJIFFI();
    }

    public static final void onAnimationStart$0(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C86991YCd) aLAdapterS0S0402000_15.l0).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87009YCv) aLAdapterS0S0402000_15.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87010YCw) aLAdapterS0S0402000_15.l0).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87000YCm) aLAdapterS0S0402000_15.l0).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS0S0402000_15 aLAdapterS0S0402000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87005YCr) aLAdapterS0S0402000_15.l0).getClass();
    }

    public ALAdapterS0S0402000_15(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.l1 = obj2;
        this.i4 = i;
        this.l2 = obj3;
        this.i5 = i2;
        this.l3 = obj4;
    }
}
