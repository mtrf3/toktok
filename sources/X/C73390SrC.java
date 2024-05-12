package X;

/* renamed from: X.SrC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73390SrC<T> extends AbstractC73672Svk<T> {
    public final InterfaceC86003Zc<T> LJLIL;

    public C73390SrC(InterfaceC86003Zc<T> interfaceC86003Zc) {
        this.LJLIL = interfaceC86003Zc;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73433Srt c73433Srt = new C73433Srt(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(c73433Srt);
        try {
            this.LJLIL.subscribe(c73433Srt);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            c73433Srt.onError(th);
        }
    }
}
