package X;

/* loaded from: classes9.dex */
public class IWK implements InterfaceC229738zx {
    public final InterfaceC46747IWh LIZ;
    public IGM LIZIZ;
    public IP0 LIZJ;

    @Override // X.InterfaceC229738zx
    public void LIZIZ() {
        this.LIZ.setVolume(0.0f, 0.0f);
    }

    @Override // X.InterfaceC229738zx
    public void LIZJ() {
        this.LIZ.setVolume(1.0f, 1.0f);
    }

    public IWK(InterfaceC46747IWh interfaceC46747IWh) {
        this.LIZ = interfaceC46747IWh;
    }

    @Override // X.InterfaceC229738zx
    public void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // X.InterfaceC229738zx
    public void LIZLLL(IP0 ip0) {
        this.LIZJ = ip0;
    }

    @Override // X.InterfaceC229738zx
    public void LJ(IGM igm) {
        this.LIZIZ = igm;
    }

    @Override // X.InterfaceC229738zx
    public void setVolume(float f, float f2) {
        this.LIZ.setVolume(f, f2);
    }
}
