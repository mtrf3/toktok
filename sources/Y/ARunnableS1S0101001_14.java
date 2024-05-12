package Y;

import X.C83332WnA;
import X.C83622Wrq;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes15.dex */
public class ARunnableS1S0101001_14 implements Runnable {
    public final int $t;
    public float f2;
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

    public static final void run$0(ARunnableS1S0101001_14 aRunnableS1S0101001_14) {
        C83622Wrq.S1((C83622Wrq) aRunnableS1S0101001_14.l0, aRunnableS1S0101001_14.i1, aRunnableS1S0101001_14.f2);
    }

    public static final void run$1(ARunnableS1S0101001_14 aRunnableS1S0101001_14) {
        boolean LIZ;
        try {
            if (((C83332WnA) aRunnableS1S0101001_14.l0).N().getParent() != null) {
                ((LinearLayoutManager) ((C83332WnA) aRunnableS1S0101001_14.l0).LJLJJL.getValue()).LJFF(aRunnableS1S0101001_14.i1, (int) aRunnableS1S0101001_14.f2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0101001_14(Object obj, int i, float f, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
        this.f2 = f;
    }
}
