package X;

import Y.ARunnableS45S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ4 implements F67 {
    public final /* synthetic */ LJ1 LJLIL;

    public LJ4(LJ1 lj1) {
        this.LJLIL = lj1;
    }

    @Override // X.F67
    public final void onChanged() {
        if (!o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
            C37179EiV.LIZ().post(new ARunnableS45S0100000_9(this.LJLIL, 105));
        } else {
            this.LJLIL.LIZ();
        }
    }
}
