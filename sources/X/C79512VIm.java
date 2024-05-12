package X;

/* renamed from: X.VIm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79512VIm implements InterfaceC61189Nzt {
    public final /* synthetic */ InterfaceC79513VIn LIZ;

    @Override // X.InterfaceC61189Nzt
    public final void LIZIZ() {
        InterfaceC79513VIn interfaceC79513VIn = this.LIZ;
        C79510VIk c79510VIk = new C79510VIk();
        c79510VIk.LIZ = 3;
        interfaceC79513VIn.LIZ(c79510VIk, "the channel has been moved to black list and not be allowed to move out");
    }

    @Override // X.InterfaceC61189Nzt
    public final void LIZJ() {
        InterfaceC79513VIn interfaceC79513VIn = this.LIZ;
        C79510VIk c79510VIk = new C79510VIk();
        c79510VIk.LIZ = 1;
        interfaceC79513VIn.LIZ(c79510VIk, "needUpdate");
    }

    @Override // X.InterfaceC61189Nzt
    public final void LIZLLL() {
        InterfaceC79513VIn interfaceC79513VIn = this.LIZ;
        C79510VIk c79510VIk = new C79510VIk();
        c79510VIk.LIZ = 0;
        interfaceC79513VIn.LIZ(c79510VIk, "skipUpdate for local version is already up-to-date");
    }

    @Override // X.InterfaceC61189Nzt
    public final void LJ() {
        InterfaceC79513VIn interfaceC79513VIn = this.LIZ;
        C79510VIk c79510VIk = new C79510VIk();
        c79510VIk.LIZ = 2;
        interfaceC79513VIn.LIZ(c79510VIk, "abortUpdate for requested channel is not in lazy channels or doesn't exist with host accesskey");
    }

    @Override // X.InterfaceC61189Nzt
    public final void LJFF() {
        InterfaceC79513VIn interfaceC79513VIn = this.LIZ;
        C79510VIk c79510VIk = new C79510VIk();
        c79510VIk.LIZ = 4;
        interfaceC79513VIn.LIZ(c79510VIk, "request for non-lazy channel and resource exist");
    }

    public C79512VIm(C82956Wh6 c82956Wh6) {
        this.LIZ = c82956Wh6;
    }

    @Override // X.InterfaceC61189Nzt
    public final void LIZ(Exception exc) {
        InterfaceC79513VIn interfaceC79513VIn = this.LIZ;
        String message = exc.getMessage();
        if (message == null) {
            message = "updateGecko exception";
        }
        interfaceC79513VIn.LJIILL(message);
    }
}
