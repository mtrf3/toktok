package Y;

import X.C27052AjY;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDAListenerS231S0100000_4 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$2(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
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
                onAnimationEnd$2(this, animation);
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
                o.LJIIIZ(animation, "animation");
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
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
                o.LJIIIZ(animation, "animation");
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

    public IDAListenerS231S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
        o.LJIIIZ(animation, "animation");
        ((View) iDAListenerS231S0100000_4.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$1(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((BaseMyProfileGuideWidget) iDAListenerS231S0100000_4.l0).LJLJJLL;
        if (view != null) {
            view.setLayerType(0, null);
        }
    }

    public static final void onAnimationEnd$3(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
        ((C27052AjY) iDAListenerS231S0100000_4.l0).setVisibility(8);
        ((C27052AjY) iDAListenerS231S0100000_4.l0).setClickable(false);
        View view = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLIL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    public static final void onAnimationStart$2(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ((C27052AjY) iDAListenerS231S0100000_4.l0).setVisibility(0);
        ((C27052AjY) iDAListenerS231S0100000_4.l0).setClickable(true);
        View view = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLIL;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLILLLLZI;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLIL;
        if (view3 != null && (animate2 = view3.animate()) != null && (duration2 = animate2.setDuration(300L)) != null) {
            duration2.alpha(1.0f);
        }
        View view4 = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLILLLLZI;
        if (view4 != null && (animate = view4.animate()) != null && (duration = animate.setDuration(300L)) != null) {
            duration.alpha(1.0f);
        }
    }

    public static final void onAnimationStart$3(IDAListenerS231S0100000_4 iDAListenerS231S0100000_4, Animation animation) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        View view = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLIL;
        if (view != null && (animate2 = view.animate()) != null && (duration2 = animate2.setDuration(300L)) != null) {
            duration2.alpha(0.0f);
        }
        View view2 = ((C27052AjY) iDAListenerS231S0100000_4.l0).LJLILLLLZI;
        if (view2 != null && (animate = view2.animate()) != null && (duration = animate.setDuration(300L)) != null) {
            duration.alpha(0.0f);
        }
    }
}
