package X;

/* renamed from: X.SvW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73658SvW extends AbstractC73547Stj {
    public final InterfaceC29937Boz LJLIL;

    public C73658SvW(InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC29937Boz;
    }

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        C73660SvY c73660SvY = new C73660SvY(C73674Svm.LIZIZ);
        interfaceC73442Ss2.onSubscribe(c73660SvY);
        try {
            this.LJLIL.run();
            if (!c73660SvY.isDisposed()) {
                interfaceC73442Ss2.onComplete();
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            if (!c73660SvY.isDisposed()) {
                interfaceC73442Ss2.onError(th);
            }
        }
    }
}
