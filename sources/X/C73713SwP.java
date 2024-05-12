package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SwP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73713SwP<T> extends AbstractC73430Srq<T, T> {
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final boolean LJLJJL;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        InterfaceC116954iR<? super T> interfaceC116954iR2 = interfaceC116954iR;
        if (!this.LJLJJL) {
            interfaceC116954iR2 = new C73844SyW(interfaceC116954iR2);
        }
        this.LJLIL.LIZ(new C73884SzA(interfaceC116954iR2, this.LJLILLLLZI, this.LJLJI, this.LJLJJI.LIZ(), this.LJLJJL));
    }

    public C73713SwP(InterfaceC115714gR interfaceC115714gR, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
        this.LJLJJL = false;
    }
}
