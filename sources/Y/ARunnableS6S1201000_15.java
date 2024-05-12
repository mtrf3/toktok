package Y;

import X.C86268XtQ;
import X.C86606Xys;
import X.C86622Xz8;
import X.InterfaceC37146Ehy;
import X.InterfaceC86630XzG;
import java.util.LinkedHashMap;

/* loaded from: classes16.dex */
public class ARunnableS6S1201000_15 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        InterfaceC86630XzG interfaceC86630XzG = ((C86606Xys) this.l1).LIZ.LJLJJI;
        C86622Xz8 c86622Xz8 = new C86622Xz8();
        c86622Xz8.LIZ = this.s0;
        c86622Xz8.LIZIZ = Integer.valueOf(this.i3);
        c86622Xz8.LIZJ = (LinkedHashMap) this.l2;
        c86622Xz8.LIZLLL = ((C86606Xys) this.l1).LIZ.LJLJJL;
        interfaceC86630XzG.LIZ(c86622Xz8, "");
    }

    public static final void run$0(ARunnableS6S1201000_15 aRunnableS6S1201000_15) {
        boolean LIZ;
        try {
            ((C86268XtQ) aRunnableS6S1201000_15.l1).LJLILLLLZI.LIZIZ();
            ((InterfaceC37146Ehy) aRunnableS6S1201000_15.l2).LIZ(aRunnableS6S1201000_15.i3, aRunnableS6S1201000_15.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S1201000_15 aRunnableS6S1201000_15) {
        boolean LIZ;
        try {
            aRunnableS6S1201000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S1201000_15(Object obj, Object obj2, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.i3 = i;
        this.s0 = str;
    }
}
