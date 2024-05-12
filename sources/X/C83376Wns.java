package X;

import Y.ARunnableS33S0200000_14;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Wns, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83376Wns {
    public final C83381Wnx LIZ;
    public InterfaceC83392Wo8 LIZIZ;
    public final ExecutorService LIZJ;

    public C83376Wns(C83381Wnx stateMachine) {
        o.LJIIIZ(stateMachine, "stateMachine");
        this.LIZ = stateMachine;
        this.LIZJ = C16880lQ.LLLLZLLIL();
    }

    public final void LIZ(AbstractC83369Wnl message) {
        o.LJIIIZ(message, "message");
        this.LIZJ.execute(new ARunnableS33S0200000_14(this, message, 91));
    }

    public final void LIZIZ(AbstractC83369Wnl message) {
        o.LJIIIZ(message, "message");
        switch (C83366Wni.LIZ[message.LIZ().ordinal()]) {
            case 1:
                this.LIZJ.execute(new ARunnableS33S0200000_14(this, message, 96));
                return;
            case 2:
                this.LIZJ.execute(new ARunnableS33S0200000_14(this, message, 94));
                return;
            case 3:
                LIZJ(message);
                return;
            case 4:
                LIZ(message);
                return;
            case 5:
                this.LIZJ.execute(new ARunnableS33S0200000_14(this, message, 95));
                return;
            case 6:
                this.LIZJ.execute(new ARunnableS33S0200000_14(this, message, 93));
                return;
            default:
                return;
        }
    }

    public final void LIZJ(AbstractC83369Wnl message) {
        o.LJIIIZ(message, "message");
        this.LIZJ.execute(new ARunnableS33S0200000_14(this, message, 92));
    }
}
