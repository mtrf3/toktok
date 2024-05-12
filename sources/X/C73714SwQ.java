package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SwQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73714SwQ<T> extends AbstractC73430Srq<T, T> {
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL.LIZ(new C73715SwR(new C73844SyW(interfaceC116954iR), this.LJLILLLLZI, this.LJLJI, this.LJLJJI.LIZ()));
    }

    public C73714SwQ(long j, InterfaceC115714gR interfaceC115714gR, AbstractC73946T0k abstractC73946T0k, TimeUnit timeUnit) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
