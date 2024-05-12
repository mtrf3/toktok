package X;

import ccb.t;

/* renamed from: X.VAj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC79301VAj implements Runnable {
    public final /* synthetic */ t LJLIL;

    public final void LIZ() {
        if (this.LJLIL.X() == EnumC48169IvN.PREPARED) {
            this.LJLIL.U0();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PrepareTask2 call prepareAsync -- ");
            UFE.LIZLLL(LIZ, this.LJLIL.u5, LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Fail to finish prepare task -- ");
        LIZ2.append(this.LJLIL.u5);
        LIZ2.append(", status: ");
        LIZ2.append(this.LJLIL.X());
        X1D.LIZIZ(LIZ2);
        C46496IMq.LIZJ();
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

    public RunnableC79301VAj(t tVar) {
        this.LJLIL = tVar;
    }
}
