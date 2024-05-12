package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ssi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73484Ssi extends AbstractC73638SvC<Long> {
    public final long LJLIL = 10;
    public final TimeUnit LJLILLLLZI;
    public final AbstractC73946T0k LJLJI;

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super Long> interfaceC73463SsN) {
        RunnableC73483Ssh runnableC73483Ssh = new RunnableC73483Ssh(interfaceC73463SsN);
        interfaceC73463SsN.onSubscribe(runnableC73483Ssh);
        EnumC73418Sre.replace(runnableC73483Ssh, this.LJLJI.LIZJ(runnableC73483Ssh, this.LJLIL, this.LJLILLLLZI));
    }

    public C73484Ssi(TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLILLLLZI = timeUnit;
        this.LJLJI = abstractC73946T0k;
    }
}
