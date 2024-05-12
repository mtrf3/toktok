package Y;

import X.C1046648w;
import X.C109174Qf;
import X.C17N;
import X.C4S3;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDAListenerS229S0100000_1 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$1(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
    }

    public static final void onAnimationStart$3(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                o.LJIIIZ(animation, "animation");
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animation, "animation");
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                o.LJIIIZ(animation, "animation");
                return;
            case 3:
                onAnimationRepeat$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animation, "animation");
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            case 3:
                onAnimationStart$3(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS229S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
        o.LJIIIZ(animation, "animation");
        C109174Qf c109174Qf = (C109174Qf) iDAListenerS229S0100000_1.l0;
        if (c109174Qf.LJLJJL) {
            c109174Qf.setVisibility(8);
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
        FrameLayout frameLayout = ((C1046648w) iDAListenerS229S0100000_1.l0).LIZ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$3(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
        C17N.LJJIIJZLJL((View) iDAListenerS229S0100000_1.l0);
    }

    public static final void onAnimationStart$2(IDAListenerS229S0100000_1 iDAListenerS229S0100000_1, Animation animation) {
        o.LJIIIZ(animation, "animation");
        C4S3 c4s3 = (C4S3) iDAListenerS229S0100000_1.l0;
        c4s3.LJIILL.startAnimation(c4s3.LJIIJ);
        ((C4S3) iDAListenerS229S0100000_1.l0).LJIILL.setVisibility(0);
    }
}
