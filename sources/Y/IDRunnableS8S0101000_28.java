package Y;

import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.client.BDLocationConfig;

/* loaded from: classes24.dex */
public class IDRunnableS8S0101000_28 implements Runnable {
    public final int $t;
    public int i1;
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

    public static final void run$0(IDRunnableS8S0101000_28 iDRunnableS8S0101000_28) {
        boolean LIZ;
        try {
            BDLocationConfig.addNotification((LocationNotification) iDRunnableS8S0101000_28.l0, iDRunnableS8S0101000_28.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS8S0101000_28 iDRunnableS8S0101000_28) {
        boolean LIZ;
        try {
            BDLocationConfig.removeNotification((LocationNotification) iDRunnableS8S0101000_28.l0, iDRunnableS8S0101000_28.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS8S0101000_28(LocationNotification locationNotification, int i, int i2) {
        this.$t = i2;
        this.l0 = locationNotification;
        this.i1 = i;
    }
}
