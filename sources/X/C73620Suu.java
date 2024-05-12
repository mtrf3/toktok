package X;

/* renamed from: X.Suu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73620Suu<T> extends AbstractC73430Srq<T, T> {
    public final long LJLILLLLZI;

    public C73620Suu(AbstractC73672Svk abstractC73672Svk) {
        super(abstractC73672Svk);
        this.LJLILLLLZI = Long.MAX_VALUE;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73616Suq c73616Suq = new C73616Suq();
        interfaceC116954iR.onSubscribe(c73616Suq);
        long j = this.LJLILLLLZI;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new C73619Sut(interfaceC116954iR, j2, c73616Suq, this.LJLIL).LIZ();
    }
}
