package X;

/* renamed from: X.NrO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60662NrO extends OM2 {
    public final /* synthetic */ C60659NrL LJLIL;

    @Override // X.OM2
    public final void LJFF() {
        super.LJFF();
        InterfaceC60663NrP interfaceC60663NrP = this.LJLIL.LJLJL;
        if (interfaceC60663NrP != null) {
            interfaceC60663NrP.destroy();
        }
    }

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C60662NrO(C60659NrL c60659NrL) {
        this.LJLIL = c60659NrL;
    }
}
