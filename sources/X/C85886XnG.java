package X;

/* renamed from: X.XnG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85886XnG implements InterfaceC25880ADs {
    public final /* synthetic */ InterfaceC85887XnH LIZ;

    @Override // X.InterfaceC25880ADs
    public final void onLoading() {
    }

    @Override // X.InterfaceC25880ADs
    public final void onFailed() {
        this.LIZ.LIZ(false);
    }

    @Override // X.InterfaceC25880ADs
    public final void onSuccess() {
        HG3.LJIILL().getCurUser().setAdAuthorization(true);
        this.LIZ.LIZ(true);
    }

    public C85886XnG(InterfaceC85887XnH interfaceC85887XnH) {
        this.LIZ = interfaceC85887XnH;
    }
}
