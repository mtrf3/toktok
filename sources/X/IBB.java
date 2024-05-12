package X;

/* loaded from: classes8.dex */
public final class IBB implements InterfaceC82637Wbx {
    public EnumC63837P3p LIZ = EnumC63837P3p.DEFAULT;
    public final /* synthetic */ C46193IAz LIZIZ;

    @Override // X.InterfaceC82637Wbx
    public final void LIZ() {
        EnumC63837P3p enumC63837P3p;
        if (C82636Wbw.LJFF) {
            this.LIZIZ.n(true, false);
            enumC63837P3p = EnumC63837P3p.WIRED;
        } else {
            this.LIZIZ.n(false, false);
            enumC63837P3p = EnumC63837P3p.DEFAULT;
        }
        this.LIZ = enumC63837P3p;
    }

    @Override // X.InterfaceC82637Wbx
    public final void LIZIZ() {
        if (this.LIZ == EnumC63837P3p.WIRED) {
            this.LIZIZ.n(false, false);
            this.LIZ = EnumC63837P3p.DEFAULT;
        }
    }

    @Override // X.InterfaceC82637Wbx
    public final void LIZJ() {
        if (this.LIZ == EnumC63837P3p.DEFAULT) {
            this.LIZIZ.n(true, false);
            this.LIZ = EnumC63837P3p.WIRED;
        }
    }

    @Override // X.InterfaceC82637Wbx
    public final void LIZLLL() {
        EnumC63837P3p enumC63837P3p = this.LIZ;
        EnumC63837P3p enumC63837P3p2 = EnumC63837P3p.BLUETOOTH;
        if (enumC63837P3p != enumC63837P3p2) {
            this.LIZIZ.n(true, true);
            this.LIZ = enumC63837P3p2;
        }
    }

    public IBB(C46193IAz c46193IAz) {
        this.LIZIZ = c46193IAz;
    }
}
