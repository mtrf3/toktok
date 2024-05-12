package Y;

import X.C16N;
import X.C16R;
import X.C29306Beo;
import X.InterfaceC03360Bg;
import android.view.View;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public class IDAListenerS228S0100000 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
    }

    public static final void onAnimationStart$2(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
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
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS228S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
        InterfaceC03360Bg interfaceC03360Bg;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) iDAListenerS228S0100000.l0;
        if (swipeRefreshLayout.LJLJI) {
            swipeRefreshLayout.LLFZ.setAlpha(255);
            ((SwipeRefreshLayout) iDAListenerS228S0100000.l0).LLFZ.start();
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) iDAListenerS228S0100000.l0;
            if (swipeRefreshLayout2.LLIIIJ && (interfaceC03360Bg = swipeRefreshLayout2.LJLILLLLZI) != null) {
                interfaceC03360Bg.LJ();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) iDAListenerS228S0100000.l0;
            swipeRefreshLayout3.LJLLJ = swipeRefreshLayout3.LJZL.getTop();
            return;
        }
        swipeRefreshLayout.LJFF();
    }

    public static final void onAnimationEnd$1(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) iDAListenerS228S0100000.l0;
        if (!swipeRefreshLayout.LJZ) {
            C16R c16r = new C16R(swipeRefreshLayout);
            swipeRefreshLayout.LLIFFJFJJ = c16r;
            c16r.setDuration(150L);
            C16N c16n = swipeRefreshLayout.LJZL;
            c16n.LJLIL = null;
            c16n.clearAnimation();
            swipeRefreshLayout.LJZL.startAnimation(swipeRefreshLayout.LLIFFJFJJ);
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS228S0100000 iDAListenerS228S0100000, Animation animation) {
        C29306Beo.LJI((View) iDAListenerS228S0100000.l0);
    }
}
