package Y;

import X.C018905p;
import X.C47135Ieh;
import X.C47959Irz;
import X.C6WM;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDAListenerS0S0110000_2 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "p0");
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
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "p0");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS0S0110000_2 iDAListenerS0S0110000_2, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        int i;
        o.LJIIIZ(animator, "animator");
        C6WM c6wm = (C6WM) iDAListenerS0S0110000_2.l0;
        boolean z = iDAListenerS0S0110000_2.z1;
        View view = c6wm.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C018905p) {
            c018905p = (C018905p) layoutParams;
        } else {
            c018905p = null;
        }
        View view2 = c6wm.LJLJI;
        if (view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = layoutParams3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        int LIZ = C47135Ieh.LIZ(26, C47959Irz.LIZJ(9, i));
        if (z) {
            if (c018905p != null) {
                c018905p.bottomToTop = R.id.iq3;
                c018905p.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = 0;
            }
            View view3 = c6wm.LJLJLJ;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        } else {
            if (c018905p != null) {
                c018905p.topToTop = R.id.j71;
                c018905p.bottomToTop = -1;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = LIZ;
            }
            View view4 = c6wm.LJLJLJ;
            if (view4 != null) {
                view4.setVisibility(4);
            }
        }
        View view5 = c6wm.LJLILLLLZI;
        if (view5 == null) {
            return;
        }
        view5.setLayoutParams(c018905p);
    }

    public static final void onAnimationEnd$1(IDAListenerS0S0110000_2 iDAListenerS0S0110000_2, Animator p0) {
        o.LJIIIZ(p0, "p0");
        if (!iDAListenerS0S0110000_2.z1) {
            View view = (View) iDAListenerS0S0110000_2.l0;
            o.LJIIIZ(view, "<this>");
            view.setVisibility(8);
        }
    }

    public static final void onAnimationStart$1(IDAListenerS0S0110000_2 iDAListenerS0S0110000_2, Animator p0) {
        o.LJIIIZ(p0, "p0");
        if (iDAListenerS0S0110000_2.z1) {
            View view = (View) iDAListenerS0S0110000_2.l0;
            o.LJIIIZ(view, "<this>");
            view.setVisibility(0);
        }
    }

    public IDAListenerS0S0110000_2(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
