package Y;

import X.C16880lQ;
import X.C201697vp;
import X.C2NF;
import X.C46251IDf;
import X.C63081OpJ;
import X.C76800UCe;
import X.C77557UcD;
import X.IEZ;
import X.IWF;
import X.InterfaceC88471Ynr;
import X.NQH;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public class ARunnableS5S0200100_8 implements Runnable {
    public final int $t;
    public long j2;
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

    public final void LIZ$0() {
        long currentPosition;
        if (((Aweme) this.l0) == ((C2NF) this.l1).LIZIZ) {
            NQH LIZ = C201697vp.LIZ();
            IEZ LIZ2 = C46251IDf.LIZ();
            if (C63081OpJ.LJLJI(((C2NF) this.l1).LIZIZ) && LIZ != null) {
                currentPosition = LIZ.getCurrentPosition();
            } else if (C63081OpJ.LJLLLL(((C2NF) this.l1).LIZIZ) && LIZ2 != null) {
                currentPosition = LIZ2.getCurrentPosition();
            } else {
                currentPosition = IWF.LJJLIIIIJ().getCurrentPosition();
            }
            if (currentPosition < 0) {
                currentPosition = 0;
            }
            C2NF c2nf = (C2NF) this.l1;
            c2nf.getClass();
            if (currentPosition >= 0 || (currentPosition < this.j2 && c2nf.LIZJ > 0)) {
                Runnable runnable = c2nf.LIZLLL;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                ((C2NF) this.l1).LIZLLL = null;
                return;
            }
            this.j2 = currentPosition;
            c2nf.LIZ.postDelayed(this, 1000L);
        }
    }

    public static final void run$0(ARunnableS5S0200100_8 aRunnableS5S0200100_8) {
        boolean LIZ;
        try {
            ((InterfaceC88471Ynr) aRunnableS5S0200100_8.l0).invoke(Long.valueOf(aRunnableS5S0200100_8.j2), Integer.valueOf(((C77557UcD) aRunnableS5S0200100_8.l1).getComboCount()));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0200100_8 aRunnableS5S0200100_8) {
        boolean LIZ;
        try {
            aRunnableS5S0200100_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0200100_8(C2NF c2nf, int i) {
        this.$t = i;
        this.l1 = c2nf;
        this.l0 = c2nf.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:java.lang.Object), (r0 I:Y.ARunnableS5S0200100_8) (LINE:67108871) Y.ARunnableS5S0200100_8.l1 java.lang.Object, block:B:1:0x0000 */
    public ARunnableS5S0200100_8(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super Long, ? super Integer, C76800UCe> interfaceC88471Ynr2, long j, C77557UcD c77557UcD) {
        Object obj;
        this.$t = c77557UcD;
        this.l0 = interfaceC88471Ynr;
        this.j2 = interfaceC88471Ynr2;
        this.l1 = obj;
    }
}
