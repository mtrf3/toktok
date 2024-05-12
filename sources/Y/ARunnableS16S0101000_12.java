package Y;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateCTNViewModel;

/* loaded from: classes13.dex */
public class ARunnableS16S0101000_12 implements Runnable {
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

    public static final void run$0(ARunnableS16S0101000_12 aRunnableS16S0101000_12) {
        boolean LIZ;
        try {
            ((AgeGateCTNViewModel) aRunnableS16S0101000_12.l0).LJLILLLLZI.postValue(Integer.valueOf(aRunnableS16S0101000_12.i1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S0101000_12 aRunnableS16S0101000_12) {
        boolean LIZ;
        try {
            ((ViewGroup) aRunnableS16S0101000_12.l0).setVisibility(aRunnableS16S0101000_12.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS16S0101000_12(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
