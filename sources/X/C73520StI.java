package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.StI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73520StI extends AbstractC73635Sv9<Long> {
    public final long LJLIL;
    public final TimeUnit LJLILLLLZI;
    public final AbstractC73946T0k LJLJI;

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super Long> interfaceC73509St7) {
        RunnableC73519StH runnableC73519StH = new RunnableC73519StH(interfaceC73509St7);
        interfaceC73509St7.onSubscribe(runnableC73519StH);
        EnumC73418Sre.replace(runnableC73519StH, this.LJLJI.LIZJ(runnableC73519StH, this.LJLIL, this.LJLILLLLZI));
    }

    public C73520StI(long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = j;
        this.LJLILLLLZI = timeUnit;
        this.LJLJI = abstractC73946T0k;
    }
}
