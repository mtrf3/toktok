package X;

import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Umq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78216Umq extends AbstractC78237UnB {
    public final C32449CoP LIZJ;
    public final O99 LIZLLL;
    public final C78158Ulu LJ;
    public final O98 LJFF;
    public final C78217Umr LJI;
    public C78215Ump LJII;

    @Override // X.InterfaceC32440CoG
    public final void stop() {
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13(this, 564));
    }

    @Override // X.InterfaceC32440CoG
    public final void LIZIZ(InterfaceC78213Umn renderView, C32448CoO c32448CoO) {
        o.LJIIIZ(renderView, "renderView");
        C32257ClJ.LJIIIIZZ(new AqS102S0300000_13(this, renderView, c32448CoO, 28));
    }

    public final void LIZJ(C78200Uma c78200Uma, int i, String downgradeReason) {
        boolean z;
        InterfaceC78244UnI interfaceC78244UnI;
        EnumC78220Umu fromType = EnumC78220Umu.LYNX;
        C78215Ump c78215Ump = this.LJII;
        boolean z2 = false;
        if (c78215Ump != null && c78215Ump.LJLJI) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(fromType, "fromType");
        o.LJIIIZ(downgradeReason, "downgradeReason");
        if (this.LIZ == 1 || (interfaceC78244UnI = this.LIZIZ) == null || !interfaceC78244UnI.LIZ(fromType, i, downgradeReason, z)) {
            C78163Ulz c78163Ulz = new C78163Ulz(-26, C012403c.LIZLLL("reason: ", i, ", str = ", downgradeReason), 4);
            C78165Um1 c78165Um1 = new C78165Um1();
            C78215Ump c78215Ump2 = this.LJII;
            if (c78215Ump2 != null) {
                z2 = c78215Ump2.LJLJI;
            }
            c78165Um1.LIZ = z2;
            c78163Ulz.LIZLLL = c78165Um1;
            c78200Uma.LJFF(fromType, c78163Ulz);
            return;
        }
        C78174UmA c78174UmA = this.LJ.LIZLLL;
        if (c78174UmA == null) {
            return;
        }
        c78174UmA.LIZJ();
    }

    public C78216Umq(C32449CoP request, O99 lynxContainerCreator, C78158Ulu c78158Ulu, O98 performanceService) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(lynxContainerCreator, "lynxContainerCreator");
        o.LJIIIZ(performanceService, "performanceService");
        this.LIZJ = request;
        this.LIZLLL = lynxContainerCreator;
        this.LJ = c78158Ulu;
        this.LJFF = performanceService;
        C78217Umr c78217Umr = request.LJIIJJI;
        if (c78217Umr != null) {
            this.LJI = c78217Umr;
            return;
        }
        throw new IllegalStateException("Request.LynxInfo should not be null");
    }
}
