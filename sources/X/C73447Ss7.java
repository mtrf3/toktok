package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ss7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73447Ss7 extends AbstractC73547Stj {
    public final long LJLIL;
    public final TimeUnit LJLILLLLZI;
    public final AbstractC73946T0k LJLJI;

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        RunnableC73446Ss6 runnableC73446Ss6 = new RunnableC73446Ss6(interfaceC73442Ss2);
        interfaceC73442Ss2.onSubscribe(runnableC73446Ss6);
        EnumC73418Sre.replace(runnableC73446Ss6, this.LJLJI.LIZJ(runnableC73446Ss6, this.LJLIL, this.LJLILLLLZI));
    }

    public C73447Ss7(long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = j;
        this.LJLILLLLZI = timeUnit;
        this.LJLJI = abstractC73946T0k;
    }
}
