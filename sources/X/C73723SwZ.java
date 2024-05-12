package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SwZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73723SwZ extends AbstractC73745Swv<Long> {
    public final AbstractC73946T0k LJLILLLLZI;
    public final long LJLJI;
    public final TimeUnit LJLJJI;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super Long> interfaceC73740Swq) {
        RunnableC73727Swd runnableC73727Swd = new RunnableC73727Swd(interfaceC73740Swq);
        interfaceC73740Swq.onSubscribe(runnableC73727Swd);
        EnumC73418Sre.trySet(runnableC73727Swd, this.LJLILLLLZI.LIZJ(runnableC73727Swd, this.LJLJI, this.LJLJJI));
    }

    public C73723SwZ(long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLJI = j;
        this.LJLJJI = timeUnit;
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
