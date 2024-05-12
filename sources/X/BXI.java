package X;

/* loaded from: classes6.dex */
public final class BXI implements InterfaceC60523Np9 {
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;

    @Override // X.InterfaceC60523Np9
    public final void onFailed() {
        this.LIZIZ.invoke("");
    }

    @Override // X.InterfaceC60523Np9
    public final void onSuccess(String str) {
        this.LIZ.invoke(str, "");
    }

    public BXI(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
        this.LIZIZ = interfaceC88472Yns;
    }
}
