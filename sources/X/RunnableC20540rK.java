package X;

import androidx.work.impl.WorkDatabase;
import java.util.HashMap;

/* renamed from: X.0rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC20540rK implements Runnable {
    public final C1OU LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    static {
        C0VW.LIZIZ("StopWorkRunnable");
    }

    public final void LIZ() {
        boolean containsKey;
        boolean LJIIJ;
        C1OU c1ou = this.LJLIL;
        WorkDatabase workDatabase = c1ou.LIZJ;
        C1OR c1or = c1ou.LJFF;
        InterfaceC19390pT LJJ = workDatabase.LJJ();
        workDatabase.LIZJ();
        try {
            String str = this.LJLILLLLZI;
            synchronized (c1or.LJLLI) {
                containsKey = ((HashMap) c1or.LJLJJLL).containsKey(str);
            }
            if (this.LJLJI) {
                LJIIJ = this.LJLIL.LJFF.LJIIIZ(this.LJLILLLLZI);
            } else {
                if (!containsKey) {
                    C1Y1 c1y1 = (C1Y1) LJJ;
                    if (c1y1.LJFF(this.LJLILLLLZI) == EnumC08510Vb.RUNNING) {
                        c1y1.LJIILL(EnumC08510Vb.ENQUEUED, this.LJLILLLLZI);
                    }
                }
                LJIIJ = this.LJLIL.LJFF.LJIIJ(this.LJLILLLLZI);
            }
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.LJLILLLLZI, Boolean.valueOf(LJIIJ)});
            LIZ.getClass();
            workDatabase.LJIILLIIL();
        } finally {
            workDatabase.LJIIJJI();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC20540rK(C1OU c1ou, String str, boolean z) {
        this.LJLIL = c1ou;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
