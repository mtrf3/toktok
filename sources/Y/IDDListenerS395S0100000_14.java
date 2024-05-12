package Y;

import X.C16300kU;
import X.C80475ViB;
import X.C80844Vo8;
import X.C80943Vpj;
import X.C81144Vsy;
import X.VRK;
import android.view.ViewTreeObserver;

/* loaded from: classes15.dex */
public class IDDListenerS395S0100000_14 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    public static final boolean onPreDraw$4(IDDListenerS395S0100000_14 iDDListenerS395S0100000_14) {
        boolean lambda$new$0;
        lambda$new$0 = ((VRK) iDDListenerS395S0100000_14.l0).lambda$new$0();
        return lambda$new$0;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            case 4:
                return onPreDraw$4(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS395S0100000_14 iDDListenerS395S0100000_14) {
        C16300kU.LJIIJ((C80943Vpj) iDDListenerS395S0100000_14.l0);
        ((C80943Vpj) iDDListenerS395S0100000_14.l0).getClass();
        return true;
    }

    public static final boolean onPreDraw$1(IDDListenerS395S0100000_14 iDDListenerS395S0100000_14) {
        C81144Vsy c81144Vsy = (C81144Vsy) iDDListenerS395S0100000_14.l0;
        if (!c81144Vsy.LJLJJL) {
            return true;
        }
        c81144Vsy.LJLLILLLL.removeCallbacks(c81144Vsy.LJLLJ);
        C81144Vsy c81144Vsy2 = (C81144Vsy) iDDListenerS395S0100000_14.l0;
        int i = c81144Vsy2.LJLJLLL + 1;
        c81144Vsy2.LJLJLLL = i;
        if (i > 60) {
            c81144Vsy2.LJLLILLLL.post(c81144Vsy2.LJLLJ);
        } else {
            c81144Vsy2.LJLLILLLL.postDelayed(c81144Vsy2.LJLLJ, 40L);
        }
        return true;
    }

    public static final boolean onPreDraw$2(IDDListenerS395S0100000_14 iDDListenerS395S0100000_14) {
        C80475ViB c80475ViB = (C80475ViB) iDDListenerS395S0100000_14.l0;
        float rotation = c80475ViB.LJIIZILJ.getRotation();
        if (c80475ViB.LJIIJJI != rotation) {
            c80475ViB.LJIIJJI = rotation;
            c80475ViB.LJIIJ();
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$3(IDDListenerS395S0100000_14 iDDListenerS395S0100000_14) {
        ((C80844Vo8) iDDListenerS395S0100000_14.l0).getViewTreeObserver().removeOnPreDrawListener(iDDListenerS395S0100000_14);
        C80844Vo8 c80844Vo8 = (C80844Vo8) iDDListenerS395S0100000_14.l0;
        if (c80844Vo8.LJLJJL) {
            return false;
        }
        c80844Vo8.LJLJJL = true;
        c80844Vo8.setScrollX(c80844Vo8.LJLLLL * C80844Vo8.LJZL);
        return false;
    }

    public IDDListenerS395S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
