package X;

/* renamed from: X.Sue, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73604Sue implements InterfaceC73442Ss2 {
    public final InterfaceC73442Ss2 LJLIL;
    public final /* synthetic */ C73605Suf LJLILLLLZI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        try {
            if (this.LJLILLLLZI.LJLILLLLZI.test(th)) {
                this.LJLIL.onComplete();
            } else {
                this.LJLIL.onError(th);
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    public C73604Sue(C73605Suf c73605Suf, InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLILLLLZI = c73605Suf;
        this.LJLIL = interfaceC73442Ss2;
    }
}
