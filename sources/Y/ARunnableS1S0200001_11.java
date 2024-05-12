package Y;

import X.EnumC84152X0y;
import com.ss.android.ttvecamera.TECameraCapture;

/* loaded from: classes12.dex */
public class ARunnableS1S0200001_11 implements Runnable {
    public final int $t;
    public float f2;
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

    public static final void run$0(ARunnableS1S0200001_11 aRunnableS1S0200001_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS1S0200001_11.l1).setAperture((TECameraCapture) aRunnableS1S0200001_11.l0, aRunnableS1S0200001_11.f2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0200001_11 aRunnableS1S0200001_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS1S0200001_11.l1).setManualFocusDistance((TECameraCapture) aRunnableS1S0200001_11.l0, aRunnableS1S0200001_11.f2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0200001_11(EnumC84152X0y enumC84152X0y, TECameraCapture tECameraCapture, float f, int i) {
        this.$t = i;
        this.l1 = enumC84152X0y;
        this.l0 = tECameraCapture;
        this.f2 = f;
    }
}
