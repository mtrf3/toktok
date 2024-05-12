package X;

/* renamed from: X.Sus, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73618Sus<T> extends AbstractC73430Srq<T, T> {
    public final InterfaceC73592SuS<? super Throwable> LJLILLLLZI;
    public final long LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73616Suq c73616Suq = new C73616Suq();
        interfaceC116954iR.onSubscribe(c73616Suq);
        new C73617Sur(interfaceC116954iR, this.LJLJI, this.LJLILLLLZI, c73616Suq, this.LJLIL).LIZ();
    }

    public C73618Sus(AbstractC73672Svk<T> abstractC73672Svk, long j, InterfaceC73592SuS<? super Throwable> interfaceC73592SuS) {
        super(abstractC73672Svk);
        this.LJLILLLLZI = interfaceC73592SuS;
        this.LJLJI = j;
    }
}
