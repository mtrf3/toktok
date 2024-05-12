package X;

/* loaded from: classes15.dex */
public final class VDY implements InterfaceC79371VDb<VDW> {
    public final /* synthetic */ VDR LIZ;

    public VDY(VDR vdr) {
        this.LIZ = vdr;
    }

    @Override // X.InterfaceC79371VDb
    public final void call(VDW vdw) {
        this.LIZ.LJIIL(vdw);
        this.LIZ.LIZJ.removeMessages(1024);
        VDR vdr = this.LIZ;
        vdr.LIZJ.sendEmptyMessageDelayed(1024, vdr.LJIIJ);
    }
}
