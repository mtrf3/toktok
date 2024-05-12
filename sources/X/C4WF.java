package X;

import java.util.List;

/* renamed from: X.4WF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WF implements InterfaceC86963bA<C4WG> {
    public final /* synthetic */ InterfaceC86963bA LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ C4WT LIZJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        InterfaceC86963bA interfaceC86963bA;
        C4WT c4wt = this.LIZJ;
        int i = c4wt.LIZ - 1;
        c4wt.LIZ = i;
        if (i <= 0 && this.LIZIZ.isEmpty() && (interfaceC86963bA = this.LIZ) != null) {
            interfaceC86963bA.LIZIZ(c63623Oy3);
        }
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C4WG c4wg) {
        InterfaceC86963bA interfaceC86963bA;
        C4WG c4wg2 = c4wg;
        if (c4wg2.LJLILLLLZI) {
            this.LIZ.onSuccess(c4wg2.LJLIL);
            return;
        }
        C4WT c4wt = this.LIZJ;
        c4wt.LIZ--;
        this.LIZIZ.addAll(c4wg2.LJLIL);
        if (this.LIZJ.LIZ > 0 || (interfaceC86963bA = this.LIZ) == null) {
            return;
        }
        interfaceC86963bA.onSuccess(this.LIZIZ);
    }

    public C4WF(C4WT c4wt, InterfaceC86963bA interfaceC86963bA, List list) {
        this.LIZJ = c4wt;
        this.LIZ = interfaceC86963bA;
        this.LIZIZ = list;
    }
}
