package X;

/* renamed from: X.Wla, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83234Wla implements InterfaceC73032SlQ {
    public final /* synthetic */ C83202Wl4 LIZ;

    @Override // X.InterfaceC73032SlQ
    public final void LIZ() {
        InterfaceC83233WlZ beautyOnInteractListener = this.LIZ.LIZIZ.getBeautyOnInteractListener();
        if (beautyOnInteractListener != null) {
            beautyOnInteractListener.LIZJ();
        }
        InterfaceC83246Wlm beautyBuried = this.LIZ.LIZIZ.getBeautyBuried();
        if (beautyBuried != null) {
            beautyBuried.LJIIJJI("cancel", this.LIZ.LIZ.K7());
        }
    }

    @Override // X.InterfaceC73032SlQ
    public final void LIZIZ() {
        InterfaceC83233WlZ beautyOnInteractListener = this.LIZ.LIZIZ.getBeautyOnInteractListener();
        if (beautyOnInteractListener != null) {
            beautyOnInteractListener.LJIIIIZZ();
        }
        InterfaceC83246Wlm beautyBuried = this.LIZ.LIZIZ.getBeautyBuried();
        if (beautyBuried != null) {
            beautyBuried.LJIIJJI("confirm", this.LIZ.LIZ.K7());
        }
        this.LIZ.LIZJ();
    }

    public C83234Wla(C83202Wl4 c83202Wl4) {
        this.LIZ = c83202Wl4;
    }
}
