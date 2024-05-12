package Y;

import X.AnonymousClass673;
import X.C131425Du;
import X.C156556Cl;
import X.C5EJ;
import X.C63E;
import X.C65C;
import X.C67C;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ARunnableS9S0000000_2 implements Runnable {
    public final int $t;

    public static final void run$1(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

    public static final void run$2(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

    public static final void run$3(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

    public static final void run$4(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

    public static final void run$5(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

    public static final void run$6(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

    public static final void run$7(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
    }

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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public ARunnableS9S0000000_2(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS9S0000000_2 aRunnableS9S0000000_2) {
        boolean LIZ;
        try {
            synchronized (C131425Du.LIZ) {
                Iterator<C5EJ> it = C131425Du.LIZJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0000000_2(double d, int i) {
        this.$t = i;
    }

    public ARunnableS9S0000000_2(int i, int i2) {
        this.$t = i2;
    }

    public ARunnableS9S0000000_2(C63E c63e, int i) {
        this.$t = i;
    }

    public ARunnableS9S0000000_2(C65C c65c, int i) {
        this.$t = i;
    }

    public ARunnableS9S0000000_2(AnonymousClass673 anonymousClass673, int i) {
        this.$t = i;
    }

    public ARunnableS9S0000000_2(C67C c67c, int i) {
        this.$t = i;
    }

    public ARunnableS9S0000000_2(C156556Cl c156556Cl, int i) {
        this.$t = i;
    }
}
