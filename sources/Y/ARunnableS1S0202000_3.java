package Y;

import X.C8NR;
import X.C8NT;
import X.C8NW;
import android.content.Context;
import java.util.List;

/* loaded from: classes4.dex */
public class ARunnableS1S0202000_3 implements Runnable {
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

    public static final void run$0(ARunnableS1S0202000_3 aRunnableS1S0202000_3) {
        boolean LIZ;
        try {
            if (aRunnableS1S0202000_3.i2 == 2) {
                C8NR.LIZLLL(C8NT.LIZJ, (Context) aRunnableS1S0202000_3.l0, (List) aRunnableS1S0202000_3.l1, aRunnableS1S0202000_3.i3);
            } else {
                C8NR.LIZLLL(C8NW.LIZJ, (Context) aRunnableS1S0202000_3.l0, (List) aRunnableS1S0202000_3.l1, aRunnableS1S0202000_3.i3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0202000_3 aRunnableS1S0202000_3) {
        boolean LIZ;
        try {
            if (aRunnableS1S0202000_3.i2 == 2) {
                C8NR.LJFF(C8NT.LIZJ, (Context) aRunnableS1S0202000_3.l0, (List) aRunnableS1S0202000_3.l1, aRunnableS1S0202000_3.i3);
            } else {
                C8NR.LJFF(C8NW.LIZJ, (Context) aRunnableS1S0202000_3.l0, (List) aRunnableS1S0202000_3.l1, aRunnableS1S0202000_3.i3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0202000_3(int i, Context context, List list, int i2) {
        this.$t = i2;
        this.i2 = 2;
        this.l0 = context;
        this.l1 = list;
        this.i3 = i;
    }

    public ARunnableS1S0202000_3(int i, int i2, Context context, List list, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.l0 = context;
        this.l1 = list;
        this.i3 = i2;
    }
}
