package Y;

import X.C35704Dzo;
import X.C38566FBq;
import X.FM0;
import X.FMA;
import X.IDP;
import android.content.Context;

/* loaded from: classes7.dex */
public class ARunnableS12S0110000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void run$0(ARunnableS12S0110000_6 aRunnableS12S0110000_6) {
        IDP idp = (IDP) aRunnableS12S0110000_6.l0;
        boolean z = aRunnableS12S0110000_6.z1;
        idp.getClass();
        idp.LLIIIJ(1, null, !z, C35704Dzo.LJI());
    }

    public static final void run$1(ARunnableS12S0110000_6 aRunnableS12S0110000_6) {
        boolean LIZ;
        try {
            FM0.LIZ.LJJIFFI(new FMA()).LJJJJZI(new AfS36S0101000_5(3, (Context) aRunnableS12S0110000_6.l0, 39));
            C38566FBq.LIZ((Context) aRunnableS12S0110000_6.l0, aRunnableS12S0110000_6.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS12S0110000_6(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
