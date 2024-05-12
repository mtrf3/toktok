package X;

/* renamed from: X.BfX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29351BfX implements InterfaceC78992UzM {
    public final /* synthetic */ C29350BfW LIZ;

    @Override // X.InterfaceC78992UzM
    public final void onCancel() {
        this.LIZ.finishWithFailure();
    }

    @Override // X.InterfaceC78992UzM
    public final void onFailed() {
        this.LIZ.finishWithFailure();
    }

    @Override // X.InterfaceC78992UzM
    public final void onSuccess() {
        this.LIZ.finishWithSuccess();
    }

    public C29351BfX(C29350BfW c29350BfW) {
        this.LIZ = c29350BfW;
    }
}
