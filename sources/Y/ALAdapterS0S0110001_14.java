package Y;

import X.C0IB;
import X.C44253HYj;
import X.I3K;
import X.WLC;
import X.WM7;
import X.WUU;
import X.WUV;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ALAdapterS0S0110001_14 extends AnimatorListenerAdapter {
    public final int $t;
    public float f2;
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

    public static final void onAnimationEnd$0(ALAdapterS0S0110001_14 aLAdapterS0S0110001_14, Animator animation) {
        I3K splitShootApiComponent;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!aLAdapterS0S0110001_14.z1) {
            ((WLC) aLAdapterS0S0110001_14.l0).kY(false, false);
            if (C44253HYj.LIZ(((WLC) aLAdapterS0S0110001_14.l0).getShortVideoContext()) && (splitShootApiComponent = ((WLC) aLAdapterS0S0110001_14.l0).getSplitShootApiComponent()) != null) {
                splitShootApiComponent.gd0(true);
            }
        }
        ((WLC) aLAdapterS0S0110001_14.l0).LLFFF.LJI(Float.valueOf(1.0f));
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0110001_14 aLAdapterS0S0110001_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!aLAdapterS0S0110001_14.z1) {
            ((WUU) aLAdapterS0S0110001_14.l0).s3(false);
            ((WUU) aLAdapterS0S0110001_14.l0).i7(false);
        }
        View view = ((WUU) aLAdapterS0S0110001_14.l0).LJJLJ().mView;
        if (view == null) {
            return;
        }
        view.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0110001_14 aLAdapterS0S0110001_14, Animator animation) {
        WM7 wm7;
        View view;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!aLAdapterS0S0110001_14.z1) {
            ((WUV) aLAdapterS0S0110001_14.l0).s3(false);
            ((WUV) aLAdapterS0S0110001_14.l0).i7(false);
        }
        Object obj = ((WUV) aLAdapterS0S0110001_14.l0).LLIIL;
        if (!(obj instanceof WM7) || (wm7 = (WM7) obj) == null || (view = wm7.mView) == null) {
            return;
        }
        view.setAlpha(1.0f);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0110001_14 aLAdapterS0S0110001_14, Animator animation) {
        boolean z;
        I3K splitShootApiComponent;
        C0IB<Integer> Ig0;
        Integer LIZ;
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((WLC) aLAdapterS0S0110001_14.l0).LLFFF.LJI(Float.valueOf(aLAdapterS0S0110001_14.f2));
        I3K splitShootApiComponent2 = ((WLC) aLAdapterS0S0110001_14.l0).getSplitShootApiComponent();
        if (splitShootApiComponent2 == null || (Ig0 = splitShootApiComponent2.Ig0()) == null || (LIZ = Ig0.LIZ()) == null || LIZ.intValue() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (aLAdapterS0S0110001_14.z1) {
            ((WLC) aLAdapterS0S0110001_14.l0).kY(true, false);
            if (!z && (splitShootApiComponent = ((WLC) aLAdapterS0S0110001_14.l0).getSplitShootApiComponent()) != null) {
                splitShootApiComponent.VV(8);
            }
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0110001_14 aLAdapterS0S0110001_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        View view = ((WUU) aLAdapterS0S0110001_14.l0).LJJLJ().mView;
        if (view != null) {
            view.setAlpha(aLAdapterS0S0110001_14.f2);
        }
        if (aLAdapterS0S0110001_14.z1) {
            ((WUU) aLAdapterS0S0110001_14.l0).s3(true);
            ((WUU) aLAdapterS0S0110001_14.l0).i7(true);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS0S0110001_14 aLAdapterS0S0110001_14, Animator animation) {
        WM7 wm7;
        View view;
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        Object obj = ((WUV) aLAdapterS0S0110001_14.l0).LLIIL;
        if ((obj instanceof WM7) && (wm7 = (WM7) obj) != null && (view = wm7.mView) != null) {
            view.setAlpha(aLAdapterS0S0110001_14.f2);
        }
        if (aLAdapterS0S0110001_14.z1) {
            ((WUV) aLAdapterS0S0110001_14.l0).s3(true);
            ((WUV) aLAdapterS0S0110001_14.l0).i7(true);
        }
    }

    public ALAdapterS0S0110001_14(Object obj, float f, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f2 = f;
        this.z1 = z;
    }
}
