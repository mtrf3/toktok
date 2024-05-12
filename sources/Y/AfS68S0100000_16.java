package Y;

import X.B43;
import X.BNM;
import X.C87671Yax;
import X.C87672Yay;
import X.C87677Yb3;
import X.C87678Yb4;
import X.C87681Yb7;
import X.C87682Yb8;
import X.C87840Ydg;
import X.C87841Ydh;
import X.InterfaceC64592gB;
import X.YXT;

/* loaded from: classes17.dex */
public class AfS68S0100000_16 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS68S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS68S0100000_16 afS68S0100000_16, Object obj) {
        ((C87840Ydg) afS68S0100000_16.l0).LIZ(((BNM) obj).LIZ.get(1));
    }

    public static final void accept$1(AfS68S0100000_16 afS68S0100000_16, Object obj) {
        ((C87841Ydh) afS68S0100000_16.l0).LIZ(((B43) obj).LIZ);
    }

    public static final void accept$2(AfS68S0100000_16 afS68S0100000_16, Object obj) {
        YXT yxt = (YXT) obj;
        if (yxt.LJLJI) {
            C87677Yb3 c87677Yb3 = (C87677Yb3) afS68S0100000_16.l0;
            c87677Yb3.LIZIZ(new C87671Yax(c87677Yb3, yxt));
        } else {
            C87677Yb3 c87677Yb32 = (C87677Yb3) afS68S0100000_16.l0;
            C87681Yb7 c87681Yb7 = new C87681Yb7(c87677Yb32, yxt);
            synchronized (c87677Yb32) {
                c87677Yb32.LIZ.LJFF(c87681Yb7);
            }
        }
    }

    public static final void accept$3(AfS68S0100000_16 afS68S0100000_16, Object obj) {
        YXT yxt = (YXT) obj;
        if (yxt.LJLJI) {
            C87678Yb4 c87678Yb4 = (C87678Yb4) afS68S0100000_16.l0;
            c87678Yb4.LIZIZ(new C87672Yay(c87678Yb4, yxt));
        } else {
            C87678Yb4 c87678Yb42 = (C87678Yb4) afS68S0100000_16.l0;
            C87682Yb8 c87682Yb8 = new C87682Yb8(c87678Yb42, yxt);
            synchronized (c87678Yb42) {
                c87678Yb42.LIZ.LJFF(c87682Yb8);
            }
        }
    }
}
