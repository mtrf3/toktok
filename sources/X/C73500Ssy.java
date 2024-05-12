package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ssy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73500Ssy<T> extends AbstractC73638SvC<T> {
    public final InterfaceC73471SsV<T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final InterfaceC73471SsV<? extends T> LJLJJL;

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        RunnableC73499Ssx runnableC73499Ssx = new RunnableC73499Ssx(interfaceC73463SsN, this.LJLJJL, this.LJLILLLLZI, this.LJLJI);
        interfaceC73463SsN.onSubscribe(runnableC73499Ssx);
        EnumC73418Sre.replace(runnableC73499Ssx.LJLILLLLZI, this.LJLJJI.LIZJ(runnableC73499Ssx, this.LJLILLLLZI, this.LJLJI));
        this.LJLIL.LIZ(runnableC73499Ssx);
    }

    public C73500Ssy(InterfaceC73471SsV<T> interfaceC73471SsV, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k, InterfaceC73471SsV<? extends T> interfaceC73471SsV2) {
        this.LJLIL = interfaceC73471SsV;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
        this.LJLJJL = interfaceC73471SsV2;
    }
}
