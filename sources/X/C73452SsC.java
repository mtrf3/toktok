package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SsC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73452SsC extends AbstractC73672Svk<Long> {
    public final AbstractC73946T0k LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final TimeUnit LJLJJLL;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super Long> interfaceC116954iR) {
        RunnableC73395SrH runnableC73395SrH = new RunnableC73395SrH(interfaceC116954iR, this.LJLILLLLZI, this.LJLJI);
        interfaceC116954iR.onSubscribe(runnableC73395SrH);
        AbstractC73946T0k abstractC73946T0k = this.LJLIL;
        if (abstractC73946T0k instanceof T1G) {
            AbstractC73945T0j LIZ = abstractC73946T0k.LIZ();
            EnumC73418Sre.setOnce(runnableC73395SrH, LIZ);
            LIZ.LIZLLL(runnableC73395SrH, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            return;
        }
        EnumC73418Sre.setOnce(runnableC73395SrH, abstractC73946T0k.LIZLLL(runnableC73395SrH, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
    }

    public C73452SsC(long j, long j2, long j3, long j4, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLJJI = j3;
        this.LJLJJL = j4;
        this.LJLJJLL = timeUnit;
        this.LJLIL = abstractC73946T0k;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
