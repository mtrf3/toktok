package X;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SyT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73841SyT<T, U extends Collection<? super T>> extends AbstractC73430Srq<T, U> {
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final TimeUnit LJLJJI;
    public final AbstractC73946T0k LJLJJL;
    public final Callable<U> LJLJJLL;
    public final int LJLJL;
    public final boolean LJLJLJ;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super U> interfaceC116954iR) {
        long j = this.LJLILLLLZI;
        if (j == this.LJLJI && this.LJLJL == Integer.MAX_VALUE) {
            this.LJLIL.LIZ(new T0X(new C73844SyW(interfaceC116954iR), this.LJLJJLL, j, this.LJLJJI, this.LJLJJL));
            return;
        }
        AbstractC73945T0j LIZ = this.LJLJJL.LIZ();
        long j2 = this.LJLILLLLZI;
        long j3 = this.LJLJI;
        if (j2 == j3) {
            this.LJLIL.LIZ(new T0Z(new C73844SyW(interfaceC116954iR), this.LJLJJLL, j2, this.LJLJJI, this.LJLJL, this.LJLJLJ, LIZ));
        } else {
            this.LJLIL.LIZ(new T0Y(new C73844SyW(interfaceC116954iR), this.LJLJJLL, j2, j3, this.LJLJJI, LIZ));
        }
    }

    public C73841SyT(InterfaceC115714gR interfaceC115714gR, long j, long j2, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k, Callable callable, int i) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = timeUnit;
        this.LJLJJL = abstractC73946T0k;
        this.LJLJJLL = callable;
        this.LJLJL = i;
        this.LJLJLJ = false;
    }
}
