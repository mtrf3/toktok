package X;

import Y.ARunnableS51S0100000_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS5S0101100_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCV implements InterfaceC84414XBa<C84430XBq> {
    public final /* synthetic */ XCL LIZ;

    @Override // X.InterfaceC84414XBa
    public final void LJFF(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
    }

    public XCV(XCL xcl) {
        this.LIZ = xcl;
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZ(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Effect][Callback][Cancel][");
        LIZ.append(this.LIZ.getId());
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadEffectTask", LIZIZ);
        XCL xcl = this.LIZ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 716);
        xcl.getClass();
        C15180ig.LIZ(new ARunnableS51S0100000_15(aqS165S0100000_15, 64));
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZLLL(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        XCZ.LJFF(new AqS165S0100000_15(this, 718));
    }

    @Override // X.InterfaceC84414XBa
    public final void LJI(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Effect][Callback][Pause][");
        LIZ.append(this.LIZ.getId());
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadEffectTask", LIZIZ);
        XCL xcl = this.LIZ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 717);
        xcl.getClass();
        C15180ig.LIZ(new ARunnableS51S0100000_15(aqS165S0100000_15, 64));
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZIZ(XBW<C84430XBq> syncTask, C84430XBq c84430XBq) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LJI(true, null);
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchEffect: ");
        LIZ.append(this.LIZ.LJIIL.getName());
        LIZ.append(" onSuccess");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadEffectTask", LIZIZ);
        XCL xcl = this.LIZ;
        AqS162S0200000_15 aqS162S0200000_15 = new AqS162S0200000_15(this, c84430XBq, 49);
        xcl.getClass();
        C15180ig.LIZ(new ARunnableS51S0100000_15(aqS162S0200000_15, 64));
    }

    @Override // X.InterfaceC84414XBa
    public final void LJ(XBW<C84430XBq> syncTask, C84418XBe c84418XBe) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LJI(false, c84418XBe);
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchEffect: ");
        LIZ.append(this.LIZ.LJIIL.getName());
        LIZ.append(" onFailed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadEffectTask", LIZIZ);
        XCL xcl = this.LIZ;
        AqS162S0200000_15 aqS162S0200000_15 = new AqS162S0200000_15(this, c84418XBe, 43);
        xcl.getClass();
        C15180ig.LIZ(new ARunnableS51S0100000_15(aqS162S0200000_15, 64));
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZJ(XBW<C84430XBq> syncTask, int i, long j) {
        o.LJIIJ(syncTask, "syncTask");
        XCZ.LJFF(new AqS5S0101100_15(this, i, j, 0));
    }
}
