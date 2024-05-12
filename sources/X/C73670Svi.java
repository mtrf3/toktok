package X;

/* renamed from: X.Svi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73670Svi<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73442Ss2 LJLIL;

    public C73670Svi(InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLIL = interfaceC73442Ss2;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onComplete();
    }
}
