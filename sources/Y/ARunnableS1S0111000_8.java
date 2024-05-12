package Y;

import X.AbstractC46746IWg;
import X.C46728IVo;
import X.C78977Uz7;
import X.InterfaceC47046IdG;
import X.J4K;
import X.J4Y;
import X.J6U;
import X.X1D;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ARunnableS1S0111000_8 implements Runnable {
    public final int $t;
    public int i2;
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
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS1S0111000_8 aRunnableS1S0111000_8) {
        C46728IVo.LJII((Aweme) aRunnableS1S0111000_8.l0, aRunnableS1S0111000_8.i2, aRunnableS1S0111000_8.z1);
    }

    public static final void run$1(ARunnableS1S0111000_8 aRunnableS1S0111000_8) {
        J4K j4k = (J4K) aRunnableS1S0111000_8.l0;
        boolean z = aRunnableS1S0111000_8.z1;
        int i = aRunnableS1S0111000_8.i2;
        if (j4k.LJFF.isEmpty()) {
            return;
        }
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.onPredictResultChanged real in success:");
            LIZ.append(z);
            LIZ.append(" errCode:");
            LIZ.append(i);
            LIZ.append(" lastResult:");
            LIZ.append(j4k.LJFF());
            X1D.LIZIZ(LIZ);
        }
        synchronized (j4k.LJFF) {
            for (int i2 = 0; i2 < j4k.LJFF.size(); i2++) {
                J4Y j4y = j4k.LJFF.get(i2);
                if (j4y != null) {
                    j4y.LIZ(j4k.LJFF(), i, z);
                }
            }
        }
    }

    public static final void run$2(ARunnableS1S0111000_8 aRunnableS1S0111000_8) {
        switch (aRunnableS1S0111000_8.i2) {
            case 0:
                ((InterfaceC47046IdG) aRunnableS1S0111000_8.l0).onResult(Boolean.valueOf(aRunnableS1S0111000_8.z1));
                return;
            case 1:
                C78977Uz7.LJJLIIIIJ(new ARunnableS11S0110000_5((Fragment) aRunnableS1S0111000_8.l0, aRunnableS1S0111000_8.z1, 4));
                return;
            default:
                AbstractC46746IWg this$0 = (AbstractC46746IWg) aRunnableS1S0111000_8.l0;
                boolean z = aRunnableS1S0111000_8.z1;
                o.LJIIIZ(this$0, "this$0");
                this$0.LIZJ = z;
                return;
        }
    }

    public ARunnableS1S0111000_8(Fragment fragment, boolean z, int i) {
        this.$t = i;
        this.i2 = 1;
        this.z1 = z;
        this.l0 = fragment;
    }

    public ARunnableS1S0111000_8(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
