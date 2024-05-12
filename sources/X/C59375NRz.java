package X;

/* renamed from: X.NRz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59375NRz implements InterfaceC69092nR {
    public int LIZ;
    public final /* synthetic */ ViewOnClickListenerC59350NRa LIZIZ;

    @Override // X.InterfaceC69092nR
    public final boolean LIZ() {
        if (this.LIZ == 6 || this.LIZIZ.LJLLI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC69092nR
    public final void run() {
        this.LIZ++;
        this.LIZIZ.LIZIZ();
        if (!this.LIZIZ.LJLLILLLL.LIZIZ) {
            this.LIZ = 6;
        }
    }

    public C59375NRz(ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa) {
        this.LIZIZ = viewOnClickListenerC59350NRa;
    }
}
