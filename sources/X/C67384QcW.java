package X;

import Y.ARunnableS15S0400000_11;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: X.QcW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67384QcW implements InterfaceC67367QcF {
    public static final Logger LJFF = Logger.getLogger(C67350Qby.class.getName());
    public final LD7 LIZ;
    public final Executor LIZIZ;
    public final InterfaceC67483Qe7 LIZJ;
    public final InterfaceC67397Qcj LIZLLL;
    public final PSE LJ;

    @Override // X.InterfaceC67367QcF
    public final void LIZ(C67376QcO c67376QcO, C67355Qc3 c67355Qc3, C72545SdZ c72545SdZ) {
        this.LIZIZ.execute(new ARunnableS15S0400000_11(c67376QcO, this, c67355Qc3, c72545SdZ, 5));
    }

    public C67384QcW(Executor executor, InterfaceC67483Qe7 interfaceC67483Qe7, LD7 ld7, InterfaceC67397Qcj interfaceC67397Qcj, PSE pse) {
        this.LIZIZ = executor;
        this.LIZJ = interfaceC67483Qe7;
        this.LIZ = ld7;
        this.LIZLLL = interfaceC67397Qcj;
        this.LJ = pse;
    }
}
