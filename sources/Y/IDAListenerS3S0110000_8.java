package Y;

import X.C48740JAy;
import X.LFH;
import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDAListenerS3S0110000_8 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
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
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS3S0110000_8 iDAListenerS3S0110000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (((BaseAutoScrollUIComponent) iDAListenerS3S0110000_8.l0).getContainerView() == null) {
            return;
        }
        if (iDAListenerS3S0110000_8.z1) {
            ((BaseAutoScrollUIComponent) iDAListenerS3S0110000_8.l0).getContainerView().setVisibility(0);
            ((BaseAutoScrollUIComponent) iDAListenerS3S0110000_8.l0).getContainerView().setAlpha(1.0f);
            return;
        }
        ((BaseAutoScrollUIComponent) iDAListenerS3S0110000_8.l0).getContainerView().setVisibility(8);
        ((BaseAutoScrollUIComponent) iDAListenerS3S0110000_8.l0).getContainerView().setAlpha(0.0f);
        if (!(((BaseAutoScrollUIComponent) iDAListenerS3S0110000_8.l0) instanceof AutoScrollComponent)) {
            return;
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJII(false);
    }

    public static final void onAnimationEnd$1(IDAListenerS3S0110000_8 iDAListenerS3S0110000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (iDAListenerS3S0110000_8.z1) {
            View view = ((C48740JAy) iDAListenerS3S0110000_8.l0).LIZJ;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = ((C48740JAy) iDAListenerS3S0110000_8.l0).LIZJ;
            if (view2 == null) {
                return;
            }
            view2.setAlpha(1.0f);
            return;
        }
        View view3 = ((C48740JAy) iDAListenerS3S0110000_8.l0).LIZJ;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = ((C48740JAy) iDAListenerS3S0110000_8.l0).LIZJ;
        if (view4 == null) {
            return;
        }
        view4.setAlpha(0.0f);
    }

    public IDAListenerS3S0110000_8(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
