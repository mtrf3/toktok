package Y;

import X.C91042ZoE;
import X.C91043ZoF;
import com.bytedance.bdlocation.LocationUtil;

/* loaded from: classes24.dex */
public class IDRunnableS87S0100000_28 implements Runnable {
    public final int $t;
    public Object l0;

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
        boolean isLocationEnabled = LocationUtil.isLocationEnabled();
        C91043ZoF c91043ZoF = ((C91042ZoE) this.l0).LIZ;
        if (c91043ZoF.LJ) {
            LocationUtil.uploadDeviceStatus("bdlocation_provider_status_change", 0);
            ((C91042ZoE) this.l0).LIZ.LJ = false;
        } else if (isLocationEnabled != c91043ZoF.LIZLLL) {
            LocationUtil.uploadDeviceStatus("bdlocation_provider_status_change", 0);
        }
        ((C91042ZoE) this.l0).LIZ.LIZLLL = isLocationEnabled;
    }

    public static final void run$0(IDRunnableS87S0100000_28 iDRunnableS87S0100000_28) {
        ((C91043ZoF) iDRunnableS87S0100000_28.l0).getClass();
        LocationUtil.uploadDeviceStatus("bdlocation_background_switch", 0);
    }

    public static final void run$1(IDRunnableS87S0100000_28 iDRunnableS87S0100000_28) {
        boolean LIZ;
        try {
            iDRunnableS87S0100000_28.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS87S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
