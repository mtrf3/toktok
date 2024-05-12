package Y;

import X.C43622HAc;
import X.C45146Hni;
import X.C73411SrX;
import X.C87677Yb3;
import X.C87678Yb4;
import X.InterfaceC29937Boz;
import X.InterfaceC65784Pro;
import X.QXX;
import X.QZV;

/* loaded from: classes8.dex */
public class IDaS218S0100000_7 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS218S0100000_7 iDaS218S0100000_7) {
        C73411SrX c73411SrX;
        C73411SrX c73411SrX2 = ((C43622HAc) iDaS218S0100000_7.l0).LIZLLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = ((C43622HAc) iDaS218S0100000_7.l0).LIZLLL) != null) {
            c73411SrX.dispose();
        }
    }

    public static final void run$1(IDaS218S0100000_7 iDaS218S0100000_7) {
        ((InterfaceC65784Pro) iDaS218S0100000_7.l0).invoke();
    }

    public static final void run$2(IDaS218S0100000_7 iDaS218S0100000_7) {
        ((C45146Hni) iDaS218S0100000_7.l0).LIZ();
    }

    public static final void run$3(IDaS218S0100000_7 iDaS218S0100000_7) {
        C87677Yb3 c87677Yb3 = (C87677Yb3) iDaS218S0100000_7.l0;
        c87677Yb3.getClass();
        C87677Yb3.LIZ("close speedProbe start", true);
        QZV qzv = c87677Yb3.LIZJ;
        if (qzv != null) {
            qzv.stop();
        }
        QZV qzv2 = c87677Yb3.LIZJ;
        if (qzv2 != null) {
            qzv2.LJII();
        }
        c87677Yb3.LIZJ = null;
        C87677Yb3.LIZ("close speedProbe finish", true);
    }

    public static final void run$4(IDaS218S0100000_7 iDaS218S0100000_7) {
        C87678Yb4 c87678Yb4 = (C87678Yb4) iDaS218S0100000_7.l0;
        c87678Yb4.getClass();
        C87678Yb4.LIZ("close speedProbe start", true);
        QXX qxx = c87678Yb4.LIZJ;
        if (qxx != null) {
            qxx.LLLLLL();
        }
        QXX qxx2 = c87678Yb4.LIZJ;
        if (qxx2 != null) {
            qxx2.LJLJJL();
        }
        c87678Yb4.LIZJ = null;
        C87678Yb4.LIZ("close speedProbe finish", true);
    }

    public IDaS218S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
