package Y;

import X.C27389Aoz;
import X.C78443UqV;
import X.C78565UsT;
import X.InterfaceC88472Yns;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS5S0301000_4 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS5S0301000_4 aRunnableS5S0301000_4) {
        boolean LIZ;
        try {
            DistrictVm districtVm = (DistrictVm) aRunnableS5S0301000_4.l0;
            C78565UsT.LJJIJIL(districtVm, new C27389Aoz((Fragment) aRunnableS5S0301000_4.l1, districtVm, aRunnableS5S0301000_4.i3, (FragmentManager) aRunnableS5S0301000_4.l2, null));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0301000_4 aRunnableS5S0301000_4) {
        float f;
        switch (aRunnableS5S0301000_4.i3) {
            case 0:
                Object obj = aRunnableS5S0301000_4.l0;
                Throwable th = (Throwable) aRunnableS5S0301000_4.l1;
                String str = (String) aRunnableS5S0301000_4.l2;
                obj.getClass();
                C78443UqV.LJJI().ensureNotReachHere(th, str);
                return;
            default:
                View view = (View) aRunnableS5S0301000_4.l0;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) aRunnableS5S0301000_4.l1;
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aRunnableS5S0301000_4.l2;
                if (view != null) {
                    f = view.getAlpha();
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, 1.0f);
                o.LJIIIIZZ(ofFloat, "ofFloat(view, \"alpha\", startAlpha, 1f)");
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(animatorUpdateListener);
                ofFloat.addListener(new IDAListenerS73S0100000_4(animatorListener, 12));
                ofFloat.setDuration(300L);
                ofFloat.start();
                return;
        }
    }

    public static final void run$2(ARunnableS5S0301000_4 aRunnableS5S0301000_4) {
        boolean LIZ;
        try {
            if (((View) aRunnableS5S0301000_4.l0).findViewById(R.id.i3s) == null) {
                ViewGroup viewGroup = (ViewGroup) ((View) aRunnableS5S0301000_4.l0).findViewById(aRunnableS5S0301000_4.i3);
                if (viewGroup != null) {
                    viewGroup.addView((View) aRunnableS5S0301000_4.l1, 0);
                }
                ((InterfaceC88472Yns) aRunnableS5S0301000_4.l2).invoke((View) aRunnableS5S0301000_4.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0301000_4(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
