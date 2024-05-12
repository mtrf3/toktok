package X;

/* loaded from: classes6.dex */
public final class BXG implements InterfaceC60523Np9 {
    public final /* synthetic */ InterfaceC05250In LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC60523Np9
    public final void onFailed() {
        this.LIZ.onFailed("");
    }

    @Override // X.InterfaceC60523Np9
    public final void onSuccess(String str) {
        this.LIZ.LJFF(str, "");
        BZI LIZ = C28787BRn.LIZ("livesdk_age_edit_confirm_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LIZIZ, "user_type");
        LIZ.LJIJJ(this.LIZJ, "request_page");
        LIZ.LJJIIJZLJL();
    }

    public BXG(InterfaceC05250In interfaceC05250In, String str, String str2) {
        this.LIZ = interfaceC05250In;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
