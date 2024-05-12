package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SsD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73453SsD extends AbstractC73672Svk<Long> {
    public final AbstractC73946T0k LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final TimeUnit LJLJJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super Long> interfaceC116954iR) {
        RunnableC73399SrL runnableC73399SrL = new RunnableC73399SrL(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(runnableC73399SrL);
        AbstractC73946T0k abstractC73946T0k = this.LJLIL;
        if (abstractC73946T0k instanceof T1G) {
            AbstractC73945T0j LIZ = abstractC73946T0k.LIZ();
            EnumC73418Sre.setOnce(runnableC73399SrL, LIZ);
            LIZ.LIZLLL(runnableC73399SrL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            return;
        }
        EnumC73418Sre.setOnce(runnableC73399SrL, abstractC73946T0k.LIZLLL(runnableC73399SrL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
    }

    public C73453SsD(long j, long j2, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = timeUnit;
        this.LJLIL = abstractC73946T0k;
    }
}
