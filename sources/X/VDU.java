package X;

import java.util.HashSet;

/* loaded from: classes15.dex */
public final class VDU implements InterfaceC79371VDb<C36783Ec7> {
    public final /* synthetic */ VDT LIZ;
    public final /* synthetic */ VDR LIZIZ;

    @Override // X.InterfaceC79371VDb
    public final void call(C36783Ec7 c36783Ec7) {
        C36783Ec7 c36783Ec72 = c36783Ec7;
        if (c36783Ec72 == null) {
            c36783Ec72 = new C36783Ec7(this.LIZ.LIZ, null);
        }
        VDT vdt = this.LIZ;
        vdt.LJ.lock();
        vdt.LIZLLL = c36783Ec72;
        vdt.LJ.unlock();
        vdt.LIZ();
        VDR vdr = this.LIZIZ;
        int i = vdr.LJIILIIL + 1;
        vdr.LJIILIIL = i;
        java.util.Set<String> set = vdr.LJIIIZ;
        if (set != null && i == ((HashSet) set).size()) {
            this.LIZIZ.LJIIJJI(new VDS(), new VDX(this));
        }
        this.LIZIZ.getClass();
    }

    public VDU(VDR vdr, VDT vdt) {
        this.LIZIZ = vdr;
        this.LIZ = vdt;
    }
}
