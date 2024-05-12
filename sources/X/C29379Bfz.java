package X;

/* renamed from: X.Bfz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29379Bfz implements InterfaceC73463SsN<InterfaceC05190Ih> {
    public final /* synthetic */ C29374Bfu LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    public C29379Bfz(C29374Bfu c29374Bfu) {
        this.LJLIL = c29374Bfu;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(InterfaceC05190Ih interfaceC05190Ih) {
        this.LJLIL.LJIJ(interfaceC05190Ih);
    }
}
