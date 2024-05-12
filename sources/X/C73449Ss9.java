package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ss9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73449Ss9 extends AbstractC73547Stj {
    public final InterfaceC73445Ss5 LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final boolean LJLJJL = false;

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLIL.LIZ(new RunnableC73448Ss8(interfaceC73442Ss2, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL));
    }

    public C73449Ss9(InterfaceC73445Ss5 interfaceC73445Ss5, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73445Ss5;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
