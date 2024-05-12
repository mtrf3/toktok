package X;

import Y.IDHandlerS21S0100000_8;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class IF0 implements Executor {
    public final /* synthetic */ IH1 LJLIL;

    public IF0(IH1 ih1) {
        this.LJLIL = ih1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this.LJLIL.LIZLLL;
        if (iDHandlerS21S0100000_8 != null) {
            iDHandlerS21S0100000_8.post(runnable);
        }
    }
}
