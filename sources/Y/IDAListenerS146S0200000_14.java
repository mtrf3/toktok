package Y;

import X.AbstractC81349VwH;
import X.C76800UCe;
import X.C81359VwR;
import X.C81360VwS;
import X.C81361VwT;
import X.C81362VwU;
import X.C81556Vzc;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import android.view.animation.Animation;

/* loaded from: classes15.dex */
public class IDAListenerS146S0200000_14 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationEnd$0(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
    }

    public static final void onAnimationEnd$2(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
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
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
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
                onAnimationStart$0(this, animation);
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

    public static final void onAnimationEnd$1(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        Animation.AnimationListener animationListener = (Animation.AnimationListener) iDAListenerS146S0200000_14.l0;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
        ((AbstractC81349VwH) iDAListenerS146S0200000_14.l1).LIZIZ(true);
    }

    public static final void onAnimationEnd$3(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        C81556Vzc c81556Vzc = (C81556Vzc) iDAListenerS146S0200000_14.l0;
        c81556Vzc.LLIIII--;
        long nanoTime = System.nanoTime();
        C81556Vzc c81556Vzc2 = (C81556Vzc) iDAListenerS146S0200000_14.l0;
        float f = ((float) (nanoTime - c81556Vzc2.LLIIIILZ)) / 1.0E9f;
        float f2 = c81556Vzc2.LLIIII / f;
        InterfaceC88473Ynt<? super Float, ? super Float, ? super Integer, C76800UCe> interfaceC88473Ynt = c81556Vzc2.LJZI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Float.valueOf(f2), Float.valueOf(f), Integer.valueOf(((C81556Vzc) iDAListenerS146S0200000_14.l0).LLIIII));
        }
        C81556Vzc c81556Vzc3 = (C81556Vzc) iDAListenerS146S0200000_14.l0;
        c81556Vzc3.LLFII = false;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c81556Vzc3.LJZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationRepeat$0(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        C81361VwT c81361VwT = (C81361VwT) iDAListenerS146S0200000_14.l0;
        c81361VwT.LJIIJJI = c81361VwT.LJ;
        c81361VwT.LJIIL = c81361VwT.LJFF;
        c81361VwT.LJIILIIL = c81361VwT.LJI;
        c81361VwT.LIZIZ((c81361VwT.LJIIJ + 1) % c81361VwT.LJIIIZ.length);
        C81361VwT c81361VwT2 = (C81361VwT) iDAListenerS146S0200000_14.l0;
        c81361VwT2.LJ = c81361VwT2.LJFF;
        c81361VwT2.LIZ();
        C81359VwR c81359VwR = (C81359VwR) iDAListenerS146S0200000_14.l1;
        if (c81359VwR.LJLL) {
            c81359VwR.LJLL = false;
            animation.setDuration(1332L);
            C81361VwT c81361VwT3 = (C81361VwT) iDAListenerS146S0200000_14.l0;
            if (c81361VwT3.LJIILJJIL) {
                c81361VwT3.LJIILJJIL = false;
                c81361VwT3.LIZ();
                return;
            }
            return;
        }
        c81359VwR.LJLJL = (c81359VwR.LJLJL + 1.0f) % 5.0f;
    }

    public static final void onAnimationRepeat$1(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        Animation.AnimationListener animationListener = (Animation.AnimationListener) iDAListenerS146S0200000_14.l0;
        if (animationListener != null) {
            animationListener.onAnimationRepeat(animation);
        }
    }

    public static final void onAnimationRepeat$2(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        C81362VwU c81362VwU = (C81362VwU) iDAListenerS146S0200000_14.l0;
        c81362VwU.LJIIJJI = c81362VwU.LJ;
        c81362VwU.LJIIL = c81362VwU.LJFF;
        c81362VwU.LJIILIIL = c81362VwU.LJI;
        c81362VwU.LIZIZ((c81362VwU.LJIIJ + 1) % c81362VwU.LJIIIZ.length);
        C81362VwU c81362VwU2 = (C81362VwU) iDAListenerS146S0200000_14.l0;
        c81362VwU2.LJ = c81362VwU2.LJFF;
        c81362VwU2.LIZ();
        C81360VwS c81360VwS = (C81360VwS) iDAListenerS146S0200000_14.l1;
        if (c81360VwS.LJLL) {
            c81360VwS.LJLL = false;
            animation.setDuration(1332L);
            C81362VwU c81362VwU3 = (C81362VwU) iDAListenerS146S0200000_14.l0;
            if (c81362VwU3.LJIILJJIL) {
                c81362VwU3.LJIILJJIL = false;
                c81362VwU3.LIZ();
                return;
            }
            return;
        }
        c81360VwS.LJLJL = (c81360VwS.LJLJL + 1.0f) % 5.0f;
    }

    public static final void onAnimationStart$0(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        ((C81359VwR) iDAListenerS146S0200000_14.l1).LJLJL = 0.0f;
    }

    public static final void onAnimationStart$1(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        Animation.AnimationListener animationListener = (Animation.AnimationListener) iDAListenerS146S0200000_14.l0;
        if (animationListener != null) {
            animationListener.onAnimationStart(animation);
        }
    }

    public static final void onAnimationStart$2(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        ((C81360VwS) iDAListenerS146S0200000_14.l1).LJLJL = 0.0f;
    }

    public static final void onAnimationStart$3(IDAListenerS146S0200000_14 iDAListenerS146S0200000_14, Animation animation) {
        C81556Vzc c81556Vzc = (C81556Vzc) iDAListenerS146S0200000_14.l0;
        c81556Vzc.LLIIII = 0;
        ((Animation) iDAListenerS146S0200000_14.l1).getDuration();
        c81556Vzc.getClass();
    }

    public IDAListenerS146S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
