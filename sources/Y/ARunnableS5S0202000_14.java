package Y;

import X.C63922P6w;
import X.C63973P8v;
import X.C79646VNq;
import X.EnumC84152X0y;
import X.PZA;
import X.X1D;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.core.JSProxy;

/* loaded from: classes15.dex */
public class ARunnableS5S0202000_14 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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
        synchronized (((EnumC84152X0y) this.l1).mStateLock) {
            if (((EnumC84152X0y) this.l1).mCurrentCameraState != 3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Can not takePicture on state : ");
                LIZ.append(((EnumC84152X0y) this.l1).mCurrentCameraState);
                String LIZIZ = X1D.LIZIZ(LIZ);
                ((EnumC84152X0y) this.l1).mCameraObserver.onError(-105, LIZIZ);
                C63922P6w.LIZIZ("TECameraServer", LIZIZ);
                PZA pza = (PZA) this.l0;
                if (pza != null) {
                    ((C63973P8v) pza).LIZIZ(new Exception(LIZIZ));
                }
                return;
            }
            EnumC84152X0y enumC84152X0y = (EnumC84152X0y) this.l1;
            if (enumC84152X0y.mCameraSettings.LJLILLLLZI == 1) {
                enumC84152X0y.updateCameraState(2);
            }
            if (((EnumC84152X0y) this.l1).mCameraInstance != null) {
                ((EnumC84152X0y) this.l1).mCameraInstance.LLJLL(this.i2, this.i3, (PZA) this.l0);
            }
        }
    }

    public static final void run$0(ARunnableS5S0202000_14 aRunnableS5S0202000_14) {
        boolean LIZ;
        try {
            aRunnableS5S0202000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0202000_14 aRunnableS5S0202000_14) {
        boolean LIZ;
        try {
            JSProxy jSProxy = ((C79646VNq) aRunnableS5S0202000_14.l1).LJIIZILJ.get();
            if (jSProxy != null) {
                jSProxy.LIZIZ(aRunnableS5S0202000_14.i2, aRunnableS5S0202000_14.i3, (JavaOnlyMap) aRunnableS5S0202000_14.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0202000_14(Object obj, Object obj2, int i, int i2, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.l0 = obj2;
        this.i2 = i;
        this.i3 = i2;
    }
}
