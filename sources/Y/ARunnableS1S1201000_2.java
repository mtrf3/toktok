package Y;

import X.C133925Nk;
import X.C151325wm;
import X.InterfaceC133955Nn;
import X.InterfaceC151245we;
import com.ss.android.ttve.nativePort.TEImageInterface;

/* loaded from: classes3.dex */
public class ARunnableS1S1201000_2 implements Runnable {
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

    public static final void run$0(ARunnableS1S1201000_2 aRunnableS1S1201000_2) {
        boolean LIZ;
        try {
            TEImageInterface tEImageInterface = ((C151325wm) aRunnableS1S1201000_2.l1).LJII;
            if (tEImageInterface != null) {
                tEImageInterface.addNewLayer(aRunnableS1S1201000_2.s0, aRunnableS1S1201000_2.i3, false);
            }
            ((InterfaceC151245we) aRunnableS1S1201000_2.l2).onLayerAdded();
            ((C151325wm) aRunnableS1S1201000_2.l1).LIZIZ();
            C151325wm c151325wm = (C151325wm) aRunnableS1S1201000_2.l1;
            c151325wm.getClass();
            c151325wm.LJ(null, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1201000_2 aRunnableS1S1201000_2) {
        boolean LIZ;
        try {
            int i = aRunnableS1S1201000_2.i3;
            if (i < 0) {
                InterfaceC133955Nn interfaceC133955Nn = (InterfaceC133955Nn) aRunnableS1S1201000_2.l1;
                String str = aRunnableS1S1201000_2.s0;
                if (str == null) {
                    str = "";
                }
                interfaceC133955Nn.onCompileError(i, i, 0.0f, str);
            } else {
                ((InterfaceC133955Nn) aRunnableS1S1201000_2.l1).onCompileDone();
            }
            ((C133925Nk) aRunnableS1S1201000_2.l2).LIZ.LJ = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1201000_2(Object obj, Object obj2, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.i3 = i;
        this.s0 = str;
    }
}
