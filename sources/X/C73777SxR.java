package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SxR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73777SxR<T> extends AbstractC73739Swp<T, T> {
    public final long LJLJI;
    public final TimeUnit LJLJJI;
    public final AbstractC73946T0k LJLJJL;
    public final boolean LJLJJLL;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        C73843SyV c73843SyV = new C73843SyV(interfaceC73740Swq);
        if (this.LJLJJLL) {
            this.LJLILLLLZI.LJIIL(new C73778SxS(c73843SyV, this.LJLJI, this.LJLJJI, this.LJLJJL));
        } else {
            this.LJLILLLLZI.LJIIL(new C73779SxT(c73843SyV, this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
    }

    public C73777SxR(C73724Swa c73724Swa, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(c73724Swa);
        this.LJLJI = 100L;
        this.LJLJJI = timeUnit;
        this.LJLJJL = abstractC73946T0k;
        this.LJLJJLL = false;
    }
}
