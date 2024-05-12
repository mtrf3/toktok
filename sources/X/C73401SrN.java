package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SrN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73401SrN extends AbstractC73672Svk<Long> {
    public final AbstractC73946T0k LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super Long> interfaceC116954iR) {
        RunnableC73400SrM runnableC73400SrM = new RunnableC73400SrM(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(runnableC73400SrM);
        EnumC73418Sre.trySet(runnableC73400SrM, this.LJLIL.LIZJ(runnableC73400SrM, this.LJLILLLLZI, this.LJLJI));
    }

    public C73401SrN(long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLIL = abstractC73946T0k;
    }
}
