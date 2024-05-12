package Y;

import X.AKT;
import X.C193077hv;
import X.C7OJ;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS0S1110000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
        AKT akt;
        if (!this.z2) {
            if (o.LJ(this.s0, ((C193077hv) this.l1).LJLIL) && (akt = ((C193077hv) this.l1).LJLILLLLZI) != null) {
                akt.LIZ.LJLIL.LJI = false;
                akt.LIZ();
            }
            AwemeCollectionAgent.LJIILLIIL().LIZJ(((C193077hv) this.l1).LJLJI);
        }
    }

    public static final void run$0(ARunnableS0S1110000_3 aRunnableS0S1110000_3) {
        boolean LIZ;
        try {
            aRunnableS0S1110000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1110000_3 aRunnableS0S1110000_3) {
        boolean LIZ;
        try {
            ((C7OJ) aRunnableS0S1110000_3.l1).LIZ(aRunnableS0S1110000_3.s0, aRunnableS0S1110000_3.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1110000_3(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
