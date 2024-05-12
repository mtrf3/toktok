package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Swz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73749Swz extends AbstractC73745Swv<Long> {
    public final AbstractC73946T0k LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final TimeUnit LJLJJL;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super Long> interfaceC73740Swq) {
        RunnableC73758Sx8 runnableC73758Sx8 = new RunnableC73758Sx8(interfaceC73740Swq);
        interfaceC73740Swq.onSubscribe(runnableC73758Sx8);
        AbstractC73946T0k abstractC73946T0k = this.LJLILLLLZI;
        if (abstractC73946T0k instanceof T1G) {
            AbstractC73945T0j LIZ = abstractC73946T0k.LIZ();
            EnumC73418Sre.setOnce(runnableC73758Sx8.LJLJI, LIZ);
            LIZ.LIZLLL(runnableC73758Sx8, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } else {
            EnumC73418Sre.setOnce(runnableC73758Sx8.LJLJI, abstractC73946T0k.LIZLLL(runnableC73758Sx8, this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
    }

    public C73749Swz(long j, long j2, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = timeUnit;
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
